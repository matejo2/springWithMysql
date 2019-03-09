package com.jolanda.dev.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path="/")
    public String hello(){
        return "Hello sssWorld";
    }

    @GetMapping(path="/users")
    public Iterable<User> getAllUsers(){
        return repository.findAll();
    }

    @GetMapping(path="/add")
    public String addUser(){
        User newUser = new User();
        newUser.setName("Flo Rider");
        newUser.setEmail("flo@rider.de");
        repository.save(newUser); //scheitert

        return "Saved";
    }

}
