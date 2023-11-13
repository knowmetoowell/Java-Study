<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%--페이지 디렉티브--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Calendar c = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();
    Calendar c3 = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) +1;

    c.set(year, month-1, 1);
    c2.set(year, month-2,1);
    c3.set(year, month, 1);

    int week = c.get(Calendar.DAY_OF_WEEK); // 1-> 일요일, 2-> 월요일,,, 3 4 5 6 7
    int nextMonthWeek = c3.get(Calendar.DAY_OF_WEEK);
    int endday = c.getActualMaximum(Calendar.DAY_OF_MONTH);

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
        int lastMonthEnd= c2.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < week; i++) { // week =4
            out.println("<td>"+ (lastMonthEnd-week+i+1)+" </td>");
        }
        for (int d = 1, w=week; d <= endday; d++, w++) {
            out.println("<td>"+(d<10 ? " " + d + " " : d+ " ")+"</td>");
            if (w%7 == 0) {
                out.print("</tr>");
            }
        }
        for (int i = nextMonthWeek, d= 1; i <= 7; i++, d++) { // week =4
            out.println("<td>"+" " + d + " "+"</td>");
        }
    %>

</table>
</body>
</html>
