package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Announcements;
import com.backendlearnify.learnifysystem.service.Announcementsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/announcements")
public class Announcementscontroller {
    private final Announcementsservice announcementsservice;

    @Autowired
    public Announcementscontroller(Announcementsservice announcementsservice) {
        this.announcementsservice = announcementsservice;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAnnouncement(@RequestBody Announcements announcement) {
        announcementsservice.saveAnnouncement(announcement);
        return new ResponseEntity<>("Announcement saved successfully", HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Announcements> getAnnouncementById(@PathVariable Long id) {
        Announcements announcement = announcementsservice.getAnnouncementById(id);
        if (announcement != null) {
            return new ResponseEntity<>(announcement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAnnouncement(@RequestBody Announcements announcement) {
        announcementsservice.updateAnnouncement(announcement);
        return new ResponseEntity<>("Announcement updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAnnouncementById(@PathVariable Long id) {
        announcementsservice.deleteAnnouncementById(id);
        return new ResponseEntity<>("Announcement deleted successfully", HttpStatus.OK);
    }
}
