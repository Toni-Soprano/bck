package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Instructor;
import com.backendlearnify.learnifysystem.repository.Instructorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Instructorserviceimpl implements Instructorservice {
    private final Instructorrepository instructorrepository;

    @Autowired
    public Instructorserviceimpl(Instructorrepository instructorrepository) {
        this.instructorrepository = instructorrepository;
    }

    @Override
    public void saveInstructor(Instructor instructor) {
        instructorrepository.save(instructor);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorrepository.findById(id).orElse(null);
    }

    @Override
    public void updateInstructor(Instructor instructor) {
        instructorrepository.save(instructor);
    }

    @Override
    public void deleteInstructorById(Long id) {
        instructorrepository.deleteById(id);
    }
}