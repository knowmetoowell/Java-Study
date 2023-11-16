<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Map<String, String[]> paramMap = request.getParameterMap();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    for (String key : paramMap.keySet()) {
        String[] values = paramMap.get(key);
        for (String value : values) {
            out.println(key + " : " + value + "<br/>");
        }

    }
%>
</body>
</html>
