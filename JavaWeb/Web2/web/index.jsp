<%--
    Document   : home
    Created on : Jul 28, 2019, 4:16:36 PM
    Author     : Kieu Anh Tuan
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.db.Student"%>
<%@page import="com.demo.db.StudentModel"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Kaiser</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        
        <%@include file = "header.html" %>

        <br/>
        <table class="table table-dark">
            <thead>
                <th>Stt</th>
                <th>Họ Tên</th>
                <th>Khoa</th>
                <th>Lớp</th>
                <th>Chức Năng</th>
            </thead>
            <tbody>
                <%                        
                    //StudentModel model = new StudentModel();
                    //ArrayList<Student> list = model.getStudents();
                    //String list = model.getStudents();
                    //out.println(list);
                    //for (Student item : list) {
                    
                    
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    out.println("1");
                    String conStr = "jdbc:mysql://localhost:3306/sinhvien";
                    out.println("2");
                    String user = "root";
                    out.println("3");
                    String pass = "root";
                    out.println("4");
                    Connection conn  = DriverManager.getConnection(conStr, user, pass);
                    out.println("5");
                        //conn = db.getConnect();
            //            String sql = "SELECT * FROM INFO";
            //            PreparedStatement pstmt = conn.prepareStatement(sql);
            //            ResultSet rs = pstmt.executeQuery();
            //            ArrayList<Student> list = new ArrayList<>();
            //            while (rs.next()) {
            //                Student s = new Student();
            //                s.setId(rs.getInt("id"));
            //                s.setName(rs.getString("name"));
            //                s.setFaculty(rs.getString("faculty"));
            //                s.setClassroom(rs.getString("classroom"));
            //                list.add(s);
            //            }
            //            return list;
                %>
                <%--
                <tr>
                    <th scope="row"><%= item.getId() %></th>
                    <td><%= item.getName() %></td>
                    <td><%= item.getFaculty()%></td>
                    <td><%= item.getClassroom()%></td>
                    <td>
                        <a class="btn btn-primary" href="">Sửa</a>
                        <a class="btn btn-danger" href="">Xóa</a>
                    </td>
                </tr>
                <% } %>
                --%>
            </tbody>
        </table>
        
        <a href="">Thêm mới</a>
        <%@include file = "footer.html" %>
    </body>
</html>
