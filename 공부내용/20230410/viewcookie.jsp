<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder"%>
<%@ page import="java.net.URLEncoder"%>
<!DOCTYPE html>
<%
Cookie[] ck2 = request.getCookies();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if (ck2 != null && ck2.length > 0) {
		for (int i = 0; i < ck2.length; i++) {
	%>
	<%=ck2[i].getName()%>
	=
	<%=URLDecoder.decode(ck2[i].getValue(), "UTF-8")%><br>
	<%
	}
	} else {
	%>
	쿠키가 존재하지 않습니다
	<%
	}
	%>
	<%
	if (ck2 != null && ck2.length > 0) {
		for (int n = 0; n < ck2.length; n++) {
			if (ck2[n].getName().equals("cook")) {
		Cookie ck3 = new Cookie("cook", URLEncoder.encode("지승민아니다", "UTF-8"));
		response.addCookie(ck3);
			}
		}
	}
	%>
	<%
	Cookie[] ck4 = request.getCookies();
	%>
	<%
	if (ck4 != null && ck4.length > 0) {
		for (int i = 0; i < ck4.length; i++) {
	%>
	<%=ck4[i].getName()%>
	=
	<%=URLDecoder.decode(ck4[i].getValue(), "UTF-8")%><br>
	<%
	}
	} else {
	%>
	쿠키가 존재하지 않습니다
	<%
	}
	%>


</body>
</html>