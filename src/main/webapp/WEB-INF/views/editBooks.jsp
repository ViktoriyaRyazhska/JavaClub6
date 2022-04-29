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
    <h1>Books search</h1>

    <form method="POST" action="searchBookByTitle"  >
        <input type="text" name="title" />
        <input type="submit" value="Search by title">
    </form>
    <br />
    <form method="POST" action="searchBookByAuthor"  >
        <input type="text" name="name" />
        <input type="submit" value="Search by author">
    </form>

    <br><br>

    <form method="POST" action="sortPopular">

    <label for="start">Start date:</label>

    <input type="date" id="start" name="tripStart"
<%--           value="2022-01-01"--%>
           min="2020-01-01" max="2022-04-29">

    <label for="finish">Finish date:</label>

    <input type="date" id="finish" name="tripFinish"
<%--           value="2022-04-28"--%>
           min="2020-01-01" max="2022-04-29">

    <input type="submit" value="Sort by popularity ">
    </form>

    <h1>Create Book</h1>

<%--    <form:form action="addBook" method="post" modelAttribute="book">--%>
<%--        <table>--%>
<%--            <tr>--%>
<%--                <td>Title</td>--%>
<%--                <td>--%>
<%--                    <form:input path="title"></form:input> <br />--%>
<%--                    <form:errors path="title" cssClass="error" />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Authors</td>--%>
<%--                <td>--%>
<%--                    <select id="author">--%>
<%--                        <c:forEach items="${authors}" var="author">--%>
<%--                            <option value="author">${author.getFirstName()} ${author.getLastName()}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Year realize</td>--%>
<%--                <td>--%>
<%--                    <form:input path="realizeYear" /> <br />--%>
<%--                    <form:errors path="realizeYear" cssClass="error" />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td>Total quantity</td>--%>
<%--                <td>--%>
<%--                    <form:input path="totalQuantity" /> <br />--%>
<%--                    <form:errors path="totalQuantity" cssClass="error" />--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--            <tr>--%>
<%--                <td colspan="4"><button type="submit">Submit</button></td>--%>
<%--            </tr>--%>
<%--        </table>--%>
<%--    </form:form>--%>

        <form method="POST" action="addBook">

            <label for="title">Title_________</label>

            <input type="text" name="title" id="title"/>

            <br> <br>
            <label for="authorName">Author_______</label>
            <select  id="authorName" name="author">
                <c:forEach items="${authors}" var="author">
                    <option  name="author" value="author">${author.getFirstName()} ${author.getLastName()}</option>
                </c:forEach>
            </select>
            <br><br>
            <label for="realizeYear">Year realize___</label>
            <input type="text" id="realizeYear" name="realizeYear"/>
            <br><br>
            <label for="totalQuantity">Total quantity_</label>
            <input type="text" id="totalQuantity" name="totalQuantity"/>
            <br><br>
            <input type="submit" value="Create">
            <br><br>
        </form>

    <h1>Books list</h1>

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
                    <a href="/deleteBook/${book.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>

