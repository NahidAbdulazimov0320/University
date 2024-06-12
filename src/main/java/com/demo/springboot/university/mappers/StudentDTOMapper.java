package com.demo.springboot.university.mappers;
import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StudentDTOMapper implements  Function<Student, StudentDTO> {
    @Override
    public StudentDTO apply(Student student) {
          return new StudentDTO(
                student.getName(),
                student.getSurname(),
                  student.getAge()


          );
    }
}
