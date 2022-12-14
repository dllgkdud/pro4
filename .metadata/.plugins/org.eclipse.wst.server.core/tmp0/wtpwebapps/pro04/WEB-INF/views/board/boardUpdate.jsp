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
<title>공지사항</title>
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
			<li><a href="#">서비스</a></li>
			<li><a href="#">공지사항</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 공지사항수정
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>공지사항수정</h2>
	<hr>
	<form action="${path1 }/board/update.do" method="post">
		<table>
			<tbody>
				<tr>
					<th>제목</th>
					<td>
						<input type="hidden" name="seq" id="seq" value="${dto.seq }" >
						<input type="text" name="title" id="title" placeholder="제목을 입력하십시오." maxlength="300" value="${dto.title }" required />
					</td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea cols="100" rows="10" name="content" id="content" placeholder="내용을 입력하십시오." style="resize: none;" maxlength="900" required>${dto.content }</textarea></td>
				</tr>
			</tbody>
		</table>
		<button class="button-group">
			<a href="${path1 }/board/list.do" class="button">목록</a>
			<input type="submit" class="submit button" value="수정" />
		</button>
	</form>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>