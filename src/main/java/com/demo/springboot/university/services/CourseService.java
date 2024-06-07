package com.demo.springboot.university.services;


import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {


    private CourseRepository cr;

    public CourseService(CourseRepository cr){
        this.cr = cr;
    }

    // Create
    public void save(Course course){
        cr.save(course);
    }

}
