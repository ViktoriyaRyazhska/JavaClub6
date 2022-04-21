<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/19/2022
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Your Profile</title>
</head>
<body>
<div class="w3-bar w3-black">
    <div class="w3-bar-item">Library by team6</div>
    <a href="#" class="w3-bar-item w3-button w3-right w3-hover-red">Your Books</a>
    <a href="/user/" class="w3-bar-item w3-button w3-right w3-hover-red">Home</a>
</div>
<div class="w3-container">
    <p><strong>Name</strong></p>
    <p>${currentUser.name}</p>
    <p><strong>Surname</strong></p>
    <p>${currentUser.surname}</p>
    <p><strong>Email</strong></p>
    <p>${currentUser.email}</p>
    <p><strong>Date of birth</strong></p>
    <p>${currentUser.birthDate}</p>
    <a class="w3-button" href="/user/changeprofile">Change profile</a>
</div>
</body>
</html>
