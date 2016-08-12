<%@ page language="java" contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<meta charset="UTF-8" />
<head>
<title>Main</title>
</head>
<body>
<h1>Main</h1>

<div id="message"></div>

<ol>
	<li><a href="${ctx}/posting">게시글</a></li>
</ol>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="${ctx}/js/root.js"></script>
</body>
</html>
