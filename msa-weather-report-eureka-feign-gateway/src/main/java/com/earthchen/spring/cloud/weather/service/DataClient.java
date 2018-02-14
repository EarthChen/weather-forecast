package com.earthchen.spring.cloud.weather.service;

import com.earthchen.spring.cloud.weather.vo.City;
import com.earthchen.spring.cloud.weather.vo.WeatherResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 直接依赖与网关
 */
@FeignClient("msa-weather-eureka-client-zuul")
public interface DataClient {
    /**
     * 获取城市列表
     *
     * @return
     * @throws Exception
     */
    @GetMapping("/city/cities")
    List<City> listCity() throws Exception;

    /**
     * 根据城市ID查询天气数据
     */
    @GetMapping("/data/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
