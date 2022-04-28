<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Book</title>
</head>
<body>
    <form:form action="/updateBook" method="post" modelAttribute="book">
        <table>
            <tr>
                <td>Id</td>
                <td><input type="text" name="id" value="${book.id}"/></td>
            </tr>
            <tr>
                <td>Title</td>
                <td><input type="text" name="title"/></td>
            </tr>
            <tr>
                <td>Deploy Date</td>
                <td><input type="text" name="deployDate"/></td>
            </tr>
            <tr>
                <td>Copy Number</td>
                <td><input type="text" name="copyNumber"/></td>
            </tr>
            <tr>
                <td>Author Name</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>Author Surname</td>
                <td><input type="text" name="surname"/></td>
            </tr>
            <tr>
                <td><input type="submit" th:field="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
