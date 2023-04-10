<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="java.net.URLEncoder" %>
<%@ page import ="java.net.URLDecoder" %>
<%@ page import = "java.util.cookieBox" %>
<% 
Cookie ck1 = new Cookie("cook", URLEncoder.encode("지승민","UTF-8"));
response.addCookie(ck1);
Cookie ck2 = cookieBox.createCookie("name","지승민1");
response.addCookie(ck2);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= ck1.getName() %> 쿠키의값 <%= URLDecoder.decode(ck1.getValue()) %>
</body>
</html>