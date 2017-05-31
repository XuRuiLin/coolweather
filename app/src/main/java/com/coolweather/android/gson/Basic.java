package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by a‘Lin on 2017/5/25 0025.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
