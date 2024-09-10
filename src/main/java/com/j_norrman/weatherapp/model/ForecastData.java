package com.j_norrman.weatherapp.model;

public class ForecastData {
    private String timestamp_local;
    private String timestamp_utc;
    private long ts;
    private String datetime;
    private double wind_gust_spd;
    private double wind_spd;
    private int wind_dir;
    private String wind_cdir;
    private String wind_cdir_full;
    private double temp;
    private double app_temp;
    private int pop;
    private double precip;
    private double snow;
    private double snow_depth;
    private double slp;
    private double pres;
    private double dewpt;
    private double rh;
    private ForecastDescription weather;
    private String pod;
    private int clouds_low;
    private int clouds_mid;
    private int clouds_hi;
    private int clouds;
    private double vis;
    private double dhi;
    private double dni;
    private double ghi;
    private double solar_rad;
    private double uv;
    private double ozone;

    public String getTimestamp_local() {
        return timestamp_local;
    }

    public void setTimestamp_local(String timestamp_local) {
        this.timestamp_local = timestamp_local;
    }

    public String getTimestamp_utc() {
        return timestamp_utc;
    }

    public void setTimestamp_utc(String timestamp_utc) {
        this.timestamp_utc = timestamp_utc;
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

    public double getApp_temp() {
        return app_temp;
    }

    public void setApp_temp(double app_temp) {
        this.app_temp = app_temp;
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

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
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

    public double getDhi() {
        return dhi;
    }

    public void setDhi(double dhi) {
        this.dhi = dhi;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public double getGhi() {
        return ghi;
    }

    public void setGhi(double ghi) {
        this.ghi = ghi;
    }

    public double getSolar_rad() {
        return solar_rad;
    }

    public void setSolar_rad(double solar_rad) {
        this.solar_rad = solar_rad;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }
}
