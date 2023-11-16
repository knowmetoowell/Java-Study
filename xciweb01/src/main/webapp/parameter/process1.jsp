<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String name = request.getParameter("r-name");
    String phone = request.getParameter("r-phone");
    String mail = request.getParameter("r-email");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
name : <%=name%>
phone : <%=phone%>
mail : <%=mail%>
</body>
</html>
