package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Cart;
import com.backendlearnify.learnifysystem.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carts")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public Cart addItemToCart(@RequestParam Long cartId, @RequestParam Long courseId, @RequestParam int quantity) {
        return cartService.addItemToCart(cartId, courseId, quantity);
    }

    @GetMapping("/{cartId}")
    public Cart getCart(@PathVariable Long cartId) {
        return cartService.getCart(cartId);
    }

    @DeleteMapping("/{cartId}")
    public void clearCart(@PathVariable Long cartId) {
        cartService.clearCart(cartId);
    }
}