/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.model;

import com.act.english.db.DBConnector;
import com.act.english.dto.Member;
import com.act.english.encrypt.Encryption;
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
public class MemberModel {
    
    public List<Member> getAll() throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM MEMBERS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Member> list = new ArrayList<>();
        while (rs.next()) {
            Member member = new Member();
            member.setId(rs.getInt("id"));
            member.setUser(rs.getString("user"));
            member.setPassword(rs.getString("password"));
            member.setSalt(rs.getString("salt"));
            member.setFlag(rs.getInt("flag"));
            list.add(member);
        }
        conn.close();
        return list;
    }
    
    public Member getById(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM MEMBERS WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        Member member = null;
        while (rs.next()) {
            member = new Member();
            member.setId(rs.getInt("id"));
            member.setUser(rs.getString("user"));
            member.setPassword(rs.getString("password"));
            member.setSalt(rs.getString("salt"));
            member.setFlag(rs.getInt("flag"));
        }
        return member;
    }
    
    // return member_id
    public void add(Member member) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "INSERT INTO MEMBERS(user, password, salt, flag) VALUES (?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, member.getUser());
        pstmt.setString(2, member.getPassword());
        pstmt.setString(3, member.getSalt());
        pstmt.setInt(4, member.getFlag());
        pstmt.executeUpdate();
        conn.close();
    }
    
    public Member getByUser(String user) throws SQLException, ClassNotFoundException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM MEMBERS WHERE user = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user);
        ResultSet rs = pstmt.executeQuery();
        Member member = null;
        while (rs.next()) {
            member = new Member();
            member.setId(rs.getInt("id"));
            member.setUser(rs.getString("user"));
            member.setPassword(rs.getString("password"));
            member.setSalt(rs.getString("salt"));
            member.setFlag(rs.getInt("flag"));
        }
        return member;
    }
    
    public int update(Member member) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "UPDATE MEMBERS SET user=?, password=?, salt=?, flag=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, member.getUser());
        pstmt.setString(2, member.getPassword());
        pstmt.setString(3, member.getSalt());
        pstmt.setInt(4, member.getFlag());
        pstmt.setInt(5, member.getId());
        return pstmt.executeUpdate();
    }
    
    public int delete(int id) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "DELETE FROM MEMBERS WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        return pstmt.executeUpdate();
    }
    
    public boolean checkMember (String user, String password) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT * FROM MEMBERS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if(user.equals(rs.getString("user"))) {
                String st = password + rs.getString("salt");
                if(new Encryption().encryptSHA512(st).equals(rs.getString("password")))
                    return true;
            }
        }
        conn.close();
        return false;
    }
    
    public boolean checkUserExisted (String user) throws ClassNotFoundException, SQLException {
        Connection conn = new DBConnector().getConnect();
        String sql = "SELECT user FROM MEMBERS";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            if(user.equals(rs.getString("user")))
                return true;
        }
        conn.close();
        return false;
    }
}
