<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Idel Gaming
  Date: 4/21/2022
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserHasReadBooks</title>
</head>
<body>
    <table>
        <th><strong>Name</strong></th>
        <th><strong>Surname</strong></th>
        <th><strong>Title</strong></th>
        <c:forEach items="${userReadBook}" var="book">
            <tr>
                <td>${book.fkUser.name}</td>
                <td>${book.fkUser.surname}</td>
                <td>${book.fkBook.title}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
