<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>index.jsp</title>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>������ ���� ǥ���ϱ�</title>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=Z7v2W6Im79RkF7XilfcJ"></script>
</head>
<body>
	<h2>�̰��� ���� ȭ���Դϴ�.</h2>
	<c:if test="${empty sessionScope.loginId}">
	<form action="login.do" method="post">
		<table border="1">
			<tr>
				<td>���̵�:</td>
				<td>
					<input type="text" name="userId">
				</td>
			</tr>
			<tr>
				<td>�н�����:</td>
				<td>
					<input type="password" name="userPw">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="�α���">
				</td>
			</tr>
		</table>
	</form>
	<hr>
	
		<a href="joinForm.do">
			<button>ȸ������</button>
		</a>
	</c:if>
	<c:if test="${not empty sessionScope.loginId}">
		${sessionScope.loginId} �� �ݰ����ϴ�.<br>
		<a href="#">My page</a>
	</c:if>
	<hr>
	<a href="board.do">[�Խ��� ����]</a>
	<hr>
	
	<div id="map" style="width:100%;height:400px;"></div>

<script>
var mapOptions = {
    center: new naver.maps.LatLng(37.3595704, 127.105399),
    zoom: 10
};

var map = new naver.maps.Map('map', mapOptions);
</script>
</script>
</body>
</html>