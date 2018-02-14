package com.earthchen.spring.cloud.weather;


import com.earthchen.spring.cloud.weather.util.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RestTemplateTest {

    @Autowired
    private RestTemplate restTemplate;


    @Test
    public void getData() {

        String ob = HttpClientUtil.doGet("http://wthrcdn.etouch.cn/weather_mini?citykey=101280101");
//        String ob = restTemplate.getForEntity("http://127.0.0.1:8080/rooms/list", String.class).getBody();
        log.info(ob);

    }
}
