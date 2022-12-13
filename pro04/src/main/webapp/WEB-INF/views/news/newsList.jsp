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
<title>홍보 - 보도자료</title>
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
			<li><a href="#">홍보</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 보도자료
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>보도자료</h2>
	<article class="grid-container">
		<div class="grid-x grid-margin-x small-up-2 medium-up-3">
			<c:forEach items="${newsList }" var="news" varStatus="status">
			<div class="cell content-box-report">
				<img class="thumbnail" src="/resources/upload/images/img_news_no_image.png">
				<h5><a href="/news/detail.do?nno=${news.nno }">${news.ntitle }</a></h5>
				<p>${news.ncontent }</p>
				<p>${news.regdate }</p>
			</div>
			</c:forEach>
		</div>
		<button class="button-group">
			<a href="${path1 }/news/insert.do" class="button">작성</a>
		</button>
	</article>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>