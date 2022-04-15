<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/15/2022
  Time: 12:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form:form action="/addUser" method="post" modelAttribute="user">
    <table>
        <tr>
            <td>Name</td>
            <td>
                <form:input path="name"/><br/>
            </td>
        </tr>
        <tr>
            <td>Surname</td>
            <td>
                <form:input path="surname"/><br/>
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <form:input path="email"/><br/>
            </td>
        </tr>
        <tr>
            <td>Date of Birth</td>
            <td>
                <form:input path="birthDate"/><br/>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <form:input path="password"/><br/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Submit</button></td>
        </tr>
    </table>
</form:form>
</body>
</html>
