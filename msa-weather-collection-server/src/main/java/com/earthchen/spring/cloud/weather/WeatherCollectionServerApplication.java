package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class WeatherCollectionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherCollectionServerApplication.class, args);
    }

}
