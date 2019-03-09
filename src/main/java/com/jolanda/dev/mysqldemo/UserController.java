package com.jolanda.dev.mysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/add")
    public String add() {
//        User newUser = new User();
//        newUser.setName("Flo Rider");
//        newUser.setEmail("flo@rider.de");
//        repository.save(newUser);

        return "Nothing much happening here ";
    }

    @GetMapping("/users/add")
    public String addUser(HttpServletRequest request) {

        // how would a request like this look?
        // http://localhost:8080/users/add?name=ada
        //User user = new User();
        String name = request.getParameter("name");
        return "what you even trying to add? This name? " + name;
    }

    @GetMapping("/users/adds")
    public String anotherAdd(@RequestParam(value = "name", required = false) String name) {
        // how would a request like this look?
        // http://localhost:8080/users/adds?name=lovelace
        return "add this name: " + name;
    }
}


/*
@PathParam is a parameter annotation which allows you to map variable URI path fragments into your method call.

@PathVariable is to obtain some placeholder from the URI (Spring call it an URI Template)
 */