package com.demo.springboot.university.controllers;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.services.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    private final CourseService cs;

    public CourseController(CourseService cs){
        this.cs = cs;
    }

    @PostMapping
    public void save(@RequestBody Course course){
        cs.save(course);
    }
}
