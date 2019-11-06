/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.controller;

import com.act.english.admin.AddCourses;
import com.act.english.admin.Post;
import com.act.english.adminModel.PostModel;
import com.act.english.dto.Courses;
import com.act.english.dto.Member;
import com.act.english.model.CoursesModel;
import com.act.english.model.MemberModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Kieu Anh Tuan
 */

@Controller
public class AdminController {
    
    private boolean isAdmin(HttpSession session, Model model) {
        String st = (String)session.getAttribute("user");
        if(st==null)
            return false;
        try {
            Member member = new MemberModel().getByUser(st);
            if (member.getFlag() == 2)
                return true;
            return  false;
        } catch (SQLException | ClassNotFoundException ex) {
            return false;
        }
    }
    
    @RequestMapping("/admin")
    public String admin(HttpSession session, Model model) {
        if (isAdmin(session, model))
            return "admin/index";
        return "login";
    }

    @RequestMapping("/admin/index")
    public String adminIndex(HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        return "admin/index";
    }
    
    @RequestMapping("/admin/courses-manager")
    public String postManager(HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        try {
            PostModel postModel = new PostModel();
            List<Post> listPost = postModel.getAll();
            model.addAttribute("listPost", listPost);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "admin/courses-manager";
    }
    
    @RequestMapping("/admin/get-courses")
    public String getCourses(HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        try {
            PostModel postModel = new PostModel();
            List<Post> listPost = postModel.getAll();
            model.addAttribute("listPost", listPost);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "admin/courses-manager";
    }
    
    @RequestMapping("/admin/add-courses")
    public String addCourses(HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        return "admin/add-courses";
    }
    
    @RequestMapping("/admin/add-courses-edit")
    public String addCoursesEdit(@ModelAttribute("addcourses") AddCourses addCourses, HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        Courses courses = new Courses();
        courses.setTitle(addCourses.getTitle());
        courses.setDescription(addCourses.getDescription());
        courses.setTeacherId(0);
        CoursesModel coursesModel = new CoursesModel();
        try {
            coursesModel.add(courses);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/";
    }

    @RequestMapping("/admin/get-courses-select")
    public String getCoursesSelect(@RequestParam int id, HttpSession session, Model model) {
        if (!isAdmin(session, model))
            return "redirect:/login";
        try {
            Courses courses = new CoursesModel().getById(id);
            model.addAttribute("courses", courses);
        } catch (ClassNotFoundException | SQLException ex) {
            return "admin/courses-manager";
        }
        return "admin/get-courses-select";
    }

}
