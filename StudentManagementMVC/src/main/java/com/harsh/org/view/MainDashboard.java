package com.harsh.org.view;

import com.harsh.org.controller.UserController;
import com.harsh.org.dto.AdminDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainDashboard {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {


        int mainOption =0;

        do{
            try{
                System.out.println("""
                    Welcome to Student Management System
                    1. Register Admin
                    2. Admin Login
                    3. Exit
                    Enter your option:""");
                mainOption = Integer.parseInt(br.readLine());

                switch (mainOption){
                    case 1-> registerAdmin();
                    case 2-> adminLogin();
                    case 3 -> System.out.println("Thank you for using SMS!");
                    default -> System.out.println("Invalid Option");
                }
            } catch (Exception e) {
                System.out.println("Something went Wrong");
                e.printStackTrace();
            }


        }
        while(mainOption!=3);

    }

    private static void registerAdmin() {
        try{
            System.out.print("Enter new Admin username:");
            String adminUser = br.readLine();
            System.out.print("Enter new Admin Password:");
            String adminPass = br.readLine();
            AdminDTO admin = new AdminDTO(adminUser,adminPass);
            UserController userController = new UserController();
            if(userController.createAdmin(admin)){
                System.out.println("Admin Registered");
            }
            else{
                System.out.println("Registration Failed");

            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    private static void adminLogin() {
        try{
            System.out.print("Enter  Admin username:");
            String adminUser = br.readLine();
            System.out.print("Enter Admin Password:");
            String adminPass = br.readLine();
            AdminDTO admin = new AdminDTO(adminUser,adminPass);
            UserController userController = new UserController();
            if(userController.adminLogin(admin)){
                System.out.println("Welcome to Admin Dashboard.");
                AdminDashboard.adminDash();
            }
            else{
                System.out.println("Invalid Username/password");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    }







