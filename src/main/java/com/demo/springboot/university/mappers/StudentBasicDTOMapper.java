package com.demo.springboot.university.mappers;

import com.demo.springboot.university.dto.StudentBasicDTO;
import com.demo.springboot.university.dto.StudentCustomDTO;
import com.demo.springboot.university.entities.Student;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StudentBasicDTOMapper implements  Function<Student, StudentBasicDTO> {

    @Override
    public StudentBasicDTO apply(Student student) {
          return new StudentBasicDTO(
                student.getName(),
                student.getSurname()
          );
    }
}
