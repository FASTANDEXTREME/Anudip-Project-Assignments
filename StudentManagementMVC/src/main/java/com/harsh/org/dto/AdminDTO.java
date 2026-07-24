package com.harsh.org.dto;

public class AdminDTO {
    private int admin_id;
    private String admin_user;
    private String admin_pass;

    public AdminDTO(int admin_id, String admin_user, String admin_pass) {
        this.admin_id = admin_id;
        this.admin_user = admin_user;
        this.admin_pass = admin_pass;
    }

    //Constructor override as id is auto_incremented
    public AdminDTO(String admin_user, String admin_pass) {
        this.admin_user = admin_user;
        this.admin_pass = admin_pass;
    }

    //GETTERS AND SETTERS
    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_user() {
        return admin_user;
    }

    public void setAdmin_user(String admin_user) {
        this.admin_user = admin_user;
    }

    public String getAdmin_pass() {
        return admin_pass;
    }

    public void setAdmin_pass(String admin_pass) {
        this.admin_pass = admin_pass;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "AdminDTO{" +
                "admin_id=" + admin_id +
                ", admin_user='" + admin_user + '\'' +
                ", admin_pass='" + admin_pass + '\'' +
                '}';
    }
}
