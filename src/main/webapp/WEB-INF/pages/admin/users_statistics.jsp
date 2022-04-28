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
        <h3>Users Statistics</h3>
        <a href="/library/admin/users" class="btn btn-outline-dark" type="button">Back to List</a>
    </div>
    <hr>
    <div class="avg-info" style="display: flex; justify-content: space-between">
        <h5>Average users age: <span style="font-weight: bold">${averageAge} years</span></h5>
        <h5>Average time of working with library: <span style="font-weight: bold">${averageWorkingTime} days</span></h5>
    </div>
    <hr>
    <div>
        <form method="post" action="statistics">
            <div style="display: flex; justify-content: space-between">
                <div style="display: flex">
                    <h6>Average number of requests to library in period from</h6>
                    <input name="start" type="date" class="form-control" style="margin: 0 10px 0 10px; width: fit-content">
                    <h6>to</h6>
                    <input name="end" type="date" class="form-control" style="margin: 0 10px 0 10px; width: max-content">
                </div>
                <input type="submit" value="See Requests" class="btn btn-outline-dark" style="width: 40%">
            </div>
        </form>
        <table class="table">
            <thead>
                <tr>
                    <th>№</th>
                    <th>User</th>
                    <th>Book</th>
                    <th>Request Date</th>
                    <th>Return Date</th>
                </tr>
            </thead>
            <tbody>
            <c:set var="number" value="0"/>
            <c:forEach var="request" items="${requests}">
                <c:set var="number" value="${number + 1}"/>
                <c:set var="user" value="${request.getUser().getName()} ${request.getUser().getSurname()}"/>
                <c:set var="book" value="\"${request.getBook().getTitle()}\" by ${request.getBook().getMainAuthor().getName()} ${request.getBook().getMainAuthor().getSurname()}"/>
                <tr>
                    <td>${number}</td>
                    <td>${user}</td>
                    <td>${book}</td>
                    <td>${request.requestDate}</td>
                    <c:if test="${request.returnDate == null}"><td>still reading</td></c:if>
                    <c:if test="${request.returnDate != null}"><td>${request.returnDate}</td></c:if>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>