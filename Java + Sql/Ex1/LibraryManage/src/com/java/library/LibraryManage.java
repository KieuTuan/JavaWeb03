package com.java.library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LibraryManage {
    public void func1(Connection conn) {
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT TEN, KHOA FROM DOCGIA ORDER BY KHOA ASC");
            while (rs.next()) {
                System.out.println(rs.getString("ten") + " , " + rs.getString("khoa"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void func2(Scanner input, Connection conn) {
        System.out.print("Nhập tên sách: ");
        String name = input.nextLine();
        System.out.print("Nhập ngày mượn(YYYY-MM-DD): ");
        String date = input.nextLine();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select docgia.ten "
                    + "from docgia inner join phieumuon, sach "
                    + "where docgia.sothe = phieumuon.sothe "
                    + "and sach.masach = phieumuon.masach "
                    + "and phieumuon.ngaymuon = '" + date + "'"
                    + "and sach.ten = '" + name + "'");
            while (rs.next()) {
                System.out.println(rs.getString("ten"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void func3(Scanner input, Connection conn) {
        System.out.print("Nhập tháng/năm(YYYY-MM): ");
        String date = input.nextLine();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(
                    "select docgia.ten, docgia.sothe, sach.ten " +
                    "from PHIEUMUON inner join SACH, DOCGIA " +
                    "where sach.masach = PHIEUMUON.masach and " +
                    "DOCGIA.sothe = PHIEUMUON.sothe and " +
                    "PHIEUMUON.ngaymuon between '" +date+ "-01' and '" +date+ "-30'");
            while (rs.next()) {
                System.out.println(rs.getString("docgia.ten") +" , "+
                        rs.getString("docgia.sothe") +" , "+ rs.getString("sach.ten"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void func4(Connection conn) {
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(
                    "select s.* from SACH s\n" +
                    "where s.masach not in (select masach from PHIEUMUON);");
            while (rs.next()) {
                System.out.println(
                    rs.getString("masach")  +" , "+
                    rs.getString("ten")     +" , "+
                    rs.getString("tacgia")  +" , "+
                    rs.getString("nxb")     +" , "+
                    rs.getString("soluong"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void func5(Scanner input, Connection conn) {
        System.out.print("Nhập tên: ");
        String name = input.nextLine();
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(
                    "select count(*) as 'soluong' from PHIEUMUON p\n" +
                    "join DOCGIA d on d.sothe = p.sothe\n" +
                    "where d.ten = '" +name+ "'");
            while (rs.next()) {
                System.out.println(rs.getString("soluong"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void func6(Connection conn) {
        try {
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(
                    "select d.* from PHIEUMUON p\n" +
                    "join DOCGIA d on d.sothe = p.sothe\n" +
                    "where p.ngaytra is null");
            while (rs.next()) {
                System.out.println(
                    rs.getString("d.sothe")   +" , "+
                    rs.getString("d.ten")     +" , "+
                    rs.getString("d.khoa")    +" , "+
                    rs.getString("d.khoahoc") +" , "+
                    rs.getString("d.thoihanthe"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LibraryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
