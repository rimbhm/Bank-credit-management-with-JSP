<%-- 
    Document   : responsable1
    Created on : 7 mars 2016, 15:04:49
    Author     : Office Info
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>UIB Direct</title>
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
                        <a  href="gestionrachat.jsp"><i class="fa fa-pencil fa-3x"></i> Gestion des Demandes de rachat </a>
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
                    <div class="col-md-12">
                     <hr>
                     <img src="assets/img/w.png"/></hr>
                          
                        <h3> </h3>
                       <h3> </h3>
                       <h3> </h3>
                       <h3>  </h3>
                    </div>
                </div>
                 <!-- /. ROW  -->
                 
                      
                               <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong>Espace Administrateur</strong> 
                        </div>
                        <div class="panel-body">
                            <div> <h5> </h5>
                            
                                    
                             <%
     
        String nom =session.getAttribute("login").toString();
          
                                           %>
                             <a href="modifresp.jsp?login=<%=nom%>" class="btn btn-primary" ><i class="fa fa-edit "></i> Modifier mes informations personnelles</a>
                                 <a href ='supresp?login=<%=nom%>' class="btn btn-danger"><i class="fa fa-pencil"></i> Supprimer mon compte</a>
                            
                            
                            </div>
                     <div class="row"> 
                     </div>
                        </div>
                    </div>            
                </div>
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
               
                         
                                
                </div> 
                
           </div>
                 <!-- /. ROW  -->
               <!-- <div class="row">                     
                      
                               <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Donut Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-donut-chart"></div>
                        </div>
                    </div>            
                </div>
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Line Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-line-chart"></div>
                        </div>-->
                    </div>            
               
                 <!-- /. ROW  -->
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
     <!-- MORRIS CHART SCRIPTS -->
     <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
