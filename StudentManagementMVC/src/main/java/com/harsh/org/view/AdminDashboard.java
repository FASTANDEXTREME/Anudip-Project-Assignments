package com.harsh.org.view;

import com.harsh.org.controller.UserController;
import com.harsh.org.dto.CourseDTO;
import com.harsh.org.dto.StudentDTO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;

public class AdminDashboard {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void adminDash() {
        UserController userController = new UserController();
        int option;
        try {
            do {
                System.out.print("""
                        ========== ADMIN DASHBOARD ==========
                        1. Add Student
                        2. View All Students
                        3. Update Student
                        4. Delete Student
                        
                        5. Add Course
                        6. View all Courses
                        7. Update Course
                        8. Delete Course
                        
                        9. Logout
                        
                        Enter your option:""");

                option = Integer.parseInt(br.readLine());

                switch (option) {
                    case 1 -> {
                        System.out.print("Student First name:");
                        String firstName = br.readLine();
                        System.out.print("Student Last name:");
                        String lastName = br.readLine();
                        System.out.print("Student Email:");
                        String email = br.readLine();
                        System.out.print("Student Phone:");
                        String phone = br.readLine();
                        System.out.print("Student Age:");
                        int age = Integer.parseInt(br.readLine());
                        System.out.print("Student City:");
                        String city = br.readLine();
                        System.out.print("Student course ID:");
                        int courseID = Integer.parseInt(br.readLine());

                        StudentDTO student = new StudentDTO(firstName, lastName, email, phone, age, city, courseID);
                        if (userController.createStudent(student)) {
                            System.out.println("Student Added successfully");
                        } else {
                            System.out.println("Error occurred while adding student");
                        }


                    }
                    case 2 -> {
                        System.out.println("View All Students");
                        List<StudentDTO> students = userController.showAllStudent();
                        for (StudentDTO student : students) {
                            System.out.println(student);
                        }

                    }
                    case 3 -> {
                        System.out.println("===== Update Student =====");

                        System.out.print("Enter Student ID: ");
                        int studentId = Integer.parseInt(br.readLine());

                        System.out.print("Enter New First Name: ");
                        String firstName = br.readLine();

                        System.out.print("Enter New Last Name: ");
                        String lastName = br.readLine();

                        System.out.print("Enter New Email: ");
                        String email = br.readLine();

                        System.out.print("Enter New Phone: ");
                        String phone = br.readLine();

                        System.out.print("Enter New Age: ");
                        int age = Integer.parseInt(br.readLine());

                        System.out.print("Enter New City: ");
                        String city = br.readLine();

                        System.out.print("Enter New Course ID: ");
                        int courseId = Integer.parseInt(br.readLine());

                        StudentDTO student = new StudentDTO(studentId, firstName, lastName, email, phone, age, city, courseId);
                        if (userController.updateStudent(student)) {
                            System.out.println("Successful in updating DB");
                        } else {
                            System.out.println("Error Occurred.");
                        }


                    }
                    case 4 -> {
                        System.out.println("===== Delete Student =====");

                        System.out.print("Enter Student ID: ");
                        int studentId = Integer.parseInt(br.readLine());

                        if (userController.deleteStudent(studentId)) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Student not found.");
                        }
                    }
                    case 5 -> {
                        System.out.print("Enter Course Name: ");
                        String courseName = br.readLine();

                        System.out.print("Enter Course Duration: ");
                        String courseDuration = br.readLine();

                        System.out.print("Enter Course Fees: ");
                        long courseFees = Long.parseLong(br.readLine());
                        CourseDTO course = new CourseDTO(courseName, courseDuration, courseFees);
                        if (userController.createCourse(course)) {
                            System.out.println("Course added successfully");
                        } else {
                            System.out.println("There was error while adding course.");
                        }
                    }
                    case 6 -> {
                        System.out.println("===== View All Courses =====");
                        List<CourseDTO> courses = userController.showAllCourses();
                        for (CourseDTO c : courses) {
                            System.out.println(c);
                        }
                    }
                    case 7 -> {
                        System.out.println("===== Update Course =====");
                        System.out.print("Enter Course ID to update: ");
                        int courseId = Integer.parseInt(br.readLine());

                        System.out.print("Enter New Course Name: ");
                        String courseName = br.readLine();

                        System.out.print("Enter New Course Duration: ");
                        String courseDuration = br.readLine();

                        System.out.print("Enter New Course Fees: ");
                        long courseFees = Long.parseLong(br.readLine());
                        
                        CourseDTO course = new CourseDTO(courseId, courseName, courseDuration, courseFees);
                        if (userController.updateCourse(course)) {
                            System.out.println("Course updated successfully");
                        } else {
                            System.out.println("Error Occurred or Course not found.");
                        }
                    }
                    case 8 -> {
                        System.out.println("===== Delete Course =====");
                        System.out.print("Enter Course ID to delete: ");
                        int courseId = Integer.parseInt(br.readLine());

                        if (userController.deleteCourse(courseId)) {
                            System.out.println("Course deleted successfully.");
                        } else {
                            System.out.println("Course not found.");
                        }
                    }
                    case 9 -> System.out.println("Logging out...");

                    default -> System.out.println("Invalid option! Please enter a number between 1 and 9.");
                }


            } while (option != 9);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
