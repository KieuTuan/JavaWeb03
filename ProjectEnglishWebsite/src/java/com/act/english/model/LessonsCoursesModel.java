/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.LessonsCourses;
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
public class LessonsCoursesModel {
    
    public List<LessonsCourses> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM LESSONS_COURSES";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<LessonsCourses> list = new ArrayList<>();
        while (rs.next()) {
            LessonsCourses lessonsCourses = new LessonsCourses();
            lessonsCourses.setId(rs.getInt("id"));
            lessonsCourses.setLessonsId(rs.getInt("lessons_id"));
            lessonsCourses.setCoursesId(rs.getInt("courses_id"));
            list.add(lessonsCourses);
        }
        conn.close();
        return list;
    }
    
    public LessonsCourses getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM LESSONS_COURSES WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        LessonsCourses lessonsCourses = null;
        while (rs.next()) {
            lessonsCourses = new LessonsCourses();
            lessonsCourses.setId(rs.getInt("id"));
            lessonsCourses.setLessonsId(rs.getInt("lessons_id"));
            lessonsCourses.setCoursesId(rs.getInt("courses_id"));
        }
        return lessonsCourses;
    }
    
    public void add(LessonsCourses lessonsCourses) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO LESSONS_COURSES(lessons_id, courses_id) VALUES (?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, lessonsCourses.getLessonsId());
        pstmt.setInt(2, lessonsCourses.getCoursesId());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(LessonsCourses coursesStudent) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE LESSONS_COURSES SET lessons_id=?, courses_id=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, coursesStudent.getLessonsId());
        pstmt.setInt(2, coursesStudent.getCoursesId());
        pstmt.setInt(3, coursesStudent.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE LESSONS_COURSES WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
