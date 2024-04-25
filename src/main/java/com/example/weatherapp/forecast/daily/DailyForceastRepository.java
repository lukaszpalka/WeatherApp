package com.example.weatherapp.forecast.daily;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyForceastRepository extends JpaRepository<DailyForecast, Long> {
}
