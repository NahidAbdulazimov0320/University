package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Enrollment;
import org.springframework.data.repository.CrudRepository;

public interface EnrollmentRepository extends CrudRepository<Enrollment,Long> {
}
