<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/13/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Book List</title>
</head>
<body>
<div class="w3-bar w3-black">
    <div class="w3-bar-item">Library by team6</div>
    <a href="/logout" class="w3-bar-item w3-right w3-button w3-hover-red">Log Out</a>
    <a href="/user/" class="w3-bar-item w3-button w3-right w3-hover-red">Home</a>
</div>
<div class="w3-container">
    <h2>Books List</h2>
<input class="w3-input w3-border w3-padding" type="text" placeholder="Search for book.." id="myInput" onkeyup="myFunction()">
<table class="w3-table-all" id="myTable">
    <tr>
        <th><strong>Id</strong></th>
        <th><strong>Title</strong></th>
        <th><strong>Authors</strong></th>
        <th><strong>Deploy date</strong></th>
        <th><strong>Availability</strong></th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>
                <c:forEach items="${book.authors}" var="author">
                    ${author.fkAuthor.name} ${author.fkAuthor.surname}
                    <br>
                </c:forEach>
            </td>
            <td>${book.deployDate.toString()}</td>
            <c:if test="${book.copyNumber == 0}"><td style="color:red">unavailable</td></c:if>
            <c:if test="${book.copyNumber != 0}">
                <td style="color:lawngreen">available</td>
                <td></td>
                <td><form:form action="/user/rentBook" method="post" modelAttribute="book">
                    <form:hidden path="id" value = "${book.id}"/>
                    <button type="submit" class="w3-button">Rent</button>
                </form:form></td>
            </c:if>
        </tr>
    </c:forEach>
</table>
<script>
    function myFunction() {
        var input, filter, table, tr, td, i;
        input = document.getElementById("myInput");
        filter = input.value.toUpperCase();
        table = document.getElementById("myTable");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            title = tr[i].getElementsByTagName("td")[1];
            author = tr[i].getElementsByTagName("td")[2];
            if (title || author) {
                titleValue = title.textContent || title.innerText;
                authorValue = author.textContent || author.innerText;
                if (titleValue.toUpperCase().indexOf(filter) > -1 || authorValue.toUpperCase().indexOf(filter) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>
</div>
</body>
</html>
