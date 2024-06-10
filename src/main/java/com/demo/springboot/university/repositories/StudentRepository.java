package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Long> {

  @Query("SELECT s FROM Student s WHERE s.age BETWEEN :minAge AND :maxAge")
    List<Student> findByAgeRange(@Param("minAge") int minAge, @Param("maxAge") int maxAge);

}
