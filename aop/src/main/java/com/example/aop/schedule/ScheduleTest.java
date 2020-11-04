package com.example.aop.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {


  /*  @Scheduled(cron = "3 * * * * ?")
    public static void sy(){
        System.out.println("3秒钟一次");
    }*/

    //@Scheduled(fixedRate = 1000*2)
    public static void syone(){
        System.out.println("2秒钟一次");
    }

}
