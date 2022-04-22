<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring5 MVC Hibernate Demo</title>
    <style type="text/css">
        .error {
            color: red;
        }
        table {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }
        table td {
            border: 1px solid #565454;
            padding: 10px;
        }
    </style>
</head>
<body>
<h1>Input Form</h1>
<form:form action="addAuthor" method="post" modelAttribute="author">
    <table>
        <tr>
            <td>First name</td>
            <td>
                <form:input path="firstName" /> <br />
                <form:errors path="firstName" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>Surname</td>
            <td>
                <form:input path="lastName" /> <br />
                <form:errors path="lastName" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Submit</button></td>
        </tr>
    </table>
</form:form>

<h2>Author List</h2>
<table>
    <tr>
        <th>ID</th>
        <th>FIRST_NAME</th>
        <th>LAST_NAME</th>
        <th>ACTION</th>
    </tr>
    <c:forEach items="${authors}" var="author">
        <tr>
            <td>${author.id}</td>
            <td>${author.firstName}</td>
            <td>${author.lastName}</td>
            <td>
                <a href="edit?id=$(author.id)">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/delete/${author.id}">Delete</a>

            </td>
        </tr>
    </c:forEach>
</table>



<%--<form method="get" action="search">--%>
<%--    <input type="text" name="keyword"> &nbsp;--%>
<%--    <input type="submit" value="Search">--%>
<%--</form>--%>

</body>
</html>



