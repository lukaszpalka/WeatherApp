package com.example.weatherapp.webclient;

import com.example.weatherapp.forecast.daily.DailyForecastDto;
import com.example.weatherapp.forecast.hourly.HourlyForecastDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {
    @JsonProperty("hourly")
    private List<HourlyForecastDto> hourlyForecasts;
    @JsonProperty("daily")
    private List<DailyForecastDto> dailyForecasts;
}
