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

    // example query link from Google:
    // https://www.google.com/search?q=Estonia
    // server: https://www.google.com
    // /search: application (endpoint) on the server
    // ? : query separator
    // q=Estonia, q: parameter name, Estonia i value for a paramater
    // & is used if more paramatars are coming
    // /greeting?name=Ain&surmname=Voolma

    @GetMapping ("/greeting")
    public String greetUser (String  name, String surname) {
        log.info("greetUser called with params: name: [{}], surname [{}]", name, surname);

        return greetingService.makeSomeGreetingToUser(name + " " + surname);
    }
}
