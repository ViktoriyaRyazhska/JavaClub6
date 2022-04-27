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
                    <td>surname</td>
                    <td>
                      <form:input path="surname" /> <br />
                      <form:errors path="surname" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>username</td>
                    <td>
                      <form:input path="username" /> <br />
                      <form:errors path="username" cssClass="error" />
                    </td>
                  </tr>                  <tr>
                    <td>Email</td>
                    <td>
                      <form:input path="email" /> <br />
                      <form:errors path="email" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>password</td>
                    <td>
                      <form:input path="password" /> <br />
                      <form:errors path="password" cssClass="error" />
                    </td>
                  </tr>
                  <tr>
                    <td>birthday</td>
                    <td>
                      <form:input path="birthday" /> <br />

                    </td>
                  </tr>
                  <tr>
                    <td colspan="2"><button type="submit">Submit</button></td>
                  </tr>
                </table>
              </form:form>
              <h2>Users List</h2>
              <table>
                <tr>
                  <td><strong>Name</strong></td>
                  <td><strong>Surname</strong></td>
                  <td><strong>username</strong></td>
                  <td><strong>Email</strong></td>
                  <td><strong>Password</strong></td>
                  <td><strong>date_registr</strong></td>
                  <td><strong>birthday</strong></td>
                </tr>
                <c:forEach items="${users}" var="user">
                  <tr>
                    <td>${user.name}</td>
                    <td>${user.surname}</td>
                    <td>${user.username}</td>
                    <td>${user.email}</td>
                    <td>${user.password}</td>
                    <td>
                      <fmt:formatDate value="${user.birthday}" type="both" pattern='yyyy-MM-dd' />
                    </td>
                    <td>
                      <fmt:formatDate value="${user.date_registr}" type="both" pattern='yyyy-MM-dd' />
                    </td>
                  </tr>
                </c:forEach>
              </table>
            </body>

            </html>