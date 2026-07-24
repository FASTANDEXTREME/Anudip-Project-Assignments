package com.harsh.org.dto;

public class StudentDTO {

        private int studentId;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private int age;
        private String city;
        private int courseId;

    public StudentDTO(int studentId, String firstName, String lastName, String email, String phone, int age, String city, int courseId) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.courseId = courseId;
    }


//OVERLOAD
    public StudentDTO(String firstName, String lastName, String email, String phone, int age, String city, int courseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.city = city;
        this.courseId = courseId;
    }

    public StudentDTO() {

    }


    //GETTERS AND SETTERS

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    @Override
    public String toString() {
        return "Student ID : " + studentId +
                "\nFirst Name : " + firstName +
                "\nLast Name  : " + lastName +
                "\nEmail      : " + email +
                "\nPhone      : " + phone +
                "\nAge        : " + age +
                "\nCity       : " + city +
                "\nCourse ID  : " + courseId +
                "\n===========================================";
    }
}


