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
<title>회원상세</title>
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
				<span class="show-for-sr">Current: </span>
				<c:if test="${sid=='admin' }">회원정보</c:if>
				<c:if test="${sid!='admin' }">마이페이지</c:if>
			</li>
		</ul>
	</nav>
</div>
<div class="content">
	<div class="row column text-center">
		<div class="container">
		<c:if test="${sid=='admin' }">
			<h2 class="con_tit">회원정보</h2>
		</c:if>
		<c:if test="${sid!='admin' }">
			<h2 class="con_tit">마이페이지</h2>
		</c:if>
		<form action="${path1 }/member/update.do" method="post" onsubmit="return updateCheck(this)">
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<div class="form-row">
							<input type="text" name="userid" id="userid" placeholder="아이디" value="${member.userid }" maxlength="50" readonly required />
						</div>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="userpw" id="userpw" placeholder="비밀번호" value="${member.userpw }" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required />
						<p class="ps">(최소 8자리에서 최대 16자리까지, 숫자, 영문 대소문자, 특수문자가 각 1자 이상 포함되어야 한다.)</p>
					</td>
				</tr>
 				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="pw2" id="pw2" placeholder="비밀번호 확인" value="${member.userpw }" required /></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="username" id="username" placeholder="이름" value="${member.username }" maxlength="50" required /></td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="text" name="birth" id="birth" placeholder="19000124" value="${member.birth }" maxlength="8" required /></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email" id="email" placeholder="email@naver.com" value="${member.email }" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required /></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="tel" id="tel" placeholder="010-XXXX-XXXX" maxlength="13" value="${member.tel }" pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}" required /></td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						<input type="text" name="addr1" id="addr1" placeholder="경기도 성남시 분당구 정자일로 95" value="${member.addr1 }" required />
						<input type="text" name="addr2" id="addr2" placeholder="네이버 1784" value="${member.addr2 }" required />
						<input type="text" name="postcode" id="postcode" style="width:200px;float:left;" placeholder="13561" value="${member.postcode }" required />
						<button id="button" onclick="findAddr()" class="button">우편번호 검색</button>
					</td>
				</tr>
			</tbody>
			<button class="button-group">
				<a href="${path1 }/member/list.do" class="button">목록</a>
				<input type="submit" class="submit button" value="수정" />
				<%-- <c:if test="${sid=='admin' }">
					<a href="${path1 }/member/delete.do?id=${member.id }" class="button">회원 강퇴</a>
				</c:if>
				<c:if test="${sid!='admin' }">
					<a href="${path1 }/member/delete.do?id=${sid }" class="button">회원 탈퇴</a>
				</c:if> --%>
			</button>
		</form>
		<script>
			function updateCheck(f){
				if(f.userpw.value!=f.pw2.value){
					alert("비밀번호가 일치하지 않습니다.");
					f.userpw.focus();
					return false;
				}
			}
		</script>
		<script>
			function findAddr() {
				new daum.Postcode({
					oncomplete: function(data) {
						console.log(data);
						var roadAddr = data.roadAddress;
						var jibunAddr = data.jibunAddress;
						document.getElementById("postcode").value = data.zonecode;
						if(roadAddr !== '') {
							document.getElementById("addr1").value = roadAddr;				
						} else if(jibunAddr !== ''){
							document.getElementById("addr1").value = jibunAddr;
						}
						document.getElementById("addr2").focus();
					}
				}).open();
			}
		</script>
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		</div>
	</div>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>