package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
