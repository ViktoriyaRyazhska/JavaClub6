<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 4/15/2022
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<h1>Books</h1>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Copies</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.amountOfCopies}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
