<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Authors</title>

</head>
<body>
<div>
    <h1>Users</h1>

    <form method="get" action="search">
        <input type="text" name="keyword"> &nbsp;
        <input type="submit" value="Search">
    </form>

    <h3><a href="/new">New Author</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>FIRST_NAME</th>
            <th>LAST_NAME</th>
            <th>EMAIL</th>
            <th>PASSWORD</th>
            <th>BIRTHDAY</th>
            <th>DATE_REGISTRATION</th>
            <th>ACTION</th>
        </tr>
        <c:forEach var="user" items="${users}" >
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getPassword()}</td>
                <td>${user.getBirthday()}</td>
                <td>${user.getDateRegistration()}</td>
                <td>
                    <a href="edit?id=$(user.id)">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="delete?id$(user.id)">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
