package com.example.weatherapp.forecast;

import com.example.weatherapp.city.City;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class Forecast {
    protected LocalDateTime dateTime;
    protected Integer pressure;
    protected Integer humidity;
    protected Double windSpeed;
}
