package com.backendlearnify.learnifysystem.controller;

import com.backendlearnify.learnifysystem.entity.Role;
import com.backendlearnify.learnifysystem.service.IRoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Role")
public class RoleController {

    IRoleService roleService;


    @PostMapping("/ajouterRole")
    public Role ajouterRole (@RequestBody Role role){
        return roleService.addRole(role);

    }

    @PutMapping("/modifierRole")
    public Role UpdateRole (@RequestBody Role role){

        return roleService.UpdateRole(role);
    }

    @DeleteMapping("/supprimerRole")
    public void deleteRole (@PathVariable int idRole){
        roleService.deleteRole(idRole);

    }

    @GetMapping("/afficherAllRole")
    public List<Role> findAllRole(){

        return roleService.findAllRole() ;
    }


}

