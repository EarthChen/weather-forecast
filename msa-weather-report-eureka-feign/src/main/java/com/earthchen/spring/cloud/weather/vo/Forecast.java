package com.earthchen.spring.cloud.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 未来天气.
 */
@Data
public class Forecast implements Serializable{

    private static final long serialVersionUID = -2657364199493193554L;

    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
}
