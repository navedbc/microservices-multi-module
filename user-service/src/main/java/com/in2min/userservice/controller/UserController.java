package com.in2min.userservice.controller;


import com.in2min.userservice.model.User;
import com.in2min.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@EnableEurekaClient
public class UserController {

    @Autowired
    UserService service;


    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){

        User user =service.getUser(id);
        return user;
    }

    @PostMapping()
    public User saveUser(@RequestBody User user){
        return service.saveUser(user);
    }
}
