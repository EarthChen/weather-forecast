package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableDiscoveryClient
@SpringBootApplication
@EnableScheduling
@EnableFeignClients
public class WeatherCollectionEurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCollectionEurekaFeignApplication.class, args);
    }

}
