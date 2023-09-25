package com.example.cbhw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

    @RequestMapping("/world")
    public String hello() {
        return "hello world";
    }
}
