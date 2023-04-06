<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@
page import="java.util.Date"%>
<%@
page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="./user.jsp" method="post">
		<%="이름을 입력하세요"%>
		<input type="text" name="name"size"10"><br> 성별을 선택하세요 남자<input
			type="checkbox" name="sex" value="male"> 여자<input
			type="checkbox" name="sex" value="female"><br> email을
		입력하세요<input type="text" name="email"><br> <input
	
			type="submit" name="전송">
	</form>
<!-- 	<script>
		var checkboxes = document.getElementsByName("sex"); // name이 "checkbox"인 모든 체크박스 요소 가져오기
		for (var i = 0; i < checkboxes.length; i++) {
			checkboxes[i].addEventListener("click", function() { // 클릭 이벤트 리스너 등록
				if (this.checked) { // 현재 체크박스가 선택된 경우
					for (var j = 0; j < checkboxes.length; j++) {
						if (checkboxes[j] != this) { // 현재 체크박스가 아닌 다른 체크박스를 찾음
							checkboxes[j].checked = false; // 다른 체크박스의 선택 상태를 해제함
						}
					}
				}
			});
		}
	</script> -->
	<%-- 	<% //이메일 형식체크
	String email = request.getParameter("email"); // 이메일 파라미터 값 가져오기
	String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"; // 이메일 형식 정규 표현식
	if (request.getParameter("email") != null) {
		if (email.matches(regex)) { // 이메일 형식이 맞는지 검사
			out.println("Valid email address."); // 이메일 형식이 맞으면 출력
		} else {
	%>
	<script>
		alert("올바른 이메일 형식이 아닙니다."); // 팝업 창 띄우기
		history.back(); // 이전 페이지로 돌아가기
	</script>
	<%
			return;
		}
	} else {
	%>
	<script>
		alert("이메일을 입력하세요."); // 팝업 창 띄우기
		history.back(); // 이전 페이지로 돌아가기
	</script>
	<%
	}
	%> --%>
	안녕하세요
	<br>
	<%
	String name = "지승민";
	Date dd = new Date();
	Calendar cc = Calendar.getInstance();
	%>
	<%=name + "입니다" + dd%><br>
	<%=cc.get(Calendar.YEAR)%>
	년
	<%=cc.get(Calendar.MONTH) + 1%>
	월
	<%=cc.get(Calendar.DATE)%>일 입니다
	<br>
	<%=request.getRemoteAddr()%>

</body>
</html>