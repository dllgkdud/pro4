<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항</title>
<link rel="stylesheet" href="include/foundation.css">
<link rel="stylesheet" href="include/app.css">
</head>
<body>
<div class="row column text-center">
	<h2>공지사항목록 테스트 화면</h2>
	<hr>
	<table>
	  <thead>
	    <tr>
	      <th>SEQ</th>
	      <th width="100">TITLE</th>
	      <th width="300">CONTENT</th>
		  <th>nick</th>
	      <th width="200">RegDate</th>
	      <th>Visited</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${boardList }" var="brd" varStatus="status">
	    <tr>
	      <td>${status.count }</td>
	      <td>${brd.title }</td>
	      <td>${brd.content }</td>
	      <td>${brd.nick }</td>
	      <td>${brd.regdate }</td>
	      <td>${brd.visited }</td>
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