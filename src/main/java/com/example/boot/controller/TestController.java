package com.example.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/home")
    public String Home() {
        return "index.html";
    };

    @RequestMapping("/test1")
    @ResponseBody
    public String Test() {
        String value = "테스트9988";
        return value;
    };
}
