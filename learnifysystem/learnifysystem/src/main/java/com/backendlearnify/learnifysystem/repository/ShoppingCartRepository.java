package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {


}
