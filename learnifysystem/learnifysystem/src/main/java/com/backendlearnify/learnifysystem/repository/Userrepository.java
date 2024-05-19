package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
