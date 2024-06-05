package com.google;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.google.mapper")
@SpringBootApplication
@EnableScheduling  // 开启对定时任务的支持
public class YupaoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YupaoBackendApplication.class, args);
    }

}
