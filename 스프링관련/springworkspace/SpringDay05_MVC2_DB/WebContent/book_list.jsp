<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>book_list.jsp</title>
</head>
<body>
	<c:if test="${empty bookList}">
	저장된 책이 없습니다.<br>
	</c:if>
	<c:if test="${not empty bookList}">
		<table border="1">
			<tr>
				<th>책번호</th>
				<th>제목</th>
				<th>출판사</th>
				<th>출판연도</th>
				<th>가격</th>
			</tr>	
			<c:forEach items="${bookList}" var="book">
				<tr>
					<td>${book.bookNum}</td>
					<td>${book.bookTitle}</td>
					<td>${book.bookPub}</td>
					<td>${book.pubYear}</td>
					<td>${book.bookPrice}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<a href="http://localhost:9999/SpringDay05_MVC2_DB/">
		[메인 화면으로]
	</a>
</body>
</html>