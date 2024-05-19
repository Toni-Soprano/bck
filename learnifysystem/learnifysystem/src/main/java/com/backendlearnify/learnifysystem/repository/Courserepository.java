package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Courserepository extends JpaRepository<Course, Long> {



}
