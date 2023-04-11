<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC드라이버 테스트</title>
</head>
<body>
MEMBER 테이블의 내용
<table width="100%" border="1">
<tr>
<td>아이디</td><td>이름</td><td>이메일</td>
	<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String db_url = "jdbc:oracle:thin:@192.168.4.171:1521:xe";
		String db_id = "ez";
		String db_pw = "oracle";

		String query = "select * from MEMBER order by MEMBERID";

		conn = DriverManager.getConnection(db_url, db_id, db_pw);

		stmt = conn.createStatement();
		out.println("jdbc가 연결되었습니다");
		rs = stmt.executeQuery(query);
		while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getString("MEMBERID")%></td>
		<td><%=rs.getString("NAME")%></td>
		<td><%=rs.getString("EMAIL")%></td>
	</tr>
	<%
		}
	} catch (SQLException ex) {
	out.println(ex.getMessage());
	ex.printStackTrace();
	} finally {
		if (rs != null)
		try {rs.close();} catch (SQLException ex) {}
		if (stmt != null)try {stmt.close();} catch (SQLException ex) {}
		if (conn != null)try {conn.close();} catch (SQLException ex) {}
	}
	%>
</table>
</body>
</html>