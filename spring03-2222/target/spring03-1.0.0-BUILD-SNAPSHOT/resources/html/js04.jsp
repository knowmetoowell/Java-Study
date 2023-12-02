<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"  src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript"></script>
$(document).ready(function(){
	var jqxhr = $.get("msg.txt", function(data) {
		$('#output').html(data);
	})
	.done(function(){
		alert("second success");
	})
	.fail(function(){
		alert("error");
	})
	.always(function(){
		alert("first success");
	})
})
</head>
<body>
</body>
</html>