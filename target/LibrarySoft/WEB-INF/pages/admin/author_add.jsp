<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Add Author</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="admin" class="btn btn-outline-light" type="button">Books</a>
        </div>
    </div>
</nav>
<div class="container">
    <div style="display: flex; justify-content: space-between">
        <h3>New Author</h3>
        <a href="/library/admin/books/add" class="btn btn-outline-dark" type="button">Back</a>
    </div>
    <hr>
    <form:form action="addAuthor" method="post" modelAttribute="author">
        <table class="table table-borderless">
            <tr>
                <td>First Name</td>
                <td><form:input path="name" class="form-control"/></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><form:input path="surname" class="form-control"/></td>
            </tr>
        </table>
        <button type="submit" class="btn btn-outline-dark" style="width: 100%">Add Author</button>
    </form:form>
</div>
</body>
</html>