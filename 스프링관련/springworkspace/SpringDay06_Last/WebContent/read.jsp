<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>read.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>�۹�ȣ:</td>
			<td>${board.articleNum}</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${board.writeDate}</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>${board.content}</td>
		</tr>
	</table>
	<a href="board.do">[�������]</a>
	<c:if test="${sessionScope.loginId == board.writer}">
		<a href="updateForm.do">[�����ϱ�]</a>
		<a href="updateForm.do">[�����ϱ�]</a>
	</c:if>
</body>
</html>






