package com.example.weatherapp.forecast.hourly;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HourlyForecastDto(
        @JsonProperty("temp") Double temp,
        Integer pressure,
        Integer humidity,
        @JsonProperty("wind_speed") Double windSpeed,
        @JsonProperty("dt") String dateTime) {
}
