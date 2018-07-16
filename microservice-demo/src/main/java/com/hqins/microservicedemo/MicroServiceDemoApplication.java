package com.hqins.microservicedemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;




@SpringBootApplication
@EnableEurekaClient
public class MicroServiceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceDemoApplication.class, args);
    }
}
