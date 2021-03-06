package com.chery.frida.coolweahter2.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Frida on 2017/9/3.
 */

public class Weather {

    public String status;

    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
