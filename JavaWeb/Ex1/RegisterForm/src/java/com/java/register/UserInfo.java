package com.java.register;

public class UserInfo {
    private String user;
    private String pass;
    private String fullName;
    private String email;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String user, String pass, String fullName, String email, String address) {
        this.user = user;
        this.pass = pass;
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
