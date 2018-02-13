package com.earthchen.spring.cloud.weather.vo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@Data
public class City {

    private String cityId;

    private String cityName;

    private String cityCode;

    private String province;

}