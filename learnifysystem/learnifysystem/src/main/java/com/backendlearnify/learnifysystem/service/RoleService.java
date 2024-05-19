package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Role;
import com.backendlearnify.learnifysystem.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleService implements IRoleService {
    @Autowired
    RoleRepository roleRepository;


    @Override
    public Role addRole (Role role){

        return roleRepository.save(role);
    }

    @Override
    public Role UpdateRole(Role role) {

        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(int id) {

        roleRepository.deleteById(id);
    }

    @Override
    public List<Role> findAllRole() {

        return roleRepository.findAll() ;

    }



}