package com.earthchen.spring.cloud.weather.config;

import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;


/**
 * Quartz 配置
 */
@Configuration
public class QuartzConfiguration {

    @Autowired
    private MyJobFactory myJobFactory;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {

        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();

//        factory.setOverwriteExistingJobs(true);
        // 把job交给spring 来管理
        schedulerFactoryBean.setJobFactory(myJobFactory);

        // 延时启动
//        factory.setStartupDelay(2);

        // 加载quartz数据源配置
        //factory.set(quartzProperties());

        return schedulerFactoryBean;
    }


    @Bean
    public Scheduler scheduler() {
        return schedulerFactoryBean().getScheduler();
    }


}
