<%-- 
    Document   : home
    Created on : Aug 18, 2019, 3:48:26 PM
    Author     : Kieu Anh Tuan
--%>

<%@page import="java.util.List"%>
<%@page import="com.java.demo.dto.Book"%>
<%@page import="com.java.demo.model.BookModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="header.html"%>
    </head>
    <body>
        <%@include file="navbar.html"%>  
        
        <br/>
        <div class="container">
            <table class="table table-dark">
                <thead>
                    <th>#</th>
                    <th>Tên Sách</th>
                    <th>Tác Giả</th>
                    <th>Giá</th>
                    <th>Số Lượng</th>
                    <th>Chức Năng</th>
                </thead>
                <c:forEach var="item" items="${list}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.title}</td>
                        <td>${item.author}</td>
                        <td>${item.price}</td>
                        <td>${item.quantity}</td>
                        <td>
                            <a class="btn btn-primary" href="GetBook?id=${item.id}">Sửa</a>
                            <a class="btn btn-danger" href="DeleteBook?id=${item.id}" onclick="remove()">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a class="btn btn-success" href="addbook.jsp">Thêm mới</a>
        </div>
        
        <%@include file="footer.html"%>
        
        <script>
            function remove() {
                confirm('Are you sure?')
            }
        </script>
    </body>
</html>
