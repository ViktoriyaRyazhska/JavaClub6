<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
    <form:form action="/admin/updateBook" method="post">
        <table>
            <tr>
                <td>Id</td>
                <td><input type="text" name="id" value="${book.id}"/></td>
            </tr>
            <tr>
                <td>Title</td>
                <td><input type="text" name="title" value="${book.title}"/></td>
            </tr>
            <tr>
                <td>Deploy Date</td>
                <td><input type="text" name="deployDate" value="${book.deployDate}"/></td>
            </tr>
            <tr>
                <td>Copy Number</td>
                <td><input type="text" name="copyNumber" value="${book.copyNumber}"/></td>
            </tr>
            <tr>
                <td>Author Name</td>
                <td><input type="text" name="name" value="${author.name}"/></td>
            </tr>
            <tr>
                <td>Author Surname</td>
                <td><input type="text" name="surname" value="${author.surname}"/></td>
            </tr>
            <tr>
                <td><input type="submit" th:field="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
