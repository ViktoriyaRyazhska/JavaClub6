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
<div class="container">
    <h1>Edit book information</h1>
    <table class="table table-borderless">
        <form:form method="post" modelAttribute="book">
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
                        <%--TODO selected authors is necessary--%>
                    <form:select class="form-select" path="authorsSet" multiple="true">
                        <c:forEach items="${authors}" var="author">
                            <c:set var="authorName" value="${author.name} ${author.surname}"/>
                            <form:option value="${author.authorId}" label="${authorName}"/>
                        </c:forEach>
                    </form:select></td>
            </tr>
            <tr>
                <td>Amount of copies</td>
                <td><form:input path="amountOfCopies" class="form-control" value="${book.amountOfCopies}"/>
                </td>
            </tr>
            <tr>
                <td>
                    <button class="btn btn-outline-dark" type="submit">Update</button>
                </td>
            </tr>

        </form:form>
    </table>

    <a href="/library/books">Back to List</a><br>
    <a href="/library">Home</a>
</div>
</body>
</html>