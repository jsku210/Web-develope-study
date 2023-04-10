<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
/* 	Cookie ck1 = new Cookie("id","madvirus");
	ck1.setDomain(".madvirus.net");
	response.addCookie(ck1);
	 */
	Cookie ck2 = new Cookie("only","onlycookie");
	response.addCookie(ck2);
	
	Cookie ck3 = new Cookie("invaild","incalidcookie");
	ck3.setDomain("javacan.tistory.com");
	response.addCookie(ck3);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
다음과 같이 쿠키를 생성했습니다
<%-- <%= ck1.getName() %>=<%= ck1.getValue() %>
[<%= ck1.getDomain() %>] --%>
<br>
<%= ck2.getName() %>=<%= ck2.getValue() %>
[<%= ck2.getDomain() %>]
<br>
<%= ck3.getName() %>=<%= ck3.getValue() %>
[<%= ck3.getDomain() %>]
<br>

</body>
</html>