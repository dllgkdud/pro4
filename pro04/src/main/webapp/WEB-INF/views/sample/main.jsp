<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>스프링 데이터 전송</title>
</head>
<body>
	<h1>Get 방식</h1>
	<h2>Get 방식1</h2>
	<div>
		<a href="./get1?id=admin&pw=1234">Get1.jsp</a>
	</div>
	<hr>
	<h2>Get 방식2</h2>
	<div>
		<a href="./get2?id=admin&pw=1234">Get2.jsp</a>
	</div>
	<hr>
	<h2>Get 방식3</h2>
	<div>
		<a href="./get3?id=admin&pw=1234">Get3.jsp</a>
	</div>
	<hr>
	<h2>Get 방식4</h2>
	<div>
		<a href="./get4?id=admin&pw=1234">Get4.jsp</a>
	</div>
	<hr>
	<h2>Get 방식5</h2>
	<div>
		<a href="./get5?id=admin&pw=1234">Get5.jsp</a>
	</div>
	<hr>
	<h2>Get 방식6</h2>
	<div>
		<a href="./get6?id=admin&pw=1234">Get6.jsp</a>
	</div>
	<hr>
	<h2>Get 방식7</h2>
	<div>
		<a href="./get7?id=admin&pw=1234">Get7.jsp</a>
	</div>
	<br>
	<hr>
	<h2>Post 방식1</h2>
	<div>
		<form name="post1" action="./post1" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post1"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식2</h2>
	<div>
		<form name="post2" action="./post2" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post2"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식3</h2>
	<div>
		<form name="post3" action="./post3" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post3"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식4</h2>
	<div>
		<form name="post4" action="./post4" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post4"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식5</h2>
	<div>
		<form name="post5" action="./post5" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post5"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식6</h2>
	<div>
		<form name="post6" action="./post6" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post6"/>
		</form>
	</div>
	<hr>
	<h2>Post 방식7</h2>
	<div>
		<form name="post7" action="./post7" method="post">
		id : <input type="text" name="id" id="id" required /><br>
		pw : <input type="password" name="pw" id="pw" required /><br>
		<input type="submit" value="post7"/>
		</form>
	</div>
</body>
</html>