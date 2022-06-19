package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class GreetingService {

    public String makeSomeGreetingToUser(String name) {
        String result = "Welcome to Spring class, " + name;

        log.info(result);
        return result;
    }
}
