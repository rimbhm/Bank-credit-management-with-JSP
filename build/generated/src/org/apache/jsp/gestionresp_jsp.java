package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import src.com.classes.client;
import java.util.Date;
import java.text.DateFormat;
import java.sql.*;

public final class gestionresp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("      <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Inscription de responsable</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- MORRIS CHART STYLES-->\n");
      out.write("   \n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("     <!-- TABLE STYLES-->\n");
      out.write("    <link href=\"assets/js/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
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
      out.write("               </nav>   \n");
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
      out.write("                               <a  class=\"active-menu\" href=\"responsable.jsp\"><i class=\"fa fa-male fa-3x\" ></i>\n");
      out.write(" Espace responsable </a>\n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                              \n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                    <a    href=\"gestionClient.jsp\"><i class=\"fa fa-university fa-3x\"></i>Gestion des clients</a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\">Consulter client</a>\n");
      out.write("                            </li> \n");
      out.write("                        \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier client</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer client</a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                    </li>\t\t\t\t\n");
      out.write("\t\t\t\t\t \n");
      out.write("                  <li>\n");
      out.write("                    <a    href=\"responsable.jsp\"><i class=\"fa fa-university fa-3x\"></i>Gestion des crédits</a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                        <li>\n");
      out.write("                                <a href=\"#\"> Consulter crédit</a>\n");
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
      out.write("                    <a    href=\"#\"><i class=\"fa fa-list fa-3x\"></i>Listes de rachat de prêt </a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                           \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier demande</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer demande</a>\n");
      out.write("                            </li>\n");
      out.write("                    </ul>\n");
      out.write("                      </li>\n");
      out.write("                     <li>\n");
      out.write("                        <a   href=\"#\"><i class=\"fa fa-list fa-3x\"></i>Listes de demande de prêt</a>\n");
      out.write("                    <ul class=\"nav nav-second-level\">\n");
      out.write("                           \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Modifier demande</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">Supprimer demande</a>\n");
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
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("         \n");
      out.write("        <!-- /. NAV SIDE  -->\n");
      out.write("        <div id=\"page-wrapper\" >\n");
      out.write("            <div id=\"page-inner\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                     <h2>Table des clients</h2>   \n");
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
      out.write("                            <center><strong>  Gestion des responsable </strong></center>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                              \n");
      out.write("                                            <th>Nom</th>\n");
      out.write("                                            <th>Prénom</th>\n");
      out.write("                                            \n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                           \n");
      out.write("                                            <th>Téléphone</th>\n");
      out.write("                                            <th>Lieu de travail</th>\n");
      out.write("                                            \n");
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
                        String query ="select * from responsable"; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            
      out.write("\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
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
      out.write("                                           \n");
      out.write("                                           <td>\n");
      out.write("                                               <center><a href ='modifres.jsp?id_resp=");
      out.print(rs.getString(2));
      out.write("'><i class=\"fa fa-refresh\"></i>modif</a>\n");
      out.write("                                        <a href ='supcres?id_resp=");
      out.print(rs.getString(2));
      out.write("' ><i class=\"fa fa-trash\"></i>sup</a></center></td>\n");
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
