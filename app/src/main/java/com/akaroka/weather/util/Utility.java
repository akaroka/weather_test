package com.akaroka.weather.util;

import android.text.TextUtils;

import com.akaroka.weather.db.City;
import com.akaroka.weather.db.Province;
import com.akaroka.weather.db.County;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i =0;i<allProvinces.length();i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();

                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse(String response, int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCitys = new JSONArray(response);
                for (int i =0;i<allCitys.length();i++) {
                    JSONObject cityObject = allCitys.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse(String response, int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i =0;i<allCounties.length();i++) {
                    JSONObject countObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countObject.getString("name"));
                    county.setWeatherId(countObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();

                }
            } catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

}
