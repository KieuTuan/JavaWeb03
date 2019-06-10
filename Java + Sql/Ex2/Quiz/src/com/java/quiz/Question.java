package com.java.quiz;

import com.mysql.cj.xdevapi.PreparableStatement;
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
    
    private void stQues(Connection conn, int stId, int quesId, String ans) {
        try {
            stat = conn.createStatement();
            String sql = "INSERT INTO student_questions "
                    + "VALUES ('" +stId+ "', '" +quesId+ "', '" +ans+ "')";
            stat.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getQuestion(Connection conn, Scanner input, int stId) {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM QUESTION");
            int count = 0;
            while (rs.next()) {
                System.out.printf("Question %d/10\n", rs.getInt("id"));
                System.out.println(rs.getString(2));
                System.out.println("A. " + rs.getString(3));
                System.out.println("B. " + rs.getString(4));
                System.out.println("C. " + rs.getString(5));
                System.out.println("D. " + rs.getString(6));
                System.out.print("Your Answer: ");
                String ans = input.nextLine();
                if (rs.getString("correct").equals(ans))
                    count++;
                stQues(conn, stId, rs.getInt("id"), ans);
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public void seeDetails(Connection conn) {
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery("SELECT * FROM QUESTION INNER JOIN STUDENT_QUESTIONS "
                    + "WHERE QUESTION.ID = STUDENT_QUESTIONS.STUDENT_ID ");
            while (rs.next()) {
                System.out.printf("Question %d/10\n", rs.getInt("id"));
                System.out.println(rs.getString(2));
                for (int i = 0; i < 3; i++) {
                    if(rs.getString(""))
                }
                System.out.println("A. " + rs.getString(3));
                System.out.println("B. " + rs.getString(4));
                System.out.println("C. " + rs.getString(5));
                System.out.println("D. " + rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Question.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
