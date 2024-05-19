package com.backendlearnify.learnifysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assignmentName;
    private int totalMarks;
    private int totalSubmit;

    public Assignment() {
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssignmentName() {

        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getTotalMarks() {

        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {

        this.totalMarks = totalMarks;
    }

    public int getTotalSubmit() {

        return totalSubmit;
    }

    public void setTotalSubmit(int totalSubmit) {

        this.totalSubmit = totalSubmit;
    }
}