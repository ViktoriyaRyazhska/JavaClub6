<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Books</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Title</th>
            <th>Copies</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <tr>
                <td>${book.title}</td>
                <td>${book.amountOfCopies}</td>
                <td><a href="/library/books/${book.bookId}">Details</a></td>
                <td>Edit</td>
                <td><a href="/library/books/delete/${book.bookId}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/library/books/add">Add new book</a><br>
    <a href="/library">Home</a>
</div>

</body>
</html>