<%-- 
    Document   : TableauAmortissement
    Created on : 20 mars 2016, 17:10:13
    Author     : Office Info
--%>

<%@page import="java.sql.*"%>
<%@page import="src.com.classes.demande"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Tableau d'amortissement</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
   
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
     <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
</head>
<body>
     <div id="wrapper">
            <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">UIB Direct</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="chart.jsp">UIB DIRECT</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"><form method="post" action="logout1">
     Bienvenu <%=session.getAttribute("login")%> <input type="submit"  class="btn btn-danger " value ="Déconnexion" />
</form></div>
       
        </nav>   
           <!-- /. NAV TOP  -->
                  <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/pc2222.png" />
					</li>
		  
                     <li>
                        <a class="active-menu" href="responsable1.jsp"><i class="fa fa-male fa-3x"></i> Espace Responsable</a>
                    </li>
                   
                    <li>
                        <a  href="gestionClient.jsp"><i class="fa fa-male fa-3x" ></i> Gestion des Client </a></li>				
                    
                     <li>
                        <a href="#" ><i class="fa fa-euro fa-3x"></i>Gestion des Crédits<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="gestioncrédit.jsp">Liste des crédits </a>
                            </li>
                            <li>
                                <a  href="ajoutcrd.jsp">Nouveau crédit</a>
                            </li>
                          
                            
                        </ul>
                      </li>  
                   <li>
                        <a  href="gestiondemande.jsp"><i class="fa fa-pencil fa-3x"></i> Gestion des Demandes </a>
                    </li>
                     <li>
                        <a  href="listenotif.jsp"><i class="fa fa-envelope fa-3x"></i> Notifications</a>
                    </li>
                     <li>
                        <a   href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>Simulation</a>
                    </li>	
                    
                     </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                      <%
       
        demande c =new demande();
   
         int num =Integer.parseInt(request.getParameter("num"));
           
            c.setNum(num);
            c.setdemande(num);
               String typec= c.getCredit();
            
           %> 
                    <div class="col-md-12">
                        <center>  <h4>Demande N°<%=c.getNum()%> pour le Client <%=c.getClient()%> </h4></center>
                        <Br>
                     <label>Durée en mois</label>
                     <input class="form-petit" value="<%=c.getDuree_cred()%>"/>  
                               <%
               Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try {
                  
			   String nom =session.getAttribute("login").toString();
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from crédit where type = '"+ typec + "'"; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                            
                            
                            
                       
           %> 
                    <label>Taux d'intérêt (annuel) </label>
                     <input class="form-petit" value="<%=rs.getString(2)%>"/>%
                    
                    <label>Montant total du prêt en (DT) </label>
                     <input class="form-petit" value="<%=c.getMontant_cred()%>" />
                      <a href="javaScript:{openPopUp();}" class="btn btn-success" >Gérer le tableaux</a>
                                    
                    </div>
                    <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>
                </div>
                 <!-- /. ROW  -->
                 <hr />
                <div id="divId" style="display:none;">
                   
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <center> <h2>Tableau d'amortissement</h2></center>
                        </div>
                        
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                            <th class="center">N°d'ordre</th>
                                            <th class="center">Date echéance</th>
                                            <th class="center">Montant en principale</th>
                                            <th class="center">Montant en intérets</th>
                                            <th class="center">Totale par échéance</th>
                                            <th class="center"> Capitale restant</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="odd gradeX">
                                            <td>Trident</td>
                                            <td>Internet Explorer 4.0</td>
                                            <td>Win 95+</td>
                                            <td class="center">4</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="even gradeC">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.0</td>
                                            <td>Win 95+</td>
                                            <td class="center">5</td>
                                            <td class="center">C</td>
                                        </tr>
                                        <tr class="odd gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.5</td>
                                            <td>Win 95+</td>
                                            <td class="center">5.5</td>
                                            <td class="center">A</td>
                                        </tr>
                                  
                                       
                                       
                                    </tbody>
                                </table>
                            </div>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                <!-- /. ROW  -->
           
        
        </div>
               
    </div>
             <!-- /. PAGE INNER  -->
            </div>
  <script>   
           function openPopUp()
{
     $('#divId').css('display','block');
      $('#divId').dialog();
}
                                  
                                             </script> 
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- DATA TABLE SCRIPTS -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
        <script>
            $(document).ready(function () {
                $('#dataTables-example').dataTable();
            });
    </script>
         <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
