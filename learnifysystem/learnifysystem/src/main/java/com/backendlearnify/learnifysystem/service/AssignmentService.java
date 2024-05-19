package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Assignment;

public interface AssignmentService {
    void saveAssignment(Assignment assignment);
    Assignment getAssignmentById(Long id);
    void updateAssignment(Assignment assignment);
    void deleteAssignmentById(Long id);
}