<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="reserv" class="beans.Reservation" scope="page"/>
<jsp:setProperty name="reserv" property="*"/>
<%--
beans.Reservation reserv = new beans.Reservation();
reserv.setName(request.getParameter("name"));
reserv.setPhone(request.getParameter("Phone"));
reserv.setEmail(request.getParameter("email"));
--%>


<%
//    String name = request.getParameter("name");
//    String phone = request.getParameter("phone");
//    String mail = request.getParameter("email");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
name : <%=reserv.getName()%>
phone : <%=reserv.getPhone()%>
mail : <%=reserv.getEmail()%>
</body>
</html>
