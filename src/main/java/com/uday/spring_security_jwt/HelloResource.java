package com.uday.spring_security_jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

}
