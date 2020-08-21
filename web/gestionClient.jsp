<%-- 
    Document   : gestionClient
    Created on : 25 mars 2016, 09:51:04
    Author     : Office Info
--%>

<%@page import="src.com.classes.client"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="java.sql.*"%>



<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Gestion des Client</title>
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
                        <a  href="responsable1.jsp"><i class="fa fa-male fa-3x"></i> Espace Responsable</a>
                    </li>
                   
                    <li>
                        <a  class="active-menu" href="gestionClient.jsp"><i class="fa fa-male fa-3x" ></i> Gestion des Client </a></li>				
                    
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
                        <a  href="gestiondemande.jsp"><i class="fa fa-envelope fa-3x"></i> Notifications</a>
                    </li>
                     <li>
                        <a   href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>Simulation</a>
                    </li>	
                    
                     </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
         
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Table des clients</h2>   
                        
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                 
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <center><strong>  Gestion des clients </strong></center>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                            <div class="col-sm-6">
                    <div id="dataTables-example_filter" class="dataTables_filter">
                  <label>Rechercher :<input type="search" class="form-control input-sm" aria-controls="dataTables-example"/>
                  </label> </div>
                            </div>
                                
                                
                                <table class="table table-striped table-bordered table-hover" >
                                    <thead>
                                        <tr>
                                              <th>NumClient</th>
                                            <th>Cin</th>
                                            <th>Nom</th>
                                            <th>Prénom</th>
                                      
                                            <th>Date naissance</th>
                                           
                                            <th>Tel</th>
                                            <th>Num compte</th>
                                            <th>Type</th>
                                            <th>Login</th>
                                            <th>Password</th>
                                        </tr>
                                        
                                    </thead>
                                    <tbody>
                                        <%
                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
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
                                           <td><%=rs.getString(7)%></td>
                                          
                                          
                                           
                                           <td><%=rs.getString(11)%></td>
                                           <td><%=rs.getString(12)%></td>
                                           <td><%=rs.getString(13)%></td>
                                           <td><%=rs.getString(14)%></td>
                                           <td><%=rs.getString(15)%></td>
                                           <td><center> <a href ='affclient.jsp?id=<%=rs.getString(1)%>' ><i class="fa fa-eye "></i></a>
                                        
                                           <a href ='supclient?id=<%=rs.getString(1)%>' ><i class="fa fa-trash"></i></a></center></td>
                                        
                                        </tr>
                                            <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>
                                      
                                    </tbody>
                                </table>
                                 <div class="row"><div class="col-sm-6"><div class="dataTables_info" id="dataTables-example_info" role="alert" aria-live="polite" aria-relevant="all"></div></div><div class="col-sm-6"><div class="dataTables_paginate paging_simple_numbers" id="dataTables-example_paginate"><ul class="pagination"><li class="paginate_button previous disabled" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous"><a href="#">Précédent</a></li><li class="paginate_button active" aria-controls="dataTables-example" tabindex="0"><a href="#">1</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">2</a></li><li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next"><a href="#">Suivant</a></li></ul></div></div></div>               
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
          
                <!-- /. ROW  -->
       
               
  
             <!-- /. PAGE INNER  -->
     
         <!-- /. PAGE WRAPPER  -->
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
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
