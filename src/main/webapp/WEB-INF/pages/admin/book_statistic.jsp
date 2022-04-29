<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Book Statistic</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="/library/admin/users" class="btn btn-outline-light" type="button">Users</a>
            <a href="/library/admin" class="btn btn-outline-light" type="button" style="margin-left: 10px">Home</a>
        </div>
    </div>
</nav>

<div class="container">
    <div style="display: flex; justify-content: space-between">
        <h3>Information about book</h3>
        <a href="/library/admin/books" class="btn btn-outline-dark" type="button">Back to List</a>
    </div>
    <hr>
    <div class="info">
        <table class="table table-borderless">
            <tbody>
            <tr>
                <td style="font-weight: bold">Title</td>
                <td>${book.title}</td>
            </tr>
            <tr>
                <td style="font-weight: bold">Main Author</td>
                <td>${book.mainAuthor.getName()} ${book.mainAuthor.getSurname()}</td>
            </tr>
            <tr>
                <td style="font-weight: bold">Co-Author</td>
                <c:if test="${book.authorSet.size() == 0}">
                    <td>-</td>
                </c:if>
                <c:if test="${book.authorSet.size() != 0}">
                    <td>
                        <c:forEach items="${book.authorSet}" var="author">
                            <c:set var="authorName" value="${author.name} ${author.surname}"/>
                            ${authorName}<br>
                        </c:forEach>
                    </td>
                </c:if>
            </tr>
            <tr>
                <td style="font-weight: bold">Amount of copies in library</td>
                <td>${book.amountOfCopies}</td>
            </tr>
            </tbody>
        </table>
    </div>
    <hr>
    <div class="avg-info" style="display: flex; justify-content: space-between">
        <h5>Number of requests: <span style="font-weight: bold">${numberOfRequests}</span></h5>
        <h5>Time of reading: <span style="font-weight: bold">${sumDays} days</span></h5>
    </div>
    <hr>
    <div class="users-list-who-take" style="margin-top: 30px">
        <c:set var="number" value="0"/>
        <c:if test="${requests.size()==0}"><p>No Requests</p></c:if>
        <c:if test="${requests.size()!=0}">
            <table class="table">
                <thead>
                <tr>
                    <th>№</th>
                    <th>User</th>
                    <th>Request Date</th>
                    <th>Return Date</th>
                    <th>Reading Days</th>
                </tr>
                </thead>
                <tbody>


                <c:forEach items="${requests}" var="request">
                    <c:set value="${number + 1}" var="number" />
                    <c:set var="user" value="${request.getUser().getName()} ${request.getUser().getSurname()}"/>
                    <tr>
                        <td>${number}</td>
                        <td>${user}</td>
                        <td>${request.requestDate}</td>
                        <c:if test="${request.returnDate == null}">
                            <td>Still reading</td>
                        </c:if>
                        <c:if test="${request.returnDate != null}">
                            <td>${request.returnDate}</td>
                        </c:if>
                        <td>${readingDays.get(number-1)}</td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </c:if>
    </div>
</div>

</body>
</html>