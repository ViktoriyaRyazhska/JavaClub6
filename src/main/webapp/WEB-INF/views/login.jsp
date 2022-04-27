<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Log In</title>
</head>
<body onload='document.loginForm.username.focus();'>
<c:if test="${not empty errorMessage}"><div class="w3-display-container w3-center w3-red">
          <span onclick="this.parentElement.style.display='none'" class="w3-button w3-large w3-display-topright">&times;</span>
    <h3>Error!</h3>
    <p>${errorMessage}</p>
</div></c:if>

<form name='login' action="/login" method='POST' class="w3-container w3-card-4 w3-black w3-display-middle">
    <h2>Library by team6</h2>
    <p>Please log into your account</p>
    <p><label>Email</label>
            <input type='email' name='username' value='' placeholder="example@example.com" class="w3-input w3-border"></p>
    <p><label>Password</label>
        <input type='password' name='password' class="w3-input w3-border" /></p>
        <input name="submit" type="submit" value="Log In" class="w3-button w3-hover-red"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <a href="/register" class="w3-button w3-right w3-hover-red">Register</a>
    <p></p>
</form>
</body>
</html>