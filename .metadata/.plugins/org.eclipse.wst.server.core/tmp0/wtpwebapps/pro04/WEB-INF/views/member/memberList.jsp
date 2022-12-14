<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원목록</title>
<jsp:include page="../include/head.jsp"></jsp:include>
</head>
<body>
<header id="header">
	<jsp:include page="../include/header.jsp"></jsp:include>
</header>
<div class="grid-x cell">
	<nav aria-label="You are here:" role="navigation">
		<ul class="breadcrumbs">
			<li><a href="${path1 }/">Home</a></li>
			<li><a href="#">관리자</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 회원목록
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>회원목록</h2>
	<hr>
	<table>
	  <thead>
	    <tr>
	      <th width="50">NO</th>
	      <th>ID</th>
	      <th>NAME</th>
	      <th width="50">Point</th>	      
	      <th width="400">RegDate</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<c:forEach items="${memberList }" var="mem" varStatus="status">
	    <tr>
	      <td>${status.count }</td>
	      <td><a href="${path1 }/member/detail.do?userid=${mem.userid }">${mem.userid }</td>
	      <td>${mem.username }</td>
	      <td>${mem.userpt }</td>
	      <td>${mem.regdate }</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	<button class="button-group">
		<a href="${path1 }/member/insert.do" class="button">등록</a>
	</button>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>