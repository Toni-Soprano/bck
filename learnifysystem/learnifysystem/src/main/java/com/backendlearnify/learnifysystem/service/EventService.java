package com.backendlearnify.learnifysystem.service;


import com.backendlearnify.learnifysystem.entity.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
}