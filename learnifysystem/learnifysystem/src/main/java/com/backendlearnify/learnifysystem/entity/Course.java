package com.backendlearnify.learnifysystem.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String price;

    private String slug;

    private String aboutCourse;

    // Course Setting
    private int maximumStudents;

    private String difficultyLevel;

    private boolean isPublicCourse;

    private boolean enableQA;

    // Choose Categories
    private String categories;
    private byte[] courseThumbnail;
    // Course Intro Video
    private String introVideoPath; // Store local video path or video URL
    private Date startDate;

    private String language;

    private String requirements;

    private String description;

    private int totalCourseDurationHours;

    private int totalCourseDurationMinutes;

    private String courseTags;

    private String targetedAudience;
    // Certificate Template
    @Lob
    @Column(name = "certificate_template")
    private byte[] certificateTemplate;
    // Approval Status
    private boolean approved;
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Review> reviews = new ArrayList<>();

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getAboutCourse() {
        return aboutCourse;
    }

    public void setAboutCourse(String aboutCourse) {
        this.aboutCourse = aboutCourse;
    }

    public int getMaximumStudents() {
        return maximumStudents;
    }

    public void setMaximumStudents(int maximumStudents) {
        this.maximumStudents = maximumStudents;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isPublicCourse() {
        return isPublicCourse;
    }

    public void setPublicCourse(boolean publicCourse) {
        isPublicCourse = publicCourse;
    }

    public boolean isEnableQA() {
        return enableQA;
    }

    public void setEnableQA(boolean enableQA) {
        this.enableQA = enableQA;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public byte[] getCourseThumbnail() {
        return courseThumbnail;
    }

    public void setCourseThumbnail(byte[] courseThumbnail) {
        this.courseThumbnail = courseThumbnail;
    }

    public String getIntroVideoPath() {
        return introVideoPath;
    }

    public void setIntroVideoPath(String introVideoPath) {
        this.introVideoPath = introVideoPath;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalCourseDurationHours() {
        return totalCourseDurationHours;
    }

    public void setTotalCourseDurationHours(int totalCourseDurationHours) {
        this.totalCourseDurationHours = totalCourseDurationHours;
    }

    public int getTotalCourseDurationMinutes() {
        return totalCourseDurationMinutes;
    }

    public void setTotalCourseDurationMinutes(int totalCourseDurationMinutes) {
        this.totalCourseDurationMinutes = totalCourseDurationMinutes;
    }

    public String getCourseTags() {
        return courseTags;
    }

    public void setCourseTags(String courseTags) {
        this.courseTags = courseTags;
    }

    public String getTargetedAudience() {
        return targetedAudience;
    }

    public void setTargetedAudience(String targetedAudience) {
        this.targetedAudience = targetedAudience;
    }

    public byte[] getCertificateTemplate() {
        return certificateTemplate;
    }

    public void setCertificateTemplate(byte[] certificateTemplate) {
        this.certificateTemplate = certificateTemplate;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "course")
    private Collection<CartItem> cartItem;

    public Collection<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(Collection<CartItem> cartItem) {
        this.cartItem = cartItem;
    }
}
