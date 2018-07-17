package com.hqins.microservicepc.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod ="demoError")
    public String demo() {
        return restTemplate.getForObject("http://SERVICE-DEMO/api/demo", String.class);
    }

    public String demoError(){
        return "Service-demo not available";
    }

}
