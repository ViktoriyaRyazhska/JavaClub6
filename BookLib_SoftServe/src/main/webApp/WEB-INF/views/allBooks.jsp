<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <!DOC TYPE html>
                <html>

                <head>
                    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
                    <title>Add Books</title>
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
                 <h1>Add Book</h1>
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
                             <td>Main author </td>
                             <td>
                               <form:input path="main_author" /> <br />
                               <form:errors path="main_author" cssClass="error" />

                              </td>
                        </tr>
                            <tr>
                                <td>Co Author(s) </td>
                                <td>
                                    <form:select class="form-select" path="coauthors">
                                        <c:forEach items="${authors}" var="author">
                                            <c:set var="authorName" value="${author.name} ${author.surname}"/>
                                            <form:option value="${author.authorId}" label="${authorName}"/>
                                        </c:forEach>
                                    </form:select>
                                </td>
                            </tr>
                            <tr>
                                <td>Copies</td>
                                <td><form:input path="copies" class="input-group-text"/></td>
                            </tr>



                        </table>
                        <p>
                            <button type="submit" class="btn btn-outline-dark">Add Book</button>
                        </p>
                    </form:form>

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

                                        <c:if test="${coauthors.size() == 0}"><td>none</td></c:if>
                                         <c:if test="${coauthors.size() != 0}">
                                             <td>
                                                 <c:forEach items="${coauthors}" var="auth">
                                                     <c:set var="authorName" value="${auth.name} ${auth.surname}"/>
                                                     ${authorName}<br>
                                                 </c:forEach>
                                             </td>
                                         </c:if>
                            </tr>
                        </c:forEach>
                    </table>


                </body>

                </html>