<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");

	if (name.equals("next") && pass.equals("1111")) {
		out.println("로그인 되었습니다.");
	} else {
		out.println("이름 혹은 비밀번호가 틀립니다.");
	}
%>