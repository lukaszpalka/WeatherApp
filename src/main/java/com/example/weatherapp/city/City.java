package com.example.weatherapp.city;

import com.example.weatherapp.forecast.daily.DailyForecast;
import com.example.weatherapp.forecast.hourly.HourlyForecast;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "lat")
    private Double latitude;
    @Column(name = "lon")
    private Double longitude;

    @OneToMany(mappedBy = "city")
    private List<HourlyForecast> hourlyForecasts = new ArrayList<>();

    @OneToMany(mappedBy = "city")
    private List<DailyForecast> dailyForecasts = new ArrayList<>();
}
