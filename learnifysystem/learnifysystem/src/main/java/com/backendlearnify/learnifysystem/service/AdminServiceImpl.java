package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Admin;
import com.backendlearnify.learnifysystem.entity.Instructor;
import com.backendlearnify.learnifysystem.repository.AdminRepository;
import com.backendlearnify.learnifysystem.repository.Instructorrepository;
import com.backendlearnify.learnifysystem.repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository;


    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
    }

    @Override
    public Admin findById(Long adminId) {
        return adminRepository.findById(adminId).orElse(null);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return null;
    }

    @Override
    public void approveInstructor(Long instructor_id) {

    }

    @Override
    public int getTotalUsers() {
        return 0;
    }

    @Override
    public int getTotalInstructors() {
        return 0;
    }

    @Override
    public double getTotalRevenue() {
        return 0;
    }
}