<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #top {
            height:150px;
            background-color:yellow;
        }

        #menu {
            width:250px;
            background-color:red;
            height:450px
        }

        #content {
            background-color:green;
        }
    </style>

</head>

<body style="margin: 0;">
<%
//    request.setCharacterEncoding("UTF-8");
    String msg = "안녕하십니꺼";
%>
<table style="width: 1180px">
    <tr>
        <td colspan="2" id="top">
            <jsp:include page="top.jsp">
                <jsp:param name="msg" value="<%=msg%>"/>
            </jsp:include>
        </td>
    </tr>
    <tr>
        <td id="menu"><jsp:include page="menu.jsp"/></td>
        <td id="content"><jsp:include page="content.jsp"/></td>
    </tr>
</table>
</body>
</html>
