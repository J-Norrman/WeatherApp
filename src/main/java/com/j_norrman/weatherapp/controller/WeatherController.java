package com.j_norrman.weatherapp.controller;

import com.j_norrman.weatherapp.model.ErrorResponse;
import com.j_norrman.weatherapp.model.weather.WeatherDataDTO;
import com.j_norrman.weatherapp.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

import java.util.function.Supplier;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public Mono<ResponseEntity<WeatherDataDTO>> getWeather(@RequestParam String city) {
        return weatherService.getWeatherData(city)
                .map(ResponseEntity::ok)
                .onErrorResume(e -> {
                    ErrorResponse errorResponse;
                    HttpStatusCode status;

                    if (e instanceof WebClientResponseException webClientException) {
                        status = webClientException.getStatusCode();
                        errorResponse = new ErrorResponse("Invalid city name or API request failed", status.value());
                    } else {
                        status = HttpStatus.INTERNAL_SERVER_ERROR;
                        errorResponse = new ErrorResponse("An unexpected error occurred", status.value());
                    }

                    return Mono.error((Supplier<? extends Throwable>) errorResponse);
                });
    }
    }
