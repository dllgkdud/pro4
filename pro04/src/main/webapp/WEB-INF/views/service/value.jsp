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
<title>가치실현 - 프로젝트 꽃</title>
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
			<li><a href="#">가치실현</a></li>
			<li><a href="#">원칙</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 프로젝트 꽃
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>프로젝트 꽃</strong></h2><br>
		<h5>프로젝트 꽃은 SME와 크리에이터의 가치를 발견하고<br>지속 가능한 성공을 응원하는 네이버의 핵심캠페인입니다.</h5>
	</div>
</div>
<div class="grid-container full">
	<img src="/resources/upload/images/img_flower.jpg" style="width: 100vw;" alt="연혁 소개 이미지">
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">
		<dd class="large-6 columns" id="val-content">
		콘텐츠를 생산하는 SME와 크리에이터의 성장은 많은 이용자가 더 다양한 콘텐츠를 만날 수 있는 기반이 되었습니다. 또한 다양한 콘텐츠들이 더 많은 이용자와 만날수록 새로운 비즈니스 기회가 만들어졌습니다. 네이버의 개발자, 기획자, 디자인 설계자들은 이러한 건강한 선순환이 잘 이루어질 수 있도록 콘텐츠 생산자 한 사람 한 사람의 도전과 성공을 응원하는 ‘프로젝트 꽃’을 시작하였습니다. 프로젝트 꽃은 숨은 보석 같은 가게, 취향 저격 콘텐츠 등 작은 개인이 한계를 넘어 다양성의 가치를 인정받고, 개개인의 성공들이 모여 우리 경제에 분수 효과를 가져오기를 기대합니다.
		</dd>
		<dd class="large-6 columns" id="val-content">
		네이버의 기술과 플랫폼은 프로젝트 꽃을 실현하는 토양입니다. AI 인공지능, 음성인식 · 합성 등 어렵게만 여겨지는 첨단 기술을 일상생활 속에서 쉽게 활용하고, 이를 통해 더 많은 개인이 성장해 더 넓은 세상에서 기회를 만들 수 있도록 돕는 것. 이것이 네이버가 기술 플랫폼이 되고자 하는 이유이고, 프로젝트 꽃의 바람입니다.
		</dd>
		<div class="val-image">
			<img src="/resources/upload/images/img_value_flower_info.png" style="width: 100vw;" alt="프로젝트 설명 이미지">
			<img src="/resources/upload/images/img_value_flower_info.gif" style="width: 100vw;" alt="프로젝트 과정 이미지" class="gif">
		</div>
	</dl>
</div>
<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>