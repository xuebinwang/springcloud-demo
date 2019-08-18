package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/health/{producer}")
    public String healthTest(@PathVariable("producer") String producer){
        return producer +" health is ok! port is : "+ port;
    }
}
