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
<title>네이버 - 수상내역</title>
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
				<span class="show-for-sr">Current: </span> 수상 연혁
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>연혁</strong></h2><br>
		<a href="${path1 }/naver/history1.do"><h5 class="his-sub-title"><strong>주요연혁</strong></h5></a>
		<h5 class="his-sub-title" id="his-sub-checked"><strong>수상내역</strong></h5>
	</div>
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
						<th id="his-year">2021</th>
						<td id="his-month">04월</td>
						<td>네이버, 독일 iF 디자인 어워드 9개 부문 수상(IF Design Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>2020년 동반성장지수 평가 ‘최우수’ 등급 선정 (5년 연속 수상)<br>
						네이버, ‘IDEA 2021 디자인 어워드’ 2개 프로덕트 수상 (클로바램프, 클로바 페이스사인)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>2020 LACP 비전 어워드(Vision Award) ESG 보고서 부문 대상 수상<br>
						2021 ARC 어워드 ESG 보고서 부문 대상 수상<br>
						2020 LACP 비전 어워드(Vision Award) 연차보고서 부문 어워드 금상 수상<br>
						2021 ARC 어워드 연차보고서 부문 금상 수상</td>
					</tr>
					<tr>
						<th id="his-year">2020</th>
						<td id="his-month">02월</td>
						<td>네이버, 독일 IF 디자인 어워드 3개 서비스 수상(IF Design Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>2020 레드닷 어워드 5개 부문 본상 수상<br>
						2019 LACP 비전 어워드(Vision Award) 금상 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>2020 ARC 어워드 온라인 연차보고서 부문 대상 수상<br>
						2019년 동반성장지수 평가 ‘최우수’ 등급 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>2020 포브스 선정 THE WORLD'S BEST EMPLOYERS 2020 37위<br>
						포춘지 선정 2020 미래유망기업 33위</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>네이버, 정책소통 유공 장관 표창 수상 (행정안전부)<br>
						네이버 클로바램프, CES 혁신상(Innovation Awards) 수상</td>
					</tr>
					<tr>
						<th id="his-year">2019</th>
						<td id="his-month">02월</td>
						<td>네이버, 독일 iF 디자인 어워드 6개 부문 수상(IF Design Awards)<br>
						브이라이브 오리지널 라이브 포맷, 미디어 엑셀런스 어워드 ‘음악’ 부문 수상(Media Excellence Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>2018년 동반성장지수 평가서 3년연속 ‘최우수’ 등급 획득 (최우수 명예기업 등극)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>네이버, ‘대한민국 일자리 으뜸기업’ 선정(고용노동부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>네이버, ‘2019 대한민국 소상공인대회’ 감사패 수상<br>
						라인웍스 클로바 클락 등 6개 제품, 일본 ‘굿디자인 어워드’ 수상(Good Design Award)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">11월</td>
						<td>동반성장주간 기념식에서 ‘자발적 상생협력 단체부문’ 대통령 표창 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>네이버, 대한민국 동반성장 시상식 3년 연속 ‘동반성장지수평가 최우수 기업상’ 수상(동반성장위원회)</td>
					</tr>
					<tr>
						<th id="his-year">2018</th>
						<td id="his-month">02월</td>
						<td>파파고, 독일 iF 디자인 어워드 2개 부문 수상(iF Design Award)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>네이버랩스, 레드닷 어워드 4개 제품 수상(Red Dot Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>네이버, 포브스 선정 100대 혁신기업 9위 선정(5년 연속)<br>
						2017년 동반성장지수 평가 ‘최우수’ 등급 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>파파고·웨일·네이버지도, 독일 레드닷 어워드 커뮤니케이션 부문 수상(Red Dot Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>LICO 웹애니메이션 ‘연애하루전’, ‘BCWW2018’ 뉴미디어콘텐츠상 대상 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>네이버, IDEA 4개 부문에서 클로바 프렌즈 등 6종 프로덕트 수상(IDEA)<br>
						포춘 선정 ‘미래유망기업(The Future 50)’ 6위에 선정(FORTUNE)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">11월</td>
						<td>네이버·네이버랩스, CES2019 이노베이션 어워드 4개 프로덕트 수상<br>
						네이버 비즈니스 플랫폼, ‘그랜드 클라우드 컨퍼런스' 장관상 수상(과학기술정보통신부)<br>(클라우드 산업발전유공 장관 표창)</td>
					</tr>
					<tr>
						<th id="his-year">2017</th>
						<td id="his-month">03월</td>
						<td>네이버, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 11년 연속 1위(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">05월</td>
						<td>CEO스코어 최우수 경영 기업 선정</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">07월</td>
						<td>2016년 동반성장지수 평가 ‘최우수’ 등급 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">11월</td>
						<td>데이터센터 각, '에너지 챔피언' 선정</td>
					</tr>
					<tr>
						<th id="his-year">2016</th>
						<td id="his-month">01월</td>
						<td>네이버, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 10년 연속 1위(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>2015년 동반성장지수 평가 ‘우수’ 등급 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>네이버, 포브스 '100대 혁신 기업' 3년 연속 선정</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>네이버, 제38회 한국에너지효율대상 대통령표창 수상(행정자치부)<br>
						네이버, 2016 KCSI(한국고객만족도조사) 검색포털사이트 부문 13년 연속 1위 선정(한국능률컨설팅협회)</td>
					</tr>
					<tr>
						<th id="his-year">2015</th>
						<td id="his-month">01월</td>
						<td>라인프렌즈, 라이센싱 최고권위상 LIMA-ALA 2관왕 석권</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">02월</td>
						<td>라인, 최고 국제 스타트업상 수상(Crunch Award)<br>
						네이버 라이브러리, TOSS 등 디자인 8개 부문 수상(iF Design Award)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>네이버 서비스 히스토리 월(커넥트원), 디지털 디자인 부문 금상 수상(IDEA)<br>
						라인 셀피 전용 앱 B612, 커뮤니케이션 디자인 부문 ‘베스트 오브 더 베스트’ 선정 등 2개 부문 수상(Red Dot Awards)<br>
						네이버 지하철노선도, 사회적 책임분야 ‘베스트 오브 더 베스트’ 선정 등 5개 부문 수상(Red Dot Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">09월</td>
						<td>네이버, 제1회 기업-농업계 상생협력 경연대회 장관상 수상(농림수산식품부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">11월</td>
						<td>네이버, 제3회 소프트웨어 산업보호대상 공공민간분야 장관상 수상(미래창조과학부)</td>
					</tr>
					<tr>
						<th id="his-year">2014</th>
						<td id="his-month">02월</td>
						<td>네이버 데이터센터 각 등 디자인 4개 부문 수상(iF Design Award)<br>
						네이버, 대한변호사협회 공로상 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">04월</td>
						<td>네이버, 고용 부문 장관 표창 수상(보건복지부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">05월</td>
						<td>네이버, 남녀고용평등 우수기업 대통령 표창 수상(고용노동부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">07월</td>
						<td>네이버 한글캠페인 등 브랜드 디자인 6개 부문 수상(IDEA)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>네이버 SDF 데이터 스퀘어 '베스트 오브 더 베스트' 선정 등 디자인 5개 부문 본상 수상(Red Dot Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>네이버 그린팩토리, LEED 플래티넘 세계최고점수 획득</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>네이버, 소프트웨어 산업 육성 공로상 수상(미래창조과학부)<br>
						네이버, 교육기부 대상 기업부문 수상(교육부)</td>
					</tr>
					<tr>
						<th id="his-year">2013</th>
						<td id="his-month">04월</td>
						<td>NHN, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 8년 연속 1위 선정(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year">2012</th>
						<td id="his-month">04월</td>
						<td>NHN, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 7년 연속 1위 선정(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>네이버 앱스퀘어, NHN NEXT Identity 등 브랜드 디자인 4 개 부문 본상 수상(Red Dot Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">07월</td>
						<td>네이버 부동산앱, NHN 다이어리 패키지 등 브랜드 디자인 4개 부문 수상(IDEA)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>NHN, '2012 디지털국토엑스포' 대통령 표창 단체부문 수상(국토해양부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>NHN NEXT 아이덴티티, 라인 등 7개 부문 디자인 본상 수상(iF Design Award)<br>
						NHN, '제 21회 경실련 좋은기업상' 비제조 부문 최우수 기업상 수상(경제정의실천시민연합)<br>
						네이버뮤직, 제 1회 대한민국 TV앱 생활 부문 최우수상 수상(방송통신위원회)</td>
					</tr>
					<tr>
						<th id="his-year">2011</th>
						<td id="his-month">04월</td>
						<td>NHN, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 6년 연속 1위 선정(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">07월</td>
						<td>NHN, 중소기업청과 벤처기업협회 선정 '매출액 부문 우수 벤처기업상' 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>연차보고서, 인터넷 서비스 부문 금상, 사진 부문 금상, 출판 부문 은상, 디자인 부문 동상 수상(Annual Report Competition 2011 Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">10월</td>
						<td>NHN 그린팩토리, 2011 한국건축문화대상 우수상 수상</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">11월</td>
						<td>네이버 앱스쿼어 및 포토 인화 패키지, 커뮤니케이션 부문 본상 수상(iF Design Award)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>NHN, 2011년도 정보보호대상 수상(방송통신위원회 및 한국인터넷진흥원)</td>
					</tr>
					<tr>
						<th id="his-year">2010</th>
						<td id="his-month">04월</td>
						<td>NHN, 국가고객만족도(NCSI) 조사 검색포털 서비스 부문 5년 연속 1위 선정(한국생산성본부)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">06월</td>
						<td>네이버 한글사랑캠페인 '한글한글 아름답게', PR Lions Silver 수상(Cannes lions)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">08월</td>
						<td>네이버 그린윈도우, 어둠속의 대화 소개영상 등 9 개 부문 디자인 본상 수상(iF Design Award)<br>
						NHN, 브랜드 디자인 5 개 부문 본상 수상(Red Dot Awards)<br>
						연차보고서, 인터넷 서비스 부문 금상, 출판/제작 부문 금상, 디자인 부문 동상 수상(Annual Report Competition 2010 Awards)</td>
					</tr>
					<tr>
						<th id="his-year"></th>
						<td id="his-month">12월</td>
						<td>네이버 모바일 웹 부문&미디어/정보서비스 15개 부문 수상(웹어워드코리아)<br>
						네이버, 아시아를 대표하는 Tech Company Top 10 선정(Business Insider)</td>
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