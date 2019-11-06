/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo.dto;

import java.sql.Date;

/**
 *
 * @author Kieu Anh Tuan
 */
public class News {
    private int id;
    private String title;
    private String image;
    private String summary;
    private String content;
    private Date createAt;
    private int authorId;

    public News() {
    }

    public News(int id, String title, String image, String summary, String content, Date createAt, int authorId) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.summary = summary;
        this.content = content;
        this.createAt = createAt;
        this.authorId = authorId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
    
    
}
