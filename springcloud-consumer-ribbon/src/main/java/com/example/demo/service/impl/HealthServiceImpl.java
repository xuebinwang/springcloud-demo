package com.example.demo.service.impl;

import com.example.demo.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * ribbon 调用SERVICE-PRODUCER服务，实现了负载均衡--轮询
 * SERVICE-PRODUCER服务提供，启动了同服务名，不同port
 * 测试该接口，可以看到两个port在切换
 */
@Service
public class HealthServiceImpl implements HealthService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String healthTest(String producer) {

//        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
        return restTemplate.getForObject("http://SERVICE-PRODUCER/health/"+producer, String.class);
    }
}
