<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%
	request.setCharacterEncoding("UTF-8");
	String memberid = request.getParameter("memberID");
	String name = request.getParameter("name");
	
	Connection conn = null; 
	Statement stmt = null;
	ResultSet rs = null;
	int updateCount = 0;
	
	try{
	String jdbcdriver = "oracle.jdbc.driver.OracleDriver";
	Class.forName(jdbcdriver);
	
	String db_url = "jdbc:oracle:thin:@192.168.4.171:1521:xe";
	String db_id = "ez";
	String db_pw = "oracle";
	conn = DriverManager.getConnection(db_url,db_id,db_pw);
	stmt= conn.createStatement();
	String query = "UPDATE MEMBER SET NAME= '"+name+"'"+"WHERE MEMBERID = '"+memberid+"'";
	updateCount = stmt.executeUpdate(query);
	}catch(SQLException xe){
		xe.printStackTrace();
	}finally{
		if(stmt != null) try{stmt.close();} catch(SQLException ex){}
		if(conn != null) try{conn.close();} catch(SQLException ex){}
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름변경</title>
</head>
<body>
<% if(updateCount>0){ %>
<%= memberid %>의 이름을 <%= name %>으로 변경
<%}
else{%>
<%=memberid %>가 존재하지않음
<%} %>

</body>
</html>