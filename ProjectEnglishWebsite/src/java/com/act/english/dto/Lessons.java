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
public class Lessons {
    
    private int id;
    private String title;
    private String description;
    private String video;
    private Date createdAt;
    private Date updatedAt;

    public Lessons() {
    }

    public Lessons(int id, String title, String description, String video, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.video = video;
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

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
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
