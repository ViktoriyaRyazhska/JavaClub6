<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Books</title>
</head>
<body>
<div class="w3-bar w3-black">
    <div class="w3-bar-item">Library by team6</div>
    <a href="/logout" class="w3-bar-item w3-right w3-button w3-hover-red">Log Out</a>
    <a href="/user/" class="w3-bar-item w3-button w3-right w3-hover-red">Home</a>
</div>
<div class="w3-container">
    <h2>Your Requests</h2>
    <table class="w3-table-all">
        <tr>
            <th><strong>Title</strong></th>
            <th><strong>Status</strong></th>
        </tr>
        <c:forEach items="${userbooks}" var="book">
            <tr>
                <td>${book.fkBook.title}</td>
                <td>${book.fkStatus.name}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
