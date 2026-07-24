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
}
