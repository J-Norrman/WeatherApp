package com.j_norrman.weatherapp.service;

import com.j_norrman.weatherapp.model.ForecastResponse;
import com.j_norrman.weatherapp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ForecastService {
    @Value("${apiKEY}")
    private String API_KEY;
    @Value("${apiURLFC}")
    private String API_URLFC;

    public ForecastResponse getForecast(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URLFC.replace("{city}", city).replace("{key}", API_KEY);

        return restTemplate.getForObject(url, ForecastResponse.class);
    }
}
