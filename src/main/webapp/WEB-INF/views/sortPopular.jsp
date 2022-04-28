<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books</title>

</head>
<body>


<div>
    <h1>Popular books</h1>

    <form method="POST" action="sortPopular">

        <label for="start">Start date:</label>

        <input type="date" id="start" name="tripStart"
           min="2020-01-01" max="2022-04-29">

        <label for="finish">Finish date:</label>

        <input type="date" id="finish" name="tripFinish"
           min="2020-01-01" max="2022-04-29">

    <input type="submit" value="Sort by popularity ">
    </form>

    <h1>Books list</h1>

    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>TITLE</th>
            <th>REALIZE YEAR</th>
            <th>BOOKS TAKEN</th>
            <th>TOTAL QUANTITY</th>

        </tr>
        <c:forEach var="book" items="${books}" >
<%--            <c:forEach var="bookUser" items="${booksUsers}" >--%>
<%--                <c:if test="${book.id == booksUsers.book_id}">--%>
            <tr>
                <td>${book.getId()}</td>
                <td>${book.getTitle()}</td>
                <td>${book.getRealizeYear()}</td>
                <td>${book.getInReading()}</td>
                <td>${book.getTotalQuantity()}</td>
            </tr>
<%--                </c:if>--%>
<%--            </c:forEach>--%>
        </c:forEach>
    </table>
    <a href="/editBooks">return to all books</a>
</div>
</body>
</html>

