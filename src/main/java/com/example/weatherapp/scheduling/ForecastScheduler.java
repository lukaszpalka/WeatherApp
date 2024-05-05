package com.example.weatherapp.scheduling;

import com.example.weatherapp.city.CityService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ForecastScheduler {

    private final CityService cityService;

    public ForecastScheduler(CityService cityService) {
        this.cityService = cityService;
    }

    @Scheduled(cron = "0 0 * ? * *")
    public void loadHourlyForecast() {
        cityService.getCityDtos().forEach(cityService::updateHourlyForecasts);
    }

    @Scheduled(cron = "0 0 0 ? * *")
    public void loadDailyForecast() {
        cityService.getCityDtos().forEach(cityService::updateDailyForecasts);
    }

}
