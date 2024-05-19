package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
}
