<%-- 
    Document   : projetmahly
    Created on : 27 mars 2016, 17:03:37
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
    <title>1/3 votre projet immobilier Mahly</title>
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
                <a class="navbar-brand" href="index.jsp">UIB DIRECT</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> <form method="post" action="logout">
     Bienvenu <%=session.getAttribute("login")%> <input type="submit"  class="btn btn-danger " value ="Déconnexion" />
</form> </div>
       
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/hffff.jpg"/>
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
                        <a  class="active-menu" href="client.jsp"><i class="fa fa-male fa-3x" ></i>
 Espace Client </a>
                    </li>				
					 <!--<li  >
                        <a   href="login.html"><i class="fa fa-bolt fa-3x"></i> Login</a>
                    </li>	
                     <li  >
                        <a   href="registeration.html"><i class="fa fa-laptop fa-3x"></i> Registeration</a>
                    </li>-->	
					                   
                    <li>
                        <a href="client.jsp" href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="expresso.jsp">Crédit Expresso</a>
                            </li>
                            <li>
                                <a href="auto.jsp" href="#">Crédit Auto</a>
                            </li>
                            <li>
                                <a href="dari.jsp">Crédit Dari</a>
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
                    
                    <li>
                        <a  href="form.html"><i class="fa fa-eye fa-3x"></i> Suivi de votre demande </a> </li>  
                 
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <hr>
                    <img src="assets/image/img/mooo.png"/></hr>
                       
                       
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><strong>Un crédit vous engage et doit etre remboursé.Vérifiez vos capacité de remboursssement avant de vous engage. </strong></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <h4>Remplissez notre formulaire en 5 minutes si vous été rapide!
                        </h4>
            
                        
             <br><div class="col-md-8">                   
                    <div class="panel panel-default">
                        
                            
                        <div class="panel-body" class="pull-center">
                            <span class="pull-left"><img src="assets/img/3_1.png"/></span><tr><h2 class="pull-center"> Votre projet Immobilier Mahly</h2></tr>
                            <h5> Les champs marqué en * sont obligatoires</h5>
                            <span class="pull-center">
                                   
                                       <br><label>*objet du crédit</label>
                                      <select  class="form-control" > 
                                          <option>sélectionnez </option>
                                          <option>Acquisition d'un terrain</option>
                                     <option>Acquisition de logement </option>
                                      <option>Construction de logement</option> 
                                      <option>Extention de logement</option>
                                       </select>
                                      <br><label> *Montant</label>
                               <input class="form-control" />
                           <br><label>*Durée </label>
                           <input class="form-control" />
                               </select>
                               <br>
                               <a class="btn btn-primary btn-lg" role="button">VALIDER</a><tr>
                                   <span class="pull-right"><a href="#" role="button">MODIFIER</a><tr>
                                           <a href="index.jsp" role="button">ANNULER</a><tr></span>
                               </div>
                    </div>            
             </div><tr><div class="col-md-4 col-sm-4">
                    <div class="well well-sm">
                        <h4>Demander de crédit en 3 étapes</h4>
                        <p>1.Simulez</p>
                        <h5>Renseinez votre projet pour recevoir votre proposition.</h5>
                    <p>1.Demandez</p>
                        <h5>Demandez votre crédit moins de 5 minutes chrono sans engagement réponse immédiate.</h5>
                        <p>1.Validez</p>
                        <h5>Finalisez votre demande en nous adressant votre dossier complet par courieur.</h5>
                    </div>
                </div>
                 <center><img src="assets/img/dem.jpg"/></center>
                                        </div>
                                            
                   <img src="assets/img/cont.jpg"/>
             <!-- /. ROW  -->
            
                            
                      
                                           
                    
    
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
     <!-- /. WRAPPER  -->
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

