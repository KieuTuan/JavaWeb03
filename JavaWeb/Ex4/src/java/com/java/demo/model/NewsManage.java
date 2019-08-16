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
public class NewsManage {
    public List<News> getNews(int limit, int offset) throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM NEWS LIMIT ? OFFSET ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, limit);
        pstmt.setInt(2, offset);
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

    public int countNews() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT COUNT(*) FROM NEWS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt(1);
    }
}
