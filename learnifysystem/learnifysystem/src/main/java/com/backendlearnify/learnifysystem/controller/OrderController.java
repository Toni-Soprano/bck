package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Order;
import com.backendlearnify.learnifysystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Order placeOrder(@RequestParam Long cartId, @RequestParam String firstName, @RequestParam String lastName,
                            @RequestParam String emailAddress, @RequestParam String phoneNumber,
                            @RequestParam String companyName, @RequestParam String address, @RequestParam String country,
                            @RequestParam String city, @RequestParam String state, @RequestParam String zipCode,
                            @RequestParam String paymentMethod) {
        return orderService.placeOrder(cartId, firstName, lastName, emailAddress, phoneNumber, companyName, address,
                country, city, state, zipCode, paymentMethod);
    }
}