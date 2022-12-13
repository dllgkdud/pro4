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
<title>가치실현 - 동반성장</title>
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
			<li><a href="#">임팩트</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 동반성장
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>동반성장</strong></h2><br>
		<h5>네이버는 다양한 파트너들과 협력하며<br>건강한 인터넷 생태계를 구축하기 위해 노력하고 있습니다.</h5>
	</div>
</div>
<div class="grid-container full">
	<img src="/resources/upload/images/img_value_spot6.jpg" style="width: 100vw;" alt="동반성장 이미지">
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">
		<h4 class="large-3 columns">공정한 거래를 위한<br>시스템 구축</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			네이버는 파트너를 경영활동의 동반자로서 존중하고, 상호협력을 통해 동반성장을 추구할 것을 약속하는 '윤리실천 협약'을 2015년 부터 시행해오고 있으며, 
			동반성장 4대 실천사항을 준수하고, 기업윤리 및 정보보호를 위한 제도를 운영하고 있습니다. 또한 전자구매시스템을 통해 투명성 및 공정성 확보를 위한 지침을 준수하고 있습니다.
			</p>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<h4 class="large-3 columns">파트너를 위한 맞춤형<br>프로그램 지원</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			네이버는 주요 파트너를 대상으로 금융, 경영, 교육, 판로확대 등 다양한 분야의 지원 프로그램을 운영, 파트너의 경영활동에 필요한 제반 사항을 지원하고 있습니다.
			</p>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<h4 class="large-3 columns">파트너 커뮤니케이션<br>채널 운영</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			네이버는 동반성장 전담조직을 운영하고 파트너들이 직접 제안 및 문의를 할 수 있는 소통창구인 파트너스라인을 운영하고 있습니다. 
			또한 네이버의 동반성장 비전을 공유하는 자리인 파트너스데이를 정기적으로 개최하는 등 파트너들과의 원활한 소통을 위한 노력을 지속하고 있습니다.
			</p>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<dd class="large-9 columns">
			<a href="https://winwin.naver.com/partnersLine/ptnLine" class="btn_link page" target="_blank">
			<span class="btn_text">파트너스라인 바로가기</span>
			</a>
			<a href="https://winwin.naver.com/" class="btn_link page" target="_blank">
			<span class="btn_text">동반성장 프로그램 바로가기</span>
			</a>
		</dd>
	</dl>
</div>
<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>