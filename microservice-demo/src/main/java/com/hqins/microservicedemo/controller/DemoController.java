package com.hqins.microservicedemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${server.port}")
    String port;

    @RequestMapping(value="/api/demo",method=RequestMethod.GET)
    public String demo(){

        return "Hello World , I am from " + port;
    }


}
