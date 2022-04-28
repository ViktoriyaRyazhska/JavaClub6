<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Rent a book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%--NEED TO FIX INCORRECT REFERENCES--%>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="/library/logout" class="btn btn-outline-light" type="button">Log Out</a>
            <a href="user/books" class="btn btn-outline-light" type="button" style="margin-left: 10px">Books</a>
        </div>
    </div>
</nav>

<div class="container">
    <h1>Rent a book</h1>
    <div class="row">
        <div class="col">
            <h3>Available books: </h3>
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
                <c:forEach items="${availableBooks}" var="avBook">
                    <c:set var="number" value="${number + 1}"></c:set>
                    <tr>
                        <td>${number}</td>
                        <td>${avBook.title}</td>
                        <td>${avBook.mainAuthor.getName()} ${avBook.mainAuthor.getSurname()}</td>
                        <c:if test="${avBook.authorSet.size() == 0}">
                            <td>-</td>
                        </c:if>
                        <c:if test="${avBook.authorSet.size() != 0}">
                            <td>
                                <c:forEach items="${avBook.authorSet}" var="author">
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
        <div class="col">
            <form:form action="createRequest" method="post" modelAttribute="request">
                <table class="table table-borderless">
                    <tr>
                        <td>Book title</td>
                        <td>
                            <form:select class="form-select" path="book">
                                <c:forEach items="${availableBooks}" var="book">
                                    <c:set var="bookTitle" value="${book.title}"/>
                                    <form:option value="${book.bookId}" label="${bookTitle}"/>
                                </c:forEach>
                            </form:select>
                        </td>
                    </tr>
                </table>

                <button type="submit" class="btn btn-outline-dark" style="width: 100%">Rent a book</button>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>
