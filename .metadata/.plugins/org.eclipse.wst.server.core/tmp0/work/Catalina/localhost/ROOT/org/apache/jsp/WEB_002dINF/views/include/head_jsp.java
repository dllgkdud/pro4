/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-11-28 01:38:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<!-- <script src=\"include/jquery.js\"></script>\r\n");
      out.write("<script src=\"include/foundation.js\"></script>\r\n");
      out.write("<link href=\"inculde/foundation.css\" rel=\"stylesheet\" /> -->\r\n");
      out.write("<!-- <script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/foundation.min.js\"></script>\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-float.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-prototype.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation-rtl.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/css/foundation.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordion.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.accordionMenu.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdown.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.7.5/js/plugins/foundation.dropdownMenu.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://www.youtube.com/iframe_api\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/css/foundation-prototype.min.css\">\r\n");
      out.write("<link href='https://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/foundation/6.4.3/js/foundation.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/motion-ui/1.2.3/motion-ui.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("	  $(document).foundation();\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("ul { \r\n");
      out.write("	list-style:none; \r\n");
      out.write("}\r\n");
      out.write(".menu>li>a {\r\n");
      out.write("    display: block;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("}\r\n");
      out.write(".has-submenu {\r\n");
      out.write("	padding-top:10px;\r\n");
      out.write("}\r\n");
      out.write(".dropdown {\r\n");
      out.write("	width:100%;\r\n");
      out.write("}\r\n");
      out.write(".callout.secondary {\r\n");
      out.write("	border:none;\r\n");
      out.write("    background-color:#f8f9fa;\r\n");
      out.write("    color: #878890;\r\n");
      out.write("}\r\n");
      out.write(".large-4.columns a {\r\n");
      out.write("	color: #878890;\r\n");
      out.write("}\r\n");
      out.write(".orbit {\r\n");
      out.write("	display: block;\r\n");
      out.write("	box-sizing: inherit;\r\n");
      out.write("}\r\n");
      out.write(".orbit-container {\r\n");
      out.write("	height: 100%;\r\n");
      out.write("}\r\n");
      out.write(".form-idCk p {\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	margin-bottom: 0;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("</style>");
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
}