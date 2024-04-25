package com.example.weatherapp.city;

import com.example.weatherapp.forecast.daily.DailyForecast;
import com.example.weatherapp.forecast.daily.DailyForecastDto;
import com.example.weatherapp.forecast.hourly.HourlyForecast;
import com.example.weatherapp.forecast.hourly.HourlyForecastDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city/all")
    public ResponseEntity<List<CityDto>> getAllCities() {
        return new ResponseEntity<>(cityService.getCityDtos(), HttpStatus.OK);
    }

    @PatchMapping("/city/{id}/update")
    public ResponseEntity updateCityDetails(@PathVariable("id") Long id, @RequestBody CityDto cityDto) {
        cityService.updateCityDetailsById(id, cityDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/city/forecast/{id}/hourly")
    public ResponseEntity<List<HourlyForecastDto>> getHourlyForecast(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cityService.getHourlyForecastsDtoById(id), HttpStatus.OK);
    }

    @GetMapping("/city/forecast/{id}/daily")
    public ResponseEntity<List<DailyForecastDto>> getDailyForecast(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cityService.getDailyForecastsDtoById(id), HttpStatus.OK);
    }

    @PatchMapping("/city/forecast/update/{id}")
    public ResponseEntity updateForecasts(@PathVariable("id") Long id) {
        cityService.updateForecastsById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/city/forecast/update/all")
    public ResponseEntity updateForecasts() {
        cityService.updateAllForecasts();
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/city/coord/{id}")
    public ResponseEntity getCityDtoById(@PathVariable("id") Long id) {
        return new ResponseEntity(cityService.getCityDtoById(id), HttpStatus.OK);
    }
}
