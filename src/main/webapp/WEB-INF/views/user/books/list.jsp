<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/13/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
        <td><strong>Available</strong></td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.deployDate.toString()}</td>
            <c:if test="${book.copyNumber == 0}"><td style="color:red">unavailable</td></c:if>
            <c:if test="${book.copyNumber != 0}">
                <td style="color:lawngreen">available</td>
                <td></td>
                <td><form:form action="/user/rentBook" method="post" modelAttribute="book">
                    <form:hidden path="id" value = "${book.id}"/>
                    <button type="submit">Rent</button>
                </form:form></td>
            </c:if>
        </tr>
    </c:forEach>
</table>
</body>
</html>
