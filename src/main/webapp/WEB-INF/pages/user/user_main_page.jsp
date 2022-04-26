<%--
  Created by IntelliJ IDEA.
  User: Maryan
  Date: 20.04.2022
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="user/books" class="btn btn-outline-light" type="button">Books</a>
            <a class="btn btn-outline-light" type="button" style="margin-left: 10px">Account</a>
        </div>
    </div>
</nav>
<div class="container">
    <h1>Welcome to the Library!</h1>
    <h1>User</h1>
    <a href="user/books">Rent a book</a>
</div>
</body>
</html>
