<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Maryan
  Date: 20.04.2022
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="/library/logout" class="btn btn-outline-light" type="button">Log Out</a>
            <a href="user/books" class="btn btn-outline-light" type="button" style="margin-left: 10px">Books</a>
            <a class="btn btn-outline-light" type="button" style="margin-left: 10px">Account</a>
        </div>
    </div>
</nav>
<div class="container">
    <h1>Welcome to the Library!</h1>
    <h3>${user.name} ${user.surname}</h3>
    <%--    <a href="user/create_book_request">Rent a book</a>--%>
    <br>
    <br>
    <a href="user/create_book_request">
        <button class="btn btn-dark">Rent a book</button>
    </a>

    <div class="is-reading-books" style="margin-top: 30px">
        <c:set var="number" value="0"/>
        <h4>Books that you are reading</h4>
        <c:if test="${isReading.size() == 0}"><p>You aren't reading any book now</p></c:if>
        <c:if test="${isReading.size() != 0}">
            <table class="table">
                <thead>
                <tr>
                    <th>№</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Request Date</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="request" items="${isReading}">
                    <c:set var="number" value="${number + 1}"/>
                    <c:set var="author" value="${request.getBook().getMainAuthor().getName()} ${request.getBook().getMainAuthor().getSurname()}"/>
                    <tr>
                        <td>${number}</td>
                        <td>${request.getBook().getTitle()}</td>
                        <td>${author}</td>
                        <td>${request.getRequestDate()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>


    <div class="read-books" style="margin-top: 30px">
        <c:set var="number" value="0"/>
        <h4>Books that you have read</h4>
        <c:if test="${hasRead.size() == 0}"><p>You have not read any book yet</p></c:if>
        <c:if test="${hasRead.size() != 0}">
            <table class="table">
                <thead>
                <tr>
                    <th>№</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Request Date</th>
                    <th>Return Date</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="request" items="${hasRead}">
                    <c:set var="number" value="${number + 1}"/>
                    <c:set var="author" value="${request.getBook().getMainAuthor().getName()} ${request.getBook().getMainAuthor().getSurname()}"/>
                    <tr>
                        <td>${number}</td>
                        <td>${request.getBook().getTitle()}</td>
                        <td>${author}</td>
                        <td>${request.getRequestDate()}</td>
                        <td>${request.getReturnDate()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>

</div>
</body>
</html>
