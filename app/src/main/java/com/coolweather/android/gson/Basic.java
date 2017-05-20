package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 周璇 on 2017/5/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
