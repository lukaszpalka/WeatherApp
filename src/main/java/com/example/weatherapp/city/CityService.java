package com.example.weatherapp.city;

import com.example.weatherapp.exceptions.CityNotFoundException;
import com.example.weatherapp.forecast.daily.DailyForecastRepository;
import com.example.weatherapp.forecast.daily.DailyForecast;
import com.example.weatherapp.forecast.daily.DailyForecastDto;
import com.example.weatherapp.forecast.hourly.HourlyForecast;
import com.example.weatherapp.forecast.hourly.HourlyForecastDto;
import com.example.weatherapp.forecast.hourly.HourlyForecastRepository;
import com.example.weatherapp.webclient.Exclude;
import com.example.weatherapp.webclient.WeatherClient;
import com.example.weatherapp.webclient.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CityService {
    private final CityRepository cityRepository;
    private final HourlyForecastRepository hourlyForecastRepository;
    private final DailyForecastRepository dailyForceastRepository;
    private final ObjectMapper objectMapper;
    private final WeatherClient weatherClient;

    public CityService(CityRepository cityRepository, HourlyForecastRepository hourlyForecastRepository, DailyForecastRepository dailyForceastRepository, ObjectMapper objectMapper, WeatherClient weatherClient) {
        this.cityRepository = cityRepository;
        this.hourlyForecastRepository = hourlyForecastRepository;
        this.dailyForceastRepository = dailyForceastRepository;
        this.objectMapper = objectMapper;
        this.weatherClient = weatherClient;
    }

//     ----------------------------------- City CRUD ----------------------------------------------

    public List<City> getCities() {
        return cityRepository.findAll();
    }

    public List<CityDto> getCityDtos() {
        return getCities().stream()
                .map(city -> new CityDto(
                        city.getId(),
                        city.getName(),
                        city.getLatitude(),
                        city.getLongitude(),
                        city.getHourlyForecasts(),
                        city.getDailyForecasts()))
                .collect(Collectors.toList());
    }

    private City getCityById(Long id) {
        return cityRepository.findById(id).orElseThrow(() -> new CityNotFoundException("City with id=" + id + " not found"));
    }

    public CityDto getCityDtoById(Long id) {
        City city = getCityById(id);
        return new CityDto(
                city.getId(),
                city.getName(),
                city.getLatitude(),
                city.getLongitude(),
                city.getHourlyForecasts(),
                city.getDailyForecasts());
    }

    private City getCityByCoordinates(CityDto cityDto) {
        return cityRepository.findCityByCoordinates(cityDto.latitude(), cityDto.longitude());
    }

    @Transactional
    public void updateCityDetailsById(Long id, CityDto cityDto) {
        City city = getCityById(id);
        setCityDetailsFromCityDto(city, cityDto);
        cityRepository.save(city);
        updateForecastsById(id);
    }

    private void setCityDetailsFromCityDto(City city, CityDto cityDto) {
        if (cityDto.name() != null) {
            city.setName(cityDto.name());
        }
        if (cityDto.longitude() != null) {
            city.setLongitude(cityDto.longitude());
        }
        if (cityDto.latitude() != null) {
            city.setLatitude(cityDto.latitude());
        }
    }

//     --------------------------------- OpenWeather ------------------------------------

    public WeatherResponse getWeatherResponse(CityDto cityDto, String exclude) {
        return weatherClient.getWeatherResponse(cityDto, exclude);
    }

    @Transactional
    public void updateHourlyForecasts(CityDto cityDto) {
        WeatherResponse weatherResponse = getWeatherResponse(cityDto, Exclude.DAILY.toString().toLowerCase(Locale.ROOT));
        City city = getCityByCoordinates(cityDto);
        List<HourlyForecast> hourlyForecasts = weatherResponse.getHourlyForecasts()
                .stream()
                .map(forecastDto -> {
                    HourlyForecast hourlyForecast = new HourlyForecast();
                    setHourlyForecastParameters(hourlyForecast, forecastDto);
                    hourlyForecast.setCityId(city.getId());
                    return hourlyForecast;
                }).toList();

        hourlyForecastRepository.saveAll(hourlyForecasts);
    }

    @Transactional
    public void updateDailyForecasts(CityDto cityDto) {
        WeatherResponse weatherResponse = getWeatherResponse(cityDto, Exclude.HOURLY.toString().toLowerCase(Locale.ROOT));
        City city = getCityByCoordinates(cityDto);
        List<DailyForecast> dailyForecasts = weatherResponse.getDailyForecasts()
                .stream()
                .map(forecastDto -> {
                    DailyForecast dailyForecast = new DailyForecast();
                    setDailyForecastParameters(dailyForecast, forecastDto);
                    dailyForecast.setCityId(city.getId());
                    return dailyForecast;
                }).toList();
        dailyForceastRepository.saveAll(dailyForecasts);
    }

    @Transactional
    public void updateForecastsById(Long id) {
        updateHourlyForecasts(getCityDtoById(id));
        updateDailyForecasts(getCityDtoById(id));
    }

    @Transactional
    public void updateAllForecasts() {
        getCityDtos().forEach(this::updateHourlyForecasts);
        getCityDtos().forEach(this::updateDailyForecasts);

    }

    private void setDailyForecastParameters(DailyForecast forecast, DailyForecastDto dailyForecastDto) {
        forecast.setDateTime(LocalDateTime.ofInstant(
                objectMapper.convertValue(dailyForecastDto.dateTime(), Instant.class),
                ZoneId.systemDefault()));
        forecast.setTemperatures(dailyForecastDto.temperatures().entrySet().stream()
                .collect(Collectors.toMap(
                        s -> s.getKey(), e -> (e.getValue().subtract(BigDecimal.valueOf(273.15))).doubleValue()
                )));
        forecast.setPressure(dailyForecastDto.pressure());
        forecast.setHumidity(dailyForecastDto.humidity());
        forecast.setWindSpeed(dailyForecastDto.windSpeed());
    }

    private void setHourlyForecastParameters(HourlyForecast forecast, HourlyForecastDto hourlyForecastDto) {
        forecast.setDateTime(LocalDateTime.ofInstant(
                objectMapper.convertValue(hourlyForecastDto.dateTime(), Instant.class),
                ZoneId.systemDefault()));
        forecast.setTemperature(hourlyForecastDto.temp() - 273.15);
        forecast.setPressure(hourlyForecastDto.pressure());
        forecast.setHumidity(hourlyForecastDto.humidity());
        forecast.setWindSpeed(hourlyForecastDto.windSpeed());
    }

//     --------------------------------- Forecast CRUD -------------------------------------

    public List<HourlyForecastDto> getHourlyForecastDtosById(Long id) {
        List<HourlyForecastDto> dtos = new ArrayList<>();
        for (HourlyForecast hourlyForecast : getCityById(id).getHourlyForecasts()) {
            HourlyForecastDto dto = new HourlyForecastDto(
                    hourlyForecast.getTemperature(),
                    hourlyForecast.getPressure(),
                    hourlyForecast.getHumidity(),
                    hourlyForecast.getWindSpeed(),
                    hourlyForecast.getDateTime().toString()
            );
            dtos.add(dto);
        }
        return dtos;
    }

    public List<DailyForecastDto> getDailyForecastDtosById(Long id) {
        List<DailyForecastDto> dtos = new ArrayList<>();
        for (DailyForecast dailyForecast : getCityById(id).getDailyForecasts()) {
            DailyForecastDto dto = new DailyForecastDto(
                    dailyForecast.getTemperatures().entrySet().stream()
                            .collect(Collectors.toMap(Map.Entry::getKey, stringDoubleEntry -> BigDecimal.valueOf(stringDoubleEntry.getValue()))),
                    dailyForecast.getPressure(),
                    dailyForecast.getHumidity(),
                    dailyForecast.getWindSpeed(),
                    dailyForecast.getDateTime().toString()
            );
            dtos.add(dto);
        }
        return dtos;
    }

//    --------------------------------- Other -------------------------------------

    public boolean dbExists() {
        return !getCities().isEmpty();
    }
}
