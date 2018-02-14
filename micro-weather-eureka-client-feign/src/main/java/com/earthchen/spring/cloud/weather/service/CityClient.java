package com.earthchen.spring.cloud.weather.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * City Client.
 */
@FeignClient("micro-weather-city-eureka-client")
public interface CityClient {

    @GetMapping("/cities")
    String listCity();
}
