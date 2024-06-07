//package com.demo.springboot.university.bootstap;
//
//import com.demo.springboot.university.entities.Course;
//import com.demo.springboot.university.entities.Enrollment;
//import com.demo.springboot.university.entities.Student;
//import com.demo.springboot.university.repositories.CourseRepository;
//import com.demo.springboot.university.repositories.EnrollmentRepository;
//import com.demo.springboot.university.repositories.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;
//
//
//
//public class Bootstap implements CommandLineRunner {
//    @Autowired
//    private CourseRepository cr;
//
//    @Autowired
//    private StudentRepository sr;
//
//    @Autowired
//    private EnrollmentRepository er;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//
//
//
//        //Long courseId, String name, int credit
//       Course course = new Course("Calculus", 6);
//        Course course1 = new Course("Math", 7);
//        cr.save(course);
//        cr.save(course1);
//
//        Student st = new Student("Elnar", "Ashrafov", 20);
//        Student st1 = new Student("Elmin", "Aliyev", 25);
//        sr.save(st);
//        sr.save(st1);
//
//        Enrollment el = new Enrollment(st, course);
//        Enrollment el1 = new Enrollment(st1, course);
//        Enrollment el3 = new Enrollment(st1, course1);
//
//        er.save(el);
//        er.save(el1);
//        er.save(el3);
//
//
//
//
//    }
//}
