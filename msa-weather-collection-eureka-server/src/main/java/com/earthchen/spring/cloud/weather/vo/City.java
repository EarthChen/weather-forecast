package com.earthchen.spring.cloud.weather.vo;

import lombok.Data;


@Data
public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

}