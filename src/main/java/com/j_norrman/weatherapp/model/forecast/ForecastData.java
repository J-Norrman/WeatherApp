package com.j_norrman.weatherapp.model.forecast;

public class ForecastData {
    private String valid_date;
    private long ts;
    private String datetime;
    private double wind_gust_spd;
    private double wind_spd;
    private int wind_dir;
    private String wind_cdir;
    private String wind_cdir_full;
    private double temp;
    private double max_temp;
    private double min_temp;
    private double high_temp;
    private double low_temp;
    private double app_max_temp;
    private double app_min_temp;
    private int pop;
    private double precip;
    private double snow;
    private double snow_depth;
    private double slp;
    private double pres;
    private double dewpt;
    private double rh;
    private ForecastDescription weather;
    private int clouds_low;
    private int clouds_mid;
    private int clouds_hi;
    private int clouds;
    private double vis;
    private double max_dhi;
    private int uv;
    private double moon_phase;
    private double moon_phase_lunation;
    private long moonrise_ts;
    private long moonset_ts;
    private long sunrise_ts;
    private long sunset_ts;

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public double getWind_gust_spd() {
        return wind_gust_spd;
    }

    public void setWind_gust_spd(double wind_gust_spd) {
        this.wind_gust_spd = wind_gust_spd;
    }

    public double getWind_spd() {
        return wind_spd;
    }

    public void setWind_spd(double wind_spd) {
        this.wind_spd = wind_spd;
    }

    public int getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(int wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getWind_cdir() {
        return wind_cdir;
    }

    public void setWind_cdir(String wind_cdir) {
        this.wind_cdir = wind_cdir;
    }

    public String getWind_cdir_full() {
        return wind_cdir_full;
    }

    public void setWind_cdir_full(String wind_cdir_full) {
        this.wind_cdir_full = wind_cdir_full;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMax_temp() {
        return max_temp;
    }

    public void setMax_temp(double max_temp) {
        this.max_temp = max_temp;
    }

    public double getMin_temp() {
        return min_temp;
    }

    public void setMin_temp(double min_temp) {
        this.min_temp = min_temp;
    }

    public double getHigh_temp() {
        return high_temp;
    }

    public void setHigh_temp(double high_temp) {
        this.high_temp = high_temp;
    }

    public double getLow_temp() {
        return low_temp;
    }

    public void setLow_temp(double low_temp) {
        this.low_temp = low_temp;
    }

    public double getApp_max_temp() {
        return app_max_temp;
    }

    public void setApp_max_temp(double app_max_temp) {
        this.app_max_temp = app_max_temp;
    }

    public double getApp_min_temp() {
        return app_min_temp;
    }

    public void setApp_min_temp(double app_min_temp) {
        this.app_min_temp = app_min_temp;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }

    public double getSnow() {
        return snow;
    }

    public void setSnow(double snow) {
        this.snow = snow;
    }

    public double getSnow_depth() {
        return snow_depth;
    }

    public void setSnow_depth(double snow_depth) {
        this.snow_depth = snow_depth;
    }

    public double getSlp() {
        return slp;
    }

    public void setSlp(double slp) {
        this.slp = slp;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public double getDewpt() {
        return dewpt;
    }

    public void setDewpt(double dewpt) {
        this.dewpt = dewpt;
    }

    public double getRh() {
        return rh;
    }

    public void setRh(double rh) {
        this.rh = rh;
    }

    public ForecastDescription getWeather() {
        return weather;
    }

    public void setWeather(ForecastDescription weather) {
        this.weather = weather;
    }

    public int getClouds_low() {
        return clouds_low;
    }

    public void setClouds_low(int clouds_low) {
        this.clouds_low = clouds_low;
    }

    public int getClouds_mid() {
        return clouds_mid;
    }

    public void setClouds_mid(int clouds_mid) {
        this.clouds_mid = clouds_mid;
    }

    public int getClouds_hi() {
        return clouds_hi;
    }

    public void setClouds_hi(int clouds_hi) {
        this.clouds_hi = clouds_hi;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public double getVis() {
        return vis;
    }

    public void setVis(double vis) {
        this.vis = vis;
    }

    public double getMax_dhi() {
        return max_dhi;
    }

    public void setMax_dhi(double max_dhi) {
        this.max_dhi = max_dhi;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public double getMoon_phase() {
        return moon_phase;
    }

    public void setMoon_phase(double moon_phase) {
        this.moon_phase = moon_phase;
    }

    public double getMoon_phase_lunation() {
        return moon_phase_lunation;
    }

    public void setMoon_phase_lunation(double moon_phase_lunation) {
        this.moon_phase_lunation = moon_phase_lunation;
    }

    public long getMoonrise_ts() {
        return moonrise_ts;
    }

    public void setMoonrise_ts(long moonrise_ts) {
        this.moonrise_ts = moonrise_ts;
    }

    public long getMoonset_ts() {
        return moonset_ts;
    }

    public void setMoonset_ts(long moonset_ts) {
        this.moonset_ts = moonset_ts;
    }

    public long getSunrise_ts() {
        return sunrise_ts;
    }

    public void setSunrise_ts(long sunrise_ts) {
        this.sunrise_ts = sunrise_ts;
    }

    public long getSunset_ts() {
        return sunset_ts;
    }

    public void setSunset_ts(long sunset_ts) {
        this.sunset_ts = sunset_ts;
    }
}
