package com.harsh.org.dao;


import com.harsh.org.dto.StudentDTO;

import java.util.List;

public interface StudentDAO {

    boolean createStudent(StudentDTO student);
    List<StudentDTO> showAllStudent();
    boolean updateStudent(StudentDTO student);
    boolean deleteStudent(int studentId);
}

