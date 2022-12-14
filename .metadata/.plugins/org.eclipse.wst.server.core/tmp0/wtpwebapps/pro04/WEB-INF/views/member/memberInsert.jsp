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
<title>회원가입</title>
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
			<li>
				<span class="show-for-sr">Current: </span> 회원가입
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>회원가입양식</h2>
	<form action="${path1 }/member/insert.do" method="post" onsubmit="return joinCheck(this)">
		<table>
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<div class="form-row">
							<input type="text" name="userid" id="userid" style="width:200px;float:left;" placeholder="아이디" maxlength="50" required />
							<input type="button" id="idCkBtn" onclick="idCheck()" class="button" value="아이디 중복 체크">
							<input type="hidden" name="idck" id="idck" value="no">
						</div>
						<div class="form-idCk">
							<c:if test="${empty aid }">
								<p id="msg">아이디 중복 체크를 진행하십시오.</p>
							</c:if>
							<c:if test="${not empty aid }">
								<p id="msg">한 번 더 중복체크를 진행하십시오.</p>
							</c:if>
						</div>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="userpw" id="userpw" placeholder="비밀번호" required /></td>
				</tr>
 				<tr>
					<th>비밀번호 확인</th>
					<td><input type="password" name="pw2" id="pw2" placeholder="비밀번호 확인" required /></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input type="text" name="username" id="username" placeholder="이름" maxlength="50" required /></td>
				</tr>
				<tr>
					<th>생년월일</th>
					<td><input type="text" name="birth" id="birth" placeholder="19000124" maxlength="8" required /></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input type="text" name="email" id="email" placeholder="email@naver.com" required /></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="tel" id="tel" placeholder="010-XXXX-XXXX" maxlength="13" required /></td>
				</tr>
				<tr>
					<th>주소</th>
					<td>
						<input type="text" name="addr1" id="addr1" placeholder="경기도 성남시 분당구 정자일로 95" required />
						<input type="text" name="addr2" id="addr2" placeholder="네이버 1784" required />
						<input type="text" name="postcode" id="postcode" style="width:200px;float:left;" placeholder="13561" required />
						<button id="button" onclick="findAddr()" class="button">우편번호 검색</button>
					</td>
				</tr>
			</tbody>
		</table>
		<button class="button-group">
			<a href="${path1 }/" class="button">취소</a>
			<input type="submit" class="submit button" value="등록" />
		</button>
	</form>
	<script>
		$(document).ready(function(){
			$("#userid").keyup(function(){
				$("#idck").val("no");
				if($(this).val()!=""){
					$("#msg").html("아이디 입력중입니다...");
				} else {
					$("#msg").html("아이디 중복 체크를 진행하십시오.");
				}
			});
		});
	</script>
	<script>
		function idCheck(){
			if($("#userid").val()==""){
				alert("아이디를 입력해 주십시오.");
				$("#userid").focus();
				return;
			} 
			var params = {	userid : $("#userid").val()	}	//전송되어질 데이터를 객체로 묶음
			$.ajax({
				url:"${path1 }/member/check.do",	//아이디가 전송되어질 곳
				type:"post",						//전송방식
				dataType:"json",					//데이터 반환 방식
				data:params,						//전송방식이 post인 경우 객체로 묶어서 전송
				success:function(result){
					console.log(result.result);
					var idChk = result.result;		//boolean을 적용해 true/false를 받음
					if(idChk==false){				//사용할 수 없는 아이디
						$("#idck").val("no");
						$("#msg").html("<strong style='color:red'>이미 사용 중인 아이디 입니다.</strong>");
						$("#userid").focus();
					} else if(idChk==true){			//사용 가능한 아이디
						$("#idck").val("yes");
						$("#msg").html("<strong style='color:blue'>사용 가능한 아이디 입니다.</strong>");
					} else if(idck==""){
						$("#msg").html("<strong>아이디가 확인되지 않았습니다.</strong>");
					}
				}
			});
		}
		function joinCheck(f){
			if(f.userpw.value!=f.pw2.value){
				alert("비밀번호가 일치하지 않습니다.");
				f.userpw.focus();
				return false;
			}
			if(f.idck.value!="yes"){
				alert("아이디 중복 체크를 진행하십시오.");
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
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>