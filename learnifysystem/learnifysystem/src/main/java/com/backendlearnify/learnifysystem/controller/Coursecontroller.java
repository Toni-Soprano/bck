package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Course;
import com.backendlearnify.learnifysystem.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
public class Coursecontroller {
    @Autowired
    private final Courseservice courseService;

    @Autowired
    public Coursecontroller(Courseservice courseService) {

        this.courseService = courseService;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveCourse(@RequestBody Course course) {
        courseService.saveCourse(course);
        return new ResponseEntity<>("Course saved successfully", HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Course course = courseService.getCourseById(id);
        if (course != null) {
            return new ResponseEntity<>(course, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateCourse(@RequestBody Course course) {
        courseService.updateCourse(course);
        return new ResponseEntity<>("Course updated successfully", HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCourseById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
        return new ResponseEntity<>("Course deleted successfully", HttpStatus.OK);
    }




}
