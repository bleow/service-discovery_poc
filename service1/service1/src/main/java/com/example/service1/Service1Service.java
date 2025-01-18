package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Service1Service {
    @Autowired
    private RestTemplate restTemplate;

    public String callService2() {
        ResponseEntity<String> res = restTemplate.getForEntity("http://localhost:9092/api/hello", String.class);
        return res.getBody();
    }
}
