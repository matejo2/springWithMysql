package com.jolanda.dev.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
// zuul  hat load balancer
// eureka services bekannt machen

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public String addUser(@RequestBody User newUser) {
        repository.save(newUser);
        return "successful";
    }
}


/*
@PathParam is a parameter annotation which allows you to map variable URI path fragments into your method call.

@PathVariable is to obtain some placeholder from the URI (Spring call it an URI Template)
 */
