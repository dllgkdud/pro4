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
<title>로그인</title>
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
				<span class="show-for-sr">Current: </span> 로그인
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>로그인</h2>
	<form action="${path1 }/member/logIn.do" method="post">
		<table>
			<tbody>
				<tr>
					<th>아이디</th>
					<td>
						<div class="form-row">
							<input type="text" name="userid" id="userid" placeholder="아이디" maxlength="50" required />
						</div>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="userpw" id="userpw" placeholder="비밀번호" required /></td>
				</tr>
			</tbody>
		</table>
		<button class="button-group">
			<a href="${path1 }/member/list.do" class="button">목록</a>
			<input type="submit" class="submit button" value="로그인" />
		</button>
	</form>
</div>
<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>