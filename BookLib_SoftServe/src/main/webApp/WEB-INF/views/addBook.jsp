<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
          <!DOC TYPE html>
            <html>

            <head>
              <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
              <title>Add Book</title>
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
                      <form:select path="id">
                        <c:forEach items="${authors}" var="author">
                          <form:option value="${author.id}">${author.surname} ${author.name}
                          </form:option>
                        </c:forEach>
                      </form:select>
                    </td>
                  </tr>
                  <tr>
                    <td>Co authors</td>
                    <td>
                      <!-- <div>
                        <c:forEach items="${authors}" var="author">
                          <input type="checkbox" path="coauthors" name="coauthors">
                          <label for="${author.id}">${author.surname} ${author.name}</label>
                        </c:forEach>
                      </div> -->

                      <form:checkboxes items="${authorsList}" path="coauthors" />
                    </td>

                    </td>
                  </tr>
                  <tr>
                    <td colspan="2">
                      <p class="error">${error}</p>
                      <button type="submit">Add Book</button>
                    </td>
                  </tr>
                </table>
              </form:form>
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
                  </tr>
                  <c:forEach items="${books}" var="book">
                    <tr>
                      <td>${book.title}</td>
                      <td>${book.genre}</td>
                      <td>${book.copies}</td>
                      <td>${book.main_author.name} ${book.main_author.surname}</td>
                    </tr>
                  </c:forEach>
                </table>
              </c:if>
            </body>

            </html>