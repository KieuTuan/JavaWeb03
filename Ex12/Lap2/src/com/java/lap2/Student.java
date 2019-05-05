package com.java.lap2;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
    private String id;
    private String name;
    private Date dob;
    private String email;

    public Student() {
    }

    public Student(String id, String name, Date dob, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id = " + id + "\nName = " + name + "\nDob = " + dob.getDate() + "/"
               + dob.getMonth() + "/" + dob.getYear() + "\nEmail = " + email + '\n';
    }
}
