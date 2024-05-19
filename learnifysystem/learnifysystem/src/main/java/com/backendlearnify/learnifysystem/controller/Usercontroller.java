package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userservice.saveUser(user);
        return "user added";
    }
    @GetMapping("/getall")
    public List<User> getall(){

        return userservice.getAllUsers();
    }

}
