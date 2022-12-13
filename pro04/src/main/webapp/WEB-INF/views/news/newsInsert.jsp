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
<title>홍보 - 보도자료</title>
<jsp:include page="../include/head.jsp"></jsp:include>
<script type="text/javascript" src="${path1 }/resources/ckeditor/ckeditor.js"></script>
</head>
<body>
<header id="header">
	<jsp:include page="../include/header.jsp"></jsp:include>
</header>
<div class="grid-x cell">
	<nav aria-label="You are here:" role="navigation">
		<ul class="breadcrumbs">
			<li><a href="#">홈</a></li>
			<li><a href="#">홍보</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 보도자료
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<h2>보도자료작성</h2>
	<hr>
	<form action="${path1 }/news/insert.do" method="post">
		<table>
			<tbody>
				<tr>
					<th>제목</th>
					<td><input type="text" name="ntitle" id="ntitle" placeholder="제목을 입력하십시오." maxlength="300" required /></td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea cols="100" rows="10" name="ncontent" id="ncontent" placeholder="내용을 입력하십시오." style="resize: none;" maxlength="2900" required></textarea>
						<script>
							CKEDITOR.replace('ncontent', {filebrowserUploadUrl:'/news/imgUpload.do'});
						</script>
					</td>
				</tr>
			</tbody>
		</table>
		<button class="button-group">
			<a href="${path1 }/news/list.do" class="button">목록</a>
			<input type="submit" class="submit button" value="등록" />
		</button>
	</form>
</div>
<footer id="footer" class="footer-nav row expanded collapse">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>