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
<title>네이버 - 네이버 소개</title>
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
			<li><a href="#">네이버</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 네이버 소개
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>네이버 소개</strong></h2><br>
		<h5>네이버는 수많은 SME와 창작자, 파트너들이 미래 기술을 활용해<br>글로벌 시장에서 더 큰 성장을 이룰 수 있도록 지원하는 글로벌 테크 플랫폼입니다.</h5>
	</div>
</div>
<div class="grid-container full">
	<img src="/resources/upload/images/img_spot_summary_v2.jpg" style="width: 100vw;">
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">
		<h4 class="large-3 columns">NAVER</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			네이버(주)는 글로벌 ICT 기업으로서 한국 최대 검색포털 네이버를 서비스하고 있고, 그 계열사에서 모바일 메신저 라인, 동영상 카메라 스노우, 디지털 만화 서비스 네이버웹툰, 메타버스 서비스 제페토 등을 서비스하고 있습니다. 또한, 네이버(주)는 인공지능, 로보틱스, 모빌리티 등 미래 기술에 대한 지속적인 연구개발을 통해 기술 플랫폼의 변화와 혁신을 추구하며 세계 각국의 수많은 이용자와 다양한 파트너들이 함께 성장할 수 있도록 노력하고 있습니다.
			</p>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<h4 class="large-3 columns">COMPANY<br>PROFILE</h4>
		<dd class="large-9 columns">
			<table>
				<tbody>
					<tr>
						<th>설립연도</th>
						<td>1999년 6월</td>
					</tr>
					<tr>
						<th>본사 위치</th>
						<td>경기도 성남시 분당구</td>
					</tr>
					<tr>
						<th>주요서비스</th>
						<td>온라인 검색포털, 모바일 메신저 플랫폼</td>
					</tr>
					<tr>
						<th>주요사업</th>
						<td>온라인 광고 및 콘텐츠 사업</td>
					</tr>
					<tr>
						<th>해외 계열 법인</th>
						<td>일본, 미국, 프랑스, 중국, 베트남, 대만, 태국, 인도네시아 외</td>
					</tr>
					<tr>
						<th>매출액</th>
						<td>6조 818억 원 (2021년)</td>
					</tr>
					<tr>
						<th>전체인력</th>
						<td>4,595명 (본사 기준, 2021년 기준)</td>
					</tr>
				</tbody>
			</table>
		</dd>
	</dl>
</div>
<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>