/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.CoursesStudent;
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
public class CoursesStudentModel {
    
    public List<CoursesStudent> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM COURSES_STUDENT";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<CoursesStudent> list = new ArrayList<>();
        while (rs.next()) {
            CoursesStudent coursesStudent = new CoursesStudent();
            coursesStudent.setId(rs.getInt("id"));
            coursesStudent.setCoursesId(rs.getInt("courses_id"));
            coursesStudent.setStudentId(rs.getInt("student_id"));
            list.add(coursesStudent);
        }
        conn.close();
        return list;
    }
    
    public CoursesStudent getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM COURSES_STUDENT WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        CoursesStudent coursesStudent = null;
        while (rs.next()) {
            coursesStudent = new CoursesStudent();
            coursesStudent.setId(rs.getInt("id"));
            coursesStudent.setCoursesId(rs.getInt("courses_id"));
            coursesStudent.setStudentId(rs.getInt("student_id"));
        }
        return coursesStudent;
    }
    
    public void add(CoursesStudent coursesStudent) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO COURSES_STUDENT(courses_id, student_id) VALUES (?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, coursesStudent.getCoursesId());
        pstmt.setInt(2, coursesStudent.getStudentId());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(CoursesStudent coursesStudent) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE COURSES_STUDENT SET courses_id=?, student_id=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, coursesStudent.getCoursesId());
        pstmt.setInt(2, coursesStudent.getStudentId());
        pstmt.setInt(3, coursesStudent.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM COURSES_STUDENT WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
