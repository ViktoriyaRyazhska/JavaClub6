<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library by team6</title>
</head>
<body>
<div class="w3-bar w3-black">
    <div class="w3-bar-item">Library by team6</div>
    <a href="/logout" class="w3-bar-item w3-right w3-button w3-hover-red">Log Out</a>
    <a href="/user/profile" class="w3-bar-item w3-button w3-right w3-hover-red">Your Profile</a>
    <a href="/user/userbookslist" class="w3-bar-item w3-button w3-right w3-hover-red">Your Books</a>
    <div class="w3-bar-item w3-right">Hello, ${nameAndSurname}!</div>
</div>
<div>
    <div class="w3-left w3-container">
        <p>Popular books in this month:</p>
        <table class="w3-table-all">
            <tr>
                <th><strong>Title</strong></th>
                <th><strong>Authors</strong></th>
            </tr>
            <c:forEach items="${popularList}" var="book">
                <tr>
                    <td>${book.title}</td>
                    <td>
                        <c:forEach items="${book.authors}" var="author">
                            ${author.fkAuthor.name} ${author.fkAuthor.surname}
                            <br>
                        </c:forEach>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href = "/user/books" class="w3-button w3-right">See All Books</a>
    </div>
    <div class="w3-bar-block w3-right" style="width:120px">
        <div class="w3-bar-item">Your upcoming deadlines: </div>
        <div class="w3-bar-item">
        <c:forEach items="${userbooks}" var="userbook">
            <p>Book ${userbook.fkBook.title}</p>
            <p>Should return ${userbook.shouldReturnDate}</p>
        </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
