package com.harsh.org.dao;

import com.harsh.org.dto.AdminDTO;
/*
The Service passes data to the DAO because the Service is responsible for business logic, while the DAO is responsible only for database operations.
The DAO contains all SQL queries and JDBC code.
This separation keeps business logic independent of the database implementation.
 */

public interface AdminDAO {

    boolean createAdmin(AdminDTO admin);

    boolean adminLogin(AdminDTO admin);
}
