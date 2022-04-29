<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Book</title>
</head>
<body>
    <form:form action="/admin/searchBook" method="post">
        <table>
            <tr>
                <td>Search</td>
                <td><input type="text" name="title"/></td>
            </tr>
            <tr>
                <td><input type="submit" th:field="Search"/></td>
            </tr>
            </form:form>
            <c:forEach items="${book}" var="book">
                <th><strong>ID</strong></th>
                <th><strong>Copy Number</strong></th>
                <th><strong>Deploy Date</strong></th>
                <th><strong>Title</strong></th>
                <tr>
                    <td>${book.id}</td>
                    <td>${book.copyNumber}</td>
                    <td>${book.deployDate}</td>
                    <td>${book.title}</td>
                    <td></td>
                    <td>
                        <form:form action="/admin/updateBook" method="get" modelAttribute="book">
                            <input type="hidden" value="${book.id}" name="id"/>
                            <input type="hidden" value="${book.copyNumber}" name="copyNumber"/>
                            <input type="hidden" value="${book.deployDate}" name="deployDate"/>
                            <input type="hidden" value="${book.title}" name="title"/>
                            <button type="submit">Update</button>
                        </form:form>
                    </td>
                </tr>
            </c:forEach>
        </table>


</body>
</html>
