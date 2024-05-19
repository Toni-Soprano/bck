package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Assignment;
import com.backendlearnify.learnifysystem.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    private final AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public void saveAssignment(Assignment assignment) {
        assignmentRepository.save(assignment);
    }

    @Override
    public Assignment getAssignmentById(Long id) {
        return assignmentRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAssignment(Assignment assignment) {
        assignmentRepository.save(assignment);
    }

    @Override
    public void deleteAssignmentById(Long id) {
        assignmentRepository.deleteById(id);
    }
}