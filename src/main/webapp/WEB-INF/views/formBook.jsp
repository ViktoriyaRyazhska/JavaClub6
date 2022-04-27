
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <h1>Book</h1>

    <form method="POST" action="addBook">

        <label name="title">Title</label>

        <input type="text" name="title"/>
        <br>
        <label name="author">Author</label>
        <select>
            <c:forEach items="${authors}" var="author">
                <option value="author">${author.getFirstName()} ${author.getLastName()}</option>
            </c:forEach>
        </select>
        <br>
        <label name="realizeYear">Year realize</label>
        <input type="text" name="realizeYear"/>
        <br>
        <label name="totalQuantity">Total quantity</label>
        <input type="text" name="totalQuantity"/>


        <br>
        <input type="submit" value="Create">
</div>
</body>
</html>












