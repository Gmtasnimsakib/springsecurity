package org.example.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloWorld(HttpServletRequest request) {
        return "Hello World!" + request.getSession().getId();
    }

    @GetMapping("/login")
    public String login() {
        return "Welcome to The Website";
    }
}
