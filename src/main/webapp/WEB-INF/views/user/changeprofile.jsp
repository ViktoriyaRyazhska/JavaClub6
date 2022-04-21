<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Profile</title>
</head>
<body class="w3-black">

<form:form action="/user/change" method="post" modelAttribute="user" cssClass="w3-container w3-black">
    <h2>Change Profile</h2>
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
</form:form>
</body>
</html>
