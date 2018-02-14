package com.earthchen.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Weather 响应体
 */
@Data
public class WeatherResponse implements Serializable{

    private static final long serialVersionUID = 2179333534820222218L;

    private Weather data;
    private Integer status;
    private String desc;
}
