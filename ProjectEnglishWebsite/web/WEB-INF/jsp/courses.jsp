<%-- 
    Document   : courses
    Created on : Oct 6, 2019, 8:19:58 AM
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
            .courses {
                background-color: #E3E9EB;
                margin: 30px 0;
            }
        </style>
    </head>
    <body>
        <%@include file="/static/html/header.html" %>
 
        <div class="container">
            <div class="courses">
                <h2>${courses.title}</h2>
                <p>${courses.description}</p>
            </div>
            <h3 class="text-center title">Danh sách bài học</h3>
            <br/><br/>
            <div class="row">
                <c:forEach items="${listLessons}" var="item">
                <div class="col-md-4">
                    <div class="card mb-4 shadow-sm">
                        <label>${item.title}</label>
                        <div class="card-body">
                            <p class="card-text">${item.description}</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a href="<c:url value="lessons?id=${item.id}"/>">
                                       <button type="button" class="btn btn-sm btn-outline-secondary">Xem thêm</button>
                                    </a>
                                </div>
                                <small class="text-muted">${item.createdAt}</small>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </body>
    <%@include file="/static/html/footer.html" %>
    </body>
</html>
