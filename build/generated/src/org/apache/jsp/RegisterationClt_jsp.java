package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;
import java.sql.*;

public final class RegisterationClt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/conexion.jsp");
  }

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
 Connection conex=null;
Statement sql=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    conex=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1/pfe","root","");
    sql=conex.createStatement();
    out.print("connection etabli");
}catch(Exception e){
    out.print("erreur");
}





      out.write('\n');
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
      out.write("               <!-- <h2> Bienvenue</h2>\n");
      out.write("               \n");
      out.write("                <h5> Inscriez -vous </h5>-->\n");
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
      out.write("                               ");
      out.write('\n');

    String c=request.getParameter("cin");
String n=request.getParameter("nom");
String p=request.getParameter("prenom");
String date=request.getParameter("dn");
String mail=request.getParameter("mail");
String adresse=request.getParameter("adresse");
String nationnalite=request.getParameter("natio");
String telephone=request.getParameter("telepho");
String compte=request.getParameter("compte");
String type=request.getParameter("type");
String login=request.getParameter("log");
String passwrd=request.getParameter("passwrd");
if(n!=null && p!=null && date!=null && mail!=null && adresse!=null && nationnalite!=null && telephone!=null && compte!=null && type!=null && login!=null && passwrd!=null)
{
String qry="insert into client(cin,nom,prenom,date_naissance,email,adresse,nationnalite,telephone,ncompte,type)values ('"+c+"','"+n+"','"+p+"','"+date+"','"+mail+"','"+adresse+"','"+nationnalite+"','"+telephone+"','"+compte+"','"+type+"')";
  String q="insert into utilisateur (login,password)values('"+login+"','"+passwrd+"')";      
       sql.executeUpdate(qry); 
     out.println("client ajouté");  
}else{
    
   
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form  action=\"RegisterationClt.jsp\" method=\"post\" role=\"form\">\n");
      out.write("                                      <br/>\n");
      out.write("                                        <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-circle-o-notch\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Cin\" name=\"cin\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                     <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Nom\" name=\"nom\" />\n");
      out.write("                                        </div>\n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Prénom\" name=\"prenom\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                         <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Date_Naissance\" name=\"dn\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\">@</span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"E-mail\" name=\"mail\"/>\n");
      out.write("                                        </div>                                      \n");
      out.write("                           <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Adresse\" name=\"adresse\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                         <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Nationnalité\" name=\"natio\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                   <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Téléphone\" name=\"telepho\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"N°Compte\" name=\"compte\"/>\n");
      out.write("                                        </div>   \n");
      out.write("                                   \n");
      out.write("                                        <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-tag\"  ></i></span>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Type\" name=\"type\"/>\n");
      out.write("                                        </div>   \n");
      out.write("                                <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Login\" name=\"log\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                     <div class=\"form-group input-group\">\n");
      out.write("                                            <span class=\"input-group-addon\"><i class=\"fa fa-lock\"  ></i></span>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"passwrd\" />\n");
      out.write("                                        </div>\n");
      out.write("                                     <input type=\"submit\" value=\"Enregistrer\"/>\n");
      out.write("                                     <!--<a href=\"Client.jsp\" class=\"btn btn-success\" >Enregisrer</a>-->\n");
      out.write("                                    <hr />\n");
      out.write("                                   Already Registered ?  <a href=\"client.jsp\" >authentifier ici</a>\n");
      out.write("                                    </form>\n");
      out.write("   ");
}//else
      out.write("\n");
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
