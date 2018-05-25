package com.brobear.myweatherapplication.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //因为JSON中的一些字段可能不太适合直接作为Java字段来命名
    //所有使用@SerializedName注解的方式让JSON字段和Java字段之间建立映射关系

    @SerializedName("city")//// TODO: 2018/5/25 ??
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }


}