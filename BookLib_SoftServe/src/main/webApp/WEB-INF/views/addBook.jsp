<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
          <!DOC TYPE html>
            <html>

            <head>
              <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
              <title>Edit User</title>
              <style type="text/css">
                .error {
                  color: red;
                }

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
              <a href="<spring:url value='/'/>">back</a>
              <h1>Input Form</h1>
              <form:form action="addBook" method="post" modelAttribute="book">
                <table>
                  <tr>
                    <td>Title</td>
                    <td>
                      <form:input path="title" /> <br />
                      <form:errors path="title" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>Genre</td>
                    <td>
                      <form:input path="genre" /> <br />
                      <form:errors path="genre" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>Copies</td>
                    <td>
                      <form:input path="copies" /> <br />
                      <form:errors path="copies" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>Main author</td>
                        <td>
                            <form:input path="main_author" /> <br />
                            <form:errors path="main_author" cssClass="error" />
                        </td>
                    </tr>
                  <tr>
                    <td colspan="2"><button type="submit">Add Book</button></td>
                  </tr>
                </table>
              </form:form>
              <h2>Book List</h2>
              <table>
                <tr>
                  <td><strong>Title</strong></td>
                  <td><strong>Genre</strong></td>
                  <td><strong>Copies</strong></td>
                  <td><strong>Main author</strong></td>
                </tr>
                <c:forEach items="${books}" var="book">
                  <tr>
                    <td>${book.title}</td>
                    <td>${book.genre}</td>
                    <td>${book.copies}</td>
                    <td>${book.main_author}</td>
                  </tr>
                </c:forEach>
              </table>
            </body>

            </html>