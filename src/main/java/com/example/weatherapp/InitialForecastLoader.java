package com.example.weatherapp;

import com.example.weatherapp.city.CityService;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
public class InitialForecastLoader {

    private final CityService cityService;
    private final JdbcTemplate jdbcTemplate;

    public InitialForecastLoader(CityService cityService, JdbcTemplate jdbcTemplate) {
        this.cityService = cityService;
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    public void loadForecast() {
        loadSqlData();
        cityService.updateAllForecasts();
    }

    private void loadSqlData() {
        try {
            ClassPathResource resource = new ClassPathResource("data.sql");
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            String[] initialSqlQueries = reader.lines().collect(Collectors.joining()).split(";");
            for (String sql : initialSqlQueries) {
                if (!sql.trim().isEmpty()) {
                    jdbcTemplate.execute(sql);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
