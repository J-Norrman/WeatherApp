package com.j_norrman.weatherapp.controller;

import com.j_norrman.weatherapp.model.ApiResponse;
import com.j_norrman.weatherapp.model.ErrorResponse;
import com.j_norrman.weatherapp.model.WeatherResponse;
import com.j_norrman.weatherapp.service.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping
    public ResponseEntity<ApiResponse> getWeather(@RequestParam String city) {
        try {
            WeatherResponse weatherResponse = weatherService.getCurrentWeather(city);
            return ResponseEntity.ok(weatherResponse);
        } catch (HttpClientErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorResponse("Invalid city name or API request failed", HttpStatus.BAD_REQUEST.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ErrorResponse("An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }
}
