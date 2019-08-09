package com.demo.db;

public class Student {
    
    private int id;
    private String name;
    private String faculty;
    private String classroom;

    public Student() {
    }

    public Student(String name, String faculty, String classroom) {
        this.name = name;
        this.faculty = faculty;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
}
