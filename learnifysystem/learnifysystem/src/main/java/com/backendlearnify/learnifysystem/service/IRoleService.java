package com.backendlearnify.learnifysystem.service;

import com.backendlearnify.learnifysystem.entity.Role;

import java.util.List;

public interface IRoleService {

    public Role addRole (Role role);
    public Role UpdateRole(Role role) ;
    public void deleteRole(int id) ;
    public List<Role> findAllRole() ;
}

