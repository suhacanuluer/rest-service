package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String template = "Hello, %s!";

    // /helloworld?message='blabla'
    @GetMapping("/helloworld")
    public HelloWorld helloWorld(@RequestParam(value = "message", defaultValue = "World") String message) {
        return new HelloWorld(String.format(template, message));
    }
}
