<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log in</title>
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
        <h1>Log in</h1>
        <form name='login' action="login" method='POST' style="margin-bottom: 0px">

            <div class="input-group mb-3">
                <input type="email" name="username" value="" placeholder="Email" class="form-control"/>
            </div>
            <div class="input-group mb-3">
                <input type="password" name="password" placeholder="Password" class="form-control"/>
            </div>
            <div>
                <button type="submit" class="btn btn-outline-dark" style="width: 100%; margin-bottom: 10px">Login</button>
                <a href="registration">I'm new here</a>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
</div>
</body>
</html>