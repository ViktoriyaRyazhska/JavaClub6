<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Library</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark" style="margin-bottom: 20px">
    <div class="container-fluid">
        <a class="navbar-brand" style="font-size: x-large; font-weight: bold">Library</a>
        <div class="d-flex">
            <a href="/library/user" class="btn btn-outline-light" type="button">Home</a>
            <a class="btn btn-outline-light" type="button" style="margin-left: 10px">Account</a>
        </div>
    </div>
</nav>
<div class="container">
    <c:set var="number" value="0"></c:set>
    <h1>Books</h1>
    <div style="display: flex">
        <input type="text" class="form-control" placeholder="Book search..." aria-describedby="basic-addon2"
               id="searchBookInput" onkeyup="searchFunction()">
        <a href="/library/user" class="btn btn-outline-dark" type="button" style="margin-left: 10px">Back</a>
    </div>
    <table class="table" id="booksTableElement">
        <thead>
        <tr>
            <th>№</th>
            <th>Title</th>
            <th>Author</th>
            <th>Co-author(s)</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${books}">
            <c:set var="number" value="${number + 1}"></c:set>
            <tr>
                <td>${number}</td>
                <td>${book.title}</td>
                <td>${book.mainAuthor.getName()} ${book.mainAuthor.getSurname()}</td>
                <c:if test="${book.authorSet.size() == 0}"><td>-</td></c:if>
                <c:if test="${book.authorSet.size() != 0}">
                    <td>
                        <c:forEach items="${book.authorSet}" var="author">
                            <c:set var="authorName" value="${author.name} ${author.surname}"/>
                            ${authorName}<br>
                        </c:forEach>
                    </td>
                </c:if>
                <td><a>Rent</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script type="text/javascript">
    function searchFunction() {
        var userRequestInput, filteredRequest, table, tr, i;
        userRequestInput = document.getElementById("searchBookInput");
        filteredRequest = userRequestInput.value.toUpperCase();
        table = document.getElementById("booksTableElement");
        tr = table.getElementsByTagName("tr");
        for (i = 0; i < tr.length; i++) {
            title = tr[i].getElementsByTagName("td")[1];
            author = tr[i].getElementsByTagName("td")[2];
            co_authors = tr[i].getElementsByTagName("td")[3];
            if (title || author || co_authors) {
                titleValue = title.textContent || title.innerText;
                authorValue = author.textContent || author.innerText;
                co_authorsValue = co_authors.textContent || co_authors.innerText;
                if (titleValue.toUpperCase().indexOf(filteredRequest) > -1 || authorValue.toUpperCase().indexOf(filteredRequest) > -1 || co_authorsValue.toUpperCase().indexOf(filteredRequest) > -1) {
                    tr[i].style.display = "";
                } else {
                    tr[i].style.display = "none";
                }
            }
        }
    }
</script>
</html>