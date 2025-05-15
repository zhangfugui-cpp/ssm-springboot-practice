package com.ztx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Hello")
public class HelloController {

    @GetMapping("boot")
    public String hello() {
        return "hello springboot3";
    }
}
