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
<title>자료게시판</title>
<jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>
<header id="header">
	<jsp:include page="../include/header.jsp"></jsp:include>
</header>
<div class="row column text-center">
	<h2>게시판상세</h2>
	<hr>
	<table>
		<tbody>
			<tr>
				<th>DNO</th>
				<td>${dto.dno }</td>
			</tr>
			<tr>
				<th>Title</th>
				<td>${dto.dtitle }</td>
			</tr>
			<tr>
		      <th>Content</th>
		      <td>${dto.dcontent }</td>
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
	<button class="button-group">
		<a href="${path1 }/data/list.do" class="button">목록</a>
		<a href="${path1 }/data/delete.do?seq=${dto.dno}" class="button">삭제</a>		
		<a href="${path1 }/data/update.do?seq=${dto.dno}" class="button">수정</a>
	</button>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>