<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" type="button" href="registration" style="margin-right: 10px">Signup</a>
            <a class="btn btn-outline-light" type="button" href="login">Login</a>

        </div>
    </div>
</nav>
<div class="container">
        <c:set var="number" value="0"/>
        <h3>Welcome to the Library!</h3>
        <hr>
        <div style="display: flex; justify-content: space-between">
            <h4>Popular books this month</h4>
            <a href="books" style="margin-left: 10px; width: 15%" class="btn btn-outline-dark" type="button">See All Books</a>
        </div>
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
                <c:set var="number" value="${number + 1}"/>
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
</div>
    </body>
</html>