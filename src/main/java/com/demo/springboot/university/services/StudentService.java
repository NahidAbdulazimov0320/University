package com.demo.springboot.university.services;

import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.repositories.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private final ModelMapper modelMapper;

    private final StudentRepository sr;
    private final StudentDTOMapper studentDTOMapper;


    public StudentService(ModelMapper modelMapper, StudentRepository sr, StudentDTOMapper studentDTOMapper) {
        this.modelMapper = modelMapper;
        this.sr = sr;
        this.studentDTOMapper = studentDTOMapper;
    }

    public void save(Student student) {
        sr.save(student);
    }

    public void deleteById(Long id) {
        sr.deleteById(id);
    }

    public Optional<StudentDTO> getById(Long id) {
       return sr.findById(id).map(studentDTOMapper);

    }

    public void update(Student student) {
        if (sr.existsById(student.getStudentId())) {
            sr.save(student);
        } else {
            System.out.println("Student with this ID does not exist");
        }

    }

    public void patch(Student student) {
        Optional<Student> st = sr.findById(student.getStudentId());

        if (st.isPresent()) {

            if (student.getName() != null) {
                st.get().setName(student.getName());
            }

            if (student.getSurname() != null) {
                st.get().setSurname(student.getSurname());
            }

            if (student.getAge() != 0) {
                st.get().setAge(student.getAge());
            }

            sr.save(st.get());
        }

    }
}
