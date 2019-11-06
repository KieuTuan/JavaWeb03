<%-- 
    Document   : index
    Created on : Aug 11, 2019, 4:16:31 PM
    Author     : Kieu Anh Tuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <title>Kaiser</title>
    </head>
    <body>
        <%@include file="header.html" %>

        <div class="container">
            <form>
                <div class="form-group">
                    <label for="txtSearch">Search</label>
                    <input type="text" class="form-control" id="txtSearch" placeholder="Search key...">
                </div>
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            <br/>

            <c:forEach var="item" items="${news}">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <p class="card-text">${item.summary}</p>
                        <p>Đăng bởi: ${item.author}</p>
                    </div>
                </div>
            </c:forEach>
            <br/>
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <c:if test="${curr == 1}">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${curr > 1}">
                        <li class="page-item">
                            <a class="page-link" href="?page=${curr-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>


                    <c:forEach var="i" begin="1" end="${total}" step="1">
                        <li class="page-item"><a class="page-link" href="?page=${i}">${i}</a></li>    
                    </c:forEach>

                    <c:if test="${curr == total}">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${curr < total}">
                        <li class="page-item">
                            <a class="page-link" href="?page=${curr+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>    

                </ul>
            </nav>
        </div>

        <%@include file="footer.html" %>
    </body>
</html>
