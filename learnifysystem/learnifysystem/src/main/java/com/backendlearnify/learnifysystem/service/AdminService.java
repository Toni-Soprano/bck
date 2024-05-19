package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Admin;
import com.backendlearnify.learnifysystem.entity.Instructor;

import java.util.List;

public interface AdminService {
    Admin saveAdmin(Admin admin);

    void deleteAdmin(Long adminId);

    Admin findById(Long adminId);

    Admin findByUsername(String username);
    List<Instructor> getAllInstructors();
    void approveInstructor(Long instructor_id);
    int getTotalUsers();
    int getTotalInstructors();
    double getTotalRevenue();
}
