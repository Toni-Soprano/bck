package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

}
