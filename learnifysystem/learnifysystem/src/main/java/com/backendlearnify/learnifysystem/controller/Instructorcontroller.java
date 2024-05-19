package com.backendlearnify.learnifysystem.controller;


import com.backendlearnify.learnifysystem.entity.Instructor;
import com.backendlearnify.learnifysystem.service.Instructorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/instructor")
public class Instructorcontroller {
    private final Instructorservice instructorservice;

    @Autowired
    public Instructorcontroller(Instructorservice instructorservice) {
        this.instructorservice = instructorservice;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveInstructor(@RequestBody Instructor instructor) {
        instructorservice.saveInstructor(instructor);
        return new ResponseEntity<>("Instructor saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instructor> getInstructorById(@PathVariable Long id) {
        Instructor instructor = instructorservice.getInstructorById(id);
        if (instructor != null) {
            return new ResponseEntity<>(instructor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateInstructor(@RequestBody Instructor instructor) {
        instructorservice.updateInstructor(instructor);
        return new ResponseEntity<>("Instructor updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteInstructorById(@PathVariable Long id) {
        instructorservice.deleteInstructorById(id);
        return new ResponseEntity<>("Instructor deleted successfully", HttpStatus.OK);
    }
}
