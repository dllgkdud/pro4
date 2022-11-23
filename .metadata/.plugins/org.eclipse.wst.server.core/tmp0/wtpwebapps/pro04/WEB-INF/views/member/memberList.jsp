<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원</title>
<link rel="stylesheet" href="include/foundation.css">
<link rel="stylesheet" href="include/app.css">
</head>
<body>
<div class="row column text-center">
	<h2>회원목록 테스트 화면</h2>
	<hr>
	<table>
	  <thead>
	    <tr>
	      <th>NO</th>
	      <th width="100">ID</th>
	      <th width="100">NAME</th>
	      <th width="200">RegDate</th>
	      <th>Point</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${memberList }" var="mem" varStatus="status">
	    <tr>
	      <td>${status.count }</td>
	      <td>${mem.id }</td>
	      <td>${mem.name }</td>
	      <td>${mem.regdate }</td>
	      <td>${mem.pt }</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
</div>	
<script src="include/jquery.js"></script>
<script src="include/what-input.js"></script>
<script src="include/foundation.js"></script>
<script src="include/app.js"></script>
</body>
</html>