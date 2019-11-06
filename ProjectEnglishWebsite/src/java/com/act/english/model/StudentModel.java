/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Students;
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
public class StudentModel {
    
    public List<Students> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM STUDENTS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Students> list = new ArrayList<>();
        while (rs.next()) {
            Students students = new Students();
            students.setId(rs.getInt("id"));
            students.setMemberId(rs.getInt("member_id"));
            students.setName(rs.getString("email"));
            students.setName(rs.getString("name"));
            students.setPhone(rs.getString("phone"));
            students.setPhoto(rs.getString("photo"));
            students.setAddress(rs.getString("address"));
            students.setCreatedAt(rs.getDate("created_at"));
            students.setUpdatedAt(rs.getDate("updated_at"));
            list.add(students);
        }
        conn.close();
        return list;
    }
    
    public Students getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM STUDENTS WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Students students = null;
        while (rs.next()) {
            students = new Students();
            students.setId(rs.getInt("id"));
            students.setMemberId(rs.getInt("member_id"));
            students.setName(rs.getString("email"));
            students.setName(rs.getString("name"));
            students.setPhone(rs.getString("phone"));
            students.setPhoto(rs.getString("photo"));
            students.setAddress(rs.getString("address"));
            students.setCreatedAt(rs.getDate("created_at"));
            students.setUpdatedAt(rs.getDate("updated_at"));
        }
        return students;
    }
    
    public Students getByMemberId(int memberId) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM STUDENTS WHERE member_id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, memberId);
        ResultSet rs = pstmt.executeQuery();
        Students students = null;
        while (rs.next()) {
            students = new Students();
            students.setId(rs.getInt("id"));
            students.setMemberId(rs.getInt("member_id"));
            students.setName(rs.getString("email"));
            students.setName(rs.getString("name"));
            students.setPhone(rs.getString("phone"));
            students.setPhoto(rs.getString("photo"));
            students.setAddress(rs.getString("address"));
            students.setCreatedAt(rs.getDate("created_at"));
            students.setUpdatedAt(rs.getDate("updated_at"));
        }
        return students;
    }
    
    public void add(Students students) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO STUDENTS(member_id , email, name, phone, photo, address, created_at, updated_at)"
                + " VALUES (?,?,?,?,?,?,now(),now())";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, students.getMemberId());
        pstmt.setString(2, students.getEmail());
        pstmt.setString(3, students.getName());
        pstmt.setString(4, students.getPhone());
        pstmt.setString(5, students.getPhoto());
        pstmt.setString(6, students.getAddress());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Students students) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE STUDENTS SET member_id=?, email=?, name=?, phone=?, photo=?, address=?, updated_at=now() WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, students.getMemberId());
        pstmt.setString(2, students.getEmail());
        pstmt.setString(3, students.getName());
        pstmt.setString(4, students.getPhone());
        pstmt.setString(5, students.getPhoto());
        pstmt.setString(6, students.getAddress());
        pstmt.setInt(7, students.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM STUDENTS WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
    public boolean checkEmailExisted (String email) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT email FROM STUDENTS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if(email.equals(rs.getString("email")))
                return true;
        }
        conn.close();
        return false;
    }
}
