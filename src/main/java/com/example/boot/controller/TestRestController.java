package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping("/test2")
    public String Test2() {
        String value2 = "RestTest123123";
        return value2;
    }
}
