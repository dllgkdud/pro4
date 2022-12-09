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
<title>네이버 - 주요연혁</title>
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
				<span class="show-for-sr">Current: </span> 주요 연혁
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>연혁</strong></h2><br>
		<h5 class="his-sub-title" id="his-sub-checked" ><strong>주요연혁</strong></h5>
		<a href="${path1 }/naver/history2.do"><h5 class="his-sub-title"><strong>수상내역</strong></h5></a>
	</div>
</div>
<div class="grid-container full">
	<img src="/resources/upload/images/img_spot_history.jpg" style="width: 100vw;" alt="연혁 소개 이미지">
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">
		<h4 class="large-3 columns">현재 - 2010</h4>
		<dd class="large-9 columns" id="his-table">
			<table>
				<tbody>
					<tr>
						<th id="his-year">2022</th>
						<td id="his-month">03월</td>
						<td>네이버웹툰, ‘이북 이니셔티브 재팬’ 인수</td>
					</tr>
					<tr>
						<th id="his-year">2021</th>
						<td id="his-month">03월</td>
						<td>라인-Z홀딩스 경영통합</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">05월</td>
						<td>글로벌 No. 1 웹소설 플랫폼 '왓패드' 인수</td>
					</tr>
					<tr>
						<th id="his-year">2019</th>
						<td id="his-month">11월</td>
						<td>네이버파이낸셜 설립</td>
					</tr>
					<tr>
						<th id="his-year">2018</th>
						<td id="his-month">02월</td>
						<td>캠프모바일 합병</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>홍콩과학기술대학교(HKUST)와 공동 AI 연구소 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>네이버웹툰, IP 브릿지 컴퍼니 스튜디오N 설립</td>
					</tr>
					<tr>
						<th id="his-year">2017</th>
						<td id="his-month">01월</td>
						<td>미래기술 별도 법인 네이버랩스(주) 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">05월</td>
						<td>네이버웹툰(주), 별도법인 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>AI 연구소 제록스리서치센터유럽(XRCE) 인수<br>
						스타트업 인큐베이터 스테이션F에 '스페이스 그린' 오픈</td>
					</tr>
					<tr>
						<th id="his-year">2016</th>
						<td id="his-month">07월</td>
						<td>라인주식회사, 뉴욕 및 도쿄증시 동시 상장</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>스노우 주식회사 설립</td>
					</tr>
					<tr>
						<th id="his-year">2015</th>
						<td id="his-month">04월</td>
						<td>기업용 협업 서비스 전담 자회사 웍스모바일(Works Mobile) 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>SW교육플랫폼 개발사 엔트리코리아 인수</td>
					</tr>
					<tr>
						<th id="his-year">2014</th>
						<td id="his-month">07월</td>
						<td>네이버비즈니스플랫폼(주) 광고 및 플랫폼 사업 부분, 네이버(주)로 합병</td>
					</tr>
					<tr>
						<th id="his-year">2013</th>
						<td id="his-month">03월</td>
						<td>LINE 글로벌 사업 전담 라인플러스(LINE+) 설립<br>
						모바일 사업 전담 자회사 '캠프모바일' 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>NHN 재팬, '라인 주식회사'로 사명 변경 및 게임사업 분리</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>데이터센터 각 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>NHN(주), 네이버(주)로 사명 변경 및 게임사업 분리</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>캠프모바일, 대만 후스콜 서비스 업체 고고룩 인수</td>
					</tr>
					<tr>
						<th id="his-year">2012</th>
						<td id="his-month">01월</td>
						<td>NHN 재팬, 네이버 재팬, 라이브도어 등 3개 법인 NHN재팬으로 통합</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>취약 계층 고용 창출위해 웹젠과 공동 투자, (주)더사랑 계열사 추가</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>싱가포르 법인 NHN Singapore PTE.LTD 설립</td>
					</tr>
					<tr>
						<th id="his-year">2011</th>
						<td id="his-month">01월</td>
						<td>스마트 디바이스 게임 개발사 오렌지크루(주) 계열회사로 추가<br>
						NHN 비즈니스 플랫폼, 네이버에 자체 광고 전면 시행</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>NTS(NHN Technology Services)(주), 계열사로 추가</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>NHN-KT 합작법인 칸커뮤니케이션즈(주) 계열회사로 추가</td>
					</tr>
					<tr>
						<th id="his-year">2010</th>
						<td id="his-month">01월</td>
						<td>NHN(주), 여성부와 '여성친화 기업문화 확산 위한 협약' 체결</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>NHN, 신사옥 그린팩토리 입주<br>
						NHN재팬, 라이브도어(livedoor.com) 인수<br>
						여유자금 운용 및 벤처투자 등 투자전문사업 NHN Investment 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">05월</td>
						<td>NHN 문화재단 설립(現 네이버 문화재단) 설립</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">07월</td>
						<td>NHN 소셜엔터프라이즈. 고용노동부 사회적 기업 인증 획득 및 사명 엔비전스로 변경<br>
						NHN, 윙버스 흡수 합병</td>
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