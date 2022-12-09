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
ul { list-style:none; }
div.row h2 { padding-top: 20px; }

.menu>li>a { display: block; line-height: 20px; }
.menu-text .logo { font-size: 26px; font-weight: 800; color: #4bd16a; }
.top-bar, .top-bar ul { background-color: #fff; }
.has-submenu { padding-top: 10px; padding-left: 50px; }
.has-submenu a { color: #222; font-weight: 600; }
.is-submenu-item { clear: both; background-color: #4bd16a; }
.is-submenu-item:hover { background-color: #1ec545; text-decoration: underline; }
.is-submenu-item a { color: #fff; font-size: 14px; }
.dropdown { width:100%; }
.dropdown.menu>li.is-dropdown-submenu-parent>a::after { border-color: #1ec545 transparent transparent; }
.large-7.columns a { color: #878890; }

.breadcrumbs { margin-left: 40px; }
.breadcrumbs li { font-size: 14px; font-weight: 600; letter-spacing: -1px; }
.breadcrumbs li a { color: #878890; }
.breadcrumbs li:not(:last-child)::after { position: relative; margin: 0 0.75rem; opacity: 1; 
content: ">"; color: #aaa; }

.orbit { display: block; box-sizing: inherit; }
.orbit-container { height: 100%; }
.orbit-slide { box-sizing: inherit; position: relative; }
.orbit-slide img { width: 100vw; }
.slide_text_box { display: block; width: 100%; }
.slide_title { position: absolute; top: 50%; left: 10%; font-size: 40px; 
letter-spacing: -1px; color: #fff; }
.slide_title:after { content: ""; clear: both; display: block; }
.slide_text { position: absolute; top: 75%; left: 10%; font-size: 16px; 
letter-spacing: -1px; color: #fff; }
.slide_text:after { content: ""; clear: both; display: block; }

.callout.secondary { border: none; background-color: #f8f9fa; color: #878890; }
.callout { margin-top: 50px; border: none; border-right: 1px solid #eee; }
.callout:first-child { font-size: 14px; font-weight: 600; }
.large-7 .logo { padding-bottom: 7px; padding-right: 10px; }
.lead { display: block; text-overflow: ellipsis; overflow: hidden; white-space: nowrap; }
.subheader { text-overflow: ellipsis; overflow: hidden; white-space: nowrap; }
.cell-id { font-size: 20px; }

.agree { width: 1000px; white-space:pre-wrap; margin: 10px auto; padding: 24px; border:1px solid #eee; 
height:600px; overflow-y:auto; }
.form-check { text-align: left; padding-left: 100px; }

.form-idCk p { text-align: left; margin-bottom: 0; font-size: 14px; }
.container form p { text-align: left; font-size: 12px; }

.info { margin: 70px auto; }
.info h2, .info h5 { letter-spacing: -1px; }
.info a { width: 50%; }
.info dl h4 { font-weight: 600; }
.info .medium-8 { padding-bottom: 3rem; }
.large-9 table { border: none; border-top: 2px solid #222; }
.large-9 th{ text-align: left; }
#his-sub-checked strong { color: #333; font-weight: 600; border-bottom: 3px solid #00c73c; }
.info .his-sub-title { color: #bac2cd; cursor: pointer; }
.info .his-sub-title strong:hover { color: #333; font-weight: 600; border-bottom: 3px solid #00c73c; }
#his-table table { border-top: none; }
#his-table th, #his-table td { background-color: #fff; }
#his-year { font-size: 22px; }
#his-month { width: 100px; text-align: right; }

#val-content { margin: 60px 0; padding-right: 40px; color: #606167; font-size: 16px; line-height: 1.8; letter-spacing: -1px; }
.val-image { position: relative; width: 100%; }
.gif { position: absolute; top: 400px; left:0; }
</style>