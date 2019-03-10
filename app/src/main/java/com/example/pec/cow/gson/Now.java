package com.example.pec.cow.gson;

import com.google.gson.annotations.SerializedName;

//当前天气信息

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
