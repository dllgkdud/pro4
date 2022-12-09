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
	<title>네이버 - CONTACT</title>
	<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/v3.js"></script>
	<script type="text/javascript" src="http://s1.daumcdn.net/svc/original/U03/cssjs/jquery/jquery-1.11.0.js"></script>	
	<script type="text/javascript" src="http://s1.daumcdn.net/svc/original/U0301/cssjs/JSON-js/fc535e9cc8/json2.min.js"></script>
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
			<li><a href="#">네이버</a></li>
			<li>
				<span class="show-for-sr">Current: </span> CONTACT
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>CONTACT</strong></h2><br>
	</div>
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">
		<h4 class="large-3 columns">네이버 본사</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			ADDRESS<br>경기도 성남시 분당구 정자일로 95 네이버 1784 우)13561<br>
			NAVER 1784, 95 Jeongjail-ro, Bundang-gu, Seongnam-si, Gyeonggi-do, Republic of Korea<br><br>TEL 1588-3830</p>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<h4 class="large-3 columns">글로벌 계열사</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			NAVER BAND Inc.<br>5750 Wilshire Blvd. Ste 640, Los Angeles, CA 90036, USA<br><br>
			NAVER FRANCE<br>2ème étage, 89 Rue Réaumur 75002 Paris, France<br><br>
			NAVER J.Hub Corporation<br>BASECAMP TOKYO, 2-10-44, Kamiosaki, Shinagawa Ku, Tokyo, Japan<br><br>
			NAVER LABS EUROPE<br>6-8 chemin de Maupertuis 38240 Meylan, France<br><br>
			NAVER VIETNAM<br>4th Floor, Tower B, Viettel Building, 285 Cach Mang Thang Tam, Dist 10, HCMC, Vietnam</p>
		</dd>
	</dl>
</div>
<div class="grid-container full">
	<!-- <img src="https://www.navercorp.com/img/ko/naver/img_map.png" style="width: 100vw;" alt="지도 이미지"> -->
	<div style="clear:both; margin-bottom:20px; padding-bottom:20px; ">
		<div id="map" style="margin-top:50px; height:600px; background:white; "></div>
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<!-- https://developers.kakao.com/ 회원가입 후 -> 내 애플리케이션 -> 애플리케이션 추가 -> 추가된 해당 앱을 클릭하면 발급받은  API키를 확인할 수 있음  -->
		<!-- * 카카오맵 - 지도퍼가기 -->		
		<script type="text/javascript" src="http://dapi.kakao.com/v2/maps/sdk.js?appkey=발급받은API키&​libraries=services"></script>
		<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		    mapOption = { //128.433182, 34.8544227
		        center: new kakao.maps.LatLng(37.3588754, 127.1052332), // 지도의 중심좌표
		        level: 5 // 지도의 확대 레벨
		    };  
		
		// 지도를 생성합니다    
		var map = new kakao.maps.Map(mapContainer, mapOption); 
		
		// 주소-좌표 변환 객체를 생성합니다
		var geocoder = new kakao.maps.services.Geocoder();
		
		// 주소로 좌표를 검색합니다
		geocoder.addressSearch($("#addr").val(), function(result, status) {
		
		    // 정상적으로 검색이 완료됐으면 
		     if (status === kakao.maps.services.Status.OK) {
		
		        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
		        // 결과값으로 받은 위치를 마커로 표시합니다
		        var marker = new kakao.maps.Marker({
		            map: map,
		            position: coords
		        });
				
		        // 인포윈도우로 장소에 대한 설명을 표시합니다
		        var infowindow = new kakao.maps.InfoWindow({
		            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+$('#place').val()+'</div>'
		        });
		        infowindow.open(map, marker);
		
		        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
		        map.setCenter(coords);
		    } 
		});    
		</script>
	</div>
	<div title="" style="position: absolute; overflow: hidden; box-sizing: content-box !important; cursor: inherit; 
	left: 1040px; top: 1400px; width: 22px; height: 33px; z-index: 50">
			<img draggable="false" src="https://ssl.pstatic.net/static/maps/mantle/1x/marker-default.png" alt="">
	</div>
</div>
<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>