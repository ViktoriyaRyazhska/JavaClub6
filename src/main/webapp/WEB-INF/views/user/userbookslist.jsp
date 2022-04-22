<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Books</title>
</head>
<body>
<div class="w3-bar w3-black">
    <div class="w3-bar-item">Library by team6</div>
    <a href="/logout" class="w3-bar-item w3-right w3-button w3-hover-red">Log Out</a>
    <a href="/user/history" class="w3-bar-item w3-button w3-right w3-hover-red">History</a>
    <a href="/user/" class="w3-bar-item w3-button w3-right w3-hover-red">Home</a>
</div>
<div class="w3-container">
<h2>Your Books List</h2>
<input class="w3-input w3-border w3-padding" type="text" placeholder="Search for book.." id="myInput" onkeyup="myFunction()">
<table class="w3-table-all" id="myTable">
    <tr>
        <th><strong>Id</strong></th>
        <th><strong>Title</strong></th>
        <th><strong>Authors</strong></th>
        <th><strong>Deploy date</strong></th>
        <th><strong>Rent date</strong></th>
        <th><strong>Should return date</strong></th>
    </tr>
    <c:forEach items="${userbooks}" var="book">
        <tr>
            <td>${book.fkBook.id}</td>
            <td>${book.fkBook.title}</td>
            <td>
                <c:forEach items="${book.fkBook.authors}" var="author">
                    ${author.fkAuthor.name} ${author.fkAuthor.surname}
                    <br>
                </c:forEach>
            </td>
            <td>${book.fkBook.deployDate.toString()}</td>
            <td>${book.rentDate}</td>
            <td>${book.shouldReturnDate}</td>
            <td><form action="/user/returnBook" method="post">
                <input type="hidden" value="${book.fkBook.id}" name="bookId"/>
                <input type="hidden" value="${book.fkUser.id}" name="userId">
                <input type="hidden" value="${book.rentDate}" name="rentDate">
                <input type="hidden" value="${book.shouldReturnDate}" name="shouldReturnDate">
                <button type="submit" class="w3-button">Return</button>
            </form></td>
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
        var title;
        var author;
        var titleValue;
        var authorValue;
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
