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
public class CoursesStudent {
    
    private int id;
    private int coursesId;
    private int studentId;

    public CoursesStudent() {
    }

    public CoursesStudent(int id, int coursesId, int studentId) {
        this.id = id;
        this.coursesId = coursesId;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    
}
