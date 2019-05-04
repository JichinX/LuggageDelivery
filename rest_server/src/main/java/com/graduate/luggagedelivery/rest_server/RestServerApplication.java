package com.graduate.luggagedelivery.rest_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan(value = "com.graduate.luggagedelivery.rest_server.dao")
public class RestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServerApplication.class, args);
    }
}
