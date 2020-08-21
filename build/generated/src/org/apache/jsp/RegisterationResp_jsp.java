package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterationResp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Free Bootstrap Admin Template : Binary Admin</title>\n");
      out.write("\t<!-- BOOTSTRAP STYLES-->\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- FONTAWESOME STYLES-->\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CUSTOM STYLES-->\n");
      out.write("    <link href=\"assets/css/custom.css\" rel=\"stylesheet\" />\n");
      out.write("     <!-- GOOGLE FONTS-->\n");
      out.write("   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row text-center  \">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <br /><br />\n");
      out.write("                <h2> Bienvenue</h2>\n");
      out.write("               \n");
      out.write("                <h5>( Enregister vous pour l'accer )</h5>\n");
      out.write("                 <br />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"row\">\n");
      out.write("               \n");
      out.write("                <div class=\"col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                        <strong>  Vous éte un nouveau utilisateur ? Enregistrer vous </strong>  \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <form role=\"form\">\n");
      out.write("<br/>\n");
      out.write("                                       <!-- <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-circle-o-notch\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Cin\" />\n");
      out.write("                                        </div>-->\n");
      out.write("                                     <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Nom\" />\n");
      out.write("                                        </div>\n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Prénom\" />\n");
      out.write("                                        </div>\n");
      out.write("                                      \n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Téléphone\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Lieu_Travail\" />\n");
      out.write("                                        </div>   \n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\">@</span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"E-mail\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Login\" />\n");
      out.write("                                        </div>\n");
      out.write("                                     <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" />\n");
      out.write("                                        </div>\n");
      out.write("                                     \n");
      out.write("                                     <a href=\"index.html\" class=\"btn btn-success \">Enregisrer</a>\n");
      out.write("                                    <hr />\n");
      out.write("                                    <!--Already Registered ?  <a href=\"login.html\" >Login here</a>-->\n");
      out.write("                                    </form>\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->\n");
      out.write("    <!-- JQUERY SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\n");
      out.write("      <!-- BOOTSTRAP SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- METISMENU SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\n");
      out.write("      <!-- CUSTOM SCRIPTS -->\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
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
