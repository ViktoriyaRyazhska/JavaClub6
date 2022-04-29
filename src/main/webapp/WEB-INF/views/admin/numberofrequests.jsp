<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Number of Books given</title>
</head>
<body>
<div class="w3-container">
    <h2>Number of Books given</h2>
    <div>Number: ${number}</div>
    <form action="/admin/calculate" method="post">
        <label>First Date</label>
        <input name="firstDate" type="date" value="${firstDate}">
        <label>Second Date</label>
        <input name="secondDate" type="date" value="${secondDate}">
        <button type="submit">Reload</button>
    </form>
</div>
</body>
</html>
