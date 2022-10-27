package org.helloworld.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping
    public String sayHelloWorld(HttpServletResponse response){
        response.setStatus(HttpStatus.OK.value());
        return "hello world..!";
    }
}
