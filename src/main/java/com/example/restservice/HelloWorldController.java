package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String message = "Hello World!";

    @GetMapping("/helloworld")
    public HelloWorld helloWorld() {
        return new HelloWorld(message);
    }
}
