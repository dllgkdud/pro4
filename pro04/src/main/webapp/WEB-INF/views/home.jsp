<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<%@ page import="java.util.*, java.lang.*" %>
<%@ page import="java.text.*, java.net.InetAddress" %>
<%-- <c:set var="path0" value="${pageContext.request.contextPath() }"/> --%>
<html>
<head>
	<title>NAVER Corporation</title>
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
			<div class="slide_text_box">
				<p class="slide_title"><strong>건강한 지구를 위해<br>네이버가 Green 계획을 소개합니다.</strong></p>
				<p class="slide_text"><span>디지털 친환경부터 지구를 위한 가장 쉽고 착한 소비까지<br>네이버의 기술력과 파트너와의 공동 노력으로 친환경 생태계를 확대해 나가고 있습니다.</span></p>
			</div>
		</li>
		<li class="orbit-slide">
			<img src="https://www.navercorp.com/img/ko/main/img_main_slide9.jpg">
			<div class="slide_text_box">
				<p class="slide_title"><strong>네이버 1784에서<br>우리는 혁신을 현실로 만들고 있습니다.</strong></p>
				<p class="slide_text"><span>네이버의 다양한 기술들로 실험과 도전, 융합을 통해<br>새로운 기회와 가능성을 만들어 갑니다.</span></p>
			</div>
        </li>
        <li class="orbit-slide">
        	<img src="https://www.navercorp.com/img/ko/main/img_main_slide10.jpg">
        	<div class="slide_text_box">
					<p class="slide_title"><strong>N개의 엔진이, 하나의 팀처럼!<br>네이버의 다양한 서비스와 비즈니스를 만듭니다</strong></p>
					<p class="slide_text"><span>도전과 혁신으로 똘똘 뭉친 TEAM NAVER 인사이드 스토리<br>TEAM NAVER 에피소드로 만나보세요.</span></p>
				</div>
        </li>
        <li class="orbit-slide">
			<img src="https://www.navercorp.com/img/ko/main/img_main_slide11.jpg">
			<div class="slide_text_box">
				<p class="slide_title"><strong>네이버의 뛰어난 동료들과 함께 성장하는 법,<br>지금 바로 NAVERSHIP에 탑승하세요!</strong></p>
				<p class="slide_text"><span>서로 다른 사람들이 모여 네이버의 추진력을 만듭니다.</span></p>
			</div>
        </li>
	</ul>
</div>
<div id="content">
<h1>Hello world!</h1>

<P>${serverTime}.</P>
</div>
<article class="grid-container">
	<div class="grid-x grid-margin-x">
		<div class="medium-5 large-3 cell">
			<div class="callout secondary">
			<c:if test="${!empty msg }">
			<script>
				alert("로그인 실패");
				document.loginForm.userid.focus();
			</script>
			</c:if>
			<c:if test="${empty sid }">
			<form action="${path1 }/member/loginCheck.do" method="post" name="loginForm">
				<div class="grid-x">
					<div class="small-12 cell">
						<label>ID
							<input type="text" name="userid" id="userid" size="100" class="single100" placeholder="아이디 입력" required>
							<!--  pattern="^[a-z0-9]+$"  -->
			  			</label>
					</div>
					<div class="small-12 cell">
						<label>PW
							<input type="password" name="userpw" id="userpw"  class="single100" placeholder="비밀번호 입력" required>
							<!--  pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"  -->
						</label>
						<button type="submit" class="button">로그인</button>
						<a href="${path1 }/member/agree.do" class="button" style="float:right;">회원가입</a>
					</div>
				</div>
			</form>
			<script>
				function loginFaiure() {
				alert("로그인 실패");
				}
			</script>
			</c:if>
			<c:if test="${not empty sid }">
			<div class="grid-x" style="height:200px">
				<div class="small-12 cell">
					<label><strong>${sid }</strong>님</label>
				</div>
				<div class="small-12 cell">
					<label>&nbsp;&nbsp;</label>
				</div>
				<div class="small-12 cell">
					<label>
						<c:set var="now" value="<%=new java.util.Date() %>" />
						<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일" type="date"/>
					</label>
				</div>
				<div class="small-12 cell">
					<label><fmt:formatDate value="${now }" pattern="a h:mm" type="date"/></label>
				</div>
				<div class="small-12 cell">
					<label><span style="display:none">${serverTime }</span></label>
				</div>
				<div class="small-12 cell">
					<a href="${path1 }/member/logout.do" class="button">로그아웃</a>
					<a href="${path1 }/member/info.do" class="button" style="float:right;">회원정보</a>
				</div>
			</div>
			</c:if>
			</div>
		</div>
	</div>
</article>
<footer id="footer">
	<jsp:include page="include/footer.jsp"></jsp:include>
</footer>
</body>
</html>