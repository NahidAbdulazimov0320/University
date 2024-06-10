package com.demo.springboot.university.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private int age;

//    private LocalDateTime enrolledDate;

//
//    @OneToMany(mappedBy = "students")
//    private List<Enrollment> enrollments;
}
