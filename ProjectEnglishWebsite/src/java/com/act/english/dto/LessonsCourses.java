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
public class LessonsCourses {
    
    private int id;
    private int lessonsId;
    private int coursesId;

    public LessonsCourses() {
    }

    public LessonsCourses(int id, int lessonsId, int coursesId) {
        this.id = id;
        this.lessonsId = lessonsId;
        this.coursesId = coursesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLessonsId() {
        return lessonsId;
    }

    public void setLessonsId(int lessonsId) {
        this.lessonsId = lessonsId;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

}
