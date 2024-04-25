package com.example.weatherapp.forecast.daily;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record DailyForecastDto(
        @JsonProperty("temp") Map<String, Double> temperatures,
        Integer pressure,
        Integer humidity,
        @JsonProperty("wind_speed") Double windSpeed,
        @JsonProperty("dt") String dateTime) {
}
