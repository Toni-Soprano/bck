package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Cart;
import com.backendlearnify.learnifysystem.entity.Order;
import com.backendlearnify.learnifysystem.repository.CartRepository;
import com.backendlearnify.learnifysystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CartRepository cartRepository;

    public Order placeOrder(Long cartId, String firstName, String lastName, String emailAddress, String phoneNumber,
                            String companyName, String address, String country, String city, String state,
                            String zipCode, String paymentMethod) {
        Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new RuntimeException("Cart not found"));

        Order order = new Order(cart.getItems(), firstName, lastName, emailAddress, phoneNumber, companyName,
                address, country, city, state, zipCode, paymentMethod);
        return orderRepository.save(order);
    }
}