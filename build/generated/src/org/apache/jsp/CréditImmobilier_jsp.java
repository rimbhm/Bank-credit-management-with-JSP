package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CréditImmobilier_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Free Bootstrap Admin Template : Binary Admin</title>\n");
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
      out.write("font-size: 16px;\"> Last access : 30 May 2014 &nbsp; <a href=\"login.html\" class=\"btn btn-danger square-btn-adjust\">Déconnection</a> </div>\n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/hffff.jpg\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("                      <li  > <a   href=\"accueil.jsp\"><i class=\"fa fa-university fa-3x\"></i>Accueil</a>\n");
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
      out.write("                        <a  class=\"active-menu\" href=\"form.html\"><i class=\"fa fa-male fa-3x\" ></i>\n");
      out.write(" Espace Client </a>\n");
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
      out.write("                                <a href=\"#\">Crédit Expresso</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Crédit Auto</a>\n");
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
      out.write("                    <li>\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i> Suivi de votre demande </a> </li>  \n");
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
      out.write("                     <img src=\"assets/img/faa.png\"/></hr>\n");
      out.write("                          \n");
      out.write("                        <h2>Le crédit immobilier Mahly UIB Direct, un crédit clair et compétitif </h2>\n");
      out.write("                        <strong> pour l'achat d'une maison ancien ou neuf ou un terrain d'habitation, notre crédit immobilier Mahly répond à vos besoins en se concentrant sur l'essentiel</strong>\n");
      out.write("                       <h2> Simulez votre crédit immobilier Mahly</h2>\n");
      out.write("                       <p>Evaluez votre capacité d'emprunt en fonction de vos revenus ou d'une mensualité viseé et obtenir une offre de crédit </p>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       <h3>  </h3>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Basic Tabs\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <ul class=\"nav nav-tabs\">\n");
      out.write("                                <li class=\"active\"><a href=\"#home\" data-toggle=\"tab\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\"><a href=\"#profile\" data-toggle=\"tab\">Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\"><a href=\"#messages\" data-toggle=\"tab\">Messages</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\"><a href=\"#settings\" data-toggle=\"tab\">Settings</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-content\">\n");
      out.write("                                <div class=\"tab-pane fade active in\" id=\"home\">\n");
      out.write("                                    <h4>Home Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"profile\">\n");
      out.write("                                    <h4>Profile Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"messages\">\n");
      out.write("                                    <h4>Messages Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"settings\">\n");
      out.write("                                    <h4>Settings Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 col-sm-6\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Pill Tabs\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <ul class=\"nav nav-pills\">\n");
      out.write("                                <li class=\"\"><a href=\"#home-pills\" data-toggle=\"tab\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\"><a href=\"#profile-pills\" data-toggle=\"tab\">Profile</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"\"><a href=\"#messages-pills\" data-toggle=\"tab\">Messages</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\"><a href=\"#settings-pills\" data-toggle=\"tab\">Settings</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <div class=\"tab-content\">\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"home-pills\">\n");
      out.write("                                    <h4>Home Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"profile-pills\">\n");
      out.write("                                    <h4>Profile Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade\" id=\"messages-pills\">\n");
      out.write("                                    <h4>Messages Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"tab-pane fade active in\" id=\"settings-pills\">\n");
      out.write("                                    <h4>Settings Tab</h4>\n");
      out.write("                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("                 \n");
      out.write("                      \n");
      out.write("                               <!--<div class=\"col-md-6 col-sm-12 col-xs-12\">                     \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h2>Accés à mon espace client</h2> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div> <strong>Simulation de crédit </strong>\n");
      out.write("                                <br><strong>Demande de crédit</strong>\n");
      out.write("                                <br><strong>Suivi de crédit </strong>\n");
      out.write("                                    <br><Strong>Consultation de tableau d'amortissement </strong></div>\n");
      out.write("                     <div class=\"row\"> \n");
      out.write("                     </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>            \n");
      out.write("                </div>\n");
      out.write("                      <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h2> Identifiez vous pour accéder à votre Espace client</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div> <strong>Saisie votre numéro client:</strong>\n");
      out.write("                                 <span class=\"pull-right\">\n");
      out.write("                                                   <a href=\"#\" ><hr>\n");
      out.write("                     <img src=\"assets/img/ee.png\"/></hr> </a> \n");
      out.write("                                            </span>\n");
      out.write("                                 <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\"  placeholder=\"Your Password\" />\n");
      out.write("                                        </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                            <label class=\"checkbox-inline\">\n");
      out.write("                                                <input type=\"checkbox\" /> <strong>mémoriser votre numéro</strong>\n");
      out.write("                                            </label></div>\n");
      out.write("                                <a href=\"chart.jsp\"  href=\"#\" class=\"btn btn-danger\">Valider</a>\n");
      out.write("                                <br><div></div>\n");
      out.write("                                    <br><strong>j'oublier mon identifient!  </strong><a href=\"registeration.jsp\" >click here </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>            \n");
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
