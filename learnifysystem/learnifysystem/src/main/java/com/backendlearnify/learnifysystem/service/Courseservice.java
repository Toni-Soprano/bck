package com.backendlearnify.learnifysystem.service;

import java.util.List;

import com.backendlearnify.learnifysystem.entity.Course;

public interface Courseservice {
    void saveCourse(Course course);
    Course getCourseById(Long id);
    void updateCourse(Course course);
    void deleteCourseById(Long id);
    List<Course> getAllCourses(); 
    
}
