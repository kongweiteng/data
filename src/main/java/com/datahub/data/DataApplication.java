package com.datahub.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.datahub.data.feign"})
@EnableScheduling
public class DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class, args);
    }

}
