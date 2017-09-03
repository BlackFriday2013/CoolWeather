package com.chery.frida.coolweahter2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Frida on 2017/9/3.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    private class More {
        @SerializedName("txt_d")
        public String info;
    }
}
