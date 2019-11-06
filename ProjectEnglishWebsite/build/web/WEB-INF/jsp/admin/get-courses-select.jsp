<%-- 
    Document   : get-courses
    Created on : Nov 6, 2019, 4:32:48 PM
    Author     : Kieu Anh Tuan
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ACT English Academy</title>
        <link href="<c:url value="/static/css/admin/admin.css" />" rel="stylesheet">
        <link href="http://www.hocvienact.edu.vn/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://www.hocvienact.edu.vn/css/admin/bootstrap.min.css" rel="stylesheet" type="text/css">

        <style>
            form {
                border: 1px black solid;
                margin: 30px 100px;
                padding: 30px;
            }

            div .drop {
                margin: 0px 100px;
                padding: 30px;
            }
            
            div .description {
                width: 100%;
                height: 350px;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                background-color: #f8f8f8;
                font-size: 16px;
                resize: none;
            }
            
            div textarea {
                width: 100%;
                height: 50px;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                background-color: #f8f8f8;
                font-size: 16px;
                resize: none;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <div class="wrapper">
                <a href="#">
                    <div class="title">ACT ENGLISH ACADEMY</div>
                </a>
            </div>
        </div>

        <br/>
        <div class="container" id="main">
            <div class="drop">
                <h2>Courses id: ${courses.id}</h2>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-danger">Xóa</button>
                    </div>
                </div>
            </div>
            <form action="<c:url value="add-courses-edit"/>" method="POST" modelAttribute="addcourses" accept-charset="UTF-8">
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Title</label>
                    <div class="col-sm-10">
                        <textarea id="description" name="description">${courses.title}</textarea>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="description" class="col-sm-2 col-form-label">Description</label>
                    <div class="col-sm-10">
                        <textarea id="description" name="description" class="description">${courses.description}</textarea>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="teacher-id" class="col-sm-2 col-form-label">Teacher id</label>
                    <div class="col-sm-10">
                        <textarea id="teacher-id" name="teacher-id">${courses.teacherId}</textarea>
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">Sửa</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
    <!--Load script-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>

    </body>
</html>
