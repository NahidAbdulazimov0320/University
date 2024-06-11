package com.demo.springboot.university.repositories;

import com.demo.springboot.university.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {



//  @Query("SELECT s FROM Student s WHERE s.age BETWEEN :minAge AND :maxAge")
//    List<Student> findByAgeRange(@Param("minAge") int minAge, @Param("maxAge") int maxAge);

}
