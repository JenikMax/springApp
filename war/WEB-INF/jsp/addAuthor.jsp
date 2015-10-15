<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add New Author Page</title>
</head>
<body>

<form:form method="post"  commandName="author">
    <table border="1" align="centre">
        <tr>
            <td>First Name:</td>
            <td><form:input path="firstName"/></td>
            <td><form:errors path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><form:input path="lastName"/></td>
            <td><form:errors path="lastName"/></td>
        </tr>
        <tr>
            <td>Country:</td>
            <td><form:input path="country"/></td>
            <td><form:errors path="country"/></td>
        </tr>
        <tr>
            <td>Birth Date:</td>
            <td><form:input path="birthDate"/></td>
            <td><form:errors path="birthDate"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add" /></td>
        </tr>
        <tr>
            <a href="<c:url value="catalog.htm"/>">Home</a>
        </tr>
    </table>
</form:form>


</body>
</html>