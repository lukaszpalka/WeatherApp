package com.example.weatherapp.forecast.daily;

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

    @Column(name = "city_id")
    Long cityId;

    @ElementCollection
    Map<String, Double> temperatures;
}
