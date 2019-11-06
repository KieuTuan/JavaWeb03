<%-- 
    Document   : index
    Created on : Oct 5, 2019, 1:11:16 AM
    Author     : Kieu Anh Tuan
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/static/html/admin/headtag.html" %>
    </head>
    <body>
        <%@include file="/static/html/admin/header.html" %>
        
        <div class="home">
            <div class="wrapper">
                <div class="panel panel-primary">
                    <div class="panel-body clear-fix">
                        <!--
                        <a href="http://www.hocvienact.edu.vn/admin/menu_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/menu.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Quản lý menu
                                    </div>
                                </div>
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/admin_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/admin.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Admin Management
                                    </div>
                                </div>
                            </div>
                        </a>
                        -->
                        <a href="http://www.hocvienact.edu.vn/admin/register_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/register.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Students Manager
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/contact_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/contacts.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Teachers Manager
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="<c:url value="/admin/courses-manager"/>">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/notepad.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Courses Manager
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <!--
                        <a href="http://www.hocvienact.edu.vn/admin/library_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/Library.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Quản lý thư viện
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/admin_upload">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/admin_upload.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Upload file
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/admin_setting">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/gear-47203_640.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Đổi thông tin
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/slider_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/computer.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Quản lý slider
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/footer_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/flipboard.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Footer
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        <a href="http://www.hocvienact.edu.vn/admin/tkb_manager">
                            <div class="panel panel-primary box">
                                <div class="panel-body clear-fix">
                                    <div class="image">
                                        <img src="http://www.hocvienact.edu.vn/images/admin/Emotes-face-smile-icon.png" width="100%" height="100%">
                                    </div>
                                    <div class="name">
                                        Thời khoá biểu
                                    </div>
                                </div>                                    
                            </div>
                        </a>
                        -->
                    </div>
                </div>
            </div>
        </div>
    </body>
    <%@include file="/static/html/admin/scriptloader.html" %>
</html>
