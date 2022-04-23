<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Book</title>
</head>
<body>
<%--    <form action="#" th:action="@{/registerBook}" th:object="${authorBook}" method="post">--%>
<%--        <p>Title<input type="text" th:field="${authorBook.title}" /></p>--%>
<%--        <p>Deploy Date<input type="text" th:field="${authorBook.deployDate}" /></p>--%>
<%--        <p>Copy Number<input type="text" th:field="${authorBook.copyNumber}" /></p>--%>
<%--        <p>Name<input type="text" th:field="${authorBook.name}" /></p>--%>
<%--        <p>Surname<input type="text" th:field="${authorBook.surname}" /></p>--%>
<%--        <p><input type="submit" value="Submit"/> </p>--%>
<%--    </form>--%>


<%--    <form:form th:action="/registerBook" method="post" modelAttribute="authorBook" cssClass="w3-container w3-black">--%>
<%--        <h2>Add Book</h2>--%>
<%--        <p><label>Title</label><br>--%>
<%--            <form:input path="title"/></p>--%>
<%--        <p><label>Deploy Date</label><br>--%>
<%--            <form:input path="deployDate"/></p>--%>
<%--        <p><label>Copy Number</label><br>--%>
<%--            <form:input path="copyNumber"/></p>--%>
<%--        <p><label>Author Name</label><br>--%>
<%--            <form:input path="name"/></p>--%>
<%--        <p><label>Author Name</label><br>--%>
<%--            <form:input path="surname"/></p>--%>
<%--        <button type="submit" class="w3-button w3-hover-red">Submit</button>--%>
<%--    </form:form>--%>

    <form action="" method="post">
        <spring:bind path="book.title">
            <input type="text" name="TITLE" value="${status.value}"><br />
        </spring:bind>

        <spring:bind path="book.deployDate">
            <input type="text" name="DEPLOYDATE" value="${status.value}"><br />
        </spring:bind>

        <spring:bind path="book.copyNumber">
            <input type="text" name="COPYNUMBER" value="${status.value}"><br />
        </spring:bind>

        <spring:bind path="author.name">
            <input type="text" name="${status.value}" value="${status.value}"><br />
        </spring:bind>

        <spring:bind path="author.surname">
            <input type="text" name="${status.value}" value="${status.value}"><br />
        </spring:bind>
        <input type="submit" value="Create"/>
    </form>
</body>
</html>
