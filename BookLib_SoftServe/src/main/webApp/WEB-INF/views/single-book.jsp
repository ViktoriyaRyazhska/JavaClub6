<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <!DOC TYPE html>
                        <html>

                        <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                            <title>Book Page</title>
                            <style type="text/css">
                                table {
                                    width: 50%;
                                    border-collapse: collapse;
                                    border-spacing: 0px;
                                }

                                table td {
                                    border: 1px solid #565454;
                                    padding: 20px;
                                }

                                .error {
                                    color: red;
                                }
                            </style>
                        </head>

                        <body>
                            <a href="<spring:url value='/allBooks'/>">back</a>
                            <h2>Book Page</h2>
                            <table>
                                <tr>
                                    <td><strong>Title</strong></td>
                                    <td><strong>Genre</strong></td>
                                    <td><strong>Copies</strong></td>
                                    <td><strong>Main_author</strong></td>
                                    <td><strong>Co_author</strong></td>
                                    <td><strong>Availability</strong></td>
                                </tr>

                                <tr>
                                    <td>${book.title}</td>
                                    <td>${book.genre}</td>
                                    <td>${book.copies}</td>
                                    <td>${book.main_author.name} ${book.main_author.surname}</td>
                                    <c:if test="${authors.size() eq 0}">
                                        <td>=====</td>
                                    </c:if>
                                    <c:if test="${authors.size() ne 0}">
                                        <td>
                                            <c:forEach items="${authors}" var="author">
                                                <p>${author.name} ${author.surname}</p>
                                            </c:forEach>
                                        </td>
                                    </c:if>

                                    <c:if test="${book.copies eq 0}">
                                        <td class="error">unavailable</td>
                                    </c:if>
                                    <c:if test="${book.copies ne 0}">
                                        <td>available</td>
                                    </c:if>
                                </tr>

                            </table>
                            <h1>TODO:</h1>
                            <h1>Update Form</h1>
                            <form:form action="updateBook" method="post" modelAttribute="book">
                                <table>
                                    <tr>
                                        <td>Title</td>
                                        <td>
                                            <form:input path="title" /> <br />
                                            <form:errors path="title" cssClass="error" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>genre</td>
                                        <td>
                                            <form:input path="genre" /> <br />
                                            <form:errors path="genre" cssClass="error" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2"><button type="submit">Submit</button></td>
                                    </tr>
                                </table>
                            </form:form>
                        </body>

                        </html>