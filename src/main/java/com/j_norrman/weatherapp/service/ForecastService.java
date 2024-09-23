package com.j_norrman.weatherapp.service;
import com.j_norrman.weatherapp.model.forecast.DailyForecastDTO;
import com.j_norrman.weatherapp.model.forecast.ForecastData;
import com.j_norrman.weatherapp.model.forecast.ForecastResponse;
import com.j_norrman.weatherapp.model.forecast.ForecastResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ForecastService {
    @Value("${apiKEY}")
    private String API_KEY;
    @Value("${apiURLFC}")
    private String API_URLFC;

    private final SearchHistoryService searchHistoryService;

    @Autowired
    public ForecastService(SearchHistoryService searchHistoryService) {
        this.searchHistoryService = searchHistoryService;
    }

    public ForecastResponseDTO getForecast(String city) {
        searchHistoryService.addCityToHistory(city);
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URLFC.replace("{city}", city).replace("{key}", API_KEY);

        ForecastResponse forecastResponse = restTemplate.getForObject(url, ForecastResponse.class);
        if (forecastResponse != null && forecastResponse.getData() != null && !forecastResponse.getData().isEmpty()) {
            List<DailyForecastDTO> forecastDataList = convertToDailyForecasts(forecastResponse);
            return new ForecastResponseDTO(forecastResponse.getCity_name(), forecastDataList);
        }
        return null; 
    }

    private static List<DailyForecastDTO> convertToDailyForecasts(ForecastResponse forecastResponse) {
        List<DailyForecastDTO> forecastDataList = new ArrayList<>();

        for (ForecastData data : forecastResponse.getData()) {
            LocalDate date = LocalDate.parse(data.getValid_date());
            String dayOfWeek = date.getDayOfWeek().name();
            DailyForecastDTO dailyForecast = new DailyForecastDTO(
                    data.getTemp(),
                    data.getMax_temp(),
                    data.getMin_temp(),
                    data.getWind_spd(),
                    data.getWind_cdir_full(),
                    data.getValid_date(),
                    dayOfWeek
            );
            forecastDataList.add(dailyForecast);
        }
        return forecastDataList;
    }
}
