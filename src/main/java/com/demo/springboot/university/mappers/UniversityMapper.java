//package com.demo.springboot.university.mappers;
//
//import com.university.university.dto.UniversityDTO;
//import com.university.university.entity.University;
//
//import java.util.function.Function;
//
//public class UniversityMapper implements Function<University, UniversityDTO> {
//    @Override
//    public UniversityDTO apply(University university) {
//        return new UniversityDTO(
//                university.getName(),
//                university.getLocation(),
//                university.getRector()
//        );
//    }
//}
