<%-- 
    Document   : gdemmahly
    Created on : 30 mars 2016, 14:38:38
    Author     : Office Info
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simulation de crédit Immobilier Mahly UIB Direct</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
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
font-size: 16px;"> <%
   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));
%><a href="login.html" class="btn btn-danger square-btn-adjust">Logout</a> </div>
       
        </nav>   
           <!-- /. NAV TOP  -->
          <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/hffff.jpg" />
					</li>
				
					
                    <li>
                        <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                     <!--<li>
                        <a  href="ui.html"><i class="fa fa-desktop fa-3x"></i> Espaceq</a>
                    </li>
                    <li>
                        <a  href="tab-panel.html"><i class="fa fa-qrcode fa-3x"></i> Tabs & Panels</a>
                    </li>
						   <li  >
                        <a   href="chart.html"><i class="fa fa-bar-chart-o fa-3x"></i> Morris Charts</a>
                    </li>	
                      <li  >
                        <a  href="table.html"><i class="fa fa-table fa-3x"></i> Table Examples</a>
                    </li>-->
                    <li>
                       <!--<form role="form" action="chart.jsp">-->
                        <a  href="client.jsp"><i class="fa fa-male fa-3x" ></i>
                                Espace Client </a>
                    </li>
                       <!--</form> >
                    </li>				
					 <!--<li  >
                        <a   href="login.html"><i class="fa fa-bolt fa-3x"></i> Login</a>
                    </li>	
                     <li  >
                        <a   href="registeration.html"><i class="fa fa-laptop fa-3x"></i> Registeration</a>
                    </li>-->	
					                   
                    <li>
                        <a href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="expresso.jsp">Crédit Expresso</a>
                            </li>
                            <li>
                                <a href="auto.jsp">Crédit Auto</a>
                            </li>
                            
                            <li>
                                <a href="#">Crédit Immobilier<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="travaux&aménagement.jsp">Immobilier Aménagement & travaux</a>
                                    </li>
                                    <li>
                                        <a href="CrdImmobilierMahly.jsp">Immobilier Mahly</a>
                                    </li>
                                    <li>
                                <a href="dari.jsp">Immobilier Dari</a>
                            </li>

                                </ul>
                               
                            </li>
                            
                        </ul>
                      </li> 
                                         
                                         
                                         
                                         
                                         
                                         
                                         
                  <!--<li  >
                        <a  href="blank.html"><i class="fa fa-square-o fa-3x"></i> Blank Page</a>
                    </li>-->
                  
                  	 <li >
                        <a   class="active-menu" href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>
 Simulation</a>
                    </li>	
                    
                   	
                </ul>
               
            </div>
            
       <li>
                        <a href="client.jsp" href="#"><i class="fa fa-edit fa-3x"></i> Faire votre demande<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="demandeCrd.jsp">Ajouter demande</a>
                            </li>
                            <li>
                                <a href="modifda.jsp" href="#">Modifier demande</a>
                            </li>
                            <li>
                                <a href="suppda.jsp">Supprimer demande</a>
                            </li>
                            
                        </ul>
                      </li>  
                   
                </ul>
               
            </div>
            
        </nav>    
<div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Table des clients</h2>   
                        
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
             
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <center><strong>  Gestion de demande de crédit Mahly </strong></center>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                              <th>Idendité</th>
                                              <tr><th>Etat Civil</th>
                                                  <th>Prénom</th>
                                              </tr>
                                            <th>Revenus</th>
                                            <th>Situation</th>
                                            <th>Charge</th>
                                            <th>Projet</th>
                                            
                                        </tr>
                                        
                                    </thead>
                                    <tbody>
                                        <%
                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe";
		
		try {
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from client"; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            %>
                                        <tr class="odd gradeX">
                                            <td><%=rs.getString(2)%></td>
                                         <td><%=rs.getString(3)%></td>
                                            <td><%=rs.getString(4)%></td>
                                            <td><%=rs.getString(5)%></td>
                                           <td><%=rs.getString(6)%></td>
                                           <td><%=rs.getString(7)%></td>
                                           <td><%=rs.getString(8)%></td>
                                           <td><%=rs.getString(9)%></td>
                                           <td><%=rs.getString(10)%></td>
                                           <td><%=rs.getString(11)%></td>
                                           <td><%=rs.getString(12)%></td>
                                           <td><center><a href ='modifclient.jsp?num_client=<%=rs.getString(2)%>' >modif</a>
                                        <a href ='supclient.jsp?num_client=<%=rs.getString(2)%>' >sup</a></center></td>
                                        
                                        </tr>
                                            <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>
                                      
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                <!-- /. ROW  -->
            
                        </div>
                    </div>
                    <!--  end  Context Classes  -->
                </div>
            </div>
                <!-- /. ROW  -->
        </div>
               
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
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
