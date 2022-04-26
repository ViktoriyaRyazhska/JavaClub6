<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Book</title>
</head>
<body>

<form:form action="/admin/registerBook" modelAttribute="model" method="post">
    <input type="text" name="title" th:field="${model.book.title}"><br />
    <input type="text" name="deployDate" th:field="${model.book.deployDate}"><br />
    <input type="text" name="copyNumber" th:field="${model.book.copyNumber}"><br />
    <input type="text" name="name" th:field="${model.author.name}"><br />
    <input type="text" name="surname" th:field="${model.author.surname}"><br />
    <input type="submit" th:field="Create"/>
</form:form>
</body>
</html>
