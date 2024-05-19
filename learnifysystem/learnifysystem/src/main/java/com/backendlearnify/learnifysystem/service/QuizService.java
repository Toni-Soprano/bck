package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Quiz;

public interface QuizService {
    void saveQuiz(Quiz quiz);
    Quiz getQuizById(Long id);
    void updateQuiz(Quiz quiz);
    void deleteQuizById(Long id);
}