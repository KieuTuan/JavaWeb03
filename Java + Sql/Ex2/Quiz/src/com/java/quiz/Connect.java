package com.java.quiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public Connection getConnect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/QUIZ";
        Connection conn = DriverManager.getConnection(connStr, "root", "root");
        return conn;
    }
}
