<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                    </style>
                </head>

                <body>
                    <h2>Books List</h2>
                    <table>
                        <tr>
                            <td><strong>Title</strong></td>
                            <td><strong>Genre</strong></td>
                            <td><strong>Copies</strong></td>
                            <td><strong>Main_author</strong></td>
                            <td><strong>Co_author</strong></td>
                        </tr>
                        <c:forEach items="${books}" var="book">
                            <tr>
                                <td>${book.title}</td>
                                <td>${book.genre}</td>
                                <td>${book.copies}</td>
                                <td>${book.main_author.name} ${book.main_author.surname}</td>
                                <!-- <c:if test="${book.coauthors.size() == 0}">
                                    <td> - </td>
                                </c:if> -->
                                <!-- <c:if test="${book.coauthors.size() != 0}"> -->
                                <td>
                                    <c:forEach items="${coauthors}" var="coauthor">
                                        ${coauthor.name} ${coauthor.surname}
                                    </c:forEach>
                                </td>
                                <!-- </c:if> -->

                            </tr>
                        </c:forEach>
                    </table>


                </body>

                </html>