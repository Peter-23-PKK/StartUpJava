/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2024-01-16 13:29:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.util.List;
import com.google.gson.Gson;
import BulletinBoard.Connection.DBConnect;
import BulletinBoard.DAO.UserDAO;
import BulletinBoard.Entities.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1704098192000L));
    _jspx_dependants.put("jar:file:/E:/1_JavaSetUp/workspace/SCI_JAVA/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BulletinBoardServletJsp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153361682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1705410541169L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("BulletinBoard.Entities.User");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("BulletinBoard.Connection.DBConnect");
    _jspx_imports_classes.add("BulletinBoard.DAO.UserDAO");
    _jspx_imports_classes.add("com.google.gson.Gson");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

if (session.getAttribute("userName") == null) {
	response.sendRedirect(request.getContextPath() + "/View/Account/Login.jsp");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>BulletinBoard</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	href=\"https://cdn.datatables.net/1.13.7/css/jquery.dataTables.min.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	href=\"https://cdn.datatables.net/1.13.7/css/dataTables.bootstrap5.min.css\">\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("	href=\"");
      out.print(request.getContextPath() + "/./css/commonStyle.css");
      out.write("\">\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\">\n");
      out.write("	");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">BulletinBoard</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav ms-auto\">\r\n");
      out.write("				");

				Integer roleInteger = (Integer) session.getAttribute("role");
				int role = (roleInteger != null) ? roleInteger.intValue() : -1;

				if (role == 1) {
				
      out.write("\r\n");
      out.write("				<li class=\"nav-item mx-0 mx-lg-1\"><a\r\n");
      out.write("					class=\"nav-link py-3 px-0 px-lg-3 rounded\"\r\n");
      out.write("					href=\"");
      out.print(request.getContextPath() + "/View/User/Index.jsp");
      out.write("\">User</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item mx-0 mx-lg-1\"><a\r\n");
      out.write("					class=\"nav-link py-3 px-0 px-lg-3 rounded\"\r\n");
      out.write("					href=\"");
      out.print(request.getContextPath() + "/View/Post/Index.jsp");
      out.write("\">Post</a></li>\r\n");
      out.write("				<li class=\"nav-item mx-0 mx-lg-1\"><a\r\n");
      out.write("					class=\"nav-link py-3 px-0 px-lg-3 rounded\">");
      out.print(session.getAttribute("userName"));
      out.write("</a></li>\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a\r\n");
      out.write("					class=\"nav-link mx-2 dropdown-toggle\" href=\"#\"\r\n");
      out.write("					id=\"navbarDropdownMenuLink\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("					aria-expanded=\"false\"> <span id=\"EmailName\"></span>\r\n");
      out.write("					<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/signin-image.jpg\"\r\n");
      out.write("							id=\"ProfileName\" class=\"navProfile\"> \r\n");
      out.write("				</a>\r\n");
      out.write("					<ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(request.getContextPath() + "/View/Account/Profile.jsp");
      out.write("\"\r\n");
      out.write("							id=\"viewProfile\">Profile</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(request.getContextPath() + "/View/Account/ChangePassword.jsp");
      out.write("\"\r\n");
      out.write("							id=\"viewChangePass\">Change Password</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\"\r\n");
      out.write("							href=\"");
      out.print(request.getContextPath() + "/Account/Logout");
      out.write("\">Logout</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.4.min.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("	<script type=\"text/javascript\" charset=\"utf8\"\n");
      out.write("		src=\"https://cdn.datatables.net/1.13.7/js/jquery.dataTables.min.js\"></script>\n");
      out.write("	<script type=\"text/javascript\" charset=\"utf8\"\n");
      out.write("		src=\"https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
