package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);

    private final GreetingService greetingService;

    public MyFirstRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @GetMapping("/say-hello")
    public String hello() {
        // TODO: explain logger lever
        log.info("hello method was called.");

        return "Welcome to Spring class!!!";
    }

    @GetMapping ("/greeting")
    public String greetUser () {
        log.info("greet user");

        return greetingService.makeSomeGreetingToUser("Ain");
    }
}
