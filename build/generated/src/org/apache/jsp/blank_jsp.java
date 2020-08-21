package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blank_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("      <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Free Bootstrap Admin Template : Binary Admin</title>\r\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- FONTAWESOME STYLES-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- CUSTOM STYLES-->\r\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- GOOGLE FONTS-->\r\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">Binary admin</a> \r\n");
      out.write("            </div>\r\n");
      out.write("  <div style=\"color: white;\r\n");
      out.write("padding: 15px 50px 5px 50px;\r\n");
      out.write("float: right;\r\n");
      out.write("font-size: 16px;\"> Last access : 30 May 2014 &nbsp; <a href=\"login.html\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\r\n");
      out.write("        </nav>   \r\n");
      out.write("           <!-- /. NAV TOP  -->\r\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("\t\t\t\t<li class=\"text-center\">\r\n");
      out.write("                    <img src=\"assets/img/find_user3.png.png\" class=\"user-image img-responsive\"/>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a  href=\"index.html\"><i class=\"fa fa-dashboard fa-3x\"></i> Dashboard</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                      <li>\r\n");
      out.write("                        <a  href=\"ui.html\"><i class=\"fa fa-desktop fa-3x\"></i> UI Elements</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a  href=\"tab-panel.html\"><i class=\"fa fa-qrcode fa-3x\"></i> Tabs & Panels</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t\t   <li  >\r\n");
      out.write("                        <a  href=\"chart.html\"><i class=\"fa fa-bar-chart-o fa-3x\"></i> Morris Charts</a>\r\n");
      out.write("                    </li>\t\r\n");
      out.write("                      <li  >\r\n");
      out.write("                        <a  href=\"table.html\"><i class=\"fa fa-table fa-3x\"></i> Table Examples</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li  >\r\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i> Forms </a>\r\n");
      out.write("                    </li>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li  >\r\n");
      out.write("                        <a   href=\"login.html\"><i class=\"fa fa-bolt fa-3x\"></i> Login</a>\r\n");
      out.write("                    </li>\t\r\n");
      out.write("                     <li  >\r\n");
      out.write("                        <a   href=\"registeration.html\"><i class=\"fa fa-laptop fa-3x\"></i> Registeration</a>\r\n");
      out.write("                    </li>\t\r\n");
      out.write("\t\t\t\t\t                   \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-sitemap fa-3x\"></i> Multi-Level Dropdown<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Second Level Link</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Second Level Link</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Second Level Link<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                <ul class=\"nav nav-third-level\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#\">Third Level Link</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li>  \r\n");
      out.write("                  <li  >\r\n");
      out.write("                        <a class=\"active-menu\"  href=\"blank.html\"><i class=\"fa fa-square-o fa-3x\"></i> Blank Page</a>\r\n");
      out.write("                    </li>\t\r\n");
      out.write("                </ul>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </nav>  \r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                     <h2>Blank Page</h2>   \r\n");
      out.write("                        <h5>Welcome Jhon Deo , Love to see you back. </h5>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                 <hr />\r\n");
      out.write("               \r\n");
      out.write("    </div>\r\n");
      out.write("             <!-- /. PAGE INNER  -->\r\n");
      out.write("            </div>\r\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("        </div>\r\n");
      out.write("     <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("    <!-- JQUERY SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- METISMENU SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
