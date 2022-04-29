<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Send Email</title>
</head>
<body>
<div class="w3-container">
    <h2>Send Email</h2>
    <form action="/admin/send" method="post">
        <label>Subject</label><br>
        <input type="text" name="subject" placeholder="Subject"><br>
        <label>To User</label><br>
        <select name="to">
            <option value="" disabled selected>Choose user</option>
            <c:forEach items="${users}" var="user">
                <option value="${user.email}">${user.name} ${user.surname}</option>
            </c:forEach>
            <option value="all">To All Users</option>
        </select><br>
        <label>Message</label><br>
        <input type="text" name="text" placeholder="Type here" required><br>
        <button class="w3-button" type="submit">Send</button>
    </form>
</div>
</body>
</html>
