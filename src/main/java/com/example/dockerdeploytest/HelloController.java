package com.example.dockerdeploytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/")
    public String sample() {
        return "Hello!!! AWESOME DOCKER!!!!!";
    }

    @GetMapping("/hi")
    public String sample2() {
        return helloService.sample();
    }
}
