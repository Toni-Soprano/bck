package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Instructorrepository extends JpaRepository<Instructor, Long> {

}
