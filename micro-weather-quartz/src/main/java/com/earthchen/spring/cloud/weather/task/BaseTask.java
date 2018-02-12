package com.earthchen.spring.cloud.weather.task;


import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * quartz 定时任务基类
 */
public abstract class BaseTask implements Job {


    @Autowired
    private Scheduler scheduler;


    /**
     * 定义jobDetail
     * <p>
     * 定义Trigger
     */
    @PostConstruct  // 等同于init-method的配置
    public void init() {

//        定义jobDetail
        JobDetail jobDetail = JobBuilder.newJob(this.getClass())
                .withIdentity(this.getClass().getSimpleName() + "_job",
                        this.getClass().getSimpleName() + "_group").build();


//        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
//                // 每隔TIME秒执行一次
//                .withIntervalInSeconds(2).repeatForever();

        // 子类提供cron
        String cronExpression = getCronExpression();

//        定义Trigger
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity(this.getClass().getSimpleName() + "_trigger",
                        this.getClass().getSimpleName() + "_group")
                .withSchedule(CronScheduleBuilder.cronSchedule(cronExpression)).build();

        // 启动job
        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public abstract String getCronExpression();

    public abstract void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException;
}
