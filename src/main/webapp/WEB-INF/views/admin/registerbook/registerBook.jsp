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

<form:form action="/admin/registerBook"  method="post">
    <table>
        <tr>
            <td>Book Title:</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td>Deploy Date</td>
            <td><input type="text" name="deployDate"/></td>
        </tr>
        <tr>
            <td>Number of copies</td>
            <td><input type="text" name="copyNumber"/></td>
        </tr>
        <tr>
            <td>Author Name</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>Author Surname</td>
            <td><input type="text" name="surname"/></td>
        </tr>
        <tr>
            <td><input type="submit" th:field="Create"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
