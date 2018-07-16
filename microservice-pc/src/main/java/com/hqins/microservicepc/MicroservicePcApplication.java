package com.hqins.microservicepc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicePcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicePcApplication.class, args);
    }
}
