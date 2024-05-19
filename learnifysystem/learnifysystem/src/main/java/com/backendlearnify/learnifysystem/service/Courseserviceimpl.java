package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Course;
import com.backendlearnify.learnifysystem.repository.Courserepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Courseserviceimpl implements Courseservice {
    private final Courserepository courseRepository;

    @Autowired
    public Courseserviceimpl(Courserepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    @Override
    public void saveCourse(Course course) {

        courseRepository.save(course);
    }
    @Override
    public Course getCourseById(Long id) {

        return courseRepository.findById(id).orElse(null);
    }
    @Override
    public void updateCourse(Course course) {

        courseRepository.save(course);
    }
    @Override
    public void deleteCourseById(Long id) {

        courseRepository.deleteById(id);
    }



}
