package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import src.com.classes.*;
import java.text.DateFormat;
import java.util.Date;

public final class accepter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>votre demande de crédit</title>\n");
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
      out.write("font-size: 16px;\"><form method=\"post\" action=\"logout1\">\n");
      out.write("     Bienvenu ");
      out.print(session.getAttribute("login"));
      out.write(" <input type=\"submit\"  class=\"btn btn-danger \" value =\"Déconnexion\" />\n");
      out.write("</form></div>\n");
      out.write("       \n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                  <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/pc2222.png\" />\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t  \n");
      out.write("                     <li>\n");
      out.write("                        <a class=\"active-menu\" href=\"responsable1.jsp\"><i class=\"fa fa-male fa-3x\"></i> Espace Responsable</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"gestionClient.jsp\"><i class=\"fa fa-male fa-3x\" ></i> Gestion des Client </a></li>\t\t\t\t\n");
      out.write("                    \n");
      out.write("                     <li>\n");
      out.write("                        <a href=\"#\" ><i class=\"fa fa-euro fa-3x\"></i>Gestion des Crédits<span class=\"fa arrow\"></span></a>\n");
      out.write("                        \n");
      out.write("                        <ul class=\"nav nav-second-level\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"gestioncrédit.jsp\">Liste des crédits </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a  href=\"ajoutcrd.jsp\">Nouveau crédit</a>\n");
      out.write("                            </li>\n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                      </li>  \n");
      out.write("                   <li>\n");
      out.write("                        <a  href=\"gestiondemande.jsp\"><i class=\"fa fa-pencil fa-3x\"></i> Gestion des Demandes </a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a  href=\"gestiondemande.jsp\"><i class=\"fa fa-envelope fa-3x\"></i> Notifications</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a   href=\"simulation.jsp\"><i class=\"fa fa-calculator fa-3x\"></i>Simulation</a>\n");
      out.write("                    </li>\t\n");
      out.write("                    \n");
      out.write("                     </ul>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        \n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                \n");
      out.write("                     \n");
      out.write("                       <img src=\"assets/img/cc.jpg\"/>\n");
      out.write("                       \n");
      out.write("                       <div class=\"panel panel-default\">\n");
      out.write("                                    <div class=\"panel-heading\">\n");
      out.write("                                        <h4 class=\"panel-title\">\n");
      out.write("                                            <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\"><strong>Un crédit vous engage et doit etre remboursé.Vérifiez vos capacité de remboursssement avant de vous engage. </strong></a>\n");
      out.write("                                        </h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapseTwo\" class=\"panel-collapse in\" style=\"height: auto;\">\n");
      out.write("                                        <div class=\"panel-body\">\n");
      out.write("                                          \n");
      out.write("            \n");
      out.write("                        \n");
      out.write("             <br><div class=\"col-md-12 col-sm-4\">                   \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        \n");
      out.write("             ");

       
        demande c =new demande();
   
         int num =Integer.parseInt(request.getParameter("num"));
           
            c.setNum(num);
            c.setdemande(num);
            
           
      out.write(" \n");
      out.write("           <div class=\"panel-body\" class=\"pull-center\">\n");
      out.write("            <span class=\"pull-left\"><img src=\"assets/img/r.png\"/></span><tr><h2 class=\"pull-center\"> Demande de crédit numéro ");
      out.print(num);
      out.write(" </h2></tr>\n");
      out.write("                      \n");
      out.write("         \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                           Veuillez donner le motif de votre décision.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("              \n");
      out.write("       \n");
      out.write("      \n");
      out.write("                                  <form role=\"form\"  methode =\"Post\" action=\"accept\">\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                      <label>Num de demande :</label>\n");
      out.write("                          <input type=\"text\" name =\"num\" value=\"");
      out.print(num);
      out.write("\" class=\"form-control\"/>\n");
      out.write("                      \n");
      out.write("                                 </div>\n");
      out.write("                                      \n");
      out.write("                                       <div class=\"form-group\">\n");
      out.write("                                            <label>Motif : </label>\n");
      out.write("                                            <textarea name =\"motif\" class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=submit class=\"btn btn-success \" value=\"Enregistrer & gére le tableau d'amortissement\">\n");
      out.write("                                         \n");
      out.write("                                            \n");
      out.write("\n");
      out.write("                                            <a href=\"javaScript:{openPopUp();}\" class=\"btn btn-success\">Gérer une notification</a>\n");
      out.write("                                                 \n");
      out.write("                                            function openPopUp()\n");
      out.write("{\n");
      out.write("                                                $('#divId').css('display','block');\n");
      out.write("                                              $('#divId').dialog();\n");
      out.write("}\n");
      out.write("                                  \n");
      out.write("                                         \n");
      out.write("                                            <a  href=\"gestiondemande.jsp\">  <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("                                      Annuler\n");
      out.write("                                     </button></a>\n");
      out.write("                                    </form>\n");
      out.write("                                      \n");
      out.write("                                     \n");
      out.write("                               \n");
      out.write("                              \n");
      out.write("                           </div>\n");
      out.write("                          \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("         \n");
      out.write("               </div>\n");
      out.write("                </div>            \n");
      out.write("             </div>\n");
      out.write("                              \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                  </div>\n");
      out.write("                                            \n");
      out.write("                   <img src=\"assets/img/cont.jpg\"/>\n");
      out.write("                   \n");
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
      out.write("                       </div></div></div></div>\n");
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
