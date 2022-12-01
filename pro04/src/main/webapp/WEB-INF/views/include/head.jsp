<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%-- <c:set var="path1" value="<% request.getContextPath() %>" /> --%>

<!-- <script src="include/jquery.js"></script>
<script src="include/foundation.js"></script>
<link href="inculde/foundation.css" rel="stylesheet" /> -->
<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/foundation.min.js"></script>
<link href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-float.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-prototype.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-rtl.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation.min.css" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordion.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordionMenu.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdown.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdownMenu.min.js"></script>
<script type="text/javascript" src="https://www.youtube.com/iframe_api"></script> -->

<script src="https://code.jquery.com/jquery-latest.js"></script>
<link rel="stylesheet" href="https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-prototype.min.css">
<link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>
<link rel="shortcut icon" type="image/x-icon" href="https://www.navercorp.com/img/ko/favicon.ico">

<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/js/foundation.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.js"></script>
<script>
  $(document).ready(function(){
	  $(document).foundation();
  });
</script>
<style>
ul { 
	list-style:none; 
}
.menu>li>a {
    display: block;
    line-height: 20px;
}
.menu-text .logo {
	font-size: 26px;
	font-weight: 800;
	color: #4bd16a;
}
.top-bar, .top-bar ul {
	background-color: #fff;
}
.has-submenu {
	padding-top: 10px;
}
.has-submenu a {
	color: #222;
	font-weight: 600;
}
.is-submenu-item {
	clear: both;
	background-color: #4bd16a;
}
.is-submenu-item:hover {
	background-color: #1ec545;
}
.is-submenu-item a {
	color: #fff;
	font-size: 14px;
}
.dropdown {
	width:100%;
}
.dropdown.menu>li.is-dropdown-submenu-parent>a::after {
	border-color: #1ec545 transparent transparent;
}
.callout.secondary {
	border:none;
    background-color:#f8f9fa;
    color: #878890;
}
.large-4.columns a {
	color: #878890;
}
.orbit {
	display: block;
	box-sizing: inherit;
}
.orbit-container {
	height: 100%;
}
.orbit-slide {
	box-sizing: inherit;
	positon: relative;
}
.orbit-slide img {
	width: 100vw;
}
.slide_text_box {
	display: block;
	width: 100%;
}
.slide_title {
	position: absolute;
	top: 50%;
	left: 10%;
	font-size: 40px;
	letter-spacing: -1px;
	color: #fff;
}
.slide_title:after {
	content: "";
	clear: both;
	display: block;
}
.slide_text {
	position: absolute;
	top: 75%;
	left: 10%;
	font-size: 16px;
	letter-spacing: -1px;
	color: #fff;
}
.slide_text:after {
	content: "";
	clear: both;
	display: block;
}
.form-idCk p {
	text-align: left;
	margin-bottom: 0;
	font-size: 14px;
}
div.row h2 {
	padding-top: 20px;
}
</style>