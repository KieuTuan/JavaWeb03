<%-- 
    Document   : lessons
    Created on : Oct 6, 2019, 10:20:57 AM
    Author     : Kieu Anh Tuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/static/html/headtag.html" %>
        <style>

        </style>
    </head>
    <body>
        <%@include file="/static/html/header.html" %>

        <div class="container">
            <div class="courses">
                <h2>${lessons.title}</h2>
                <p>${lessons.description}</p>
            </div>
            <div class="embed-responsive embed-responsive-16by9">
                <iframe class="embed-responsive-item" src="${lessons.video}" allowfullscreen></iframe>
            </div>
        </div>

        <%@include file="/static/html/footer.html" %>
    </body>
</html>
