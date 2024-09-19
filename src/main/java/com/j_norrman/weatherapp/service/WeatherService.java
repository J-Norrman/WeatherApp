package com.j_norrman.weatherapp.service;

import com.j_norrman.weatherapp.model.weather.WeatherData;
import com.j_norrman.weatherapp.model.weather.WeatherDataDTO;
import com.j_norrman.weatherapp.model.weather.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {
    @Value("${apiKEY}")
    private String API_KEY;
    @Value("${apiURL}")
    private String API_URL;

    private final WebClient webClient;

    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(API_URL).build();
    }

    public Mono<WeatherResponse> getCurrentWeather(String city) {
        String url = API_URL.replace("{city}", city).replace("{key}", API_KEY);

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }

    public Mono<WeatherDataDTO> getWeatherData(String city) {
        return getCurrentWeather(city).flatMap(weatherResponse -> {
            if (weatherResponse.getData() != null && !weatherResponse.getData().isEmpty()) {
                WeatherData weatherData = weatherResponse.getData().get(0);
                WeatherDataDTO weatherDataDTO = new WeatherDataDTO(
                        weatherData.getCity_name(),
                        weatherData.getDatetime(),
                        weatherData.getTemp(),
                        weatherData.getWind_spd(),
                        weatherData.getWind_cdir_full(),
                        weatherData.getSunrise(),
                        weatherData.getSunset(),
                        weatherData.getPrecip()
                );

                return Mono.just(weatherDataDTO);
            } else {
                return Mono.error(new RuntimeException("No weather data available"));
            }
        });
    }
}

