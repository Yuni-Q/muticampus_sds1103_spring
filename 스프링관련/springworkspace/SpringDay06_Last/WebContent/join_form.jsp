<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>join_form.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('form').submit(function(){
			var pw = $('#pw').val();
			var conPw = $('#pwConfirm').val();
			
			if(pw == conPw){
				return true; // ���� ����
			}else{
				alert('�н����尡 ��ġ���� �ʽ��ϴ�.');
				return false; // submit ���
			}
		})
	})
</script>

</head>
<body>
	<h4>�̰��� ȸ������ �Է� ȭ���Դϴ�.</h4>
	<form action="join.do" method="post">
		<table border="1">
			<tr>
				<td>���̵�</td>
				<td>
					<input type="text" name="memberId">
					<button>�ߺ�Ȯ��(���� ����)</button>
				</td>
			</tr>
			<tr>
				<td>�н�����</td>
				<td>
					<input type="password" name="memberPw" id="pw">
				</td>
			</tr>
			<tr>
				<td>�н����� Ȯ��</td>
				<td>
					<input type="password" id="pwConfirm">
				</td>
			</tr>
			<tr>
				<td>E-MAIL</td>
				<td>
					<input type="email" name="email">
				</td>
			</tr>
			<tr>
				<td>�޴�����ȣ</td>
				<td>
					<input type="tel" name="phone">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="����">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>