package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Review;

public interface ReviewService {
    Review saveReview(Review review);

    void deleteReview(Long reviewId);
}
