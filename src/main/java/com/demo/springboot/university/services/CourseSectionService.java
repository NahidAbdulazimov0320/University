//package com.demo.springboot.university.services;
//
//import com.university.university.entity.CourseSection;
//import com.university.university.repository.CourseSectionRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CourseSectionService {
//
//    private final CourseSectionRepository courseSectionRepository;
//
//    public CourseSectionService(CourseSectionRepository courseSectionRepository) {
//        this.courseSectionRepository = courseSectionRepository;
//    }
//
//    public CourseSection createCourseSection(CourseSection courseSection) {
//        return courseSectionRepository.save(courseSection);
//    }
//
//    public List<CourseSection> getAllCourseSections() {
//        return courseSectionRepository.findAll();
//    }
//
//    public Optional<CourseSection> getCourseSectionById(Long id) {
//        return courseSectionRepository.findById(id);
//    }
//
//    public CourseSection updateCourseSection(CourseSection courseSection) {
//        if (courseSection.getId() != null && courseSectionRepository.existsById(courseSection.getId())) {
//            return courseSectionRepository.save(courseSection);
//        } else {
//            throw new IllegalArgumentException("CourseSection with ID " + courseSection.getId() + " does not exist.");
//        }
//    }
//
//    public void deleteCourseSectionById(Long id) {
//        courseSectionRepository.deleteById(id);
//    }
//}
