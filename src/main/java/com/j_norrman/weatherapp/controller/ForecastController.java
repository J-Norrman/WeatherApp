package com.j_norrman.weatherapp.controller;

import com.j_norrman.weatherapp.model.ApiResponse;
import com.j_norrman.weatherapp.model.ErrorResponse;
import com.j_norrman.weatherapp.model.forecast.ForecastResponse;
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
    public ResponseEntity<ApiResponse> getForecast(@RequestParam String city) {
        try {
            ForecastResponseDTO forecastResponse = forecastService.getForecast(city);
            return ResponseEntity.ok(forecastResponse);
        } catch (HttpClientErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorResponse("Invalid city name or API request failed", HttpStatus.BAD_REQUEST.value()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ErrorResponse("An unexpected error occurred", HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
    }
}
