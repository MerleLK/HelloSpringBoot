package com.hello.base.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/** 定时任务
 * Created by merle on 17-5-27.
 */

@Configuration
@EnableScheduling
public class SchedulingConfig {

//    @Scheduled(cron = "0/20****?")  // 注意cron表达式  http://www.manpagez.com/man/5/crontab/
//    @Scheduled(fixedRate = 5000)  // 每个5秒执行一次该函数
//    public void scheduler(){
//        System.out.println(">>>>>>>>>>SchedulingConfig.scheduler()......");
//    }


}
