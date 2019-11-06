/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.dto;

import java.sql.Date;

/**
 *
 * @author Kieu Anh Tuan
 */
public class Courses {
    
    private int id;
    private String title;
    private String description;
    private int teacherId;
    private Date createdAt;
    private Date updatedAt;

    public Courses() {
    }

    public Courses(int id, String title, String description, int teacherId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.teacherId = teacherId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
}
