<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book</title>
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
            <h3>Edit Book Information</h3>
            <a href="/library/admin/books" class="btn btn-outline-dark" type="button">Back to List</a>
        </div>
        <hr>
        <form:form method="post" modelAttribute="book">
            <table class="table table-borderless">
                <tr>
                    <td>Title</td>
                    <td><form:input path="title" value="${book.title}" class="form-control"/></td>
                </tr>

                <tr>
                    <td>Main author</td>
                    <td>
                        <form:select class="form-select" path="mainAuthor">
                            <c:forEach items="${authors}" var="author">
                                <c:set var="authorName" value="${author.name} ${author.surname}"/>
                                <form:option value="${author.authorId}" label="${authorName}" selected="${author.authorId == book.mainAuthor.authorId? 'selected' : '' }"/>
                            </c:forEach>
                        </form:select></td>

                </tr>
                <tr>
                    <td>Co-authors</td>
                    <td>
                        <form:select class="form-select" path="authorsSet" multiple="true">
                            <c:forEach items="${authors}" var="author">
                                <c:set var="authorName" value="${author.name} ${author.surname}"/>
                                <form:option value="${author.authorId}" label="${authorName}" selected="${book.authorSet.contains(author)? 'selected' : '' }"/>
                            </c:forEach>
                        </form:select></td>
                </tr>
                <tr>
                    <td>Amount of copies</td>
                    <td><form:input path="amountOfCopies" class="form-control" value="${book.amountOfCopies}"/>
                    </td>
                </tr>
<%--                <tr>--%>
<%--                    <td>--%>
<%--                        <button class="btn btn-outline-dark" type="submit">Update</button>--%>
<%--                    </td>--%>
<%--                </tr>--%>
            </table>
            <button type="submit" class="btn btn-outline-dark" style="width: 100%">Update</button>
        </form:form>
    </div>
</body>
</html>