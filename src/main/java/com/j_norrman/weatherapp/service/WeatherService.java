package com.j_norrman.weatherapp.service;

import com.j_norrman.weatherapp.model.ForecastResponse;
import com.j_norrman.weatherapp.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${apiKEY}")
    private String API_KEY;
    @Value("${apiURL}")
    private String API_URL;
//    @Value("${apiURLFC}")
//    private String API_URLFC;

    public WeatherResponse getCurrentWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL.replace("{city}", city).replace("{key}", API_KEY);

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
//    public ForecastResponse getForecast(String city) {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = API_URLFC.replace("{city}", city).replace("{key}", API_KEY);
//        System.out.println(url);
//        return restTemplate.getForObject(url, ForecastResponse.class);
//    }
}
