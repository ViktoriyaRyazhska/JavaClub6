<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>${book.title}</title>
</head>
<body>
<div class="w3-container">
    <h2>${book.title}</h2>
    <p>Authors:</p>
    <c:forEach items="${book.authors}" var="author">
        <c:if test="${author.status}"><p>Main: ${author.fkAuthor.name} ${author.fkAuthor.surname}</p></c:if>
    </c:forEach>
    <p>Deployed: </p>
    <p>${book.deployDate}</p>
    <p>Number of copies: </p>
    <p>${book.copyNumber}</p>
    <p>Average Time of Reading</p>
    <p>${averageTime} days</p>
</div>
</body>
</html>
