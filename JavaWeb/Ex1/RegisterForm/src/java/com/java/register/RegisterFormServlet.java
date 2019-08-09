/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.register;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kieu Anh Tuan
 */
@WebServlet(name = "RegisterFormServlet", urlPatterns = {"/register"})
public class RegisterFormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\" dir=\"ltr\">");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Register Form</title>");
            out.println("<link rel=\"stylesheet\" href=\"styles.css\">");
            out.println("</head>");
            out.println("<body><center>");
            out.println("<div class=\"main\">");
            out.println("<h1>REGISTER FORM</h1>");
            out.println("<form>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><label>Username: </label></td>");
            out.println("<td><input type=\"text\" name=\"user\"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Password: </label></td>");
            out.println("<td><input type=\"password\" name=\"pass\"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Full name: </label></td>");
            out.println("<td><input type=\"text\" name=\"fullName\"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Email: </label></td>");
            out.println("<td><input type=\"email\" name=\"email\"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Address: </label></td>");
            out.println("<td><textarea name=\"address\"></textarea></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><a href=\"http://localhost:8080/RegisterForm/hello\"><input type=\"submit\" name=\"register\" value=\"Register\"></a></td>");
            out.println("<td><input type=\"reset\" name=\"clear\" value=\"Clear\"></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</div>");
            out.println("</center></body>");
            out.println("</html>");
            
            UserInfo userInfo = new UserInfo();
            userInfo.setUser(request.getParameter("user"));
            userInfo.setPass(request.getParameter("pass"));
            userInfo.setFullName(request.getParameter("fullName"));
            userInfo.setEmail(request.getParameter("email"));
            userInfo.setAddress(request.getParameter("address"));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
