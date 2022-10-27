package org.helloworld.controllers;

import org.helloworld.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping("/say")
    public String sayHelloWorld(HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        return "hello world..!";
    }

    @GetMapping("/users")
    public List<User> getUsers(HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        return List.of(new User("Rakshith", "R", "Jogihalli"));
    }
}
