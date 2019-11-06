<%-- 
    Document   : insert
    Created on : Aug 18, 2019, 4:41:58 PM
    Author     : Kieu Anh Tuan
--%>

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
        <div class="container" id="main">
            <form action="Add" method="POST">
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Tên sách</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="title" name="title">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="author" class="col-sm-2 col-form-label">Tác giả</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="author" name="author">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="price" class="col-sm-2 col-form-label">Giá</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="price" name="price">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="quantity" class="col-sm-2 col-form-label">Số lượng</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="quantity" name="quantity">
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary">GỬI</button>
                    </div>
                </div>
            </form>
        </div>

        <%@include file="footer.html"%>
    </body>
</html>