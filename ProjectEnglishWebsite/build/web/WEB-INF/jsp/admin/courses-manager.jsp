<%-- 
    Document   : postmanager
    Created on : Oct 5, 2019, 2:15:36 AM
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
        </br>
        <h1 class="text-center">COURSES MANAGEMENT</h1>
        </br>
        <div class="container">
            <table class="table table-light">
                <thead>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Created At</th>
                    <th>Updated At</th>
                    <th>Details</th>
                </thead>
                <c:forEach var="item" items="${listPost}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.title}</td>
                        <td>${item.author}</td>
                        <td>${item.createdAt}</td>
                        <td>${item.updatedAt}</td>
                        <td>
                            <a href="get-courses-select?id=${item.id}">
                                <img src="<c:url value="/public/images/admin/go.png"/>" width="32px" height="32px">
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-success" href="<c:url value="/admin/add-courses"/>">Thêm mới</a>
        </div>
    </body>
    <%@include file="/static/html/admin/scriptloader.html" %>
</html>
