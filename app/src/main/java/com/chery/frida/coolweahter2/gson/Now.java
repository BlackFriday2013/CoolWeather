package com.chery.frida.coolweahter2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Frida on 2017/9/3.
 */

public class Now {

    @SerializedName("tem")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("tex")
        public String info;
    }
}
