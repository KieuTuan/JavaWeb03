/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.adminModel;

import com.act.english.admin.Post;
import com.act.english.dto.Courses;
import com.act.english.dto.Teachers;
import com.act.english.model.CoursesModel;
import com.act.english.model.TeacherModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kieu Anh Tuan
 */
public class PostModel {
    
    public List<Post> getAll() throws ClassNotFoundException, SQLException {
        List<Courses> listCourses = new CoursesModel().getAll();
        List<Teachers> listTeacher = new TeacherModel().getAll();
        List<Post> listPost = new ArrayList<>();
        Post post;
        Teachers teachers;
        for (Courses item : listCourses) {
            post = new Post();
            post.setId(item.getId());
            post.setTitle(item.getTitle());
            post.setCreatedAt(item.getCreatedAt());
            post.setUpdatedAt(item.getUpdatedAt());
            if(item.getTeacherId()==0)
                post.setAuthor("Admin Kaiser");
            else {
                teachers = new TeacherModel().getById(item.getTeacherId());
                post.setAuthor(teachers.getName());
            }
            listPost.add(post);
        }
        return listPost;
    }
    
    public Post getById(int id) throws ClassNotFoundException, SQLException {
        List<Post> listPost = getAll();
        Post post = new Post();
        for (Post item : listPost) {
            if(item.getId() == id)
                post = item;
        }
        return post;
    }
    
}
