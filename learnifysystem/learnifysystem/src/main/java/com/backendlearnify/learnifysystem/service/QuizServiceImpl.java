package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Quiz;
import com.backendlearnify.learnifysystem.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {
    private final QuizRepository quizRepository;

    @Autowired
    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public void saveQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElse(null);
    }

    @Override
    public void updateQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public void deleteQuizById(Long id) {
        quizRepository.deleteById(id);
    }
}