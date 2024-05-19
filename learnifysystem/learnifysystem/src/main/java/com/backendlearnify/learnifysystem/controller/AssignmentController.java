package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Assignment;
import com.backendlearnify.learnifysystem.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {
    private final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAssignment(@RequestBody Assignment assignment) {
        assignmentService.saveAssignment(assignment);
        return new ResponseEntity<>("Assignment saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assignment> getAssignmentById(@PathVariable Long id) {
        Assignment assignment = assignmentService.getAssignmentById(id);
        if (assignment != null) {
            return new ResponseEntity<>(assignment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAssignment(@RequestBody Assignment assignment) {
        assignmentService.updateAssignment(assignment);
        return new ResponseEntity<>("Assignment updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAssignmentById(@PathVariable Long id) {
        assignmentService.deleteAssignmentById(id);
        return new ResponseEntity<>("Assignment deleted successfully", HttpStatus.OK);
    }
}