package com.example.weatherapp.forecast.hourly;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HourlyForecastRepository extends JpaRepository<HourlyForecast, Long> {

}
