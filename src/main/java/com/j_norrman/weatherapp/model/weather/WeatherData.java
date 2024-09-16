package com.j_norrman.weatherapp.model.weather;

import java.util.List;

public class WeatherData {

    private String wind_cdir; //+
    private int rh;
    private String pod;
    private double lon;
    private double pres;
    private String timezone; //+
    private String ob_time; //+
    private String country_code;
    private int clouds;
    private double vis;
    private double wind_spd;
    private double gust;
    private String wind_cdir_full;
    private double app_temp;
    private String state_code;
    private long ts;
    private double h_angle;
    private double dewpt;
    private WeatherDescription weather;
    private double uv;
    private int aqi;
    private String station;
    private List<String> sources;
    private int wind_dir;
    private double elev_angle;
    private String datetime;
    private double precip;
    private double ghi;
    private double dni;
    private double dhi;
    private double solar_rad;
    private String city_name;
    private String sunrise;
    private String sunset;
    private double temp;
    private double lat;
    private double slp;


    public String getWind_cdir() { return wind_cdir; }
    public void setWind_cdir(String wind_cdir) { this.wind_cdir = wind_cdir; }

    public int getRh() { return rh; }
    public void setRh(int rh) { this.rh = rh; }

    public String getPod() { return pod; }
    public void setPod(String pod) { this.pod = pod; }

    public double getLon() { return lon; }
    public void setLon(double lon) { this.lon = lon; }

    public double getPres() { return pres; }
    public void setPres(double pres) { this.pres = pres; }

    public String getTimezone() { return timezone; }
    public void setTimezone(String timezone) { this.timezone = timezone; }

    public String getOb_time() { return ob_time; }
    public void setOb_time(String ob_time) { this.ob_time = ob_time; }

    public String getCountry_code() { return country_code; }
    public void setCountry_code(String country_code) { this.country_code = country_code; }

    public int getClouds() { return clouds; }
    public void setClouds(int clouds) { this.clouds = clouds; }

    public double getVis() { return vis; }
    public void setVis(double vis) { this.vis = vis; }

    public double getWind_spd() { return wind_spd; }
    public void setWind_spd(double wind_spd) { this.wind_spd = wind_spd; }

    public double getGust() { return gust; }
    public void setGust(double gust) { this.gust = gust; }

    public String getWind_cdir_full() { return wind_cdir_full; }
    public void setWind_cdir_full(String wind_cdir_full) { this.wind_cdir_full = wind_cdir_full; }

    public double getApp_temp() { return app_temp; }
    public void setApp_temp(double app_temp) { this.app_temp = app_temp; }

    public String getState_code() { return state_code; }
    public void setState_code(String state_code) { this.state_code = state_code; }

    public long getTs() { return ts; }
    public void setTs(long ts) { this.ts = ts; }

    public double getH_angle() { return h_angle; }
    public void setH_angle(double h_angle) { this.h_angle = h_angle; }

    public double getDewpt() { return dewpt; }
    public void setDewpt(double dewpt) { this.dewpt = dewpt; }

    public WeatherDescription getWeather() { return weather; }
    public void setWeather(WeatherDescription weather) { this.weather = weather; }

    public double getUv() { return uv; }
    public void setUv(double uv) { this.uv = uv; }

    public int getAqi() { return aqi; }
    public void setAqi(int aqi) { this.aqi = aqi; }

    public String getStation() { return station; }
    public void setStation(String station) { this.station = station; }

    public List<String> getSources() { return sources; }
    public void setSources(List<String> sources) { this.sources = sources; }

    public int getWind_dir() { return wind_dir; }
    public void setWind_dir(int wind_dir) { this.wind_dir = wind_dir; }

    public double getElev_angle() { return elev_angle; }
    public void setElev_angle(double elev_angle) { this.elev_angle = elev_angle; }

    public String getDatetime() { return datetime; }
    public void setDatetime(String datetime) { this.datetime = datetime; }

    public double getPrecip() { return precip; }
    public void setPrecip(double precip) { this.precip = precip; }

    public double getGhi() { return ghi; }
    public void setGhi(double ghi) { this.ghi = ghi; }

    public double getDni() { return dni; }
    public void setDni(double dni) { this.dni = dni; }

    public double getDhi() { return dhi; }
    public void setDhi(double dhi) { this.dhi = dhi; }

    public double getSolar_rad() { return solar_rad; }
    public void setSolar_rad(double solar_rad) { this.solar_rad = solar_rad; }

    public String getCity_name() { return city_name; }
    public void setCity_name(String city_name) { this.city_name = city_name; }

    public String getSunrise() { return sunrise; }
    public void setSunrise(String sunrise) { this.sunrise = sunrise; }

    public String getSunset() { return sunset; }
    public void setSunset(String sunset) { this.sunset = sunset; }

    public double getTemp() { return temp; }
    public void setTemp(double temp) { this.temp = temp; }

    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }

    public double getSlp() { return slp; }
    public void setSlp(double slp) { this.slp = slp; }
}
