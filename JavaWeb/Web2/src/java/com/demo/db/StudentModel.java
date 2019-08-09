package com.demo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentModel {

    //private final DBConnector db = new DBConnector();
    private Connection conn;
    
    public String getStudents() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String conStr = "jdbc:mysql://localhost:3306/sinhvien";
            String user = "root";
            String pass = "root";
            conn  = DriverManager.getConnection(conStr, user, pass);
            //conn = db.getConnect();
            return "yes";
//            String sql = "SELECT * FROM INFO";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            ArrayList<Student> list = new ArrayList<>();
//            while (rs.next()) {
//                Student s = new Student();
//                s.setId(rs.getInt("id"));
//                s.setName(rs.getString("name"));
//                s.setFaculty(rs.getString("faculty"));
//                s.setClassroom(rs.getString("classroom"));
//                list.add(s);
//            }
//            return list;
        } catch (ClassNotFoundException | SQLException ex) {
            return "no";
        }
    }

    public Student getStudentById(int id) {
        // TODO 
        // - Ket noi csdl
        // - Thuc hien cua lenh select where id = ?
        return null;
    }
    
    public int addStudent(Student stud) {
        // TODO 
        // - Ket noi csdl
        // - Thuc hien cua lenh insert
        return 0;
    }
    
    public int updateStudent(Student stud) {
        // TODO 
        // - Ket noi csdl
        // - Thuc hien cua lenh update
        return 0;
    }
    
    public int deleteStudent(int id) {
        // TODO 
        // - Ket noi csdl
        // - Thuc hien cua lenh delete
        return 0;
    }
    
}
