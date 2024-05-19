package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Cart;
import com.backendlearnify.learnifysystem.entity.CartItem;
import com.backendlearnify.learnifysystem.entity.Course;
import com.backendlearnify.learnifysystem.repository.CartRepository;
import com.backendlearnify.learnifysystem.repository.Courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private Courserepository courserepository;

    public Cart addItemToCart(Long cartId, Long courseId, int quantity) {
        Optional<Course> courseOptional = courserepository.findById(courseId);
        if (!courseOptional.isPresent()) {
            throw new RuntimeException("Course not found");
        }

        Course course = courseOptional.get();
        Cart cart;
        if (cartId == null) {
            cart = new Cart();
        } else {
            cart = cartRepository.findById(cartId).orElse(new Cart());
        }

        CartItem cartItem = new CartItem(course, quantity);
        cart.getItems().add(cartItem);
        cart.setSubtotal(cart.getItems().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum());

        return cartRepository.save(cart);
    }

    public Cart getCart(Long cartId) {
        return cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));
    }

    public void clearCart(Long cartId) {
        Cart cart = getCart(cartId);
        cart.getItems().clear();
        cartRepository.save(cart);
    }
}
