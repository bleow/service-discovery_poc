package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Service1Controller {
    @Autowired
    private Service1Service service;

    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("in controller");
        return service.callService2() + " Hello Service1";
    }
}
