package com.harsh.org.service.impl;

import com.harsh.org.dao.AdminDAO;
import com.harsh.org.dao.StudentDAO;
import com.harsh.org.dao.impl.AdminDAOImpl;
import com.harsh.org.dao.CourseDAO;
import com.harsh.org.dao.impl.CourseDAOImpl;
import com.harsh.org.dao.impl.StudentDAOImpl;
import com.harsh.org.dto.AdminDTO;
import com.harsh.org.dto.CourseDTO;
import com.harsh.org.dto.StudentDTO;
import com.harsh.org.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    AdminDAO adminDAO = new AdminDAOImpl();
    StudentDAO studentDAO =new StudentDAOImpl();
    CourseDAO courseDAO= new CourseDAOImpl();

    public boolean createAdmin(AdminDTO admin){
        return adminDAO.createAdmin(admin);
    }
    public boolean adminLogin(AdminDTO admin) {
        return adminDAO.adminLogin(admin);
    }
    public boolean createStudent(StudentDTO student) {
        return studentDAO.createStudent(student);
    }
    public  boolean createCourse(CourseDTO course) {
        return courseDAO.createCourse(course);
    }
    public List<StudentDTO> showAllStudent() {
        return studentDAO.showAllStudent();
    }
    public boolean updateStudent(StudentDTO student) {
        return studentDAO.updateStudent(student);
    }
    public boolean deleteStudent(int studentId) {
       return studentDAO.deleteStudent(studentId);
    }

}
