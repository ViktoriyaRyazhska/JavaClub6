<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="/library/admin/books" class="btn btn-outline-light" type="button">Books</a>
            <a href="/library/admin" class="btn btn-outline-light" type="button" style="margin-left: 10px">Home</a>
        </div>
    </div>
</nav>
<div class="container">
    <div style="display: flex; justify-content: space-between">
        <h3>Information about user</h3>
        <a href="/library/admin/users" class="btn btn-outline-dark" type="button">Back to List</a>
    </div>
    <hr>
    <div class="info">
        <table class="table table-borderless">
            <tbody>
            <tr>
                <td style="font-weight: bold">Name</td>
                <td>${user.name} ${user.surname}</td>
            </tr>
            <tr>
                <td style="font-weight: bold">Email</td>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td style="font-weight: bold">Date of Birth</td>
                <td>${user.dateOfBirth}</td>
            </tr>
            <tr>
                <td style="font-weight: bold">Our client since</td>
                <td>${user.createTime}</td>
            </tr>
            </tbody>
        </table>
    </div>
    <h3 style="margin-top: 40px">Books</h3>
    <hr>
    <div class="is-reading-books" style="margin-top: 30px">
        <c:set var="number" value="0"/>
        <h4>Books that user is reading</h4>
        <c:if test="${isReading.size() == 0}"><p>User is not reading any book now</p></c:if>
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
        <h4>Books that user has read</h4>
        <c:if test="${hasRead.size() == 0}"><p>User has not read any books yet</p></c:if>
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
