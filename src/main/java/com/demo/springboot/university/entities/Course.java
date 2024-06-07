package com.demo.springboot.university.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
public class Course {

    @Id
    private Long courseId;

    private String name;
    private int credit;
    @OneToMany(mappedBy = "courses")
    private List<Enrollment> enrollments;

    public Course() {
    }

    public Course(Long id,String name, int credit) {
        this.courseId =id;
        this.name = name;
        this.credit = credit;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}
