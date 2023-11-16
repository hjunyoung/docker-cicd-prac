package com.example.dockerdeploytest;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HelloService.class)
class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    @DisplayName("테스트 테스트")
    void name() {
        String str = helloService.sample();

        Assertions.assertThat(str).isEqualTo("Hello service");
    }
}