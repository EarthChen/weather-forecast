package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
public class WeatherCollectionEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCollectionEurekaServerApplication.class, args);
    }

}
