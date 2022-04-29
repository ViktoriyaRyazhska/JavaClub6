<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <div>
        <form action="/addUser" method="POST" class="w3-container">
            <h2>Registration</h2>
            <p>Please fill all inputs</p>
            <p>
                <label>Name</label><br>
                <input type="text" name="name" placeholder="Boris" required>
            </p>
            <p>
                <label>Surname</label><br>
                <input type="text" name="surname" placeholder="Johnsonuk" required>
            </p>
            <p>
                <label>Email</label><br>
                <input type="email" name="email" placeholder="boris.johnson.mp@parliament.uk" required>
            </p>
            <p>
                <label>Date of birth</label><br>
                <input type="date" name="birthDate" placeholder="1964-06-19" required>
            </p>
            <p>
                <label>Password</label><br>
                <input type="password" name="password" required>
            </p>
            <button type="submit" class="w3-button">Create</button>
            <p>Have an account? <a href="/login" class="w3-button">Log In</a></p>
        </form>
    </div>
</body>
</html>
