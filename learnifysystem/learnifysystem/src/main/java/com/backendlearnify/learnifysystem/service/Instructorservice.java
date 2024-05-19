package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Instructor;

public interface Instructorservice {
    void saveInstructor(Instructor instructor);
    Instructor getInstructorById(Long id);
    void updateInstructor(Instructor instructor);
    void deleteInstructorById(Long id);
}