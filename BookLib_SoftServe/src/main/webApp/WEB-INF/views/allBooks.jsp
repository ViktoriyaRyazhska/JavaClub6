<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <!DOC TYPE html>
                        <html>

                        <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                            <title>All Books</title>
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
                            <a href="<spring:url value='/'/>">back</a>
                            <h2>Books List</h2>
                            <c:if test="${empty books}">
                                <div>Not found</div>
                            </c:if>

                            <c:if test="${not empty books}">
                                <table>
                                    <tr>
                                        <td><strong>Title</strong></td>
                                        <td><strong>Genre</strong></td>
                                        <td><strong>Copies</strong></td>
                                        <td><strong>Main_author</strong></td>
                                        <td><strong>Availability</strong></td>
                                        <td><strong>Buttons</strong></td>
                                    </tr>
                                    <c:forEach items="${books}" var="book">
                                        <tr>
                                            <td>${book.title}</td>
                                            <td>${book.genre}</td>
                                            <td>${book.copies}
                                                <c:if test="${book.copies ne 0}">
                                                    <form:form action="${contextPath}/BookLib_SoftServe/updateCopies" method="GET"
                                                        enctype="multipart/form-data">
                                                        <input type="hidden" value="${book.id}" name="id">
                                                        <button type="submit">&#8595;</button>
                                                    </form:form>
                                                </c:if>
                                            </td>
                                            <td>${book.main_author.name} ${book.main_author.surname}</td>
                                            <c:if test="${book.copies eq 0}">
                                                <td class="error">unavailable</td>
                                            </c:if>
                                            <c:if test="${book.copies ne 0}">
                                                <td>available</td>
                                            </c:if>
                                            <td>
                                                <form:form action="${contextPath}/BookLib_SoftServe/single-book" method="GET"
                                                    enctype="multipart/form-data">
                                                    <input type="hidden" value="${book.id}" name="id">
                                                    <button type="submit">Open</button>
                                                </form:form>
                                                <form:form action="${contextPath}/BookLib_SoftServe/deleteBook" method="GET"
                                                    enctype="multipart/form-data">
                                                    <input type="hidden" value="${book.id}" name="id">
                                                    <button type="submit">Delete</button>
                                                </form:form>
                                                <form:form action="${contextPath}/BookLib_SoftServe/addRequest" method="POST"
                                                    enctype="multipart/form-data">
                                                    <input type="hidden" value="${book.id}" name="id">
                                                    <button type="submit">Take TODO:</button>
                                                </form:form>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </c:if>
                        </body>

                </html>