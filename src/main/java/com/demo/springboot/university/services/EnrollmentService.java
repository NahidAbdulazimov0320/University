package com.demo.springboot.university.services;

import com.demo.springboot.university.entities.Course;
import com.demo.springboot.university.entities.Enrollment;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.repositories.CourseRepository;
import com.demo.springboot.university.repositories.EnrollmentRepository;
import com.demo.springboot.university.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EnrollmentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public Enrollment enrollStudent(Long studentId, Long courseId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Enrollment enrollment = new Enrollment(student, course);
        return enrollmentRepository.save(enrollment);
    }
}
