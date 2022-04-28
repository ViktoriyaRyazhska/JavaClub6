
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
    <h1>Books</h1>

    <form method="POST" action="searchBookByTitle"  >
        <input type="text" name="title" />
        <input type="submit" value="Search by title">
    </form>
    <br />
    <form method="POST" action="searchBookByAuthor"  >
        <input type="text" name="name" />
        <input type="submit" value="Search by author">
    </form>

    <h3><a href="formBook">New Book</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>TITLE</th>
            <th>REALIZE YEAR</th>
            <th>AUTHOR</th>
            <th>BOOK AVAILABILITY</th>
            <th>ACTION</th>
        </tr>
        <c:forEach var="book" items="${books}" >
            <tr>
                <td>${book.getId()}</td>
                <td>${book.getTitle()}</td>
                <td>${book.getRealizeYear()}</td>
                <c:forEach items="${authors}" var="author">

                    <c:if test="${book.getRoleId() == author.getId()}"><td>${author.getFirstName()} ${author.getLastName()}</td>
                    </c:if>

                </c:forEach>
                <c:if test="${book.totalQuantity-book.inReading == 0}"><td style="color:red">unavailable</td></c:if>
                <c:if test="${book.totalQuantity-book.inReading != 0}"> <td style="color:blue">available</td></c:if>


                <td>
                    <a href="edit?id=$(book.getId())">Edit</a>
                    <a href="delete?id=$(book.getId())">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

