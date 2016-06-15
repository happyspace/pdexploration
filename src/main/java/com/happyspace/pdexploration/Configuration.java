package com.happyspace.pdexploration;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Created by Eddie Warner on 6/15/2016.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ThreadPoolTaskScheduler nfsThreadPoolTaskScheduler(){
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("NFS Task-");
        scheduler.setPoolSize(Runtime.getRuntime().availableProcessors());
        scheduler.setRemoveOnCancelPolicy(true);
        return scheduler;
    }

}
