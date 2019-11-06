<%-- 
    Document   : login
    Created on : Sep 11, 2019, 3:56:30 PM
    Author     : Kieu Anh Tuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/static/html/headtag.html" %>
        <link href="<c:url value="/static/css/login.css" />" rel="stylesheet">
    </head>
    <body>
        <form action="authlogin" method="POST" class="form-signin" modelAttribute="login">
            <img class="mb-4" src="<c:url value="/public/images/head/actlogo.png"/>" alt="ACT Logo">
            <h1 style="color: red">${error}</h1>
            <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
            <label class="sr-only">User</label>
            <input type="text" id="username" name="user" class="form-control" placeholder="Username" required autofocus/>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Password" required/>
            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </body>
</html>
