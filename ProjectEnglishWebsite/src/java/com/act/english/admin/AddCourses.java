/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.admin;

/**
 *
 * @author Kieu Anh Tuan
 */
public class AddCourses {
    
    private String title;
    private String description;
    private String author;

    public AddCourses() {
    }

    public AddCourses(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    
}
