<%                        
    StudentModel model = new StudentModel();
    List<Student> list = model.getStudents();
    for (Student item : list) {
%>

<tr>
    <th scope="row"><%= item.getId() %></th>
    <td><%= item.getName() %></td>
    <td><%= item.getFaculty()%></td>
    <td><%= item.getClassroom()%></td>
    <td>
        <a class="btn btn-primary" href="">S?a</a>
        <a class="btn btn-danger" href="">Xóa</a>
    </td>
</tr>
<% } %>