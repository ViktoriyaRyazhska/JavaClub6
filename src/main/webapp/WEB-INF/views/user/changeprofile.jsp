<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Profile</title>
</head>
<body class="w3-black">

<form action="/user/change" method="post" class="w3-container w3-black">
    <h2>Change Profile</h2>
    <p><label>Name</label><br>
        <input type="text" name="name" value=""/></p>
    <p><label>Surname</label><br>
        <input type="text" name="surname" value=""/></p>
    <p><label>Email</label><br>
        <input type="email" name="email" value=""/></p>
    <p><label>Date of birth</label><br>
        <input type="date" name="birthDate" value=""/></p>
    <p><label>Password</label><br>
        <input type="password" name="password" value=""/></p>
    <button type="submit" class="w3-button w3-hover-red">Submit</button>
</form>
</body>
</html>
