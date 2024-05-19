package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addToCart(Long userId, Long courseId, int quantity);
    void removeItem(Long cartItemId);
    ShoppingCart updateQuantity(Long cartItemId, int quantity);
    void checkout(Long cartItemId);
}
