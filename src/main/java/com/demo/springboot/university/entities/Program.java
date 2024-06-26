package com.demo.springboot.university.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Program {  // IT, CS, CE
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @OneToMany(mappedBy = "program")
    private List<Course> courses;

    @OneToMany(mappedBy = "program")
    private List<Student> student;



}
