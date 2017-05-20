package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 周璇 on 2017/5/19.
 */

public class Forecast {
    @SerializedName("date")
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
