package com.lh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lh.mapper")
@ServletComponentScan(basePackages = "com.lh.config")
public class JoinProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoinProjectApplication.class, args);
    }
}