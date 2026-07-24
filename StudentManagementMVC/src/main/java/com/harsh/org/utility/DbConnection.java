package com.harsh.org.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    // ESTABLISHING CONNECTION
    public static Connection makeConnection(){
        final String URL ="jdbc:mysql://localhost:3306/student_management";
        final String USER="root";
        final String PASS="data";

        try{
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //TESTING
    public static void main(String[] args) {
        try(Connection con = makeConnection()){
            if(con!=null){
                System.out.println("Connection is successful");
            }
            else{
                System.out.println("Connection not successful");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
