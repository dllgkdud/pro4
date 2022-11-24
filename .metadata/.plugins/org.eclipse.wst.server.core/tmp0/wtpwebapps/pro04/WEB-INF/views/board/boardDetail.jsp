<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>공지사항</title>
<link rel="stylesheet" href="https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
</head>
<body>
<div class="row column text-center">
	<h2>공지사항상세</h2>
	<hr>
	<table>
		<tbody>
			<tr>
				<th>SEQ</th>
				<td>${dto.seq }</td>
			</tr>
			<tr>
				<th>Title</th>
				<td>${dto.title }</td>
			</tr>
			<tr>
		      <th>Content</th>
		      <td>${dto.content }</td>
			</tr>
	    	<tr>
			  <th>Nick</th>
			  <td>${dto.nick }</td>
			</tr>
			<tr>
		      <th>RegDate</th>
		      <td>${dto.regdate }</td>
		    </tr>
		    <tr>
		    <th>Visited</th>
		      <td>${dto.visited }</td>
		    </tr>
	  </tbody>
	</table>
</div>	
<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
  $(document).foundation();
</script>
</body>
</html>