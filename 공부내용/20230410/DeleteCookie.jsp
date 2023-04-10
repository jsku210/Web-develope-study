<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Cookie[] ck1 = request.getCookies();
		if(ck1 !=null&& ck1.length>0){
			for(int i =0; i<ck1.length; i++){
		%>
	<%=ck1[i].getName()%>
	=
	<%=URLDecoder.decode(ck1[i].getValue(),"UTF-8") %>
	<%
			}
		}else{
		%>
	쿠키가 존재하지 않습니다
	<%
		}
		%>
		<%
			Cookie[] ck2 = request.getCookies();
			if(ck2 != null&& ck2.length>0){
				for(int a=0; a<ck2.length;a++){
					if(ck2[a].getName().equals("cook")){
						Cookie cookk = new Cookie("cook","삭제될거임");
						cookk.setMaxAge(0);
						response.addCookie(cookk);
						out.print("쿠키가 삭제되었습니다");
						break;
					}
					else{
						out.print("cook인 cookie가 존재하지않습니다");
					}
				}
			}else{
				out.print("cookie가 존재하지않습니다");
			}
		
		%>
		
</body>
</html>