<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오후 3:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <caption>북산</caption>
    <c:forEach items="${list}" var="mem"/>
        <tr>
            <td>${mem.no}</td>
            <td>${mem.name}</td>
            <td>${mem.position}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
