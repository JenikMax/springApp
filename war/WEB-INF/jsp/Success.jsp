<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>${message}</title></head>
<body>
<h1>${message}</h1>



<a href="<c:url value="catalog.htm"/>">Home</a><br>
<a href="<c:url value="addAuthor.htm"/>">Add Athour</a>


</body>
</html>