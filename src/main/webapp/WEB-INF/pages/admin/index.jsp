<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <a href="/library/logout" class="btn btn-outline-light" type="button" >Log Out</a>
            <a href="/library/admin/users" class="btn btn-outline-light" type="button" style="margin-left: 10px">Users</a>
            <a href="/library/admin/books" class="btn btn-outline-light" type="button" style="margin-left: 10px">Books</a>
        </div>
    </div>
</nav>
<div class="container">
    <h1>Welcome to the Library!</h1>
    <h2>${user.name} ${user.surname}</h2>
    <h3>Admin panel</h3>

    <a href="/library/admin/books"> <button class="btn btn-outline-dark">See all books </button></a>
    <a href="/library/admin/give_book"> <button class="btn btn-outline-dark">Give book to reader</button></a>

</div>
</body>
</html>