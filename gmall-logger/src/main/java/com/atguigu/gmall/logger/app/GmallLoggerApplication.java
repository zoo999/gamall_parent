package com.atguigu.gmall.logger.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu.gmall.logger.controller")
public class GmallLoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallLoggerApplication.class, args);
    }

}
