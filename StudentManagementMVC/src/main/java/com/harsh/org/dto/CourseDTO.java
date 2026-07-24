package com.harsh.org.dto;

public class CourseDTO {
    private int course_id;
    private String course_name;
    private String course_duration;
    private long course_fees;

    public CourseDTO(int course_id, String course_name, String course_duration, long course_fees) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_duration = course_duration;
        this.course_fees = course_fees;
    }

    //OVERLOAD
    public CourseDTO(String course_name, String course_duration, long course_fees) {
        this.course_name = course_name;
        this.course_duration = course_duration;
        this.course_fees = course_fees;
    }

    //GETTER & SETTER

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public long getCourse_fees() {
        return course_fees;
    }

    public void setCourse_fees(long course_fees) {
        this.course_fees = course_fees;
    }

    @Override
    public String toString() {
        return "Course ID      : " + course_id +
                "\nCourse Name    : " + course_name +
                "\nCourse Duration: " + course_duration +
                "\nCourse Fees    : " + course_fees +
                "\n===========================================";
    }
}
