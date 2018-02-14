package com.earthchen.spring.cloud.weather.service;

import com.earthchen.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("micro-weather-data-eureka-client")
public interface WeatherDataClient {

    @GetMapping("/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
