<%@ page language="java" contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<meta charset="UTF-8" />
<head>
	<title>Title</title>
</head>
<body>
	<table>
		<thead>
			<th></th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
		</thead>
		<tbody>
			<c:forEach var="item" items="${results}">
			<tr>
				<td>${item.id}</td>
				<td>${item.title}</td>
				<td>${item.contents}</td>
				<td>${item.creator}</td>
				<td><fmt:formatDate value="${item.createdAt}" pattern="yyyy-MM-dd HH:mm"/> </td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
