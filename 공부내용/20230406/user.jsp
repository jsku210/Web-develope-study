<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	user페이지입니다
	<br> 이름은
	<% request.setCharacterEncoding("UTF-8"); %>
	
	<%= request.getParameter("name") %>입니다
	<br> 성별은
	<% String[]  a = request.getParameterValues("sex");
		if(a != null){
			for(int i=0;i<a.length;i++){
	%>			
			<%=	a[i] %>
			
	<%		}
		}
	%>
	입니다
	<br> 이메일주소는 <%= request.getParameter("email") %>
</body>
</html>