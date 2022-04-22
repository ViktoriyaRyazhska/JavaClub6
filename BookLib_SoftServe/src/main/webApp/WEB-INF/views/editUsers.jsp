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
              <h1>Input Form TODO:</h1>
              <form:form action="addUser" method="post" modelAttribute="user">
                <table>
                  <tr>
                    <td>Name</td>
                    <td>
                      <form:input path="name" /> <br />
                      <form:errors path="name" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>Email</td>
                    <td>
                      <form:input path="email" /> <br />
                      <form:errors path="email" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td colspan="2"><button type="submit">Submit</button></td>
                  </tr>
                </table>
              </form:form>
            </body>

            </html>