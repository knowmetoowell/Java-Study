<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>top</h1>
<%
//    request.setCharacterEncoding("UTF-8");
    String msg = request.getParameter("msg");
    out.println(msg);
%>
</body>
</html>
