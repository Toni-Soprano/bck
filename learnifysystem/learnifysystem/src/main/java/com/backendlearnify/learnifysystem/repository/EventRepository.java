package com.backendlearnify.learnifysystem.repository;

import com.backendlearnify.learnifysystem.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom query methods if needed
}