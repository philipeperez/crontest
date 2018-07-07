package com.perez.crontest.cron;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class CronTest {
    @Scheduled(cron = "0/5 * * 1/1 * ? ")
    @Async
    public void test() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            TimeUnit.SECONDS.sleep(1L);
            System.out.println(i);
        }
    }
}
