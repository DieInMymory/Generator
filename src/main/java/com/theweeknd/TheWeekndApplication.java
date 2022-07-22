package com.theweeknd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.theweeknd.mapper")
public class TheWeekndApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheWeekndApplication.class, args);
    }

}
