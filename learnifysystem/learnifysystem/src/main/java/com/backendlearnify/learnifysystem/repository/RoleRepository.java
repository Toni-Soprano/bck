package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.ERole;
import com.backendlearnify.learnifysystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
    public Role deleteById(int id);
}

