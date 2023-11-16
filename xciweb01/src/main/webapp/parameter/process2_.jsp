<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String field = request.getParameter("field");
    String[] hobbies = request.getParameterValues("hobby");
    String gender = request.getParameter("gender");
    if (gender == "1"){
        gender = "남자";
    }
    else{
        gender = "여자";
    }
    String motive = request.getParameter("motive");


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
name : <%=name +"<br/>"%>
phone : <%=phone+"<br/>"%>
field : <%=field+"<br/>"%>


hobbies : <%
    for (String hobby : hobbies) {
    out.println(hobby + ", ");
}
//Arrays.stream(hobbies).forEach(h -> out.println(h));


%>
<br/>
gender : <%=gender+"<br/>"%>
motive : <%=motive+"<br/>"%>

</body>
</html>
