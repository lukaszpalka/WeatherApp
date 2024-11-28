package com.example.weatherapp.webclient;


import com.example.weatherapp.city.CityDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class WeatherClient {

    private final WebClient webClient;
    private final String API_KEY_OPENWEATHER;

    public WeatherClient(WebClient.Builder webClientBuilder, @Value("${external.api.key}") String apiKeyOpenWeather, @Value("${api.url}") String apiUrl) {
        this.webClient = webClientBuilder.baseUrl(apiUrl).build();
        API_KEY_OPENWEATHER = apiKeyOpenWeather;
    }

    public WeatherResponse getWeatherResponse(CityDto cityDto, String exclude) {
        if (exclude != null) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder.path("/onecall")
                            .queryParam("lat", cityDto.latitude())
                            .queryParam("lon", cityDto.longitude())
                            .queryParam("exclude", "current,minutely")
                            .queryParam("appid", API_KEY_OPENWEATHER)
                            .build())
                    .retrieve()
                    .bodyToMono(WeatherResponse.class)
                    .block();
        } else {
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
}
