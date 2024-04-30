package com.example.weatherapp.apitest;

import com.example.weatherapp.Data;
import com.example.weatherapp.city.CityDto;
import com.example.weatherapp.city.CityService;
import com.example.weatherapp.config.MySQLContainerConfig;
import com.example.weatherapp.forecast.daily.DailyForecastDto;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

//@WireMockTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExternalApiTest extends MySQLContainerConfig {

    @LocalServerPort
    private int port;

//    @Value("${external.api.key}")
//    private String apiKeyOpenweather;
//
//    @Value("${api.url}")
//    private String apiUrl;

//    private final CityService cityService;
//
//    public ExternalApiTest(CityService cityService) {
//        this.cityService = cityService;
//    }

    @Test
    public void testExternalApiCall() {
//        CityDto cityDto = cityService.getCityDtoById(1L);

        WireMockServer wireMockServer = new WireMockServer();
        WireMock.configureFor("localhost", 8081);

        WireMock.stubFor(get(urlEqualTo("${api.url}/onecall"))
//                .withQueryParam("lat", equalTo(cityDto.latitude().toString()))
//                .withQueryParam("lon", equalTo(cityDto.longitude().toString()))
                .withQueryParam("exclude", equalTo("current,minutely,hourly"))
                .withQueryParam("appid", equalTo("${external.api.key}"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
//                        .withBody("{ \"key\": \"value\" }")
                        .withBody(Data.dailyForecast)));

        wireMockServer.start();

//        cityService.getDailyForecastsFromAPI(cityDto);

//        List<DailyForecastDto> dailyForecastsDto = cityService.getDailyForecastsDtoById(cityDto.id());
////        assertEquals(cityDto.dailyForecasts().toString(), dailyForecastsDto.toString());
//        assertArrayEquals(cityDto.dailyForecasts().toArray(), dailyForecastsDto.toArray());

        wireMockServer.stop();

    }
}
