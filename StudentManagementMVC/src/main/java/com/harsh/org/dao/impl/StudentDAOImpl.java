package com.harsh.org.dao.impl;


import com.harsh.org.dao.StudentDAO;
import com.harsh.org.dto.StudentDTO;
import com.harsh.org.utility.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean createStudent(StudentDTO student) {

        String sql = "INSERT INTO Student(first_name,last_name,email,phone,age,city,course_id) values (?,?,?,?,?,?,?)";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql);) {

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setInt(5, student.getAge());
            ps.setString(6, student.getCity());
            ps.setInt(7, student.getCourseId());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Rows updated: " + rows);
                return true;
            } else {
                System.out.println("ERROR occurred, no rows updated.");
                return false;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<StudentDTO> showAllStudent() {
        List<StudentDTO> students = new ArrayList<>();

        String sql = "Select * from student";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();


            while (rs.next()) {
                StudentDTO student = new StudentDTO();

                student.setStudentId(rs.getInt("student_id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setEmail(rs.getString("email"));
                student.setPhone(rs.getString("phone"));
                student.setAge(rs.getInt("age"));
                student.setCity(rs.getString("city"));
                student.setCourseId(rs.getInt("course_id"));
                students.add(student);

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return students;

    }

    @Override
    public boolean updateStudent(StudentDTO student) {

        String sql = "UPDATE student SET first_name = ?, last_name = ?, email = ?, phone = ?, age = ?, city = ?, course_id = ? WHERE student_id = ?";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getPhone());
            ps.setInt(5, student.getAge());
            ps.setString(6, student.getCity());
            ps.setInt(7, student.getCourseId());
            ps.setInt(8, student.getStudentId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Rows updated: " + rows);
                return true;
            }

            return false;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteStudent(int studentId) {

        String sql = "DELETE FROM student WHERE student_id = ?";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, studentId);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Rows updated: " + rows);
                return true;
            }
            return false;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}





