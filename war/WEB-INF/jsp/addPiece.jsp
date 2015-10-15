<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add New Author Page</title>
</head>
<body>

<form:form method="post"  commandName="piece" enctype="multipart/form-data">
    <table border="1" align="centre">
        <tr>
            <td>Author ID:</td>
            <td><form:input path="idAuthor"/></td>
            <td><form:errors path="idAuthor"/></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name"/></td>
        </tr>
        <tr>
            <td>Create Date:</td>
            <td><form:input path="createDate"/></td>
            <td><form:errors path="createDate"/></td>
        </tr>
        <tr>
            <td>Cover:</td>
            <td><input type="file" name="cover" path="cover" /></td>
            <td><form:errors path="cover"  /></td>
        </tr>
        <tr>
            <td>Text:</td>
            <td><form:input path="text"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add Piece" /></td>
        </tr>
        <tr>
            <a href="<c:url value="catalog.htm"/>">Home</a>
        </tr>
    </table>
</form:form>


</body>
</html>

