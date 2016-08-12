<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
</head>
<body>
<c:if test="${param.err != null}">
<div>
	Does not exist username, or does not match password
</div>
</c:if>


<h1>Login</h1>
<form action="${ctx}/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    Login Id : <input type="text" name="username" tabindex="1" /> <br/>

    Password : <input type="password" name="password" tabindex="2" /> <br/>

    remember me : <input type="checkbox" name="remember-me" tabindex="3"/> <br/>

    <input type="submit" value="Login" tabindex="4"/>

</form>


</body>
</html>
