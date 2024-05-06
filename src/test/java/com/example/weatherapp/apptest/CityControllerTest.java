package com.example.weatherapp.apptest;

import com.example.weatherapp.city.CityDto;
import com.example.weatherapp.city.CityRepository;
import com.example.weatherapp.config.MySQLContainerConfig;
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
                        city.getHourlyForecasts(),
                        city.getDailyForecasts()))
                .collect(Collectors.toList());

        try {
            ResponseEntity<List<CityDto>> response = restTemplate.exchange(
                    "http://localhost:" + port + "/city/all",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<>() {
                    });
            assertEquals(cityDtos, response.getBody());
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
