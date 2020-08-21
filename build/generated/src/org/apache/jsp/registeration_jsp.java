package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registeration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\" />\r\n");
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
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row text-center  \">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <br /><br />\r\n");
      out.write("                <h2> Binary Admin : Register</h2>\r\n");
      out.write("               \r\n");
      out.write("                <h5>( Register yourself to get access )</h5>\r\n");
      out.write("                 <br />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1\">\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                        <strong>  New User ? Register Yourself </strong>  \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"panel-body\">\r\n");
      out.write("                                <form role=\"form\">\r\n");
      out.write("<br/>\r\n");
      out.write("                                        <div class=\"form-group input-group\">\r\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-circle-o-notch\"  ></i></span>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Your Name\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                     <div class=\"form-group input-group\">\r\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Desired Username\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                         <div class=\"form-group input-group\">\r\n");
      out.write("                                            <span class=\"input-group-addon\">@</span>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Your Email\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                      <div class=\"form-group input-group\">\r\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Enter Password\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                     <div class=\"form-group input-group\">\r\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Retype Password\" />\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                     \r\n");
      out.write("                                     <a href=\"index.html\" class=\"btn btn-success \">Register Me</a>\r\n");
      out.write("                                    <hr />\r\n");
      out.write("                                    Already Registered ?  <a href=\"login.html\" >Login here</a>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("    <!-- JQUERY SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- METISMENU SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\r\n");
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
