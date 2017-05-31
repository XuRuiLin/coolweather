package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by a‘Lin on 2017/5/25 0025.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
