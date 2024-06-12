package com.demo.springboot.university.services;

import com.demo.springboot.university.dto.StudentDTO;
import com.demo.springboot.university.entities.Student;
import com.demo.springboot.university.mappers.StudentDTOMapper;
import com.demo.springboot.university.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    private final StudentDTOMapper  studentDTOMapper;


    public StudentService(StudentRepository studentRepository, StudentDTOMapper studentDTOMapper){
        this.studentRepository= studentRepository;
        this.studentDTOMapper = studentDTOMapper;
    }

    // Used DTO for saving
//    public StudentDTO saveStudent(StudentDTO student){
//        Student st = new Student();
//        st.setName(student.getName());
//        st.setSurname(student.getSurname());
//        st.setAge(student.getAge());
//        Student savedStudent = studentRepository.save(st);
//        return new StudentDTO(savedStudent.getName(), savedStudent.getSurname(), savedStudent.getAge());
//    }


    public void save(Student student) {
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }


    public StudentDTO getById(Long id) {
        return studentRepository.findById(id).map(studentDTOMapper).orElse(null);

    }

    public void update(Student student) {
        if (studentRepository.existsById(student.getId())) {
            studentRepository.save(student);
        } else {
            System.out.println("Student with this ID does not exist");
        }

    }

    public void patch(Student student) {
        Optional<Student> st = studentRepository.findById(student.getId());

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

            studentRepository.save(st.get());
        }

     }

     // Custom method
//    @Override
//    public List<Student> findByAgeRange(int minAge, int maxAge) {
//        return sr.findByAgeRange(minAge, maxAge);
//    }
//





}
