package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Quiz;
import com.backendlearnify.learnifysystem.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {
    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveQuiz(@RequestBody Quiz quiz) {
        quizService.saveQuiz(quiz);
        return new ResponseEntity<>("Quiz saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long id) {
        Quiz quiz = quizService.getQuizById(id);
        if (quiz != null) {
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateQuiz(@RequestBody Quiz quiz) {
        quizService.updateQuiz(quiz);
        return new ResponseEntity<>("Quiz updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteQuizById(@PathVariable Long id) {
        quizService.deleteQuizById(id);
        return new ResponseEntity<>("Quiz deleted successfully", HttpStatus.OK);
    }
}