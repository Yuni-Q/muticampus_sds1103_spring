<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		�̸� : <input type="text" name="name" size="10"><br>
		�޴�����ȣ : <input type="text" name="phone" size="20"><br>
		����÷�� : <input type="file" name="memberFile"><br>
		<input type="submit" value="upload">
	</form>
</body>
</html>