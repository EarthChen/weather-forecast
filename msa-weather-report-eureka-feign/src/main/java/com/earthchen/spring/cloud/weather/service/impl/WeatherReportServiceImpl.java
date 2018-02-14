package com.earthchen.spring.cloud.weather.service.impl;

import com.earthchen.spring.cloud.weather.service.WeatherDataClient;
import com.earthchen.spring.cloud.weather.service.WeatherReportService;
import com.earthchen.spring.cloud.weather.vo.Weather;
import com.earthchen.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Weather Report Service.
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {


    @Autowired
    private WeatherDataClient weatherDataClient;

    @Override
    public Weather getDataByCityId(String cityId) {

        // 由天气数据API微服务来提供
        WeatherResponse resp = weatherDataClient.getDataByCityId(cityId);
        Weather data = resp.getData();
        return data;
    }
}
