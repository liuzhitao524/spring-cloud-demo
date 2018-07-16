package com.hqins.microservicepc.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String demo(){
        return restTemplate.getForObject("http://SERVICE-DEMO/api/demo",String.class);
    }
}
