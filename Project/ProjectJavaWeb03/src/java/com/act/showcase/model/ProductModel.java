/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.model;

import com.act.showcase.db.DBConnector;
import com.act.showcase.dto.Products;
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
public class ProductModel {
    
    public List<Products> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM AUTHORS INNER JOIN NEWS WHERE AUTHORS.ID = NEWS.ID";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Products> listProducts = new ArrayList<>();
        while (rs.next()) {
            Products products = new Products();
            products.setId(rs.getInt("id"));
            products.setName(rs.getString("name"));
            products.setDescription(rs.getString("description"));
            products.setAuthorId(rs.getInt("author_id"));
            products.setImages(rs.getString("images"));
            listProducts.add(products);
        }
        return listProducts;
    }
}
