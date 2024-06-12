//package com.demo.springboot.university.config;
//import com.demo.springboot.university.entities.University;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.HashSet;
//import java.util.Set;
//
//@Configuration
//public class DataInitializer {
//
//    @Bean
//    CommandLineRunner initDatabase(UniversityService universityService, SchoolService schoolService, ProgramService programService) {
//        return args -> {
//            University university = createUniversity("ADA University", "Ahmad Bay Aghaoglu", "Hafiz Pashayev", 112314253543L, LocalDate.of(2006, 3, 12), "GPA");
//            universityService.saveUniversity(university);
//
//            Set<School> schools = createSchools(university);
//            schoolService.saveSchool(schools);
//
//            Set<Program> programs = createPrograms(schools);
//            programService.saveProgram(programs);
//        };
//    }
//
//    private University createUniversity(String name, String location, String rector, Long id, LocalDate establishmentDate, String gradingSystem) {
//        University university = new Universenumsity();
//        university.setName(name);
//        university.setLocation(location);
//        university.setRector(rector);
//        university.setId(id);
//        university.setEstablishmentDate(establishmentDate);
//        university.setGradingSystem(gradingSystem);
//        return university;
//    }
//
//    private Set<School> createSchools(University university) {
//        Set<School> schools = new HashSet<>();
//        schools.add(createSchool(SchoolsEnum.BAPA, "Azer Babayev", university));
//        schools.add(createSchool(SchoolsEnum.BUSINESS, "Huseyn Ismayilov", university));
//        schools.add(createSchool(SchoolsEnum.LAW, "Rasad Ibadov", university));
//        schools.add(createSchool(SchoolsEnum.SITE, "Abzatdin Adamov", university));
//        schools.add(createSchool(SchoolsEnum.EDUCATION, "Ulviyya Mikayilova", university));
//        return schools;
//    }
//
//    private School createSchool(SchoolsEnum schoolEnum, String dean, University university) {
//        School school = new School();
//        school.setName(schoolEnum.name());
//        school.setDean(dean);
//        school.setUniversity(university);
//        school.setEstablishmentDate(university.getEstablishmentDate());
//        return school;
//    }
//
//    private Set<Program> createPrograms(Set<School> schools) {
//        Set<Program> programs = new HashSet<>();
//        for (School school : schools) {
//            switch (school.getName()) {
//                case "BAPA":
//                    addPrograms(programs, school, "International Studies", "Communication and Digital Media", "Public Affairs");
//                    break;
//                case "BUSINESS":
//                    addPrograms(programs, school, "Business Administration", "Economics", "Finance");
//                    break;
//                case "LAW":
//                    addPrograms(programs, school, "Laws");
//                    break;
//                case "SITE":
//                    addPrograms(programs, school, "Computer Science", "Computer Engineering", "Information Technology", "Mathematics", "Electrical and Electronics Engineering");
//                    break;
//                case "EDUCATION":
//                    addPrograms(programs, school, "English for Academic and Professional Purposes (EAPP) (NON-DEGREE)");
//                    break;
//            }
//        }
//        return programs;
//    }
//
//    private void addPrograms(Set<Program> programs, School school, String... programNames) {
//        for (String programName : programNames) {
//            Program program = new Program();
//            program.setSchool(school);
//            program.setName(programName);
//            programs.add(program);
//        }
//    }
//}
