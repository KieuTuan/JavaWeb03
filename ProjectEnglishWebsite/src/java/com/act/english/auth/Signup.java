/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.auth;

/**
 *
 * @author Kieu Anh Tuan
 */
public class Signup {
    
    private String email;
    private String user;
    private String name;
    private String phone;
    private String address;
    private String password;
    private String confirm;

    public Signup() {
    }

    public Signup(String email, String user, String name, String phone, String address, String password, String confirm) {
        this.email = email;
        this.user = user;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.confirm = confirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

}
