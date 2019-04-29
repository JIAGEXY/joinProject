package com.lh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan(basePackages = "com.lh.mapper")
@ServletComponentScan(basePackages = "com.lh.config")
public class JoinProjectApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(JoinProjectApplication.class, args);
    }
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JoinProjectApplication.class);
    }*/
}