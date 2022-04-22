<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
            <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
                    <html>

                    <body onload='document.loginForm.username.focus();'>
                        <h1>Login TODO:</h1>

                        <c:if test="${not empty errorMessge}">
                            <div style="color:red; font-weight: bold; margin: 30px 0px;">${errorMessge}</div>
                        </c:if>

                        <form name='login' action="/login" method='POST'>
                            <table>
                                <tr>
                                    <td>UserName:</td>
                                    <td><input type='text' name='username' value=''></td>
                                </tr>
                                <tr>
                                    <td>Password:</td>
                                    <td><input type='password' name='password' /></td>
                                </tr>
                                <tr>
                                    <td colspan='2'><input name="submit" type="submit" value="submit" /></td>
                                </tr>
                            </table>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        </form>
                    </body>

                    </html>