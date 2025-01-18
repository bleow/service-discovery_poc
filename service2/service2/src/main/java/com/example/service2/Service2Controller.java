package com.example.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Service2Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Service2";
    }
}
