package com.example.dockerdeploytest;

import org.springframework.stereotype.Service;

@Service
public class HelloService
{

    public String sample() {
        return "Hello service";
    }
}
