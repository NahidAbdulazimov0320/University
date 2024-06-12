//package com.demo.springboot.university.entities;
//
//
//import com.university.university.enums.Semester;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.DayOfWeek;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class CourseSection{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name ="course_id")
//    private Course mainCourse;
//
//
//    @OneToMany(mappedBy = "courseSection")
//    private Set<Enrollment> enrollments = new HashSet<>();
//
//    @OneToMany(mappedBy = "courseSection")
//    private Set<SectionSchedule> sectionSchedules = new HashSet<>();
//
//    private int capacity;
//
//    private Semester semester;
//
//}
