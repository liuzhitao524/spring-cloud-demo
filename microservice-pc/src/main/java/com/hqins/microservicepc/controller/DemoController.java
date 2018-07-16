package com.hqins.microservicepc.controller;

import com.hqins.microservicepc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value="/api/pc/demo",method = RequestMethod.GET)
    public String demo(){
        return demoService.demo();
    }

}
