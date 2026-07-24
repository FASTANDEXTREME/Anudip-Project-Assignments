package com.harsh.org.dao.impl;

import com.harsh.org.dao.CourseDAO;
import com.harsh.org.dto.CourseDTO;
import com.harsh.org.utility.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean createCourse(CourseDTO course){

        String sql ="Insert into course(course_name,course_duration,course_fees) values (?,?,?)";

        try(Connection con = DbConnection.makeConnection();
            PreparedStatement ps = con.prepareStatement(sql);){
            ps.setString(1, course.getCourse_name());
            ps.setString(2, course.getCourse_duration());
            ps.setLong(3,course.getCourse_fees());

            int rows = ps.executeUpdate();
            if(rows>0){
                System.out.println("Rows updated: "+ rows);
                return true;
            }
            else{
                System.out.println("ERROR occurred, no rows updated.");
                return false;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<CourseDTO> showAllCourses() {
        List<CourseDTO> courses = new java.util.ArrayList<>();
        String sql = "SELECT * FROM course";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            java.sql.ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                CourseDTO course = new CourseDTO(
                        rs.getInt("course_id"),
                        rs.getString("course_name"),
                        rs.getString("course_duration"),
                        rs.getLong("course_fees")
                );
                courses.add(course);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return courses;
    }

    @Override
    public boolean updateCourse(CourseDTO course) {
        String sql = "UPDATE course SET course_name = ?, course_duration = ?, course_fees = ? WHERE course_id = ?";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, course.getCourse_name());
            ps.setString(2, course.getCourse_duration());
            ps.setLong(3, course.getCourse_fees());
            ps.setInt(4, course.getCourse_id());

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
    public boolean deleteCourse(int courseId) {
        String sql = "DELETE FROM course WHERE course_id = ?";

        try (Connection con = DbConnection.makeConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, courseId);
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
