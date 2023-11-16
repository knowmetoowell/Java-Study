<%--
  Created by IntelliJ IDEA.
  User: sangwon
  Date: 2023-11-14
  Time: 오전 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>연습문제 1</title>
    <style>
        ul { list-style:none;}
        li { line-height:50px; }
        label {
            width:60px;
            float:left;
        }
    </style>
</head>
<body>
<h1>예약 정보</h1>
<form action="process1.jsp" method="post">
    <ul>
        <li>
            <label for="name">이 름</label>
            <input type="text" id="name" name="name" autofocus="autofocus" required="required">
        </li>
        <li>
            <label for="phone">휴대폰</label>
            <input type="tel" id="phone" name="phone" required="required">
        </li>
        <li>
            <label for="email">이메일</label>
            <input type="email" id="email" name="email" required="required">
        </li>
        <li>
            <input type="submit" value="예약하기">
    </ul>
</form>
</body>
</html>
