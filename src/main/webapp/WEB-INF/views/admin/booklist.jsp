<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<html>
<head>
    <title>Book List</title>
</head>
<body>
<div class="w3-container">
    <h2>Books List</h2>
    <input class="w3-input w3-border w3-padding" type="text" placeholder="Search for book.." id="myInput" onkeyup="myFunction()">
    <table class="w3-table-all" id="myTable">
        <tr>
            <th><strong>Id</strong></th>
            <th><strong>Title</strong></th>
        </tr>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td><a href="/admin/book?id=${book.id}" class="w3-button">See All Info</a></td>
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
                if (title) {
                    titleValue = title.textContent || title.innerText;
                    if (titleValue.toUpperCase().indexOf(filter) > -1) {
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
