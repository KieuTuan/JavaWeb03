/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.english.controller;

import com.act.english.auth.Login;
import com.act.english.auth.Signup;
import com.act.english.dto.Courses;
import com.act.english.dto.Lessons;
import com.act.english.dto.LessonsCourses;
import com.act.english.dto.Member;
import com.act.english.dto.Students;
import com.act.english.encrypt.Encryption;
import com.act.english.model.CoursesModel;
import com.act.english.model.LessonsCoursesModel;
import com.act.english.model.LessonsModel;
import com.act.english.model.MemberModel;
import com.act.english.model.StudentModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author Kieu Anh Tuan
 */
@Controller
@SessionAttributes("user")
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        try {
            CoursesModel coursesModel = new CoursesModel();
            List<Courses> listCourses = coursesModel.getAll();
            model.addAttribute("listCourses", listCourses);
            for (Courses item : listCourses) {
                if (item.getDescription().length() > 300) {
                    item.setDescription(item.getDescription().substring(0, 299) + "...");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/authlogin")
    public String authLogin(@ModelAttribute("login") Login login, Model model) {
        try {
            MemberModel memberModel = new MemberModel();
            if (memberModel.checkMember(login.getUser(), login.getPassword()) == false) {
                model.addAttribute("error", "Login fail!");
                return "login";
            }
            model.addAttribute("user", login.getUser());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(SessionStatus status, Model model) {
        status.setComplete();
        return "redirect:/";
    }

    @RequestMapping("/signup")
    public String logout(Model model) {
        return "signup";
    }

    @RequestMapping("/authsignup")
    public String authSignup(@ModelAttribute("signup") Signup signup, Model model) {
        try {
            if (new MemberModel().checkUserExisted(signup.getUser()) == true) {
                model.addAttribute("error", "User existed!");
                return "signup";
            }
            if (new StudentModel().checkEmailExisted(signup.getEmail()) == true) {
                model.addAttribute("error", "Email existed!");
                return "signup";
            }
            if (signup.getPassword().equals(signup.getConfirm()) == false) {
                model.addAttribute("error", "Confirm password fail!");
                return "signup";
            }

            // create member
            String salt = new Encryption().randomSalt();
            Member member = new Member();
            member.setUser(signup.getUser());
            member.setFlag(0);
            member.setSalt(salt);
            member.setPassword(new Encryption().encryptSHA512(signup.getPassword()+salt));
            // end create member
            
            // add member
            MemberModel memberModel = new MemberModel();
            memberModel.add(member);
            member = memberModel.getByUser(signup.getUser());
            // end add member
            int memberId = member.getId();
            // add students
            Students students = new Students(memberId, signup.getEmail(), signup.getName(), signup.getPhone(),
                    null, signup.getAddress());
            StudentModel studentModel = new StudentModel();
            studentModel.add(students);
            // end add student
            model.addAttribute("user", signup.getUser());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "redirect:/";
    }

    @RequestMapping("courses")
    public String courses(HttpSession session, Model model, HttpServletRequest request) {
        String user = (String) session.getAttribute("user");
        String memberName = (String) session.getAttribute("memberName");
        if (memberName == null && user == null) {
            return "redirect:/login";
        }

        try {
            // Lấy courses_id để hiển thị mô tả khóa học.
            CoursesModel coursesModel = new CoursesModel();
            int id = Integer.parseInt(request.getParameter("id"));
            Courses courses = coursesModel.getById(id);
            model.addAttribute("courses", courses);

            // Lấy list lessons_id của courses_id trên.
            List<LessonsCourses> listLCAll = new LessonsCoursesModel().getAll();
            List<LessonsCourses> listLC = new ArrayList<>();
            for (LessonsCourses item : listLCAll) {
                if (item.getCoursesId() == id) {
                    listLC.add(item);
                }
            }

            // Lấy list lessons
            List<Lessons> list = new LessonsModel().getAll();
            List<Lessons> listLessons = new ArrayList<>();
            for (Lessons item : list) {
                for (LessonsCourses lc : listLC) {
                    if (item.getId() == lc.getLessonsId()) {
                        listLessons.add(item);
                    }
                }
            }
            model.addAttribute("listLessons", listLessons);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "courses";
    }

    @RequestMapping("lessons")
    public String lessons(HttpSession session, Model model, HttpServletRequest request) {
        String user = (String) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        try {
            // Lấy lessons_id.
            LessonsModel lessonsModel = new LessonsModel();
            int id = Integer.parseInt(request.getParameter("id"));
            Lessons lessons;
            lessons = lessonsModel.getById(id);
            model.addAttribute("lessons", lessons);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "lessons";
    }
}
