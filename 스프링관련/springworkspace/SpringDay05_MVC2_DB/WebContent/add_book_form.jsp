<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>add_book_form.jsp</title>
</head>
<body>
	<form action="addBook.do" method="post">
	<table border="1">
		<tr>
			<td>제목</td>
			<td>
				<input type="text" name="bookTitle" size="10">
			</td>
		</tr>
		<tr>
			<td>출판사</td>
			<td>
				<input type="text" name="bookPub" size="10">
			</td>
		</tr>
		<tr>
			<td>가격</td>
			<td>
				<input type="text" name="bookPrice" size="10">
			</td>
		</tr>
		<tr>
			<td>출판년도</td>
			<td>
				<input type="text" name="pubYear" size="10">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="제출">
			</td>
		</tr>
		
	</table>
	</form>
</body>
</html>