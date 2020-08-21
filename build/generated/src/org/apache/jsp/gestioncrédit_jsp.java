package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.util.Date;
import java.sql.*;

public final class gestioncrédit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Gestion des crédits</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("   <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"index.html\">UIB Direct</a> \n");
      out.write("            </div>\n");
      out.write("  <div style=\"color: white;\n");
      out.write("padding: 15px 50px 5px 50px;\n");
      out.write("float: right;\n");
      out.write("font-size: 16px;\"> ");

   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));

      out.write("<a href=\"login.html\" class=\"btn btn-danger square-btn-adjust\">Logout</a> </div>\n");
      out.write("        </nav>   \n");
      out.write("           <!-- /. NAV TOP  -->\n");
      out.write("                <nav class=\"navbar-default navbar-side\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-collapse\">\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\n");
      out.write("\t\t\t\t<li class=\"text-center\">\n");
      out.write("                    <img src=\"assets/img/mccc.jpg\" />\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    \n");
      out.write("                      <li  >   \n");
      out.write("                               <a  class=\"active-menu\" href=\"form.html\"><i class=\"fa fa-male fa-3x\" ></i>\n");
      out.write(" Espace responsable </a>\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li  >\n");
      out.write("                    <a    href=\"gestionClient.jsp\"><i class=\"fa fa-male fa-3x\"></i>Gestion des clients</a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\">Consulter client</a>\n");
      out.write("                            </li> \n");
      out.write("                       \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier client</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer client</a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </li>\t\t\t\t\n");
      out.write("\t\t\t\t\t \n");
      out.write("                  <li  >\n");
      out.write("                    <a    href=\"gestioncrédit.jsp\"><i class=\"fa fa-money fa-3x\"></i>Gestion des crédits</a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"gestioncrédit.jsp\"> Consulter crédit</a>\n");
      out.write("                            </li>    \n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\"> Ajouter crédit</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"modifclient.jsp\">Modifier crédit</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer crédit</a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                  </li>\t\t\t\t\t\n");
      out.write("                      <li  >\n");
      out.write("                    <a    href=\"#\"><i class=\"fa fa-list fa-3x\"></i>\n");
      out.write("Listes de rachat de prêt </a>\n");
      out.write("                     <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\">Consulter demande de rachat</a>\n");
      out.write("                            </li> \n");
      out.write("                       \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier demande de rachat</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer demande de rachat</a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                      </li>\n");
      out.write("                     <li  >\n");
      out.write("                        <a   href=\"simulation.jsp\"><i class=\"fa fa-list fa-3x\"></i>\n");
      out.write("Listes de demande de prêt</a>\n");
      out.write("                   <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\">Consulter demande de crédit</a>\n");
      out.write("                            </li> \n");
      out.write("                       \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier demande de crédit</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer demande de crédit/a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                     </li>\t\n");
      out.write("                   \t\t\t\t\n");
      out.write("                    <li>\n");
      out.write("                        <a  href=\"Amortissement.jsp\"><i class=\"fa fa-table fa-3x\"></i>  Tableau d'amortissement</a> </li>  \n");
      out.write("                \n");
      out.write("                </ul>\n");
      out.write("              \n");
      out.write("                  \n");
      out.write("                 \n");
      out.write("           \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </nav>  \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                     <h2>Table des crédits</h2>   \n");
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
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <center><strong>  Gestion des crédits </strong></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                             <th>NumCrédit</th>\n");
      out.write("                                            <th>NumClient</th>\n");
      out.write("                                            <th>Nature Crédit</th>\n");
      out.write("                                            <th>Nbr Echéances en(mois)</th>\n");
      out.write("                                            <th>Taux d'intéret Annuel en(%)</th>\n");
      out.write("                                            <th>Lieu Payement</th>\n");
      out.write("                                    \n");
      out.write("                                            <th>Montant</th>\n");
      out.write("                                        <th>Situation</th>\n");
      out.write("                                        <th>Etat</th>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        ");

                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe";
		
		try {
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from crédit"; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                         <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString(8));
      out.write("</td>\n");
      out.write("                                           <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                                           \n");
      out.write("                                           \n");
      out.write("                                           \n");
      out.write("                                           <td>\n");
      out.write("                                               <center> <a href ='ajoutcrd.jsp?num_c=");
      out.print(rs.getString(1));
      out.write("' ><i class=\"fa fa-pencil-square-o\"></i></a>\n");
      out.write("                                                   <br><a href ='modifcrd.jsp?num_c=");
      out.print(rs.getString(1));
      out.write("' ><i class=\"fa fa-refresh\"></i></a>\n");
      out.write("                                                       <br> <a href ='supcrd?num_c=");
      out.print(rs.getString(1));
      out.write("' ><i class=\"fa fa-trash\"></i></a></center></td>\n");
      out.write("                                        \n");
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
      out.write("                            </div>\n");
      out.write("                        </div>\n");
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
      out.write("            </div>\n");
      out.write("                <!-- /. ROW  -->\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("             <!-- /. PAGE INNER  -->\n");
      out.write("            </div>\n");
      out.write("         <!-- /. PAGE WRAPPER  -->\n");
      out.write("     <!-- /. WRAPPER  -->\n");
      out.write("    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("     <!-- DATA TABLE SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"assets/js/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dataTables-example').dataTable();\n");
      out.write("            });\n");
      out.write("    </script>\n");
      out.write("         <!-- CUSTOM SCRIPTS -->\n");
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
