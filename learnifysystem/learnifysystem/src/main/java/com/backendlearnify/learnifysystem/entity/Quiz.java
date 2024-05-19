package com.backendlearnify.learnifysystem.entity;

import jakarta.persistence.*;

@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String totalMarks;
    private String correctAnswers;
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id") // Reference to the instructor who created the quiz
    private Instructor instructor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id") // Reference to the course associated with the quiz
    private Course course;

    // Other quiz attributes, such as questions, options, etc., can be added as needed

    public Quiz() {
    }

    // Getters and setters
}
