<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <%@include file="/static/html/headtag.html" %>
    </head>
    <body>
        <%@include file="/static/html/header.html" %>
 
        <div class="container">
            <h3 class="text-center title">Các chương trình đào tạo</h3>
            <br/><br/>
            <div class="row">
                <c:forEach items="${listCourses}" var="item">
                <div class="col-md-4">
                    <div class="card mb-4 shadow-sm">
                        <label>${item.title}</label>
                        <div class="card-body">
                            <p class="card-text">${item.description}</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a href="<c:url value="courses?id=${item.id}"/>">
                                        <button type="submit" class="btn btn-sm btn-outline-secondary">Xem thêm</button>
                                    </a>
                                </div>
                                <small class="text-muted">${item.id}</small>
                                <small class="text-muted">${item.createdAt}</small>
                                <small class="text-muted">${item.updatedAt}</small>
                            </div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </body>
    <%@include file="/static/html/footer.html" %>
</html>
