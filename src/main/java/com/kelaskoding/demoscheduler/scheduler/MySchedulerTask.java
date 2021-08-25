package com.kelaskoding.demoscheduler.scheduler;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
// @EnableAsync
public class MySchedulerTask {
    
    // @Async
    // @Scheduled(fixedDelay = 1000, initialDelay = 2000)
    @Scheduled(cron="0 * * ? * *")
    public void myFirstTask(){
        // fungsi scheduler harus void dan tanpa parameter
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Task executed at "+ fmt.format(System.currentTimeMillis()));
        // Thread.sleep(10000);
    }
}
