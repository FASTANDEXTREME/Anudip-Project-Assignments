package com.harsh.org.service;

import com.harsh.org.dto.AdminDTO;
import com.harsh.org.dto.CourseDTO;
import com.harsh.org.dto.StudentDTO;

import java.util.List;
/*
The Controller passes data to the Service because the Controller's responsibility is only to handle the request and decide which operation to perform.
The Service layer contains the business logic, validations, and application rules.
 Keeping business logic in the Service makes the application modular, reusable, and easier to maintain.
 */

public interface UserService {

   public boolean createAdmin(AdminDTO admin);
   public boolean adminLogin(AdminDTO admin);
   public boolean createStudent(StudentDTO student);
   public boolean createCourse(CourseDTO course);
   public List<StudentDTO> showAllStudent();
   public boolean updateStudent(StudentDTO student);
   boolean deleteStudent(int studentId);

   public List<CourseDTO> showAllCourses();
   public boolean updateCourse(CourseDTO course);
   public boolean deleteCourse(int courseId);
}
