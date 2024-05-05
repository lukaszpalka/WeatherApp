package com.example.weatherapp.city;

import com.example.weatherapp.forecast.daily.DailyForecastDto;
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

    @GetMapping("/city/{id}")
    public ResponseEntity<CityDto> getCity(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cityService.getCityDtoById(id), HttpStatus.OK);
    }

    @PutMapping("/city/{id}/update")
    public ResponseEntity updateCityDetails(@PathVariable("id") Long id, @RequestBody CityDto cityDto) {
        cityService.updateCityDetailsById(id, cityDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/forecast/{id}/hourly")
    public ResponseEntity<List<HourlyForecastDto>> getHourlyForecast(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cityService.getHourlyForecastDtosById(id), HttpStatus.OK);
    }

    @GetMapping("/forecast/{id}/daily")
    public ResponseEntity<List<DailyForecastDto>> getDailyForecast(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cityService.getDailyForecastDtosById(id), HttpStatus.OK);
    }

    @PutMapping("/forecast/update/{id}")
    public ResponseEntity updateForecasts(@PathVariable("id") Long id) {
        cityService.updateForecastsById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/forecast/update/all")
    public ResponseEntity updateForecasts() {
        cityService.updateAllForecasts();
        return new ResponseEntity(HttpStatus.OK);
    }
}
