package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;
import src.com.servlet.*;
import src.com.classes.*;
import java.sql.*;

public final class gestionrachat_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title> Espace responsable</title>\n");
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
      out.write("    \n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("   <nav class=\"navbar navbar-default navbar-cls-top \" role=\"navigation\" style=\"margin-bottom: 0\">\n");
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
      out.write("                        <a href=\"responsable1.jsp\"><i class=\"fa fa-male fa-3x\"></i> Espace Responsable</a>\n");
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
      out.write("                        <a class=\"active-menu\" href=\"gestiondemande.jsp\"><i class=\"fa fa-pencil fa-3x\"></i> Gestion des Demandes </a>\n");
      out.write("                    </li>\n");
      out.write("                      <li>\n");
      out.write("                        <a  href=\"gestionrachat.jsp\"><i class=\"fa fa-pencil fa-3x\"></i> Gestion des Demandes de rachat </a>\n");
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
      out.write("     <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                     <h2>Table des demandes de rachat</h2>   \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 <!-- /. ROW  -->\n");
      out.write("                 <hr />\n");
      out.write("               \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <!-- Advanced Tables -->\n");
      out.write("                 \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <center><strong>  Liste des demandes de rachat </strong></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                    <div id=\"dataTables-example_filter\" class=\"dataTables_filter\">\n");
      out.write("                  <label>Rechercher :<input type=\"search\" class=\"form-control input-sm\" aria-controls=\"dataTables-example\">\n");
      out.write("                    </div></div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <th>Num</th>\n");
      out.write("                                              <th>client</th>\n");
      out.write("                                          <th>Situation</th>\n");
      out.write("                                          <th>Personne à charge</th>\n");
      out.write("                                         \n");
      out.write("                                            <th>Statut professionnel</th>\n");
      out.write("                                      \n");
      out.write("                                            <th>Durée d'activié</th>\n");
      out.write("                                             <th>Salaire mensuel net</th>\n");
      out.write("                                            \n");
      out.write("                                             <th>Montant</th>\n");
      out.write("                                             <th>Durée</th>\n");
      out.write("                                             <th>Etat</th>\n");
      out.write("                                         \n");
      out.write("                                      \n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try {
			  
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from rachat where etat = 'en cours' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                           <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                              <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                         <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                          \n");
      out.write("                                           <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                          <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                          <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                       \n");
      out.write("                                             <td>");
      out.print(rs.getString(16));
      out.write("</td>\n");
      out.write("                                               <td>");
      out.print(rs.getString(17));
      out.write("</td>\n");
      out.write("                                               <td>");
      out.print(rs.getString(18));
      out.write("</td>\n");
      out.write("                                           <td><center>\n");
      out.write("                                        <td><center> <a href ='affrachatresp.jsp?num=");
      out.print(rs.getString(1));
      out.write("' ><i class=\"fa fa-eye \"></i></a>\n");
      out.write("                                        \n");
      out.write("                                                   <a href ='modifrachat.jsp?num=");
      out.print(rs.getString(1));
      out.write("'><i class=\"fa fa-pencil-square-o\"></i></a>\n");
      out.write("                                      \n");
      out.write("                              \n");
      out.write("                               </center>\n");
      out.write("                                   </td>       \n");
      out.write("                                        </tr>\n");
      out.write("                                            ");

                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                
      out.write("\n");
      out.write("                                      \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                 <div class=\"row\"><div class=\"col-sm-6\"><div class=\"dataTables_info\" id=\"dataTables-example_info\" role=\"alert\" aria-live=\"polite\" aria-relevant=\"all\"></div></div><div class=\"col-sm-6\"><div class=\"dataTables_paginate paging_simple_numbers\" id=\"dataTables-example_paginate\"><ul class=\"pagination\"><li class=\"paginate_button previous disabled\" aria-controls=\"dataTables-example\" tabindex=\"0\" id=\"dataTables-example_previous\"><a href=\"#\">Précédent</a></li><li class=\"paginate_button active\" aria-controls=\"dataTables-example\" tabindex=\"0\"><a href=\"#\">1</a></li><li class=\"paginate_button \" aria-controls=\"dataTables-example\" tabindex=\"0\"><a href=\"#\">2</a></li><li class=\"paginate_button next\" aria-controls=\"dataTables-example\" tabindex=\"0\" id=\"dataTables-example_next\"><a href=\"#\">Suivant</a></li></ul></div></div></div>               \n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--End Advanced Tables -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <!-- /. ROW  -->\n");
      out.write("            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!--  end  Context Classes  -->\n");
      out.write("                </div>\n");
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
      out.write("\n");
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
