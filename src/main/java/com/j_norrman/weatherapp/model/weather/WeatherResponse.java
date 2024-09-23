package com.j_norrman.weatherapp.model.weather;
import java.util.List;

public class WeatherResponse  {
    private int count;
    private List<WeatherData> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<WeatherData> getData() {
        return data;
    }

    public void setData(List<WeatherData> data) {
        this.data = data;
    }
}
