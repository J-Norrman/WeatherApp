package com.j_norrman.weatherapp.model.forecast;

import com.j_norrman.weatherapp.model.ApiResponse;

import java.util.List;

public class ForecastResponseDTO implements ApiResponse {
    private String city_name;
    private List<DailyForecastDTO> forecasts;

    public ForecastResponseDTO() {}

    public ForecastResponseDTO(String city_name, List<DailyForecastDTO> forecasts) {
        this.city_name = city_name;
        this.forecasts = forecasts;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public List<DailyForecastDTO> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<DailyForecastDTO> forecasts) {
        this.forecasts = forecasts;
    }
}
