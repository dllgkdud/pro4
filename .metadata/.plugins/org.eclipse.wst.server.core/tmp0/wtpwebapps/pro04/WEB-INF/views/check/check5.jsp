<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>폼 유효성 검사5</title>
</head>
<body>
	<h2>폼 유효성 검사5</h2>
	<form action="./check5" method="post">
		ID : <input type="text" name="id" id="id" /><br>
		PW : <input type="password" name="pw" id="pw" /><br>
		<button class="button" id="submit">전송</button>
	</form>
</body>
</html>