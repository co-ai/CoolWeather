package com.example.pec.cow.gson;

import com.google.gson.annotations.SerializedName;

//所在城市的天气ID和更新时间
public class Basic {

    @SerializedName("city")        //注解,JSON字段和JAVA字段建立映射
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
