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

    @ManyToOne
    @JoinColumn(name = "programId")
    private Program program;

//    @OneToMany(mappedBy = "courses")
//    private List<Enrollment> enrollments;

}
