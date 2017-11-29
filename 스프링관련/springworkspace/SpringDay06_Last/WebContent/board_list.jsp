<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<html>
<head>
<title>board_list.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>No.</th>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�ۼ��Ͻ�</th>
			<th>��ȸ��</th>
		</tr>
		<c:if test="${empty boardPage.boardList}">
			<tr>
				<td colspan="5">
					���� �Խñ��� �������� �ʽ��ϴ�.
				</td>
			</tr>
		</c:if>
		<c:if test="${not empty boardPage.boardList}">
			<c:forEach items="${boardPage.boardList}" var="b">
				<tr>
					<td>${b.articleNum}</td>
					<td>
						<a href="read.do?articleNum=${b.articleNum}">
							${b.title}
						</a>
					</td>
					<td>${b.writer}</td>
					<td>
						<fmt:formatDate value="${b.writeDate}" type="both"/>
					</td>
					<td>${b.readCount}</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5">
					<c:if test="${boardPage.startPage > 1}">
						<a href="board.do?page=${boardPage.startPage-1}">
							[����]
						</a>
					</c:if>
					<c:forEach begin="${boardPage.startPage}" 
									end="${boardPage.endPage}"
										var="p">
						<a href="board.do?page=${p}">[${p}]</a>
					</c:forEach>
					<c:if test="${boardPage.endPage < boardPage.totalPage}">
						<a href="board.do?page=${boardPage.endPage+1}">
							[����]
						</a>
					</c:if>
				</td>
			</tr>
		</c:if>
	</table>

	<a href="writeForm.do">[�۾���]</a>
</body>
</html>



