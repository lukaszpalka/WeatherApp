package com.example.weatherapp.apptest;

import com.example.weatherapp.city.CityDto;
import com.example.weatherapp.city.CityRepository;
import com.example.weatherapp.config.MySQLContainerConfig;
import com.example.weatherapp.forecast.hourly.HourlyForecast;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CityControllerTest extends MySQLContainerConfig {

    @LocalServerPort
    private int port;

    private final TestRestTemplate restTemplate = new TestRestTemplate();
    private final CityRepository cityRepository;

    @Autowired
    public CityControllerTest(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Transactional
    @Test
    public void canGetCityDtos() {
        try {
            ResponseEntity<List<CityDto>> response = restTemplate.exchange(
                    "http://localhost:" + port + "/city/all",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    });
            assertTrue(response.hasBody());
        } catch (RestClientException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Transactional
    @Test
    public void shouldCityDtosBeEqualToResponseBody() {
        List<CityDto> cityDtos = cityRepository.findAll().stream()
                .map(city -> new CityDto(
                        city.getId(),
                        city.getName(),
                        city.getLatitude(),
                        city.getLongitude(),
                        city.getHourlyForecasts().stream()
                                .peek(hourlyForecast -> {
                                    Double roundedTemperature = Math.round(hourlyForecast.getTemperature() * 100.0) / 100.0;
                                    hourlyForecast.setTemperature(roundedTemperature);
                                }).toList(),
                        city.getDailyForecasts().stream()
                                .peek(dailyForecast -> {
                                    Map<String, Double> roundedTemperatures = dailyForecast.getTemperatures().entrySet().stream().collect(Collectors.toMap(
                                            Map.Entry::getKey,
                                            stringDoubleEntry -> Math.round(stringDoubleEntry.getValue() * 100.0) / 100.0));
                                    dailyForecast.setTemperatures(roundedTemperatures);
                                }).toList()))
                .collect(Collectors.toList());

        try {
            ResponseEntity<List<CityDto>> response = restTemplate.exchange(
                    "http://localhost:" + port + "/city/all",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    });

            List<CityDto> body = response.getBody().stream()
                    .peek(cityDto -> {
                        cityDto.hourlyForecasts().forEach(hourlyForecast -> {
                            Double roundedTemperature = Math.round(hourlyForecast.getTemperature() * 100.0) / 100.0;
                            hourlyForecast.setTemperature(roundedTemperature);
                        });
                        cityDto.dailyForecasts().forEach(dailyForecast -> {
                            Map<String, Double> roundedTemperatures = dailyForecast.getTemperatures().entrySet().stream().collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    stringDoubleEntry -> Math.round(stringDoubleEntry.getValue() * 100.0) / 100.0));
                            dailyForecast.setTemperatures(roundedTemperatures);
                        });
                    })
                    .toList();

            assertEquals(cityDtos, body);
        } catch (RestClientException e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }

    @Transactional
    @Test
    public void shouldThrowRestClientException() {
        try {
            ResponseEntity<List<CityDto>> response = restTemplate.exchange(
                    "http://localhost:" + port + "/city/all/",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    });
            fail("exception not thrown");
        } catch (RestClientException e) {
            assertEquals("org.springframework.web.client.RestClientException", e.getClass().getCanonicalName());
        }
    }
}
