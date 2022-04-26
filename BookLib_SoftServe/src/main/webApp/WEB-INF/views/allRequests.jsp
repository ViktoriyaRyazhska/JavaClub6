<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <!DOC TYPE html>
                        <html>

                        <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                            <title>All Requests</title>
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
                            <li><a href="<spring:url value='/allRequests'/>">allRequests</a></li>
                            <li><a href="<spring:url value='/isReading'/>">isReading</a></li>
                            <h2>Requests List</h2>
                            <c:if test="${empty requests}">
                                <div>Not found</div>
                            </c:if>

                            <c:if test="${not empty requests}">
                                <table>
                                    <tr>
                                        <td><strong>User</strong></td>
                                        <td><strong>Book</strong></td>
                                        <td><strong>First_day</strong></td>
                                        <td><strong>Last_day</strong></td>
                                        <td><strong>Date_return</strong></td>
                                        <td><strong>Buttons</strong></td>
                                    </tr>
                                    <c:forEach items="${requests}" var="request">
                                        <tr>
                                            <td>${request.user.name} ${request.user.surname}</td>
                                            <td>${request.book.title} (${request.book.genre})</td>
                                            <td>
                                                <fmt:formatDate value="${request.first_day}" type="both"
                                                    pattern='yyyy-MM-dd' />
                                            </td>
                                            <td>
                                                <fmt:formatDate value="${request.last_day}" type="both"
                                                    pattern='yyyy-MM-dd' />
                                            </td>
                                            <c:if test="${request.date_return eq null}">
                                                <td class="error">Not returned</td>
                                            </c:if>
                                            <c:if test="${request.date_return ne null}">
                                                <td>
                                                    <fmt:formatDate value="${request.date_return}" type="both"
                                                        pattern='yyyy-MM-dd' />
                                                </td>
                                            </c:if>
                                            <td>
                                                <form:form action="${contextPath}/deleteRequest" method="GET"
                                                    enctype="multipart/form-data">
                                                    <!-- <input type="hidden" value="${request.id}" name="id"> -->
                                                    <button type="submit">Return TODO:</button>
                                                </form:form>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </c:if>
                        </body>

                        </html>