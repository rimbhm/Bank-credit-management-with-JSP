package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;

public final class responsable_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>UIB Direct</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- MORRIS CHART STYLES-->\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">UIB Direct</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"chart.jsp\">UIB DIRECT</a> \n");
      out.write("            </div>\n");
      out.write("  <div style=\"color: white;\n");
      out.write("padding: 15px 50px 5px 50px;\n");
      out.write("float: right;\n");
      out.write("font-size: 16px;\"> ");

   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));

      out.write("<a href=\"login.html\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("       \n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                  <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/pc2222.png\" />\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("                      <li  > <a   href=\"index.jsp\"><i class=\"fa fa-university fa-3x\"></i>Accueil</a>\n");
      out.write("                    </li>\n");
      out.write("                     <!--<li>\n");
      out.write("                        <a  href=\"ui.html\"><i class=\"fa fa-desktop fa-3x\"></i> Espaceq</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"tab-panel.html\"><i class=\"fa fa-qrcode fa-3x\"></i> Tabs & Panels</a>\n");
      out.write("                    </li>\n");
      out.write("\t\t\t\t\t\t   <li  >\n");
      out.write("                        <a   href=\"chart.html\"><i class=\"fa fa-bar-chart-o fa-3x\"></i> Morris Charts</a>\n");
      out.write("                    </li>\t\n");
      out.write("                      <li  >\n");
      out.write("                        <a  href=\"table.html\"><i class=\"fa fa-table fa-3x\"></i> Table Examples</a>\n");
      out.write("                    </li>-->\n");
      out.write("                    <li  >\n");
      out.write("                        <a  class=\"active-menu\" href=\"responsable.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\n");
      out.write(" Espace Responsable </a>\n");
      out.write("                    </li>\t\t\t\t\n");
      out.write("\t\t\t\t\t <!--<li  >\n");
      out.write("                        <a   href=\"login.html\"><i class=\"fa fa-bolt fa-3x\"></i> Login</a>\n");
      out.write("                    </li>\t\n");
      out.write("                     <li  >\n");
      out.write("                        <a   href=\"registeration.html\"><i class=\"fa fa-laptop fa-3x\"></i> Registeration</a>\n");
      out.write("                    </li>-->\t\n");
      out.write("\t\t\t\t\t                   \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"client.html\" href=\"#\"><i class=\"fa fa-money fa-3x\"></i> Nos Crédits Consommation<span class=\"fa arrow\"></span></a>\n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"expreso.jsp\">Crédit Expresso</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"auto.jsp\">Crédit Auto</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Crédit Dari</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Crédit Immobilier<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Immobilier Aménagement & travaux</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Immobilier Mahly</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                               \n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                      </li>  \n");
      out.write("                  <!--<li  >\n");
      out.write("                        <a  href=\"blank.html\"><i class=\"fa fa-square-o fa-3x\"></i> Blank Page</a>\n");
      out.write("                    </li>-->\n");
      out.write("                  \n");
      out.write("                  \t <li  >\n");
      out.write("                        <a   href=\"simulation.jsp\"><i class=\"fa fa-calculator fa-3x\"></i>\n");
      out.write(" Simulation</a>\n");
      out.write("                    </li>\t\n");
      out.write("                    \n");
      out.write("                    <!--<li>\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i> Suivi de votre demande </a> </li>-->  \n");
      out.write("                 \n");
      out.write("                </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        \n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                     <hr>\n");
      out.write("                          \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("                 \n");
      out.write("                 <div>\n");
      out.write("                               \n");
      out.write("                     <div class=\"row\"> \n");
      out.write("                     \n");
      out.write("                      <div class=\"col-md-4.2 col-md-offset-4.2 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                        <strong>   Identiviez-vous pour accedé à votre espace responsable </strong>  \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <form role=\"form\" methode=\"Post\" action=\"servresp\">\n");
      out.write("                                       <br />\n");
      out.write("                                     <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"login\" placeholder=\"votre identifient \" />\n");
      out.write("                                        </div>\n");
      out.write("                                          <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" name=\"password\" class=\"form-control\"  placeholder=\"votre Password\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                            <label class=\"checkbox-inline\">\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                            </label>\n");
      out.write("                                            <span class=\"pull-right\">\n");
      out.write("                                                   \n");
      out.write("                                                  \n");
      out.write("                                            <a href=\"#\" >vous oubliez password ? </a> \n");
      out.write("                                  </span>\n");
      out.write("                                        </div>\n");
      out.write("                                     \n");
      out.write("                                       <input type=submit class=\"btn btn-primary \" value=\"se connecter\">\n");
      out.write("                                           <img src=\"assets/img/eee.png\"/>\n");
      out.write("                                    <hr />\n");
      out.write("                                    Non Enregistrer ? <a href=\"ajoutresp.jsp\" >clique ici</a> \n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                </div> \n");
      out.write("                \n");
      out.write("           </div>\n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("               <!-- <div class=\"row\">                     \n");
      out.write("                      \n");
      out.write("                               <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Donut Chart Example\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div id=\"morris-donut-chart\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                      <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Line Chart Example\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div id=\"morris-line-chart\"></div>\n");
      out.write("                        </div>-->\n");
      out.write("                    </div>            \n");
      out.write("               \n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("    </div>\n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("        </div>\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
