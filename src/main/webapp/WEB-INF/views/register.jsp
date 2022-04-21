<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/15/2022
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Registration</title>
</head>
<body class="w3-black">

<form:form action="/addUser" method="post" modelAttribute="user" cssClass="w3-container w3-black">
    <h2>Registration</h2>
    <p>Please fill all inputs</p>
        <p><label>Name</label><br>
            <form:input path="name"/></p>
    <p><label>Surname</label><br>
        <form:input path="surname"/></p>
    <p><label>Email</label><br>
        <form:input path="email"/></p>
    <p><label>Date of birth</label><br>
        <form:input path="birthDate"/></p>
    <p><label>Password</label><br>
        <form:input path="password"/></p>
    <button type="submit" class="w3-button w3-hover-red">Submit</button>
    <p>Have an account? <a href="/login" class="w3-button w3-hover-red">Log In</a></p>
</form:form>
</body>
</html>
