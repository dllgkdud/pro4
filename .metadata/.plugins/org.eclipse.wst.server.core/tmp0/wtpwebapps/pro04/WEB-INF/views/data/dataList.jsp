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
<div class="grid-x cell">
	<nav aria-label="You are here:" role="navigation">
		<ul class="breadcrumbs">
			<li><a href="#">홈</a></li>
			<li><a href="#">서비스</a></li>
			<li><a href="#">자료실</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 자료실목록
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>자료실목록</h2>
	<hr>
	<table>
	  <thead>
	    <tr>
	      <th>DNO</th>
	      <th width="200">TITLE</th>
	      <th width="300">RegDate</th>
	      <th>Visited</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${dataList }" var="data" varStatus="status">
	    <tr>
	      <td>${status.count }</td>
	      <td><a href="/data/detail.do?dno=${data.dno }">${data.dtitle }</a></td>
	      <td>${data.regdate }</td>
	      <td>${data.visited }</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<button class="button-group">
		<a href="${path1 }/data/insert.do" class="button">작성</a>
	</button>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>