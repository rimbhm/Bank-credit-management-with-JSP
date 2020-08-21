<%-- 
    Document   : ajotclient
    Created on : 25 mars 2016, 10:55:37
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
    <title>Enregitrez Vous Sur UIB DIRECT</title>
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
                <a class="navbar-brand" href="index.jsp">UIB DIRECT</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> <%
   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));
%> </div>
       
        </nav>   
           <!-- /. NAV TOP  -->
               </nav>   
           <!-- /. NAV TOP  -->
                 <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/mccc.jpg" />
					</li>
				
					
                    
                      <li  > <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
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
                    <li  >
                        <a  class="active-menu" href="form.html"><i class="fa fa-male fa-3x" ></i>
 Espace Client </a>
                    </li>				
					 <!--<li  >
                        <a   href="login.html"><i class="fa fa-bolt fa-3x"></i> Login</a>
                    </li>	
                     <li  >
                        <a   href="registeration.html"><i class="fa fa-laptop fa-3x"></i> Registeration</a>
                    </li>-->	
					                   
                    <li>
                        <a href="client.html" href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">Crédit Expresso</a>
                            </li>
                            <li>
                                <a href="auto.jsp">Crédit Auto</a>
                            </li>
                            <li>
                                <a href="#">Crédit Dari</a>
                            </li>
                            <li>
                                <a href="#">Crédit Immobilier<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">Immobilier Aménagement & travaux</a>
                                    </li>
                                    <li>
                                        <a href="#">Immobilier Mahly</a>
                                    </li>
                                    

                                </ul>
                               
                            </li>
                            
                        </ul>
                      </li>  
                  <!--<li  >
                        <a  href="blank.html"><i class="fa fa-square-o fa-3x"></i> Blank Page</a>
                    </li>-->
                  
                  	 <li  >
                        <a   href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>
 Simulation</a>
                    </li>	
                    
                    <!--<li>
                        <a  href="form.html"><i class="fa fa-edit fa-3x"></i> Suivi de votre demande </a> </li>-->  
                 
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper"  >
            <div id="page-inner">
                <div  class="row">
                    <div class="col-md-12">
                     <h2>BienVenue Sur UIB DIRECT</h2>   
                       <h3> Déjà 1 Million de Clients! Merci de votre confiance </h3>  
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               
           <div class="row">
                <div class="col-md-4.5 col-md-offset-4.5 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1" class="center-block">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                             <strong><strong>Nouveau Utilisateur? Enregistrer Vous</strong></strong>  
                            </div>
                            <div class="panel-body">
                              
                                
                                              <form role="form"  methode="Post" action="ajoutcl">
                                                  <br/>
                                             
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Num Client :</span>
                                            <input type="text" value="" class="form-control" name ="num_client" placeholder="Entrer votre num_client"/>
                                          
                                        </div>
                           
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Cin : </span>
                                            <input type="text" value=""  class="form-control" name ="cin" placeholder="Entrer votre Cin"/>
                                        </div> 
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Nom : </span>
                                            <input type="text" value=""  class="form-control" name ="nom" placeholder="Entrer votre nom"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Prénom :</span>
                                            <input type="text" class="form-control" value=""  name ="prenom" placeholder="Entrer votre prenom"/>
                                        </div> 
                                      
                                       
                                                  <div class="form-group input-group">
                                              <span class="input-group-addon">Etat civil :</span>
                                        <select class="form-control" name ="etat" >
                                                     <option>Monsieur</option>
                                                 <option>Madame</option>
                                            <option>Mademoiselle</option>
                                                       </select> </div>
                                       <div class="form-group input-group">
                                            <span class="input-group-addon">Date de naissance :</span>
                                            <input type="text" class="form-control" value="" name ="date_naissance" placeholder="JJ/MM/AAAA"/>
                                        </div>
                                        
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Email @:</span>
                                            <input type="text" class="form-control" value=""  name ="email" placeholder="aaaaa@gmail.com"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Adresse:</span>
                                            <input type="text" value=""  class="form-control" name ="adresse" placeholder="Entrer votre adresse"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Nationalité:</span>
                                            <input type="text" value=""  class="form-control" name ="nationalite" placeholder="Entrer votre  nationalite"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Téléphone :</span>
                                            <input type="text" value="" class="form-control" name ="telephone" placeholder="Entrer votre  tel" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Num Compte :</span>
                                            <input type="text" class="form-control"  name ="ncompte" placeholder="Entrer votre num de compte"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">Type :</span>
                                            <input type="text" class="form-control"  name ="type"  placeholder="Entrer votre type"/>
                                        </div>
                                      <div class="form-group input-group">
                                            <span class="input-group-addon">Login :</span>
                                            <input type="text" class="form-control" name ="login" placeholder="Entrer votre login" />
                                        </div>
                                     <div class="form-group input-group">
                                            <span class="input-group-addon">Password :</span>
                                            <input type="password" class="form-control" name ="password" placeholder="Retype Password" />
                                        </div>
                                     
                                    
                                          <input type=submit class="btn btn-info " value="Enregistrer">
                                         <input type=reset class="btn btn-primary " value="Annuler" onclick="window.location.replace('client.jsp')">
                                    
                                        </form>
                                       
                            </div>
                     
                        </div>
                    </div>
                
                
        </div
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

