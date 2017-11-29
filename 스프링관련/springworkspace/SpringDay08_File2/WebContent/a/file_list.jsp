<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>file_list.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>���Ϲ�ȣ</th>
			<th>���Ͽ����̸�</th>
			<th>���� ����� ���</th>
		</tr>
		<c:if test="${empty fileList}">
			<tr>
				<td colspan="3">
					���ε� �� ���� ������ �������� �ʽ��ϴ�.
				</td>
			</tr>
		</c:if>
		<c:if test="${not empty fileList}">
			<c:forEach items="${fileList}" var="f">
				<tr>
					<td>${f.fileNum}</td>
					<td>
						<a href="download.do?fileNum=${f.fileNum}">
						${f.originalName}
						</a>
					</td>
					<td>${f.savedPath}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	<hr>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		���ε� �� ������ �����ϼ���.
		<input type="file" name="uploadFile"><br>
		<input type="submit" value="���ε�">	
	</form>
</body>
</html>



