package com.j_norrman.weatherapp.controller;
import com.j_norrman.weatherapp.model.weather.WeatherDataDTO;
import com.j_norrman.weatherapp.service.SearchHistoryService;
import com.j_norrman.weatherapp.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;


@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;
    private final SearchHistoryService searchHistoryService;

    public WeatherController(WeatherService weatherService, SearchHistoryService searchHistoryService) {
        this.weatherService = weatherService;
        this.searchHistoryService = searchHistoryService;
    }

    @GetMapping
    public Mono<ResponseEntity<WeatherDataDTO>> getWeather(@RequestParam String city) {
        return weatherService.getWeatherData(city)
                .map(ResponseEntity::ok);
    }
    @GetMapping("/history")
    public ResponseEntity<List<String>> getSearchHistory() {
        List<String> history = searchHistoryService.getSearchHistory();
        return ResponseEntity.ok(history);
    }
}
