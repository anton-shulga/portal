<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Антон
  Date: 12.02.2016
  Time: 4:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<table border="1">
  <c:forEach items="${students}" var="student">
  <tr>
    <td>
      ${student.id}
    </td>
    <td>
      ${student.login}
    </td>
    <td>
        ${student.name}
    </td>
    <td>
        ${student.surname}
    </td>
    <td>
      ${student.phoneNumber}
    </td>
    <td>
      ${student.email}
    </td>
    <td>
      ${student.banStatus}
    </td>
  </tr>
    </c:forEach>
</table>
</body>
</html>
