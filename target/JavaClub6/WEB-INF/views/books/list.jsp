<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/13/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Book List</title>
</head>
<body>
<h2>Books List</h2>
<table>
    <tr>
        <td><strong>Id</strong></td>
        <td><strong>Title</strong></td>
        <td><strong>Deploy date</strong></td>
        <td><strong>Copy number</strong></td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.deployDate.toString()}</td>
            <td>${book.copyNumber}</td>
        </tr>
    </c:forEach>
</table>
<a href = "/books/">Return</a>
<a href = ""></a>
</body>
</html>
