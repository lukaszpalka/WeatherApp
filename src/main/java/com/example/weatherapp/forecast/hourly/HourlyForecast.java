package com.example.weatherapp.forecast.hourly;

import com.example.weatherapp.city.City;
import com.example.weatherapp.forecast.Forecast;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class HourlyForecast extends Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    Double temperature;
}
