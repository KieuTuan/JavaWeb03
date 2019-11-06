/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Lessons;
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
public class LessonsModel {
    
    public List<Lessons> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM LESSONS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Lessons> list = new ArrayList<>();
        while (rs.next()) {
            Lessons lessons = new Lessons();
            lessons.setId(rs.getInt("id"));
            lessons.setTitle(rs.getString("title"));
            lessons.setDescription(rs.getString("description"));
            lessons.setVideo(rs.getString("video"));
            lessons.setCreatedAt(rs.getDate("created_at"));
            lessons.setUpdatedAt(rs.getDate("updated_at"));
            list.add(lessons);
        }
        conn.close();
        return list;
    }
    
    public Lessons getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM LESSONS WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Lessons lessons = null;
        while (rs.next()) {
            lessons = new Lessons();
            lessons.setId(rs.getInt("id"));
            lessons.setTitle(rs.getString("title"));
            lessons.setDescription(rs.getString("description"));
            lessons.setVideo(rs.getString("video"));
            lessons.setCreatedAt(rs.getDate("created_at"));
            lessons.setUpdatedAt(rs.getDate("updated_at"));
        }
        return lessons;
    }
    
    public void add(Lessons lessons) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO LESSONS(title, description, video, created_at, updated_at) VALUES (?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, lessons.getTitle());
        pstmt.setString(2, lessons.getDescription());
        pstmt.setString(3, lessons.getVideo());
        pstmt.setDate(4, lessons.getCreatedAt());
        pstmt.setDate(5, lessons.getUpdatedAt());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Lessons lessons) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE LESSONS SET title=?, description=?, video=?, created_at=?, updated_at=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, lessons.getTitle());
        pstmt.setString(2, lessons.getDescription());
        pstmt.setString(3, lessons.getVideo());
        pstmt.setDate(4, lessons.getCreatedAt());
        pstmt.setDate(5, lessons.getUpdatedAt());
        pstmt.setInt(6, lessons.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM LESSONS WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
