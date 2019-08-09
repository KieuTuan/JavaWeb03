package com.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    
    Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String conStr = "jdbc:mysql://localhost:3306/sinhvien";
        String user = "root";
        String pass = "root";
        return DriverManager.getConnection(conStr, user, pass);
    }
    
}
