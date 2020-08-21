package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;

public final class demande_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Faire votre demande de crédit</title>\n");
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
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/myfobyke.jpg\"/>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("                      <li  > <a   href=\"index.jsp\"><i class=\"fa fa-university fa-3x\"></i>Accueil</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li  >\n");
      out.write("                        <a   href=\"client.jsp\"><i class=\"fa fa-male fa-3x\" ></i> Espace Client </a>\n");
      out.write("                    </li>\t\t\t\t\n");
      out.write("\t\t\t\t              \n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"#\"><i class=\"fa fa-money fa-3x\"></i> Nos Crédits Consommation<span class=\"fa arrow\"></span></a>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"expresso.jsp\">Crédit Expresso</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"auto.jsp\">Crédit Auto</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"dari.jsp\">Crédit Dari</a>\n");
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
      out.write("               \n");
      out.write("                  \n");
      out.write("                  \t <li  >\n");
      out.write("                        <a   href=\"simulation.jsp\"><i class=\"fa fa-calculator fa-3x\"></i>\n");
      out.write(" Simulation</a>\n");
      out.write("                    </li>\t\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-eye fa-3x\"></i> Suivi de votre demande </a> </li>  \n");
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
      out.write("                     <img src=\"assets/img/rou.png\"/></hr>\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\">\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\"><strong>Un crédit vous engage et doit etre remboursé.Vérifiez vos capacité de remboursssement avant de vous engage. </strong></a>\n");
      out.write("                                        </h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapseTwo\" class=\"panel-collapse in\" style=\"height: auto;\">\n");
      out.write("                                        <div class=\"panel-body\">\n");
      out.write("                                            <h4>Remplissez notre formulaire en 5 minutes si vous etes rapide!\n");
      out.write("                        </h4>\n");
      out.write("            \n");
      out.write("                        \n");
      out.write("             <br><div class=\"col-md-8\">                   \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                        <div class=\"panel-body\" class=\"pull-center\">\n");
      out.write("                            <span class=\"pull-left\"><img src=\"assets/img/a2.png\"/></span><tr><h2 class=\"pull-center\"> Vos Revenus et charges</h2></tr>\n");
      out.write("                            <h5> Les champ marqué en * sont obligatoires</h5>\n");
      out.write("                            <span class=\"pull-center\">\n");
      out.write("                                   <h4>Vos Revenus</h4>\n");
      out.write("                                      <h5> saissez le chiffre 0 si un champ ne vous concerne pas.</h5>\n");
      out.write("                                       <br><label>*Salaire mensuel net</label>\n");
      out.write("                                      <input class=\"form-control\" />  \n");
      out.write("                                    <br><label> *Revenu non salarié(Pension de retraite)</label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                           <br><label>*Loyer mensuel percu </label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Autre revenus mensuels </label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Ressources totales mensuelles </label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                           <br><h4>Vos Charges</h4>\n");
      out.write("                               <h5> saissez le chiffre 0 si un champ ne vous concerne pas.</h5>\n");
      out.write("                               <br><label> *Montant du loyer à payer(si locataire)</label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Mensualité des crédits à la consommation </label>\n");
      out.write("                           <input class=\"form-control\" \n");
      out.write("                            <br><label> *Mensualité des crédits UIB </label>\n");
      out.write("                           <input class=\"form-control\" \n");
      out.write("                            <br><label> *Encours des crédits UIB </label>\n");
      out.write("                           <input class=\"form-control\" \n");
      out.write("                            \n");
      out.write("                                  <br><label> *Autre charges mensuelles</label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </span></br>\n");
      out.write("                        <a href=\"demprojet.jsp\"class=\"btn btn-primary btn-lg\" role=\"button\">CONTINUER</a>\n");
      out.write("                               </div>\n");
      out.write("                    </div>            \n");
      out.write("             </div><tr><div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"well well-sm\">\n");
      out.write("                        <h4>Demander de crédit en 3 étapes</h4>\n");
      out.write("                        <p>1.Simulez</p>\n");
      out.write("                        <h5>Renseinez votre projet pour recevoir votre proposition.</h5>\n");
      out.write("                    <p>2.Demandez</p>\n");
      out.write("                        <h5>Demandez votre crédit en remplissant le formulaire en moins de 5 minutes chrono  sans engagement réponse immédiate.</h5>\n");
      out.write("                        <p>3.Validez</p>\n");
      out.write("                        <h5>Finalisez votre demande en nous envoyant votre dossier complet par courieur.</h5>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <center><img src=\"assets/img/dem.jpg\"/></center>\n");
      out.write("                                        </div>\n");
      out.write("                                            \n");
      out.write("                   <img src=\"assets/img/cont.jpg\"/>\n");
      out.write("             <!-- /. ROW  -->\n");
      out.write("            \n");
      out.write("                            \n");
      out.write("                      \n");
      out.write("                                           \n");
      out.write("                    \n");
      out.write("    \n");
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
      out.write("\n");
      out.write("\n");
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
