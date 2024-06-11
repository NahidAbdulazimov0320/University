//package com.demo.springboot.university;
//
//import com.demo.springboot.university.dto.StudentDTO;
//import com.demo.springboot.university.entities.Student;
//import com.demo.springboot.university.mappers.StudentDTOMapper;
//import com.demo.springboot.university.repositories.StudentRepository;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Profile("Basic")
//public class StudentBasicService implements StudentService {
//    private final StudentRepository sr;
//    private final StudentDTOMapper studentDTOMapper;
//
//
//    public StudentBasicService(StudentRepository sr, StudentDTOMapper studentDTOMapper) {
//        this.sr = sr;
//        this.studentDTOMapper = studentDTOMapper;
//    }
//
//    public void save(Student student) {
//        sr.save(student);
//    }
//
//    public void deleteById(Long id) {
//        sr.deleteById(id);
//    }
//
//    @Override
//    public void update(Student student) {
//
//    }
//
//    @Override
//    public void patch(Student student) {
//
//    }
//
//    @Override
//    public List<Student> findByAgeRange(int minAge, int maxAge) {
//        return null;
//    }
//
//    public Optional<StudentDTO> getById(Long id) {
//       return sr.findById(id).map(studentDTOMapper);
//
//    }
//
////    public void update(Student student) {
////        if (sr.existsById(student.getStudentId())) {
////            sr.save(student);
////        } else {
////            System.out.println("Student with this ID does not exist");
////        }
////
////    }
//
////    public void patch(Student student) {
////        Optional<Student> st = sr.findById(student.getStudentId());
////
////        if (st.isPresent()) {
////
////            if (student.getName() != null) {
////                st.get().setName(student.getName());
////            }
////
////            if (student.getSurname() != null) {
////                st.get().setSurname(student.getSurname());
////            }
////
////            if (student.getAge() != 0) {
////                st.get().setAge(student.getAge());
////            }
////
////            sr.save(st.get());
////        }
//
//   // }
//
////    @Override
////    public List<Student> findByAgeRange(int minAge, int maxAge) {
////        return sr.findByAgeRange(minAge, maxAge);
////    }
//}
