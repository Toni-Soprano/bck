package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
