<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="margin: 0;">
<%
    String msg = "안녕하십니꺼";

%>
<table style="width: 1180px">
    <tr>
        <td colspan="2" style="height: 150px; background-color:yellow"><%@include file="top.jsp"%></td>
    </tr>
    <tr>
        <td style="width: 250px; background-color: red; height: 450px"><%@include file="menu.jsp"%></td>
        <td style="background-color: green"><%@include file="content.jsp"%></td>
    </tr>
</table>
</body>
</html>
