//package com.demo.springboot.university.mappers;
//
//import com.university.university.dto.EnrollmentDTO;
//import com.university.university.entity.Enrollment;
//
//import java.util.function.Function;
//
//public class EnrollmentMapper implements Function<Enrollment, EnrollmentDTO> {
//
//    @Override
//    public EnrollmentDTO apply(Enrollment enrollment) {
//        return new EnrollmentDTO(
//                enrollment.getStudent().getId(),
//                enrollment.getCourseSection().getId(),
//                enrollment.getCourseSection().getSemester()
//        );
//    }
//}
