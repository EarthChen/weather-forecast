package com.earthchen.spring.cloud.weather;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 集成redis
 */
@SpringBootApplication
public class WeatherRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherRedisApplication.class, args);
    }

}
