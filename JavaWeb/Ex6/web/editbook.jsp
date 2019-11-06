<%-- 
    Document   : editbook
    Created on : Aug 22, 2019, 9:21:04 AM
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
        <div class="container" id="main" style="margin-top: 50px;">
            <form action="EditBook" method="POST">
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Id</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="id" name="id" readonly="true" value="${book.id}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="title" class="col-sm-2 col-form-label">Tên sách</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="title" name="title" value="${book.title}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="author" class="col-sm-2 col-form-label">Tác giả</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="author" name="author" value="${book.author}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="price" class="col-sm-2 col-form-label">Giá</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="price" name="price" value="${book.price}">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="quantity" class="col-sm-2 col-form-label">Số lượng</label>
                    <div class="col-sm-10">
                        <input type="number" class="form-control" id="quantity" name="quantity" value="${book.quantity}">
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
