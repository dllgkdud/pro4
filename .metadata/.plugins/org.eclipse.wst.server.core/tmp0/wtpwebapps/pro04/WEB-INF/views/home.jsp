<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- <c:set var="path0" value="${pageContext.request.contextPath() }"/> --%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<jsp:include page="include/head.jsp"></jsp:include>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<header id="header">
	<jsp:include page="include/header.jsp"></jsp:include>
</header>
<div class="orbit" role="region" aria-label="Favorite Space Pictures" data-orbit>
	<ul class="orbit-container">
		<button class="orbit-previous" aria-label="previous"><span class="show-for-sr">Previous Slide</span>&#9664;</button>
		<button class="orbit-next" aria-label="next"><span class="show-for-sr">Next Slide</span>&#9654;</button>
		<li class="orbit-slide is-active">
			<img src="https://www.navercorp.com/img/ko/main/img_main_slide12.jpg">
		</li>
		<li class="orbit-slide">
			<img src="https://www.navercorp.com/img/ko/main/img_main_slide9.jpg">
        </li>
        <li class="orbit-slide">
        	<img src="https://www.navercorp.com/img/ko/main/img_main_slide10.jpg">
        </li>
        <li class="orbit-slide">
			<img src="https://www.navercorp.com/img/ko/main/img_main_slide11.jpg">
        </li>
	</ul>
</div>
<div id="content">
<h1>Hello world!</h1>

<P>The time on the server is ${serverTime}.</P>
</div>
<footer id="footer">
	<jsp:include page="include/footer.jsp"></jsp:include>
</footer>
</body>
</html>