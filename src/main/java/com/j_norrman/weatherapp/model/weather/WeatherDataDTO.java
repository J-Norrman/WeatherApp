package com.j_norrman.weatherapp.model.weather;
import com.j_norrman.weatherapp.model.ApiResponse;

public class WeatherDataDTO implements ApiResponse {
    private String city_name;
    private String datetime;
    private double temp;
    private double wind_spd;
    private String wind_cdir_full;
    private String sunrise;
    private String sunset;
    private double precip;

    public WeatherDataDTO(){
    }

    public WeatherDataDTO(String city_name, String datetime, double temp, double wind_spd, String wind_cdir_full, String sunrise, String sunset, double precip) {
        this.city_name = city_name;
        this.datetime = datetime;
        this.temp = temp;
        this.wind_spd = wind_spd;
        this.wind_cdir_full = wind_cdir_full;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.precip = precip;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(double wind_spd) {
        this.wind_spd = wind_spd;
    }

    public String getWind_cdir_full() {
        return wind_cdir_full;
    }

    public void setWind_cdir_full(String wind_cdir_full) {
        this.wind_cdir_full = wind_cdir_full;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }
}
