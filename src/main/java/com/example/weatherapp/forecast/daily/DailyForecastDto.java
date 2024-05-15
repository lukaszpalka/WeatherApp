package com.example.weatherapp.forecast.daily;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

public record DailyForecastDto(
        @JsonProperty("temp") Map<String, BigDecimal> temperatures,
        Integer pressure,
        Integer humidity,
        @JsonProperty("wind_speed") Double windSpeed,
        @JsonProperty("dt") String dateTime) {
}
