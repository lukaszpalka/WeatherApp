package com.example.weatherapp.forecast.daily;

import com.example.weatherapp.city.City;
import com.example.weatherapp.forecast.Forecast;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Map;

@Data
@Entity
public class DailyForecast extends Forecast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @ElementCollection
    Map<String, Double> temperatures;
}
