
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>${message}</title></head>
<body>
    <h1>${message}</h1>

    <table id="t1" border="1" align="centre">
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Country</th>
            <th>Birt Date</th>
        </tr>
        <c:forEach items="${authors}" var="author">
            <tr>
                <td><c:out value="${author.id}"/></td>
                <td><c:out value="${author.firstName}"/></td>
                <td><c:out value="${author.lastName}"/></td>
                <td><c:out value="${author.country}"/></td>
                <td><c:out value="${author.birthDate}"/></td>

            </tr>
        </c:forEach>
    </table>

    <a href="<c:url value="addAuthor.htm"/>">Add Authors</a><br>
    <a type="botton" href="<c:url value="addPiece.htm"/>">Add Piece</a><br>



    <table id="t2" border="1" align="centre">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Create Date</th>
            <th>Cover</th>
            <th>Text</th>
            <th>Author</th>
        </tr>
        <c:forEach items="${pieces}" var="piece">
            <tr>
                <td><c:out value="${piece.id}"/></td>
                <td><c:out value="${piece.name}"/></td>
                <td><c:out value="${piece.createDate}"/></td>
                <td><img title="${piece.name}" src="${piece.cover}"></td>
                <td><c:out value="${piece.text}"/></td>
                <td>ID Author: <c:out value="${piece.idAuthor.id}"/> || Name: <c:out value="${piece.idAuthor.firstName}"/> <c:out value="${piece.idAuthor.lastName}"/></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>