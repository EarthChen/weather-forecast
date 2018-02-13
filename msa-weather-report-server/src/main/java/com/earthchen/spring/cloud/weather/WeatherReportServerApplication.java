package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class WeatherReportServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherReportServerApplication.class, args);
    }

}
