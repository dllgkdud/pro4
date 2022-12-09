<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContext.request.contextPath }" />

<nav class="top-bar">
	<div class="top-bar-left" id="gnb">
		<ul class="dropdown menu" data-dropdown-menu>
			<li class="menu-text"><a href="/" class="logo">NAVER</a></li>
			<li class="has-submenu">
				<a href="#">네이버</a>
				<ul class="submenu menu vertical" data-submenu>
					<li><a href="${path1 }/naver/profile.do">네이버 소개</a></li>
					<li><a href="${path1 }/naver/history1.do">주요 연혁</a></li>
					<li><a href="${path1 }/naver/contact.do">CONTACT</a></li>
				</ul>
			</li>
			<li class="has-submenu">
				<a href="#">가치실현</a>
				<ul class="submenu menu vertical" data-submenu>
					<li><a href="${path1 }/service/value.do">원칙</a></li>
					<li><a href="#">정책</a></li>
					<li><a href="#">임팩트</a></li>
				</ul>
			</li>
			<li class="has-submenu"><a href="#">홍보</a></li>
			<li class="has-submenu">
				<a href="#">서비스</a>
				<ul class="submenu menu vertical" data-submenu>
					<li><a href="${path1 }/board/list.do">공지사항</a></li>
					<li><a href="${path1 }/data/list.do">자료실</a></li>
					<li><a href="#">질문 및 답변</a></li>
				</ul>
			</li>
			<li class="has-submenu"><a href="https://recruit.navercorp.com/">채용</a></li>
		</ul>
	</div>
            
     <%-- <div class="top-bar-right">
       <ul class="menu">
	        <c:if test="${empty sid }">
			<li><a href="${path1 }/member/login.do">로그인</a></li>
			<li><a href="${path1 }/member/insert.do">회원가입</a></li>
	        </c:if>
	        <c:if test="${not empty sid }">
			<li><a href="#">로그아웃</a></li>
			<li><a href="${path1 }/member/info.do">회원정보</a></li>
	        </c:if>
	        <c:if test='${sid eq "admin"}'>
			<li><a href="#">관리자 페이지</a></li>
	        </c:if>  
		</ul>
	</div> --%>
</nav>