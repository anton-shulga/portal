<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 17.02.2016
  Time: 7:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Add new student</title>
</head>
<body>

<form method="POST" action='StudentsController' name="frmAddUser">
  Student ID : <input type="text" readonly="readonly" name="id"
                   value="<c:out value="${student.id}" />" /> <br />
  Login : <input
        type="text" name="login"
        value="<c:out value="${student.login}" />" /> <br />
  Name : <input
        type="text" name="name"
        value="<c:out value="${student.name}" />" /> <br />
  Surname : <input
        type="text" name="surname"
        value="<c:out value="${student.surname}" />" /> <br />
  PhoneNumber : <input
        type="text" name="phoneNumber"
        value="<c:out value="${student.phoneNumber}" />" /> <br />
  Email : <input
        type="text" name="email"
        value="<c:out value="${student.email}" />" /> <br />
  Ban status : <input
        type="text" name="banStatus"
        value="<c:out value="${student.banStatus}" />" /> <br />
        <input type="submit" value="Submit" />

</form>
</body>
</html>
