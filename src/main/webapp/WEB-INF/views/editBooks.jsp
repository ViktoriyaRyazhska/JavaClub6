<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Books</title>

</head>
<body>
<div>
    <h1>Books</h1>

    <form method="get" action="search">
        <input type="text" name="keyword"> &nbsp;
        <input type="submit" value="Search">
    </form>

    <h3><a href="/new">New Book</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>TITLE</th>
<%--            <th>REALIZE_YEAR</th>--%>
            <th>TOTAL_QUANTITY</th>
            <th>IN-READING</th>
            <th>LAST_UPDATE</th>

            <th>ACTION</th>
        </tr>
        <c:forEach var="book" items="${books}" >
            <tr>
                <td>${book.getId()}</td>
                <td>${book.getTitle()}</td>
<%--                <td>${book.getRealizeYear()}</td>--%>
                <td>${book.getTotalQuantity()}</td>
                <td>${book.getInReading()}</td>
                <td>${book.getLastUpdate()}</td>


                <td>
                    <a href="edit?id=$(book.id)">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="delete?id$(book.id)">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

