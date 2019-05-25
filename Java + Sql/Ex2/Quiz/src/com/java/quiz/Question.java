package com.java.quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question {
    private Statement stat;
    private ResultSet rs;
    
    public int getQuestion(Connection conn, Scanner input) {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM QUESTION");
            int count = 0;
            while (rs.next()) {
                System.out.printf("Question %d/10", rs.getInt("id"));
                System.out.println(rs.getString(2));
                System.out.println("A. " + rs.getString(3));
                System.out.println("B. " + rs.getString(4));
                System.out.println("C. " + rs.getString(5));
                System.out.println("D. " + rs.getString(6));
                System.out.print("Your Answer: ");
                String ans = input.nextLine();
                if (rs.getString("correct").equals(ans))
                    count++;
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
