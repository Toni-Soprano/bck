package com.backendlearnify.learnifysystem.entity;

import jakarta.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity

public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    @NotBlank
    @Email
    private String email;
    @Size(min = 6)
    private String password;
    @Transient
    private String passwordConfirmation;

    private String phone;
    @Column(columnDefinition = "TEXT")
    private String bio;
    private boolean approved;
    /*/
    private Byte[] cv;
/*/
    public Instructor() {
    }
/*/
    public Byte[] getCv() {
        return cv;
    }

    public void setCv(Byte[] cv) {
        this.cv = cv;
    }
/*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @OneToMany(mappedBy = "instructor")
    private Collection<Event> event;

    public Collection<Event> getEvent() {
        return event;
    }

    public void setEvent(Collection<Event> event) {
        this.event = event;
    }
}