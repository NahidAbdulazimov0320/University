package com.demo.springboot.university.controllers;

import com.demo.springboot.university.services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping("/{student_id}/{course_id}")
    public void enrollStudent(@PathVariable("student_id") Long studentId, @PathVariable("course_id") Long courseId) {
        enrollmentService.enrollStudent(studentId, courseId);
    }
}
