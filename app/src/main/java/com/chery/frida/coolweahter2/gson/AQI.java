package com.chery.frida.coolweahter2.gson;

/**
 * Created by Frida on 2017/9/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
