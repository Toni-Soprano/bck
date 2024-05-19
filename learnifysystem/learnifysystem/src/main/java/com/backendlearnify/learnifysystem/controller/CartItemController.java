package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.CartItem;
import com.backendlearnify.learnifysystem.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartItemController {
    @Autowired
    private CartItemService cartItemService;

    @PostMapping("/add")
    public CartItem addCartItem(@RequestParam Long courseId, @RequestParam Long userId, @RequestParam int quantity) {
        return cartItemService.addCartItem(courseId, userId, quantity);
    }
}