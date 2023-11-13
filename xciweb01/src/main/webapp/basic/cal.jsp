<%@ page import="java.util.Calendar" %><%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-13
  Time: 오후 4:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%--페이지 디렉티브--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) +1;
    int day = c.get(Calendar.DATE);

    System.out.println("year, month, day = " +year+month+ day);
    c.set(year, month-1, 1);
    int week = c.get(Calendar.DAY_OF_WEEK); // 1-> 일요일, 2-> 월요일,,,
    System.out.println("week = " + week);
    int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println("endday = " + endday);

    System.out.println(" 일 월 화 수 목 금 토");
    System.out.println("-----------------------");



    for (int d = 1, w=week; d <= endday; d++, w++) {
        System.out.print(d<10 ? " " + d + " " : d+ " ");
        if (w%7 == 0) {
            System.out.println();
        }

    }

//    System.out.println(space + date);
%>
<table border="1">
    <caption><%=year%>, <%=month%></caption>
    <tr>
        <th>일</th>
        <th>월</th>
        <th>화</th>
        <th>수</th>
        <th>목</th>
        <th>금</th>
        <th>토</th>
    </tr>

    <%
//        out.print("<tr>");
        for (int i = 1; i < week; i++) {
            out.println("<td>   </td>");
        }
        for (int d = 1, w=week; d <= endday; d++, w++) {
            out.println("<td>"+(d<10 ? " " + d + " " : d+ " ")+"</td>");
            if (w%7 == 0) {
                out.print("</tr>");
            }
        }
    %>




</table>

<%


%>
</body>
</html>
