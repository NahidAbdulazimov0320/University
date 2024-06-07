package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
