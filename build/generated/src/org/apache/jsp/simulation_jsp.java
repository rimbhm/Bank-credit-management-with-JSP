package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;

public final class simulation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Simulez votre projet</title>\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"simulation.jsp\">UIB DIRECT</a> \n");
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
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/simmm.jpg\" />\n");
      out.write("\t\t\t\t \t\n");
      out.write("                                </li>\n");
      out.write("                   \n");
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
      out.write("                        <a  href=\"client.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\n");
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
      out.write("                        <a  href=\"#\" ><i class=\"fa fa-money fa-3x\"></i> Nos Crédits Consommation<span class=\"fa arrow\"></span></a>\n");
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
      out.write("                        <a  class=\"active-menu\"  href=\"chart.html\"><i class=\"fa fa-calculator fa-3x\"></i>\n");
      out.write(" Simulation</a>\n");
      out.write("                    </li>\t\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                       <!-- <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i> Suivi de votre demande </a> </li>-->  \n");
      out.write("              \n");
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
      out.write("                        <h2>un crédit vous engage et doit etre remboursé. vérifiez vos capacités de rembourssement avant de vous engager</h2>\n");
      out.write("                        <hr>\n");
      out.write("                     \n");
      out.write("                            <img src=\"assets/img/s.jpg\"/></hr>\n");
      out.write("                        <img src=\"assets/img/s1.jpg\"/></hr>\n");
      out.write("                        <img src=\"assets/img/slide1.png\"/>\n");
      out.write("                            <!--<center><img src=\"assets/img/connn.png\" /></center>-->\n");
      out.write("                       <h1> <rihght>Simulez votre crédit en 5 minutes</rihght></h1>\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                        <h3> </h3>\n");
      out.write("                       <h3> </h3>\n");
      out.write("                       <h3> </h3>\n");
      out.write("                       <h3>  </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("                 \n");
      out.write("                      \n");
      out.write("                                <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-headin g\">\n");
      out.write("                            crédit Expresso\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <img src=\"assets/img/exp1.jpg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            <h5> \n");
      out.write("                             Avec Expresso Réalisez vos projet:\n");
      out.write("                             projet de  voiture, anticipation de l'arrivée de bébé, financement de votre mariage, projet de vacance, projet de travaux .</h5>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-default\" ><i class=\"fa fa-calculator fa-1x\"></i>Simuler votre prêt Expresso</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-primary\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h5>Crédit Auto</h5>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <center> <img src=\"assets/img/vv.jpg\"/></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                             <h5>Crédit Auto est le meilleur moyen pour vous ouffrir le voiture neuf ou d'occasion de moins de 3 ans.</h5>\n");
      out.write("                        <a href=\"auto.jsp\" class=\"btn btn-primary\"><i class=\"fa fa-calculator fa-1x\"></i>Simuler votre prêt Auto</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-success\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            crédit Dari\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <center><img src=\"assets/img/dd.jpg\"/></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            \n");
      out.write("                               <h5> Le plan epargne logement DARI est la clé de tous vos projets immobilier.DARI vous permet d'associer simplicité d'épargne et rapidité dans l'octroi du crédit</h5>\n");
      out.write("                         <a href=\"#\" class=\"btn btn-success\"><i class=\"fa fa-calculator fa-1x\"></i>Simuler votre prêt Dari</a>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                   <!-- /. ROW  -->\n");
      out.write("                   <hr>\n");
      out.write("                   <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Crédit Aménagement et Travaux\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <img src=\"assets/img/ct.jpg\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            <h5>Crédit Aménagement et Travaux est la solution la plus adapté pour vos petits et gros travaux.</h5>\n");
      out.write("                        <a href=\"travaux&aménagement.jsp\" class=\"btn btn-info\"><i class=\"fa fa-calculator fa-1x\"></i>Simuler votre prêtTravaux </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div></hr>\n");
      out.write("            </hr><div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-warning\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Crédit Immobilier Mahly\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                         <img src=\"assets/img/construction.jpg\"/> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            <h5>vous permet de financer :\n");
      out.write(" L'acquisition d'un logement neuf ou ancien ou d'un terrain à usage d'habitation\n");
      out.write(" , La construction d'un logement\n");
      out.write(" et L'extension de votre logement.</h5>\n");
      out.write("                        <a href=\"CrdImmobilierMahly.jsp\" class=\"btn btn-warning\"><i class=\"fa fa-calculator fa-1x\"></i>Simuler votre prêt Mahly</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </div></hr>\n");
      out.write("            <hr> \n");
      out.write("               <img src=\"assets/img/pret.jpg\" />\n");
      out.write("            <!--<div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"panel panel-danger\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Danger Panel\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-footer\">\n");
      out.write("                            Panel Footer\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    <!-- /. ROW  -->\n");
      out.write("            \n");
      out.write("                </div>\n");
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
      out.write("\n");
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
