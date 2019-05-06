package com.datahub.data.job;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//@Component
@Slf4j
public class TestJobs {

    @Scheduled(cron = "0/10 * *  * * ? ")   //每10秒执行一次
    public void test() {
        try {
            log.info("当前时间：" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
