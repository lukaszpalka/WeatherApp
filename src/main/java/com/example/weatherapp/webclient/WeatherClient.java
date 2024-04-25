package com.example.weatherapp.webclient;


import com.example.weatherapp.city.CityDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WeatherClient {

    private final WebClient webClient;
    private final String API_KEY_OPENWEATHER;

//    @Value("${api.url}")
//    private String apiUrl;

    public WeatherClient(WebClient.Builder webClientBuilder, @Value("${external.api.key}") String apiKeyOpenweather) {
        this.webClient = webClientBuilder.baseUrl("${api.url}").build();
        API_KEY_OPENWEATHER = apiKeyOpenweather;
    }

    public WeatherResponse getWeatherResponse(CityDto cityDto, String exclude) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/onecall")
                        .queryParam("lat", cityDto.latitude())
                        .queryParam("lon", cityDto.longitude())
                        .queryParam("exclude", "current,minutely," + exclude)
                        .queryParam("appid", API_KEY_OPENWEATHER)
                        .build())
                .retrieve()
                .bodyToMono(WeatherResponse.class)
                .block();
    }
}
