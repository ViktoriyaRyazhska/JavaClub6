<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
    <body>
    <div class="container">
        <h1>Add New Book</h1>
        <hr>
        <form:form action="add" method="post" modelAttribute="book">
            <table class="table table-borderless">
                <tr>
                    <td>Title </td>
                    <td><form:input path="title"/></td>
                </tr>
                <tr>
                    <td>Author(s) </td>
                    <td>
                        <form:select class="form-select" path="authorSet">
                            <c:forEach items="${authors}" var="author">
                                <c:set var="authorName" value="${author.name} ${author.surname}"/>
                                <form:option value="${author.authorId}" label="${authorName}"/>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>Amount of Copies </td>
                    <td><form:input path="amountOfCopies"/></td>
                </tr>
            </table>
            <p>
                <button type="submit" class="btn btn-outline-dark">Add Book</button>
            </p>
        </form:form>
        <hr>
        <a href="/library/books">Back to List</a><br>
        <a href="/library">Home</a>
    </div>
    </body>
</html>