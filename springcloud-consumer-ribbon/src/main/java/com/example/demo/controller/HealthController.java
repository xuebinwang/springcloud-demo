package com.example.demo.controller;

import com.example.demo.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    HealthService healthService;

    @RequestMapping("/health/{producer}")
    public String healthTest(@PathVariable("producer") String producer){
        return healthService.healthTest(producer);
    }
}
