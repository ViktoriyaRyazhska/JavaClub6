<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <!DOC TYPE html>
                        <html>

                        <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                            <title>All Users</title>
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
                            </style>
                        </head>

                        <body>
                            <a href="/">back</a>
                            <h2>Users List</h2>
                            <table>
                                <tr>
                                    <td><strong>Name</strong></td>
                                    <td><strong>Email</strong></td>
                                    <td><strong>Birth</strong></td>
                                    <td><strong>Date_registr</strong></td>
                                </tr>
                                <c:forEach items="${users}" var="user">
                                    <tr>
                                        <td>${user.name} ${user.surname}</td>
                                        <td>${user.email}</td>
                                        <td>
                                            <fmt:formatDate value="${user.birthday}" type="both" pattern='yyyy-MM-dd' />
                                        </td>
                                        <td>
                                            <fmt:formatDate value="${user.date_registr}" type="both"
                                                pattern='yyyy-MM-dd' />
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </body>

                        </html>