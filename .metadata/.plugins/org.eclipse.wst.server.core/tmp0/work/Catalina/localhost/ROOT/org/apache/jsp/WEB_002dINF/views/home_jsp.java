/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-12-06 00:27:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.net.InetAddress;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/lhy/pro04/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro04/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1668994785251L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro04/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro04/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro04/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/pro04/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.InetAddress");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<title>NAVER Corporation</title>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/head.jsp", out, false);
      out.write("\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"orbit\" role=\"region\" aria-label=\"Favorite Space Pictures\" data-orbit>\r\n");
      out.write("	<ul class=\"orbit-container\">\r\n");
      out.write("		<button class=\"orbit-previous\" aria-label=\"previous\"><span class=\"show-for-sr\">Previous Slide</span>&#9664;</button>\r\n");
      out.write("		<button class=\"orbit-next\" aria-label=\"next\"><span class=\"show-for-sr\">Next Slide</span>&#9654;</button>\r\n");
      out.write("		<li class=\"orbit-slide is-active\">\r\n");
      out.write("			<img src=\"https://www.navercorp.com/img/ko/main/img_main_slide12.jpg\">\r\n");
      out.write("			<div class=\"slide_text_box\">\r\n");
      out.write("				<p class=\"slide_title\"><strong>건강한 지구를 위해<br>네이버가 Green 계획을 소개합니다.</strong></p>\r\n");
      out.write("				<p class=\"slide_text\"><span>디지털 친환경부터 지구를 위한 가장 쉽고 착한 소비까지<br>네이버의 기술력과 파트너와의 공동 노력으로 친환경 생태계를 확대해 나가고 있습니다.</span></p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li class=\"orbit-slide\">\r\n");
      out.write("			<img src=\"https://www.navercorp.com/img/ko/main/img_main_slide9.jpg\">\r\n");
      out.write("			<div class=\"slide_text_box\">\r\n");
      out.write("				<p class=\"slide_title\"><strong>네이버 1784에서<br>우리는 혁신을 현실로 만들고 있습니다.</strong></p>\r\n");
      out.write("				<p class=\"slide_text\"><span>네이버의 다양한 기술들로 실험과 도전, 융합을 통해<br>새로운 기회와 가능성을 만들어 갑니다.</span></p>\r\n");
      out.write("			</div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"orbit-slide\">\r\n");
      out.write("        	<img src=\"https://www.navercorp.com/img/ko/main/img_main_slide10.jpg\">\r\n");
      out.write("        	<div class=\"slide_text_box\">\r\n");
      out.write("					<p class=\"slide_title\"><strong>N개의 엔진이, 하나의 팀처럼!<br>네이버의 다양한 서비스와 비즈니스를 만듭니다</strong></p>\r\n");
      out.write("					<p class=\"slide_text\"><span>도전과 혁신으로 똘똘 뭉친 TEAM NAVER 인사이드 스토리<br>TEAM NAVER 에피소드로 만나보세요.</span></p>\r\n");
      out.write("				</div>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"orbit-slide\">\r\n");
      out.write("			<img src=\"https://www.navercorp.com/img/ko/main/img_main_slide11.jpg\">\r\n");
      out.write("			<div class=\"slide_text_box\">\r\n");
      out.write("				<p class=\"slide_title\"><strong>네이버의 뛰어난 동료들과 함께 성장하는 법,<br>지금 바로 NAVERSHIP에 탑승하세요!</strong></p>\r\n");
      out.write("				<p class=\"slide_text\"><span>서로 다른 사람들이 모여 네이버의 추진력을 만듭니다.</span></p>\r\n");
      out.write("			</div>\r\n");
      out.write("        </li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<article class=\"grid-container\">\r\n");
      out.write("	<div class=\"grid-x grid-margin-x\">\r\n");
      out.write("		<div class=\"medium-5 large-3 cell\">\r\n");
      out.write("			<div class=\"cell\">\r\n");
      out.write("				<div class=\"callout\">\r\n");
      out.write("					<p>CAREER</p>\r\n");
      out.write("					<p class=\"lead\">네이버페이 앱, 구글플레이 '2022 올해를 빛낸 인기 앱' 선정… 3개 부문 수상</p>\r\n");
      out.write("					<p class=\"subheader\">네이버페이 앱, 구글플레이 '2022 올해를 빛낸 인기 앱' 선정… 3개 부문 수상\r\n");
      out.write("					- 구글플레이 ‘2022 올해를 빛낸 인기 앱∙일상생활 앱∙웨어 앱 등 3개 부문 수상\r\n");
      out.write("					- 네이버페이 앱∙워치 앱, 기존 네이버페이 사용자로부터 뜨거운 호응…앱을 통한 현장결제 누적 결제건수 1900만건, 이용도 또한 네이버 앱보다 2배 더 높아</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"medium-5 large-3 cell\">\r\n");
      out.write("			<div class=\"cell\">\r\n");
      out.write("				<div class=\"callout\">\r\n");
      out.write("					<p>NEWS</p>\r\n");
      out.write("					<p class=\"lead\">수 많은 사용자의 목소리에서<br>내 일의 자부심과 무게를 느낍니다.</p>\r\n");
      out.write("					<p class=\"subheader\"><a href=\"https://recruit.navercorp.com\" class=\"summary_link\" target=\"_blank\">네이버에서 일한다는 것</a></p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"medium-5 large-3 cell\">\r\n");
      out.write("			<div class=\"cell\">\r\n");
      out.write("				<div class=\"callout\">\r\n");
      out.write("					<p>STOCK</p>\r\n");
      out.write("					<p class=\"lead\">185,500원</p>\r\n");
      out.write("					<p class=\"subheader\">▼ 2,000<br>KRX 2022.12.02</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("        </div>\r\n");
      out.write("		<div class=\"medium-5 large-3 cell\">\r\n");
      out.write("			<div class=\"callout secondary\">\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("			");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f2_reused = false;
      try {
        _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f2.setParent(null);
        // /WEB-INF/views/home.jsp(120,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
        if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("			<div class=\"grid-x\" style=\"height:200px\">\r\n");
            out.write("				<div class=\"small-12 cell\">\r\n");
            out.write("					<label>\r\n");
            out.write("						<strong class=\"cell-id\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</strong>&nbsp;님\r\n");
            out.write("						");
            if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("					</label>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div class=\"small-12 cell\">\r\n");
            out.write("					<label>&nbsp;&nbsp;</label>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div class=\"small-12 cell\">\r\n");
            out.write("					<label>\r\n");
            out.write("						");
            //  c:set
            org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
            boolean _jspx_th_c_005fset_005f0_reused = false;
            try {
              _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fset_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
              // /WEB-INF/views/home.jsp(135,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fset_005f0.setVar("now");
              // /WEB-INF/views/home.jsp(135,6) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
              _jspx_th_c_005fset_005f0.setValue(new java.util.Date() );
              int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
              if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
              _jspx_th_c_005fset_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
            }
            out.write("\r\n");
            out.write("						");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("					</label>\r\n");
            out.write("					<label>");
            if (_jspx_meth_fmt_005fformatDate_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
              return;
            out.write("</label>\r\n");
            out.write("					<label><span style=\"display:none\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverTime }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span></label>\r\n");
            out.write("				</div>\r\n");
            out.write("				<div class=\"small-12 cell\">\r\n");
            out.write("					");
            if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("				</div>\r\n");
            out.write("			</div>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
        _jspx_th_c_005fif_005f2_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
      }
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"\">\r\n");
      out.write("		<p class=\"lead\"></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"grid-x grid-margin-x small-up-1 medium-up-2 large-up-3\">\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("	        <div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content13.png\" alt=\"N robot\"></p>\r\n");
      out.write("				<p class=\"lead\">N 로봇</p>\r\n");
      out.write("				<p class=\"subheader\">가장 최신의 로봇 기술, 네이버 로봇</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content14.png\" alt=\"Clova Note\"></p>\r\n");
      out.write("				<p class=\"lead\">클로바노트</p>\r\n");
      out.write("				<p class=\"subheader\">눈으로 보며 듣는 음성 기록</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content15.png\" alt=\"Naver Pay\"></p>\r\n");
      out.write("				<p class=\"lead\">네이버 페이 앱</p>\r\n");
      out.write("				<p class=\"subheader\">현장결제, 멤버십적립, 송금까지 한번에</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content4.png\" alt=\"Naver Whale\"></p>\r\n");
      out.write("				<p class=\"lead\">네이버 웨일</p>\r\n");
      out.write("				<p class=\"subheader\">인터넷의 새로운 시작</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content18.png\" alt=\"Naver Works\"></p>\r\n");
      out.write("				<p class=\"lead\">네이버웍스</p>\r\n");
      out.write("				<p class=\"subheader\">네이버웍스는 비즈니스 커뮤니케이션을 넓힙니다.</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content19.png\" alt=\"Naver Cloud\"></p>\r\n");
      out.write("				<p class=\"lead\">네이버클라우드</p>\r\n");
      out.write("				<p class=\"subheader\">모든 비즈니스를 가능하게 하는 네이버클라우드</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content7.png\" alt=\"Naver Webtoon\"></p>\r\n");
      out.write("				<p class=\"lead\">네이버 웹툰</p>\r\n");
      out.write("				<p class=\"subheader\">매일매일 새로운 재미</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content8.png\" alt=\"Project Flower\"></p>\r\n");
      out.write("				<p class=\"lead\">프로젝트 꽃</p>\r\n");
      out.write("				<p class=\"subheader\">가치의 발견과 성장</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"cell\">\r\n");
      out.write("			<div class=\"callout\">\r\n");
      out.write("				<p class=\"pic\"><img src=\"https://www.navercorp.com/img/ko/main/img_main_content17.png\" alt=\"Naver Now\"></p>\r\n");
      out.write("				<p class=\"lead\">NOW</p>\r\n");
      out.write("				<p class=\"subheader\">We Live NOW</p>\r\n");
      out.write("	        </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</article>\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(93,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("			<form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/loginCheck.do\" method=\"post\" name=\"loginForm\">\r\n");
          out.write("				<div class=\"grid-x\">\r\n");
          out.write("					<div class=\"small-12 cell\">\r\n");
          out.write("						<label>ID\r\n");
          out.write("							<input type=\"text\" name=\"userid\" id=\"userid\" size=\"100\" class=\"single100\" placeholder=\"아이디 입력\" required>\r\n");
          out.write("							<!--  pattern=\"^[a-z0-9]+$\"  -->\r\n");
          out.write("			  			</label>\r\n");
          out.write("					</div>\r\n");
          out.write("					<div class=\"small-12 cell\">\r\n");
          out.write("						<label>PW\r\n");
          out.write("							<input type=\"password\" name=\"userpw\" id=\"userpw\"  class=\"single100\" placeholder=\"비밀번호 입력\" required>\r\n");
          out.write("							<!--  pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\"  -->\r\n");
          out.write("						</label>\r\n");
          out.write("						");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("					</div>\r\n");
          out.write("				</div>\r\n");
          out.write("			</form>\r\n");
          out.write("			<script>\r\n");
          out.write("				function loginFaiure() {\r\n");
          out.write("				alert(\"로그인 실패\");\r\n");
          out.write("				}\r\n");
          out.write("			</script>\r\n");
          out.write("			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/views/home.jsp(107,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							<button type=\"submit\" class=\"button\">로그인</button>\r\n");
          out.write("							<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/agree.do\" class=\"button\" style=\"float:right;\">회원가입</a>\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/home.jsp(125,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sid eq \"admin\"}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("				          	<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/list.do\" class=\"button\" style=\"float:right;\">관리자</a>\r\n");
          out.write("				        ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/home.jsp(136,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/home.jsp(136,6) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy년 MM월 dd일");
      // /WEB-INF/views/home.jsp(136,6) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setType("date");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f1_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/home.jsp(138,12) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${now }", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/home.jsp(138,12) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setPattern("a h:mm");
      // /WEB-INF/views/home.jsp(138,12) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f1.setType("date");
      int _jspx_eval_fmt_005fformatDate_005f1 = _jspx_th_fmt_005fformatDate_005f1.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005ftype_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f1);
      _jspx_th_fmt_005fformatDate_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f1, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f4_reused = false;
    try {
      _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
      // /WEB-INF/views/home.jsp(142,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sid }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
      if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("						<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/logout.do\" class=\"button\">로그아웃</a>\r\n");
          out.write("						<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/info.do\" class=\"button\" style=\"float:right;\">회원정보</a>\r\n");
          out.write("        			");
          int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      _jspx_th_c_005fif_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f4, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f4_reused);
    }
    return false;
  }
}
