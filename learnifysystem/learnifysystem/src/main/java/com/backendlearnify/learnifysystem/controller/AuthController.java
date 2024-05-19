package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.DTO.LoginRequest;
import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.ResponseEntity;

@RestController
public class AuthController {
    @Autowired
    private Userservice userservice;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userservice.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password) {
        User user = userservice.findByUsernameAndPassword(username, password);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).body(null); // Unauthorized status
        }
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userservice.findById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        User user = userservice.findByUsernameAndPassword(loginRequest.getUsername(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).body(null); // Unauthorized status
        }
    }
}
