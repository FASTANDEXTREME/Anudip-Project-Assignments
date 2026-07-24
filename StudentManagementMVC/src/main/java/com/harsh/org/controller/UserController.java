package com.harsh.org.controller;

import com.harsh.org.dto.AdminDTO;
import com.harsh.org.dto.CourseDTO;
import com.harsh.org.dto.StudentDTO;
import com.harsh.org.service.UserService;
import com.harsh.org.service.impl.UserServiceImpl;

import java.util.List;

/*
Data is passed from the View to the Controller because the View's responsibility is only to collect input from the user and display output.
It should not contain business logic or database code.
The Controller receives the user's request, processes it by calling the appropriate Service methods, and returns the response back to the View.
This separation follows the MVC architecture and makes the application easier to maintain, test, and modify.
 */

public class UserController {
    UserService userService = new UserServiceImpl();

    public boolean createAdmin(AdminDTO admin){
        return userService.createAdmin(admin);
    }

    public boolean adminLogin(AdminDTO admin) {
        return userService.adminLogin(admin);
    }

    public boolean createStudent(StudentDTO student){
        return userService.createStudent(student);
    }

    public boolean createCourse(CourseDTO course){
        return userService.createCourse(course);
    }

    public List<StudentDTO> showAllStudent() {
        return userService.showAllStudent();
    }

    public boolean updateStudent(StudentDTO student) {
        return userService.updateStudent(student);
    }

    public boolean deleteStudent(int studentId) {
        return  userService.deleteStudent(studentId);
    }
}
