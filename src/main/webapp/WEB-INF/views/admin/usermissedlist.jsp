<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Users Missed Return Date</title>
</head>
<body>
<div class="w3-container">
    <h2>Users who not returned book at time</h2>
    <table class="w3-table-all">
        <tr>
            <th><strong>Id</strong></th>
            <th><strong>Email</strong></th>
            <th><strong>Name</strong></th>
            <th><strong>Surname</strong></th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.email}</td>
                <td>${user.name}</td>
                <td>${user.surname}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
