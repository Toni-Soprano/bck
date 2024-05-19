package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.CartItem;
import com.backendlearnify.learnifysystem.entity.Course;
import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.repository.CartItemRepository;
import com.backendlearnify.learnifysystem.repository.Courserepository;
import com.backendlearnify.learnifysystem.repository.Userrepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private Courserepository courserepository;

    @Autowired
    private Userrepository userrepository;

    @Transactional
    public CartItem addCartItem(Long courseId, Long userId, int quantity) {
        Course course = courserepository.findById(courseId)
                .orElseThrow(() -> new IllegalArgumentException("Course not found"));

        User user = userrepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        CartItem cartItem = new CartItem();
        cartItem.setCourse(course);
        cartItem.setUser(user);
        cartItem.setQuantity(quantity);

        return cartItemRepository.save(cartItem);
    }
}