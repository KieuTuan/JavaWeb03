/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.dto;

/**
 *
 * @author Kieu Anh Tuan
 */
public class Member {
    
    private int id;
    private String user;
    private String password;
    private String salt;
    private int flag;       // 0 == students    ;   1 == teacher    ;   2 == admin

    public Member() {
    }

    public Member(String user, String password, String salt, int flag) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.salt = salt;
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
