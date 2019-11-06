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
public class Payment {
    private int id;
    private Date paymentDate;
    private String paymentMethod;
    private int coursesId;
    private int studentId;

    public Payment() {
    }

    public Payment(int id, Date paymentDate, String paymentMethod, int coursesId, int studentId) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.coursesId = coursesId;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
