<%--
  Created by IntelliJ IDEA.
  User: max12
  Date: 4/16/2022
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Page</title>
</head>
<body>
<h2>Admin Page</h2>
<a href="admin/showFrom">Register book with copies</a><br>
<a href="admin/search">Update book’ information</a><br>
<a href="">Delete One copy/Book with all copies</a><br>
<a href="">Give book to Reader</a><br>
<a href="">Set title of book and display count of this Book’ copies with information about them (available/unavailable in Library)</a><br>
<a href="/admin/userReadBooks">Get statistics by Reader (books which this user has read, is reading, how long he is our client)</a><br>
<a href="/admin/books">Get statistics by Book (general, by copies, average time of reading)</a><br>
<a href="">Get statistics by Readers (average age, time of working with Library, average number of requests to Library in selected period)</a><br>
<a href="/admin/usermissedlist">Get list of users who has not returned book in time with detailed information about them</a><br>
<a href="/admin/numberofrequests">How many books were giving in selected period?</a><br>
<a href="/admin/sendmail">*Send notification to one reader, all reader</a><br>
</body>
</html>
