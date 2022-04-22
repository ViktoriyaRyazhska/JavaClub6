<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <!DOC TYPE html>
                        <html>

                        <head>
                            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                            <title>Hello</title>
                        </head>

                        <body>
                            <h1>Hello Page</h1>

                            <ul>
                                <li><a href="<spring:url value='/allUsers'/>">allUsers</a></li>
                                <li><a href="<spring:url value='/editUsers'/>">editUsers</a></li>
                                <li><a href="<spring:url value='/allBooks'/>">allBooks</a></li>
                                <li><a href="<spring:url value='/allBooks/Title1'/>">allBooks/{Title1}</a></li>
                                <li><a href="<spring:url value='/allRequests'/>">allRequests</a></li>
                            </ul>
                        </body>

                        </html>