package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);


    @GetMapping("/say-hello")
    public String hello() {
        // TODO: explain logger lever
        log.info("hello method was called...");

        return "Welcome to Spring class!!!";
    }
}
