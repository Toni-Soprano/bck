package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Announcements;
import com.backendlearnify.learnifysystem.repository.Announcementsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Announcementserviceimpl implements Announcementsservice {
    private final Announcementsrepository announcementsrepository;

    @Autowired
    public Announcementserviceimpl(Announcementsrepository announcementsrepository) {
        this.announcementsrepository = announcementsrepository;
    }

    @Override
    public void saveAnnouncement(Announcements announcement) {
        announcementsrepository.save(announcement);
    }

    @Override
    public Announcements getAnnouncementById(Long id) {
        return announcementsrepository.findById(id).orElse(null);
    }

    @Override
    public void updateAnnouncement(Announcements announcement) {
        announcementsrepository.save(announcement);
    }

    @Override
    public void deleteAnnouncementById(Long id) {
        announcementsrepository.deleteById(id);
    }
}
