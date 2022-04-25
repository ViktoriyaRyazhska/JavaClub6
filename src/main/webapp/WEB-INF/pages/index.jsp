<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-light bg-light" style="margin-bottom: 20px">
        <div class="container-fluid">
            <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
            <div class="d-flex">
                <a class="btn btn-outline-dark" type="button" href="register" style="margin-right: 10px">Register</a>
                <a class="btn btn-outline-dark" type="button" href="login">Login</a>
            </div>
        </div>
    </nav>
    <div class="container">
<%--  HEAD START--%>
        <h1>Welcome to the Library!</h1>
        <a href="books">List of books </a><br>
        <a href="user">User </a><br>
        <a href="login">Log In</a>
<%--    HEAD END--%>
        <c:set var="number" value="0"></c:set>
        <h5>Popular books this month</h5>
        <table class="table" id="booksTableElement">
            <thead>
            <tr>
                <th>№</th>
                <th>Title</th>
                <th>Author</th>
                <th>Co-author(s)</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${books}">
                <c:set var="number" value="${number + 1}"></c:set>
                <tr>
                    <td>${number}</td>
                    <td>${book.title}</td>
                    <td>${book.mainAuthor.getName()} ${book.mainAuthor.getSurname()}</td>
                    <c:if test="${book.authorSet.size() == 0}"><td>-</td></c:if>
                    <c:if test="${book.authorSet.size() != 0}">
                        <td>
                            <c:forEach items="${book.authorSet}" var="author">
                                <c:set var="authorName" value="${author.name} ${author.surname}"/>
                                ${authorName}<br>
                            </c:forEach>
                        </td>
                    </c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </body>
</html>