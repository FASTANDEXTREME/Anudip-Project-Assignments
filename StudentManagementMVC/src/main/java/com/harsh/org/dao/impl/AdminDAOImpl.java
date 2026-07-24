package com.harsh.org.dao.impl;

import com.harsh.org.dao.AdminDAO;
import com.harsh.org.dto.AdminDTO;
import com.harsh.org.utility.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOImpl implements AdminDAO {

    @Override
    public boolean createAdmin(AdminDTO admin) {

        String sql = "INSERT INTO admin(admin_user, admin_pass) VALUES (?, ?)";

        try (Connection con = DbConnection.makeConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, admin.getAdmin_user());
            ps.setString(2, admin.getAdmin_pass());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Admin created successfully.");
                return true;
            } else {
                System.out.println("Admin creation failed.");
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean adminLogin(AdminDTO admin) {
        String sql = "SELECT admin_pass from admin where admin_user = ?";

        try (
                Connection con = DbConnection.makeConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        )
        {
            ps.setString(1, admin.getAdmin_user());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String pass = rs.getString("admin_pass");
                return admin.getAdmin_pass().equals(pass);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}