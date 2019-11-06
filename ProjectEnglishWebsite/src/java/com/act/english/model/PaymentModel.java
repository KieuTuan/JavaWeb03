/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Payment;
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
public class PaymentModel {
        
    public List<Payment> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM PAYMENT";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Payment> list = new ArrayList<>();
        while (rs.next()) {
            Payment payment = new Payment();
            payment.setId(rs.getInt("id"));
            payment.setPaymentDate(rs.getDate("payment_date"));
            payment.setPaymentMethod(rs.getString("payment_method"));
            payment.setCoursesId(rs.getInt("courses_id"));
            payment.setStudentId(rs.getInt("student_id"));
            list.add(payment);
        }
        conn.close();
        return list;
    }
    
    public Payment getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM PAYMENT WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Payment payment = null;
        while (rs.next()) {
            payment = new Payment();
            payment.setId(rs.getInt("id"));
            payment.setPaymentDate(rs.getDate("payment_date"));
            payment.setPaymentMethod(rs.getString("payment_method"));
            payment.setCoursesId(rs.getInt("courses_id"));
            payment.setStudentId(rs.getInt("student_id"));
        }
        return payment;
    }
    
    public void add(Payment payment) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO PAYMENT(payment_date, payment_method, courses_id, student_id) VALUES (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setDate(1, payment.getPaymentDate());
        pstmt.setString(2, payment.getPaymentMethod());
        pstmt.setInt(3, payment.getCoursesId());
        pstmt.setInt(4, payment.getStudentId());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Payment payment) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE PAYMENT SET payment_date=?, payment_method=? courses_id=?, student_id=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setDate(1, payment.getPaymentDate());
        pstmt.setString(2, payment.getPaymentMethod());
        pstmt.setInt(3, payment.getCoursesId());
        pstmt.setInt(4, payment.getStudentId());
        pstmt.setInt(5, payment.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM PAYMENT WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
