package com.j_norrman.weatherapp.controller;

import com.j_norrman.weatherapp.model.ApiResponse;
import com.j_norrman.weatherapp.exception.ErrorResponse;
import com.j_norrman.weatherapp.model.forecast.ForecastResponseDTO;
import com.j_norrman.weatherapp.service.ForecastService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/forecast")
public class ForecastController {
    private final ForecastService forecastService;

    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping
    public ResponseEntity<ForecastResponseDTO> getForecast(@RequestParam String city) {
        ForecastResponseDTO forecastResponse = forecastService.getForecast(city);
        return ResponseEntity.ok(forecastResponse);
    }
}
