/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kieu Anh Tuan
 */
public class QuizModel {
    
    public List<Quiz> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM QUIZ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Quiz> list = new ArrayList<>();
        while (rs.next()) {
            Quiz quiz = new Quiz();
            quiz.setId(rs.getInt("id"));
            quiz.setQuestion(rs.getString("question"));
            quiz.setA(rs.getString("a"));
            quiz.setB(rs.getString("b"));
            quiz.setC(rs.getString("c"));
            quiz.setD(rs.getString("d"));
            quiz.setResult(rs.getString("result"));
            list.add(quiz);
        }
        conn.close();
        return list;
    }
    
    public Quiz getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM QUIZ WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Quiz quiz = null;
        while (rs.next()) {
            quiz = new Quiz();
            quiz.setId(rs.getInt("id"));
            quiz.setQuestion(rs.getString("question"));
            quiz.setA(rs.getString("a"));
            quiz.setB(rs.getString("b"));
            quiz.setC(rs.getString("c"));
            quiz.setD(rs.getString("d"));
            quiz.setResult(rs.getString("result"));
        }
        return quiz;
    }
    
    public void add(Quiz quiz) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO QUIZ(question, a, b, c, d, result) VALUES (?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, quiz.getQuestion());
        pstmt.setString(2, quiz.getA());
        pstmt.setString(3, quiz.getB());
        pstmt.setString(4, quiz.getC());
        pstmt.setString(5, quiz.getD());
        pstmt.setString(6, quiz.getResult());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Quiz quiz) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE QUIZ SET question=?, a=?, b=?, c=?, d=?, result=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, quiz.getQuestion());
        pstmt.setString(2, quiz.getA());
        pstmt.setString(3, quiz.getB());
        pstmt.setString(4, quiz.getC());
        pstmt.setString(5, quiz.getD());
        pstmt.setString(6, quiz.getResult());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM QUIZ WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
