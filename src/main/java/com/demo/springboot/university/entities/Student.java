package com.demo.springboot.university.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
public class Student {

    @Id
    private Long id;

    private String name;
    private String surname;
    private int age;

    private LocalDateTime enrolledDate;


    @OneToMany(mappedBy = "students")
    private List<Enrollment> enrollments;
}
