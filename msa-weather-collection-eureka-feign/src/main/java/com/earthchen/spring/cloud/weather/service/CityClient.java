package com.earthchen.spring.cloud.weather.service;

import com.earthchen.spring.cloud.weather.vo.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("micro-weather-eureka-client-feign")
public interface CityClient {

    @GetMapping("/cities")
    List<City> listCity() throws Exception;
}
