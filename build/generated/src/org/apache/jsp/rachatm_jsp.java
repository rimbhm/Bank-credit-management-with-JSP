package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;

public final class rachatm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Demnader votre rachat de crédit Immobilier Mahly</title>\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">UIB DIRECT</a> \n");
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
      out.write("                    <img src=\"assets/img/pc2222.png\"/>\n");
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
      out.write("                        <a  class=\"active-menu\" href=\"client.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\n");
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
      out.write("                        <a href=\"client.jsp\" href=\"#\"><i class=\"fa fa-money fa-3x\"></i> Nos Crédits Consommation<span class=\"fa arrow\"></span></a>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"expresso.jsp\">Crédit Expresso</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"auto.jsp\" href=\"#\">Crédit Auto</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"dari.jsp\">Crédit Dari</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Crédit Immobilier<span class=\"fa arrow\"></span></a>\n");
      out.write("                                <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"travaux&aménagement.jsp\">Immobilier Aménagement & travaux</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"CrdImmobilierMahly.jsp\">Immobilier Mahly</a>\n");
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
      out.write("                    <li>\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i>Demander votre Rachat de Prêt</a> </li>  \n");
      out.write("                  <li>\n");
      out.write("                        <a  href=\"form.html\"><i class=\"fa fa-edit fa-3x\"></i> Faire une demande </a> </li>  \n");
      out.write("                  \n");
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
      out.write("                     <!--<img src=\"assets/img/yy.png\"/></hr>\n");
      out.write("                       <img src=\"assets/img/ac.png\"/></hr>-->\n");
      out.write("                     <img src=\"assets/img/reggg.png\"/>\n");
      out.write("                       \n");
      out.write("                       <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\">\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\"><h1>Demande de regroupement de crédits </h1></a>\n");
      out.write("                                        </h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapseTwo\" class=\"panel-collapse in\" style=\"height: auto;\">\n");
      out.write("                                        <div class=\"panel-body\">\n");
      out.write("                                           \n");
      out.write("            \n");
      out.write("                        \n");
      out.write("             \n");
      out.write("                                            <br><div class=\"col-md-8\">                   \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("                        <div class=\"panel-body\" class=\"pull-center\">\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <h5> Les champs marqué en * sont obligatoires</h5>\n");
      out.write("                            <span class=\"pull-center\">\n");
      out.write("                                <h2>votre pojet</h2>\n");
      out.write("                                 \n");
      out.write("                                <br><label>*Type de crédit </label> \n");
      out.write("                                              <tr><input class=\"form-control\"  /> </br> \n");
      out.write("                                <br><label>*Capital Restant en(DT) </label>\n");
      out.write("                                          <input class=\"form-control\" /> </br>\n");
      out.write("                                          \n");
      out.write("                            \n");
      out.write("                                            <br><label>*Montant du nouveau crédit </label> \n");
      out.write("                                              <tr><input class=\"form-control\"  /> </br>\n");
      out.write("                                                    \n");
      out.write("                       \n");
      out.write("                                   <h2>Vos Identité</h2>\n");
      out.write("                                    <br><label>*Votre état civil</label>\n");
      out.write("                                        <select class=\"form-control\">\n");
      out.write("                           <option>Monsieur</option>\n");
      out.write("                                 <option>Madame</option>\n");
      out.write("                                  <option>Mademoiselle</option>\n");
      out.write("                                        </select></br>    \n");
      out.write("                                    <br><label>*Prénom </label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                           <br><label>*Nom </label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label>*Nom de Naissance </label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Date de naissance </label>\n");
      out.write("                               <br><input class=\"form-petit\" placeholder=\"JJMMAAAA\"/>\n");
      out.write("  \n");
      out.write("                           <br><label> *Ville de naissance</label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Pays de naissance </label>\n");
      out.write("                           <input class=\"form-control\" \n");
      out.write("                            <br><label> *Nationnalité</label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label>*Adresse </label>\n");
      out.write("                           <input class=\"form-control\" placeholder=\"Numéro,Nom de rue\" />\n");
      out.write("                           <br><label>*Code postal </label>\n");
      out.write("                           <input class=\"form-control\"/>\n");
      out.write("                           <br><label>*Adresse E-mail </label>\n");
      out.write("                           <input class=\"form-control\" />\n");
      out.write("                           <br><label> *Téléphone</label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                           <br><h2>Vos situation</h2>\n");
      out.write("                           <br><label>*Situation familiale</label>\n");
      out.write("                               <select class=\"form-control\">\n");
      out.write("                               <option>Marié(e)</option>\n");
      out.write("                                 <option>Célibataire</option>\n");
      out.write("                                  <option>Veuf(ve)</option>\n");
      out.write("                               <option>Divorcé(e)</option>         \n");
      out.write("                               </select></br>    \n");
      out.write("                           <br><label>* Régime matrimonial</label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                            <br><label>*Nbre de pers.à.charge</label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                            <br><label> *Situation Logement</label>\n");
      out.write("                                <select class=\"form-control\">\n");
      out.write("                                    <option>Propriétaire</option>\n");
      out.write("                            <option>Locataire</option>\n");
      out.write("                            <option>Logé par la famille</option>\n");
      out.write("                            <option>Logé par l'employeur</option>\n");
      out.write("                            <option>Autre</option>\n");
      out.write("                                </select>\n");
      out.write("                                    <br><label> *Profession</label>\n");
      out.write("                               <input class=\"form-control\" />\n");
      out.write("                                <br><label>*Statut professionnel</label>\n");
      out.write("                                    <select class=\"form-control\"> <option>Salarié public</option>\n");
      out.write("                                        <option>Salarié privé</option>\n");
      out.write("                                        <option>Autre et retraité</option>\n");
      out.write("                                    </select>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           </span></br>\n");
      out.write("                                  \n");
      out.write("                              \n");
      out.write("   <h2>Vos Revenus</h2>\n");
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
      out.write("                           <br><h2>Vos Charges</h2>\n");
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
      out.write("                           <input class=\"form-control\" /> \n");
      out.write("                           <br><a class=\"btn btn-primary btn-lg\" role=\"button\">VALIDER</a><tr>     \n");
      out.write("                           </div>\n");
      out.write("                    </div>            \n");
      out.write("             </div><tr><div class=\"col-md-4 col-sm-4\">\n");
      out.write("                    <div class=\"well well-sm\">\n");
      out.write("                        <h4>Demander de rachat de crédit en 4 étapes</h4>\n");
      out.write("                        <p>1.Demende de rachat</p>\n");
      out.write("                        <h5>Réalizer votre demande en ligne gratuit et sans engagement</h5>\n");
      out.write("                    <p>2.Etude et Montage de dossier</p>\n");
      out.write("                    <h5>Par un de nos conseillers experts en rachat de crédit</h5><br>\n");
      out.write("                        Il sera votre interlocuteur unique.\n");
      out.write("                        <p>3.Negociation auprés de nos partenaires Bancaires</p>\n");
      out.write("                        <h5>En voi de votre dosseir auprés de notre banque</h5>\n");
      out.write("                        <p>2.Etude et Montage de dossier</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
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
