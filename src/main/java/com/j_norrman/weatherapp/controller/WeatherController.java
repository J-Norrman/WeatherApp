package com.j_norrman.weatherapp.controller;

import com.j_norrman.weatherapp.exception.ErrorResponse;
import com.j_norrman.weatherapp.exception.ResourceNotFoundException;
import com.j_norrman.weatherapp.model.ApiResponse;
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
                .map(ResponseEntity::ok);
    }
    }
