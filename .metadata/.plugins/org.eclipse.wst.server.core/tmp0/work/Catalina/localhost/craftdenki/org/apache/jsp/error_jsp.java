/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-02-28 08:36:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-kaneda/backup/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/craftdenki/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1519377391214L));
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".home2 {\r\n");
      out.write("\tpadding-top: 200px;\r\n");
      out.write("}\r\n");
      out.write("/* 下にスクロールでヘッダー非表示・上にスクロールでヘッダー表示*/\r\n");
      out.write("header {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttransition: .3s;\r\n");
      out.write("}\r\n");
      out.write("/*メニューバー*/\r\n");
      out.write(".bar {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbackground-color: #2c3e50;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bar a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tmargin: 5%;\r\n");
      out.write("}\r\n");
      out.write("/*ヘッダー*/\r\n");
      out.write("header {\r\n");
      out.write("\theight: 120px;\r\n");
      out.write("\tline-height: 30px;\r\n");
      out.write("\tbackground-color: ghostwhite;\r\n");
      out.write("\tbackground-image: url(\"images/Paper01.jpg\");\r\n");
      out.write("}\r\n");
      out.write("/*ロゴ*/\r\n");
      out.write("#logo {\r\n");
      out.write("\tmargin-left: 15px;\r\n");
      out.write("\tmargin-top: 30px;\r\n");
      out.write("\tmargin-bottom: 20px;\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 70px;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground-image: url(\"images/logo.png\");\r\n");
      out.write("\tbackground-size: 200px;\r\n");
      out.write("}\r\n");
      out.write("/*検索フォーム左にロゴ真ん中にフォーム右に空div*/\r\n");
      out.write("nav {\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tjustify-content: space-between;\r\n");
      out.write("\talign-items: center;\r\n");
      out.write("\tmin-width: 885px;\r\n");
      out.write("}\r\n");
      out.write("/*minimalectにフォームの形を合わせる*/\r\n");
      out.write("input.area {\r\n");
      out.write("\tfont-family: \"Segoe UI\", Segoe, \"Lucida Grande\", \"Lucida Sans Unicode\",\r\n");
      out.write("\t\tArial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #333;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 45px;\r\n");
      out.write("\tborder: 1px solid #e5e5e5;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\t-webkit-box-sizing: border-box;\r\n");
      out.write("\t-moz-box-sizing: border-box;\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("/*kensaku.jpgとフォームのずれ補正*/\r\n");
      out.write("input.area, input.hosei {\r\n");
      out.write("\tvertical-align: top;\r\n");
      out.write("}\r\n");
      out.write("/*selectboxとフォーム横並びにして隙間なくす*/\r\n");
      out.write("table.table-header {\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\tborder-spacing: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("\theight: 70px;\r\n");
      out.write("\tbackground: #2c3e50;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".under {\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".guide ul {\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".guide li {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tflex-grow: 1;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#error {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("<link href=\"css/jquery.minimalect.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/validationEngine.jquery.css\">\r\n");
      out.write("<script src=\"js/jquery.minimalect.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.validationEngine-ja.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.validationEngine.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.autoKana.js\"></script>\r\n");
      out.write("<script src=\"https://ajaxzip3.github.io/ajaxzip3.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar $win = $(window), $header = $('header'), headerHeight = $header\r\n");
      out.write("\t\t\t\t.outerHeight(), startPos = 0;\r\n");
      out.write("\r\n");
      out.write("\t\t$win.on('load scroll', function() {\r\n");
      out.write("\t\t\tvar value = $(this).scrollTop();\r\n");
      out.write("\t\t\tif (value > startPos && value > headerHeight) {\r\n");
      out.write("\t\t\t\t$header.css('top', '-' + headerHeight + 'px');\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$header.css('top', '0');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tstartPos = value;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#select1\").minimalect({\r\n");
      out.write("\t\t\ttheme : \"bubble\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.fn.autoKana('#familyName', '#familyNameKana');\r\n");
      out.write("\t\t$.fn.autoKana('#firstName', '#firstNameKana');\r\n");
      out.write("\t});\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tjQuery(\"#form_1\").validationEngine({\r\n");
      out.write("\t\t\tscrollOffset : 170\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction nextField(i, n, m) {\r\n");
      out.write("\t\tif (i.value.length >= m) {\r\n");
      out.write("\t\t\ti.form.elements[n].focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Press+Start+2P\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/footerFixed.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"home2\">\r\n");
      out.write("\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<nav>\r\n");
      out.write("\t\t\t<a href=\"start.jsp\"><div id=\"logo\"></div></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"kara\"></div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"bar\">\r\n");
      out.write("\t\t\t<span>&nbsp;</span>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("\t<h2 id=\"error\">\r\n");
      out.write("\t\tエラーページです <a href=\"start.jsp\">最初から</a>やり直してください。\r\n");
      out.write("\t</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\">\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<div class=\"under\">CraftDenki All right reserved.</div>\r\n");
      out.write("\t\t\t<div class=\"guide\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>お問い合わせ</li>\r\n");
      out.write("\t\t\t\t\t<li>ヘルプ</li>\r\n");
      out.write("\t\t\t\t\t<li>ご利用ガイド</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
}
