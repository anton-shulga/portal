<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 12.02.2016
  Time: 4:35
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Students</title>
</head>
<body>
<table border="1">

  <thead>
  <tr>
    <th>Student id</th>
    <th>Login</th>
    <th>Name</th>
    <th>Surname</th>
    <th>PhoneNumber</th>
    <th>Email</th>
    <th>Ban status</th>
    <th colspan=2>Action</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${students}" var="student">
    <tr>
      <td><c:out value="${student.id}" /></td>
      <td><c:out value="${student.login}" /></td>
      <td><c:out value="${student.name}" /></td>
      <td><c:out value="${student.surname}" /></td>
      <td><c:out value="${student.phoneNumber}" /></td>
      <td><c:out value="${student.email}" /></td>
      <td><c:out value="${student.banStatus}" /></td>
      <td><a href="StudentsController?action=edit&id=<c:out value="${student.id}"/>">Update</a></td>
      <td><a href="StudentsController?action=delete&id=<c:out value="${student.id}"/>">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<p><a href="StudentsController?action=insert">Add new student</a></p>
</body>
</html>