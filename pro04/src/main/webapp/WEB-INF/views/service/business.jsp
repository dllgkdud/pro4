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
<title>가치실현 - 기업윤리규범</title>
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
			<li><a href="#">가치실현</a></li>
			<li><a href="#">정책</a></li>
			<li>
				<span class="show-for-sr">Current: </span> 기업윤리규범
			</li>
		</ul>
	</nav>
</div>
<div class="row column text-center">
	<div class="info">
		<h2><strong>기업윤리규범</strong></h2><br>
		<h5>네이버는 기업윤리 실천을 통해 우리와 함께하는 다양한 관계에서의 가치를 제고하며,<br>투명하고 신뢰받는 기업으로서의 명성을 추구합니다.</h5>
	</div>
</div>
<div class="grid-container full">
	<img src="/resources/upload/images/img_value_spot1.jpg" style="width: 100vw;" alt="기업윤리규범 이미지">
</div>
<div class="grid-x align-center info">
	<dl class="cell medium-8">	
		<h4 class="large-3 columns">기업윤리규범</h4>
		<dd class="large-9 columns">
			<table>
				<tbody>
					<tr class="content_box_button">
						<th></th>
						<td colspan="3">
							<a href="/resources/upload/corp/Anti_Corruption_Policy_KOR.pdf" class="btn_link down" target="_blank">
								<span class="btn_text">부패방지 경영 방침</span>
							</a>
							<a href="/resources/upload/corp/kNockIntegrityCode_KOR.pdf" class="btn_link down" target="_blank">
								<span class="btn_text">인테그리티 코드</span>
							</a>
							<a href="/resources/upload/corp/Compliance_Policy_KOR.pdf" class="btn_link down" target="_blank">
								<span class="btn_text">공정거래 자율준수편람</span>
							</a>
						</td>
					</tr>
					<tr>
						<th><img src="/resources/upload/images/img_value_employees.png" alt="기업윤리규범 임직원 이미지"></th>
						<td>임직원<br>다양성을 인정하고 서로 존중하며, 임직원의 능력이 최대한 발휘되도록 책임을 다하는 기업문화와 최상의 근무 환경을 조성합니다. 모든 임직원을 능력과 성과에 따라 합리적으로 대우하며, 차별 없이 평등하게 일할 수 있는 기회를 제공합니다.</td>
					</tr>
					<tr>
						<th><img src="/resources/upload/images/img_value_partner.png" alt="기업윤리규범 파트너 이미지"></th>
						<td>파트너ㆍ경쟁사<br>파트너사와의 모든 거래에 대하여 합리적인 거래조건을 보장하며 장기적 관점에서 상생적인 인터넷 생태계를 함께 조성해 나갑니다. 경쟁사와는 상호 존중하며 공정한 거래질서를 유지하고, 선의의 경쟁을 통해 고객의 후생을 높일 수 있는 방향으로 함께 발전해 나갑니다.</td>
					</tr>
					<tr>
						<th><img src="/resources/upload/images/img_value_social.png" alt="기업윤리규범 사회 이미지"></th>
						<td>사회<br>기업시민으로서 지역사회의 법규 및 사회적 가치관을 존중하며 다양한 사회공헌 활동 등을 통해 사회적 책임을 다합니다. 회사의 이익과 사회적 가치가 상충될 때는 사회적 가치를 우선적으로 고려합니다.</td>
					</tr>
					<tr>
						<th><img src="/resources/upload/images/img_value_consumer.png" alt="기업윤리규범 고객 이미지"></th>
						<td>고객<br>고객이 원하는 가치를 경영활동의 최우선 판단 기준으로 여기며, 고객에게 도움이 되는 가치를 끊임없이 만듭니다. 고객에게 정직함으로써 신뢰를 받을 수 있도록 노력하고 고객의 의견에 항상 귀 기울입니다.</td>
					</tr>
					<tr>
						<th><img src="/resources/upload/images/img_value_stock.png" alt="기업윤리규범 주주 이미지"></th>
						<td>주주<br>건실한 경영활동을 통해 정당하고 안정적인 이익을 실현함으로써 주주의 가치를 만듭니다. 주주와의 신뢰를 유지하기 위하여 투명성을 제고하고 각종 경영정보를 제 때에 제공합니다.</td>
					</tr>
				</tbody>
			</table>
		</dd>
	</dl>
	<dl class="cell medium-8">
		<h4 class="large-3 columns">CEO의 공정거래 자율준수 및 윤리경영 약속</h4>
		<dd class="large-9 columns">
			<p class="content-text">
			네이버는 다양한 이해관계자들과 함께 성장하기 위해 기업윤리를 철저히 실천해 나가고 있습니다.<br><br>
			네이버와 파트너사의 창의성 도모, 소비자 보호, 사회전반의 균형 있는 발전을 위하여 공정거래 관련 법규를 준수하며, 이를 위해 자체적인 공정거래 자율준수 프로그램(Compliance Program)을 운영하고 있습니다. 
			이를 통하여 불공정행위 예방, 파트너와 상생, 그리고 공정하고 자유로운 경쟁 문화가 정착될 수 있도록 최선을 다하고 있습니다.<br><br>
			또한 사업 운영상 잠재적인 위험요인을 최소화하고 윤리경영 문화를 정착시키기 위하여 Integrity Code, 부패방지 경영시스템을 마련하는 등 준법경영을 위하여 Compliance 체계 구축에 앞장 서고 있습니다.<br><br>
			앞으로도 임직원 한 명 한 명이 각자의 자리에서 투명하고 떳떳하게 일하고, 네이버와 일하는 다양한 이해관계자들과 함께 상생하는 건강한 파트너십을 이어갈 수 있도록 지속적으로 노력하겠습니다.
			</p>
		</dd>
	</dl>
</div>

<footer id="footer">
	<jsp:include page="../include/footer.jsp"></jsp:include>
</footer>
</body>
</html>