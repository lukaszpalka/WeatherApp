package com.example.weatherapp.apitest;

import com.example.weatherapp.city.City;
import com.example.weatherapp.city.CityRepository;
import com.example.weatherapp.config.MySQLContainerConfig;
import com.example.weatherapp.forecast.daily.DailyForecast;
import com.example.weatherapp.forecast.daily.DailyForecastDto;
import com.example.weatherapp.forecast.hourly.HourlyForecast;
import com.example.weatherapp.forecast.hourly.HourlyForecastDto;
import com.example.weatherapp.webclient.Exclude;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@WireMockTest(httpPort = 8081)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApiCallTest extends MySQLContainerConfig {

    @LocalServerPort
    private int port;

    private final TestRestTemplate restTemplate = new TestRestTemplate();

    private final String apiKeyOpenweather;
    private final String apiUrl;
    private final CityRepository cityRepository;

    @Autowired
    public ApiCallTest(@Value("${external.api.key}") String apiKeyOpenweather, @Value("${api.url}") String apiUrl, CityRepository cityRepository) {
        this.apiKeyOpenweather = apiKeyOpenweather;
        this.apiUrl = apiUrl;
        this.cityRepository = cityRepository;
    }

    @Transactional
    @Test
    public void canUpdateDailyForecast() {
        Long id = 1L;
        City city = cityRepository.findById(id).get();

        stubFor(get(urlEqualTo(apiUrl + "/onecall"))
                .withQueryParam("lat", equalTo(city.getLatitude().toString()))
                .withQueryParam("lon", equalTo(city.getLongitude().toString()))
                .withQueryParam("exclude", equalTo("current,minutely," + Exclude.HOURLY))
                .withQueryParam("appid", equalTo(apiKeyOpenweather))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(Data.dailyForecast)));

        restTemplate.put("http://localhost:" + port + "/forecast/update/" + id, null);
        List<DailyForecast> dailyForecast = cityRepository.findById(id).get().getDailyForecasts();

        assertFalse(dailyForecast.isEmpty());
    }

    @Transactional
    @Test
    public void canUpdateHourlyForecast() {
        Long id = 1L;
        City city = cityRepository.findById(id).get();

        stubFor(get(urlEqualTo(apiUrl + "/onecall"))
                .withQueryParam("lat", equalTo(city.getLatitude().toString()))
                .withQueryParam("lon", equalTo(city.getLongitude().toString()))
                .withQueryParam("exclude", equalTo("current,minutely," + Exclude.DAILY))
                .withQueryParam("appid", equalTo(apiKeyOpenweather))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(Data.hourlyForecast)));

        restTemplate.put("http://localhost:" + port + "/forecast/update/" + id, null);
        List<HourlyForecast> hourlyForecasts = cityRepository.findById(id).get().getHourlyForecasts();

        assertFalse(hourlyForecasts.isEmpty());
    }

    @Transactional
    @Test
    public void canGetDailyForecast() {
        Long id = 1L;
        City city = cityRepository.findById(id).get();
        List<DailyForecastDto> dailyForecastDtos = city.getDailyForecasts().stream()
                .map(dailyForecast -> new DailyForecastDto(
                        dailyForecast.getTemperatures(),
                        dailyForecast.getPressure(),
                        dailyForecast.getHumidity(),
                        dailyForecast.getWindSpeed(),
                        dailyForecast.getDateTime().toString()))
                .toList();

        ResponseEntity<List<DailyForecastDto>> response = restTemplate.exchange(
                "http://localhost:" + port + "/forecast/" + id + "/daily",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        assertEquals(dailyForecastDtos, response.getBody());
    }

    @Transactional
    @Test
    public void canGetHourlyForecast() {
        Long id = 1L;
        City city = cityRepository.findById(id).get();
        List<HourlyForecastDto> hourlyForecastDtos = city.getHourlyForecasts().stream()
                .map(hourlyForecast -> new HourlyForecastDto(
                        hourlyForecast.getTemperature(),
                        hourlyForecast.getPressure(),
                        hourlyForecast.getHumidity(),
                        hourlyForecast.getWindSpeed(),
                        hourlyForecast.getDateTime().toString()))
                .toList();

        ResponseEntity<List<HourlyForecastDto>> response = restTemplate.exchange(
                "http://localhost:" + port + "/forecast/" + id + "/hourly",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        assertEquals(hourlyForecastDtos, response.getBody());
    }
}
