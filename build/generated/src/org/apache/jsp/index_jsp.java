package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("      <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>UIB Direct</title>\r\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- FONTAWESOME STYLES-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("     <!-- MORRIS CHART STYLES-->\r\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\r\n");
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
      out.write("                    <span class=\"sr-only\">  UIB DIRECT</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                \r\n");
      out.write("                </button>\r\n");
      out.write("               \r\n");
      out.write("                <a class=\"navbar-brand\" href=\"accueil.jsp\" >  UIB  DIRECT </a> \r\n");
      out.write("            </div>\r\n");
      out.write("  <div style=\"color: white;\r\n");
      out.write("padding: 15px 50px 5px 50px;\r\n");
      out.write("float: right;\r\n");
      out.write("font-size: 16px;\"> ");

   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));

      out.write(" </div>\r\n");
      out.write("       \r\n");
      out.write("        </nav>   \r\n");
      out.write("           <!-- /. NAV TOP  -->\r\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("\t\t\t\t<li class=\"text-center\">\r\n");
      out.write("                    <img src=\"assets/img/pc2222.png\" />\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"active-menu\"  href=\"index.jsp\"><i class=\"fa fa-university fa-3x\"></i>Accueil</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                     \r\n");
      out.write("                    <li>\r\n");
      out.write("                       <!--<form role=\"form\" action=\"chart.jsp\">-->\r\n");
      out.write("                        <a  href=\"client.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\r\n");
      out.write("                                Espace Client </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   <li>\r\n");
      out.write("                       <!--<form role=\"form\" action=\"chart.jsp\">-->\r\n");
      out.write("                        <a  href=\"responsable.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\r\n");
      out.write("                                Espace Responsble </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\t                   \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-money fa-3x\"></i> Nos Crédits Consommation<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"expresso.jsp\">Crédit Expresso</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"auto.jsp\">Crédit Auto</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">Crédit Immobilier<span class=\"fa arrow\"></span></a>\r\n");
      out.write("                                <ul class=\"nav nav-third-level\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"travaux&aménagement.jsp\">Immobilier Aménagement & travaux</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"CrdImmobilierMahly.jsp\">Immobilier Mahly</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                <a href=\"dari.jsp\">Immobilier Dari</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                               \r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                      </li> \r\n");
      out.write("                 \r\n");
      out.write("                  \t <li  >\r\n");
      out.write("                        <a    href=\"simulation.jsp\"><i class=\"fa fa-calculator fa-3x\"></i>\r\n");
      out.write(" Simulation</a>\r\n");
      out.write("                    </li>\t\r\n");
      out.write("                    \r\n");
      out.write("                  <li  >\r\n");
      out.write("                        <a    href=\"demande.jsp\"><i class=\"fa fa-edit fa-3x\"></i>Demander votre Rachat de crédit </a>\r\n");
      out.write("                    </li>\t \t\r\n");
      out.write("               \t\r\n");
      out.write("                </ul>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </nav>  \r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        \r\n");
      out.write("     <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\r\n");
      out.write("    <!-- JQUERY SCRIPTS -->\r\n");
      out.write("     <div id=\"page-wrapper\" >\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                     <h2>Bienvenue sur UIBDIRECT</h2>   \r\n");
      out.write("                        <h3> Déjà 1 Million de Clients! Merci de votre confiance </h3>\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                 <hr>\r\n");
      out.write("             \r\n");
      out.write("                 <center>  <img src =\"assets/img/a1.jpg\"/></center>\r\n");
      out.write("                \r\n");
      out.write("            <hr/>\r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("                 <br> <div class=\"row\"> \r\n");
      out.write("                    \r\n");
      out.write("                      \r\n");
      out.write("                       <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("               \r\n");
      out.write("                            <h2> Pourquoi choisir notre Banque UIB DIRECT? </h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div > <strong>30 Années au services de nos client pour les aider à concrétiser leurs projets aprés une étude personnalisée de leur dossier.</strong></div>\r\n");
      out.write("                            <strong><br> 127 Agences ouvertes 5 jours sur 7 jusqu'à 17h du lundi au vendredi.</br></strong>\r\n");
      out.write("                            <strong> <br>Bénéficiez de la qualité de services UIB DIRECT grâce à notre équipe spécialistes.</br>\r\n");
      out.write("                        \r\n");
      out.write("</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>            \r\n");
      out.write("                </div>\r\n");
      out.write("                         \r\n");
      out.write("                      <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h2>Votre crédit en ligne avec UIB DIRECT</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <div ><strong>Découvrez notre offre de crédits adapteé à votre situation:<strong>\r\n");
      out.write("                                        <strong> <br> Besoin d'argent? Achat imprévus? projet d'avenir? Achaque projet Découvrez la simulation sans engagement, la demande de votre crédit 100% en ligne.\r\n");
      out.write("                                        </strong>\r\n");
      out.write("                                                <!--<br><div class=\"col-md-6 col-sm-12 col-xs-12\">                     \r\n");
      out.write("                   \r\n");
      out.write("                                     \r\n");
      out.write("                                            \r\n");
      out.write("                                                -->\r\n");
      out.write("                           \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    \r\n");
      out.write("                    </div>            \r\n");
      out.write("                </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                     <div class=\"row\">                     \r\n");
      out.write("                      \r\n");
      out.write("                               <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h2> Comment obtenez votre crédit en ligne?</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                     <div >\r\n");
      out.write("                         <!--<span class=\"pull-left\"><img src=\"assets/img/nb1.png\"/></span>-->\r\n");
      out.write("                         <h3> 1ére étape:Simulez votre crédit</h3>\r\n");
      out.write("                         <strong> Vous choisissez et simulez votre crédit, remplaissez le formulaire de simulation pour savoir combien emprunter sur la base de vos revenus.\r\n");
      out.write("                         </strong>\r\n");
      out.write("                             <br><h3> 2ème étape:Demandez votre crédit</h3>\r\n");
      out.write("                                 <strong> vous remplissez le formulaire en ligne.</strong>\r\n");
      out.write("                                 <strong> <br> Il vous suffira ensuite d'imprimer votre dossier de demande de financement personalisé.</strong>\r\n");
      out.write("                           <br><h3> 3ème étape:Envoyer-nous votre dossier complet</h3>\r\n");
      out.write("                               <strong>  Vous nous envoyez votre dossier de demande de financement complet, accompagné des pièces justificatives nécessaires dans un délai de 15 jours maximum à compter du moment où vous avez obtenu une réponse de principe.             \r\n");
      out.write("                               </strong>\r\n");
      out.write("                                   </div>            \r\n");
      out.write("                </div>\r\n");
      out.write("                      \r\n");
      out.write("               <hr>  <center>  <img src =\"assets/img/a2.jpg\"/></center> </hr> \r\n");
      out.write("           </div>\r\n");
      out.write("             <div class=\"col-md-6 col-sm-12 col-xs-12\">                     \r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h2> Comment vous faire votre crédit en ligne?</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div><h3> 4ème étape:Suivi de votre crédit</h3>\r\n");
      out.write("                            <strong> aprés que vous demandez votre crédit vous souhaiterez connaitre l'etat d'avencement de votre dossier en ligne.\r\n");
      out.write("                                </strong>                \r\n");
      out.write("                                <h3> 5ème étape: Vous recevez notre réponse</h3>\r\n");
      out.write("                                <strong> Nous vous confirmons la bonne réception de votre dossier et nous étudions votre demande de financement.\r\n");
      out.write("                                </strong>              \r\n");
      out.write("                                    <h3> 6ème étape:Finalisez votre projet</h3>\r\n");
      out.write("                                  \r\n");
      out.write("                                    <strong>Il vous faudra prendre rendez-vous chez nous pour signé le contrat de pret.</strong>\r\n");
      out.write("                    </div>            \r\n");
      out.write("                </div>       \r\n");
      out.write("                         \r\n");
      out.write("                 \r\n");
      out.write("          \r\n");
      out.write("    \r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("                 \r\n");
      out.write("              </div>\r\n");
      out.write("                            \r\n");
      out.write("                 <!-- /. ROW  -->\r\n");
      out.write("    </div>\r\n");
      out.write("             <!-- /. PAGE INNER  -->\r\n");
      out.write("            </div>\r\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("     </div>    \r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- METISMENU SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("     <!-- MORRIS CHART SCRIPTS -->\r\n");
      out.write("     <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\r\n");
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
