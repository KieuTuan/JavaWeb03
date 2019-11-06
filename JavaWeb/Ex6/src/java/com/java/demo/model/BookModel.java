/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.model;

import com.java.demo.db.DBConnector;
import com.java.demo.dto.Book;
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
public class BookModel {
    
    public List<Book> getAll() throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "SELECT * FROM BOOK";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Book> list = new ArrayList<>();
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setPrice(rs.getDouble("price"));
            book.setQuantity(rs.getInt("quantity"));
            list.add(book);
        }
        conn.close();
        return list;
    }
    
    public Book getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM book WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Book b = null;
        while (rs.next()) {
            b = new Book();
            b.setId(rs.getInt("id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setPrice(rs.getFloat("price"));
            b.setQuantity(rs.getInt("quantity"));
        }
        return b;
    }
    
    public void add(Book book) throws ClassNotFoundException, SQLException {
        DBConnector db = new DBConnector();
        Connection conn = db.getConnect();
        String sql = "INSERT INTO book(title, author, price, quantity) VALUES (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setDouble(3, book.getPrice());
        pstmt.setInt(4, book.getQuantity());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public int update(Book book) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE BOOK SET title=?, author=?, price=?, quantity=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, book.getTitle());
        pstmt.setString(2, book.getAuthor());
        pstmt.setDouble(3, book.getPrice());
        pstmt.setInt(4, book.getQuantity());
        pstmt.setInt(5, book.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM BOOK WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
}
