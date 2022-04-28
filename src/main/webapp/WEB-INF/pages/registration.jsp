<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold" href="/library">Library</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" type="button" href="/library">Home</a>
        </div>
    </div>
</nav>
<div class="container" align="center">
    <div class="card" style="width: 50%; padding: 30px; margin: 30px">
        <h1>Registration</h1>
        <form action="registration" method="post" modelAttribute="user" style="margin: 0px">
            <div class="input-group mb-3">
                <input name="name" placeholder="First Name" class="form-control"/>
            </div>
            <div class="input-group mb-3">
                <input name="surname" placeholder="Last Name" class="form-control"/>
            </div>
            <div class="input-group mb-3">
                <input name="birth" type="date" class="form-control"/>
            </div>
            <div class="input-group mb-3">
                <input name="email" type="email" placeholder="Email" class="form-control"/>
            </div>
            <div class="input-group mb-3">
                <input name="password" type="password" placeholder="Password" class="form-control"/>
            </div>
            <div>
                <button type="submit" class="btn btn-outline-dark" style="width: 100%">Register</button>
                <a href="login">I have an account</a>
            </div>
        </form>
    </div>
</div>
</body>
</html>
