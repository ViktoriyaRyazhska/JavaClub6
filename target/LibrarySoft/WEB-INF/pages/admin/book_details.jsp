<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Book</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
    <div class="container">
        <h1>Book</h1>
        <table class="table table-borderless">
            <tr>
                <td>Title </td>
                <td>${book.title}</td>
            </tr>
            <tr>
                <td>Main Author </td>
                <td>${book.mainAuthor.getName()} ${book.mainAuthor.getSurname()}</td>
            </tr>
            <tr>
                <td>Co Author(s) </td>
                <c:if test="${authors.size() == 0}"><td>none</td></c:if>
                <c:if test="${authors.size() != 0}">
                    <td>
                        <c:forEach items="${authors}" var="author">
                            <c:set var="authorName" value="${author.name} ${author.surname}"/>
                            ${authorName}<br>
                        </c:forEach>
                    </td>
                </c:if>
            </tr>
            <tr>
                <td>Amount of copies </td>
                <td>${book.amountOfCopies}</td>
            </tr>
        </table>
        <a href="/library/books">Back to List</a><br>
        <a href="/library">Home</a>
    </div>
    </body>
</html>
