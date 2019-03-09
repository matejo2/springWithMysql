package com.jolanda.dev.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return repository.findAll();
    }

    @GetMapping("/add")
    public String add(){
//        User newUser = new User();
//        newUser.setName("Flo Rider");
//        newUser.setEmail("flo@rider.de");
//        repository.save(newUser);

        return "Nothing much happening here ";
    }

    @PostMapping("/users/add/")
    public String addUser(){
        return "what you even trying to add?";
    }
}
