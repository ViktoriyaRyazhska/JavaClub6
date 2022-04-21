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
    <h1>Authors</h1>

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
            <th>ACTION</th>
        </tr>
        <c:forEach var="author" items="${authors}" >
            <tr>
                <td>${author.getId()}</td>
                <td>${author.getFirstName()}</td>
                <td>${author.getLastName()}</td>
                <td>
                    <a href="edit?id=$(author.id)">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="delete?id$(author.id)">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
