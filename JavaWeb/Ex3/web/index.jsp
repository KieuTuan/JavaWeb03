<%-- 
    Document   : index.jsp
    Created on : Aug 10, 2019, 3:29:27 PM
    Author     : Kieu Anh Tuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <title>JSTL Test</title>
    </head>
    <body>
        <c:set var="name" value="Kaiser" scope="page"/>
        <c:out value="${name}"/>
        
        <hr/>
        <c:set var="age" value="${20}" scope="page"/>
        <c:if test="${age>18}">
            <c:out value="${age}"/>
        </c:if>
        
        <hr/>
        <c:choose>
            <c:when test="${age<20}">
                <c:out value="0"/>
            </c:when>
            <c:when test="${age==20}">
                <c:out value="1"/>
            </c:when>
            <c:otherwise>
                <c:out value="2"/>
            </c:otherwise>
        </c:choose>
        
        <hr/>
        <c:forEach var="i" begin="0" end="5">
        <li>Item ${i}</li>
        </c:forEach>
        
        <hr/>
        <sql:setDataSource
            var="conn"
            driver="com.mysql.cj.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/sinhvien?autoReconnect=true&useSSL=false"
            user="root" password="root"/>
        <sql:query
            var="rs" dataSource="${conn}"
            sql="SELECT * FROM INFO"/>
        
        <table class="table table-dark">
            <thead>
                <th>Stt</th>
                <th>Họ Tên</th>
                <th>Khoa</th>
                <th>Lớp</th>
                <th>Chức Năng</th>
            </thead>
            <tbody>
                <c:forEach var="item" items="${rs.rows}">
                <tr>
                    <th scope="row">${item.id}</th>
                    <td>${item.name}</td>
                    <td>${item.faculty}</td>
                    <td>${item.classroom}</td>
                    <td>
                        <a class="btn btn-primary" href="">Sửa</a>
                        <a class="btn btn-danger" href="">Xóa</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
            
        <footer>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        </footer>
    </body>
</html>
