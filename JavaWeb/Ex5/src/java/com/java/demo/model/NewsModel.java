/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
import com.java.demo.dto.News;
import com.mysql.cj.xdevapi.PreparableStatement;
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
public class NewsModel {
    
    public List<News> getAll() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM NEWS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<News> listNews = new ArrayList<>();
        while (rs.next()) {
            News news = new News();
            news.setId(rs.getInt("id"));
            news.setTitle(rs.getString("title"));
            news.setImage(rs.getString("image"));
            news.setSummary(rs.getString("summary"));
            news.setContent(rs.getString("content"));
            news.setCreateAt(rs.getDate("createAt"));
            news.setAuthorId(rs.getInt("authorId"));
            listNews.add(news);
        }
        return listNews;
    }
    
    public News getById(int id) {
        return null;
    }
    
    public int create(News news) {
        return 0;
    }
    
    public int update(News news){
        return 0;
    }
    
    public int delete(int id) {
        return 0;
    }
    
}
