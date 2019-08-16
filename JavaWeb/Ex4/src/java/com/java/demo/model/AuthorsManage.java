/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
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
public class AuthorsManage {
    public List<Authors> getAuthors() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM AUTHORS INNER JOIN NEWS WHERE AUTHORS.ID = NEWS.ID";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Authors> listAuthors = new ArrayList<>();
        while (rs.next()) {
            Authors authors = new Authors();
            authors.setId(rs.getInt("id"));
            authors.setName(rs.getString("name"));
            authors.setEmail(rs.getString("email"));
            listAuthors.add(authors);
        }
        return listAuthors;
    }
}
