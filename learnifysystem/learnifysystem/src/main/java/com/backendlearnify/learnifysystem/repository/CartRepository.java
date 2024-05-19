package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
