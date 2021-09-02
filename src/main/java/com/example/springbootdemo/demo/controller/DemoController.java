package com.example.springbootdemo.demo.controller;

import com.example.springbootdemo.demo.config.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private ProduceService produceService;

    @RequestMapping("/sendMq")
    public String sendMq() {
//        produceService.directSend("test");
        return "Test Successful!";
    }
}
