package com.chery.frida.coolweahter2.db;

import org.litepal.crud.DataSupport;

/**
 * 县
 * Created by Frida on 2017/8/30.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private  int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
