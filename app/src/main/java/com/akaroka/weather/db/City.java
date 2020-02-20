package com.akaroka.weather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport{

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCityName(){ return cityName;}

    public void setCityName(String cityName) {this.cityName = cityName;}

    public int getCityCode() { return cityCode;}

    public void setCityCode(int Code) { this.cityCode = Code;}

    public int getProvinceId() {return provinceId;}

    public void setProvinceId(int id) {this.provinceId=id;}

}
