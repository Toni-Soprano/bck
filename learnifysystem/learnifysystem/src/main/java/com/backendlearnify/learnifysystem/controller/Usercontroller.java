package com.backendlearnify.learnifysystem.controller;
import com.backendlearnify.learnifysystem.entity.User;
import com.backendlearnify.learnifysystem.service.Userserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class Usercontroller {
    @Autowired
    private Userserviceimpl userservice;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userservice.saveUser(user);
        return "user added";
    }

    @GetMapping("/getall")
    public List<User> getall() {

        return userservice.getAllUsers();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        user.setId(id);
        User updateduser = userservice.updateUser(user);
        return new ResponseEntity<>(updateduser, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userservice.getUserById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    

    
    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody Map<String, String> loginRequest) {
        String email = loginRequest.get("email");
        String password = loginRequest.get("password");
        User user = userservice.loginUser(email, password);

        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }

}
