package com.demo.springboot.university.mappers;

import com.demo.springboot.university.dto.StudentCustomDTO;
import com.demo.springboot.university.entities.Student;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Service
public class StudentCustomDTOMapper implements Function<Student, StudentCustomDTO> {
    @Override
    public StudentCustomDTO apply(Student student) {
        return new StudentCustomDTO(
                student.getName(),
                student.getSurname(),
                student.getAge()
        );
    }
}
