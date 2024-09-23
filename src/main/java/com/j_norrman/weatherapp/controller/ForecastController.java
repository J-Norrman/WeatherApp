package com.j_norrman.weatherapp.controller;
import com.j_norrman.weatherapp.model.forecast.ForecastResponseDTO;
import com.j_norrman.weatherapp.service.ForecastService;
import com.j_norrman.weatherapp.service.SearchHistoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forecast")
public class ForecastController {
    private final ForecastService forecastService;
    private final SearchHistoryService searchHistoryService;


    public ForecastController(ForecastService forecastService, SearchHistoryService searchHistoryService) {
        this.forecastService = forecastService;
        this.searchHistoryService = searchHistoryService;
    }

    @GetMapping
    public ResponseEntity<ForecastResponseDTO> getForecast(@RequestParam String city) {
        ForecastResponseDTO forecastResponse = forecastService.getForecast(city);
        return ResponseEntity.ok(forecastResponse);
    }
    @GetMapping("/history")
    public ResponseEntity<List<String>> getSearchHistory() {
        List<String> history = searchHistoryService.getSearchHistory();
        return ResponseEntity.ok(history);
    }
}
