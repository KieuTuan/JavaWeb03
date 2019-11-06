/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Teachers;
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
public class TeacherModel {
        
    public List<Teachers> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM TEACHERS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Teachers> list = new ArrayList<>();
        while (rs.next()) {
            Teachers teachers = new Teachers();
            teachers.setId(rs.getInt("id"));
            teachers.setId(rs.getInt("member_id"));
            teachers.setName(rs.getString("email"));
            teachers.setName(rs.getString("name"));
            teachers.setDescription(rs.getString("description"));
            teachers.setPhoto(rs.getString("photo"));
            teachers.setIsActive(rs.getInt("is_active"));
            teachers.setCreatedAt(rs.getDate("created_at"));
            teachers.setUpdatedAt(rs.getDate("updated_at"));
            list.add(teachers);
        }
        conn.close();
        return list;
    }
    
    public Teachers getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM TEACHERS WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Teachers teachers = null;
        while (rs.next()) {
            teachers = new Teachers();
            teachers.setId(rs.getInt("id"));
            teachers.setId(rs.getInt("member_id"));
            teachers.setName(rs.getString("email"));
            teachers.setName(rs.getString("name"));
            teachers.setDescription(rs.getString("description"));
            teachers.setPhoto(rs.getString("photo"));
            teachers.setIsActive(rs.getInt("is_active"));
            teachers.setCreatedAt(rs.getDate("created_at"));
            teachers.setUpdatedAt(rs.getDate("updated_at"));
        }
        return teachers;
    }
    
    public void add(Teachers teachers) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO TEACHERS(member_id, email, name, description, photo, is_active, now(), now()) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, teachers.getMemberId());
        pstmt.setString(2, teachers.getEmail());
        pstmt.setString(3, teachers.getName());
        pstmt.setString(4, teachers.getDescription());
        pstmt.setString(5, teachers.getPhoto());
        pstmt.setInt(6, teachers.getIsActive());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Teachers teachers) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE TEACHERS SET member_id=?, email=?, name=?, description=?, photo=?, is_active=?, updated_at=now() WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, teachers.getMemberId());
        pstmt.setString(2, teachers.getEmail());
        pstmt.setString(3, teachers.getName());
        pstmt.setString(4, teachers.getDescription());
        pstmt.setString(5, teachers.getPhoto());
        pstmt.setInt(6, teachers.getIsActive());
        pstmt.setInt(7, teachers.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM TEACHERS WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
