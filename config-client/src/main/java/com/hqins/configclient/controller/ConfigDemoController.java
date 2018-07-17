package com.hqins.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigDemoController {

    @Value("${name}")
    String name;

    @RequestMapping(value="/name",method=RequestMethod.GET)
    public String getName(){
        return name;
    }


}
