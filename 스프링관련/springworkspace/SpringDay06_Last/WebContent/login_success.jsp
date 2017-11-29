<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>login_success.jsp</title>
</head>
<body>
<%
// 로그인 성공 했으면 로그인 성공 페이지 말고 걍 메인으로 보내기
	response.sendRedirect("/SpringDay06_Last/");
%>

</body>
</html>