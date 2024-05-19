package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.User;

import java.util.List;

public interface Userservice {
    public User saveUser(User user);
    public List<User> getAllUsers();
    void registerUser(User user);

    void save(User user);
    User findById(Long id);
    User findByUsernameAndPassword(String username, String password);
}
