<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	할인율은<%= application.getInitParameter("sale") %>
	<%
	Enumeration<String> a = application.getInitParameterNames();
	while(a.hasMoreElements()){
		String b = a.nextElement();
		out.println(b);
	}

	%><br>
	서버정보<%=application.getServerInfo()%><br>
	majorVersion : <%= application.getMajorVersion() %><br>
	minorVersion : <%= application.getMinorVersion() %><br>
	<%
	application.log("로그출력하기"); %>
	
	
	<%
	String e="/3chapter/test.txt";
	String real = application.getRealPath(e);
	FileReader fr = new FileReader(real);
	BufferedReader br = new BufferedReader(fr);
	char[] c = new char[300];
	int d;
	while(true){
		d = br.read(c);
		if(d == -1){
			break;
		}
		
		String data = new String(c, 0, d);
		out.print(data);
	}
	%>
	
	<%
	Enumeration<String> au = application.getAttributeNames();
	while(au.hasMoreElements()){
	
		String name = au.nextElement();
		Object vlaue = application.getAttribute(name);
		out.println( name + ":" + vlaue + "\n");
		out.newLine();
	}
	
	%>
	
</body>
</html>