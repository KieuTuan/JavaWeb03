<%-- 
    Document   : signup
    Created on : Sep 30, 2019, 3:30:13 PM
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
        <form action="authsignup" method="POST" class="form-signin" modelAttribute="signup">
            <img class="mb-4" src="<c:url value="/public/images/head/actlogo.png"/>" alt="ACT Logo">
            <h3 style="color: red">${error}</h1>
            <h1 class="h3 mb-3 font-weight-normal">Sign up form</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="email" name="email" class="form-control" placeholder="Email address" required autofocus/>
            <label class="sr-only">User</label>
            <input type="text" id="username" name="user" class="form-control" placeholder="Username" required autofocus/>
            <label class="sr-only">Name</label>
            <input type="text" id="name" name="name" class="form-control" placeholder="Your name" required autofocus/>
            <label class="sr-only">Phone</label>
            <input type="text" id="phone" name="phone" class="form-control" placeholder="Your phone" required autofocus/>
            <label class="sr-only">Address</label>
            <input type="text" id="address" name="address" class="form-control" placeholder="Address" required autofocus/>
            <label for="inputPassword" class="sr-only">Password</label>
            <input style="margin-bottom: 0;" type="password" id="password" name="password" class="form-control" placeholder="Password" required/>
            <label for="inputPassword" class="sr-only">Confirm Password</label>
            <input type="password" id="password" name="confirm" class="form-control" placeholder="Confirm" required/>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
        </form>
    </body>
</html>