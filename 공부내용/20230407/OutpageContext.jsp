<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	String[] a = {"안녕하세요","저는","지승민","입니다"};
	for(int i=0;i<a.length;i++){
		out.println(a[i]);
	}
	%><br>
	<% HttpServletRequest http = (HttpServletRequest)pageContext.getRequest(); %>
	
	request기본객체와 pageContext.getRequest()의 동일여부<%= request == http %>
	<br>
	pageContext.getOut()을 이용한 출력
	<% pageContext.getOut().print("출력하였습니다"); %>
</body>
</html>