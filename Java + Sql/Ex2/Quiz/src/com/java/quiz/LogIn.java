package com.java.quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogIn {
    private String email;
    private String pass;
    private Statement stat;
    private ResultSet rs;
    
    public void LogInDB(Scanner input, Connection conn) {
        System.out.print("Email: ");
        email = input.nextLine();
        System.out.print("Password: ");
        pass = input.nextLine();
        boolean bl = CheckEmail(conn);
        if(bl == false) {
            System.out.println("Email does not exist.");
            LogInDB(input, conn);
        }
        else {
            bl = false;
            while (bl == false) {                
                bl = CheckPass(conn);
                if(bl == false) {
                    System.out.println("Password false!!!");
                    System.out.print("Retype Password: ");
                    pass = input.nextLine();
                }
            }
        }
    }
    
    private boolean CheckEmail(Connection conn) {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT EMAIL FROM STUDENTS");
            while (rs.next())               
                if(rs.getString("EMAIL").equals(email))
                    return true;
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private boolean CheckPass(Connection conn) {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT EMAIL, PASS FROM STUDENTS");
            while (rs.next())               
                if(rs.getString("EMAIL").equals(email) && rs.getString("PASS").equals(pass))
                    return true;
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
