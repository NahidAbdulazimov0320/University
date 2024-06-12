package com.demo.springboot.university.dto;

import com.university.university.enums.Semester;

public record EnrollmentDTO (Long studentId, Long courseSectionId, Semester semester){
}
