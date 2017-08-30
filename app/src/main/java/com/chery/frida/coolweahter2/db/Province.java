package com.chery.frida.coolweahter2.db;

import org.litepal.crud.DataSupport;

/**
 * 省
 * Created by Frida on 2017/8/30.
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
