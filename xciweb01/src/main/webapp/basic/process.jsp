<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-13
  Time: 오전 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% //scriptlet
    String name = request.getParameter("name");
    out.println("<h1>그래, 난 " + name + ". 포기를 모르는 남자지</h1>");
%>
</body>
</html>
