package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class WeatherCityEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCityEurekaServerApplication.class, args);
    }

}
