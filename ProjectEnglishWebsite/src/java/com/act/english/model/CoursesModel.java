/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Courses;
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
public class CoursesModel {
    
    public List<Courses> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM COURSES";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Courses> list = new ArrayList<>();
        while (rs.next()) {
            Courses courses = new Courses();
            courses.setId(rs.getInt("id"));
            courses.setTitle(rs.getString("title"));
            courses.setDescription(rs.getString("description"));
            courses.setTeacherId(rs.getInt("teacher_id"));
            courses.setCreatedAt(rs.getDate("created_at"));
            courses.setUpdatedAt(rs.getDate("updated_at"));
            list.add(courses);
        }
        conn.close();
        return list;
    }
    
    public Courses getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM COURSES WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Courses courses = null;
        while (rs.next()) {
            courses = new Courses();
            courses.setId(rs.getInt("id"));
            courses.setTitle(rs.getString("title"));
            courses.setDescription(rs.getString("description"));
            courses.setTeacherId(rs.getInt("teacher_id"));
            courses.setCreatedAt(rs.getDate("created_at"));
            courses.setUpdatedAt(rs.getDate("updated_at"));
        }
        return courses;
    }
    
    public void add(Courses courses) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO COURSES(title, description, teacher_id, created_at, updated_at) VALUES (?,N?,?,now(),now())";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, courses.getTitle());
        pstmt.setString(2, courses.getDescription());
        pstmt.setInt(3, courses.getTeacherId());
        System.out.println(pstmt);
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Courses courses) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE COURSES SET title=?, description=?, teacher_id=?, created_at=?, updated_at=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, courses.getTitle());
        pstmt.setString(2, courses.getDescription());
        pstmt.setInt(3, courses.getTeacherId());
        pstmt.setDate(4, courses.getCreatedAt());
        pstmt.setDate(5, courses.getUpdatedAt());
        pstmt.setInt(6, courses.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM COURSES WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
