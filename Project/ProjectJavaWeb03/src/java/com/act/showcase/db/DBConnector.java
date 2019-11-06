/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kieu Anh Tuan
 */
public class DBConnector {
    
    public Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connStr = "jdbc:mysql://localhost:3306/DB_Project_JavaWeb_03?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "root";
        return DriverManager.getConnection(connStr, user, pass);
    }
    
}
