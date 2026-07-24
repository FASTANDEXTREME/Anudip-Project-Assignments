package com.harsh.org.dao;

import com.harsh.org.dto.CourseDTO;
import java.util.List;

public interface CourseDAO {
    boolean createCourse(CourseDTO course);
    List<CourseDTO> showAllCourses();
    boolean updateCourse(CourseDTO course);
    boolean deleteCourse(int courseId);
}
