package com.example.weatherapp.city;

import com.example.weatherapp.forecast.daily.DailyForecast;
import com.example.weatherapp.forecast.hourly.HourlyForecast;

import java.util.List;

public record CityDto(Long id, String name, Double latitude, Double longitude, List<HourlyForecast> hourlyForecasts, List<DailyForecast> dailyForecasts) {
}
