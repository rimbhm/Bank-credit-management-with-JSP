<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simulez votre projet</title>
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
                <a class="navbar-brand" href="simulation.jsp">UIB DIRECT</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"> <%
   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));
%></div>
       
        </nav>   
           <!-- /. NAV TOP  -->
               <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/so.jpg" />
					</li>
				
					
                    <li>
                        <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                 
                    <li>
                       <!--<form role="form" action="chart.jsp">-->
                        <a  href="client.jsp"><i class="fa fa-male fa-3x" ></i>
                                Espace Client </a>
                    </li>
                      	                   
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
                   
                  
                  	 <li  >
                        <a  class="active-menu"  href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>
 Simulation</a>
                    </li>	
                    
                   	
                </ul>
               
            </div>
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h2>un crédit vous engage et doit etre remboursé. vérifiez vos capacités de rembourssement avant de vous engager</h2>
                        <hr>
                     
                            <img src="assets/img/s.jpg"/></hr>
                        <img src="assets/img/s1.jpg"/></hr>
                        <img src="assets/img/slide1.png"/>
                            <!--<center><img src="assets/img/connn.png" /></center>-->
                       <h1> <rihght>Simulez votre crédit en 5 minutes</rihght></h1>

                          
                        <h3> </h3>
                       <h3> </h3>
                       <h3> </h3>
                       <h3>  </h3>
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <div class="row">
                <div class="col-md-4 col-sm-4">
                     <div class="panel panel-default">
                        <div class="panel-heading">
                            <h5> crédit Expresso </h5>
                        </div>
                        <div class="panel-body">
                            <img src="assets/img/exp1.jpg">
                        </div>
                        <div class="panel-footer">
                            <h5> 
                             Avec Expresso Réalisez vos projet:
                             projet de  voiture, anticipation de l'arrivée de bébé, financement de votre mariage, projet de vacance, projet de travaux .</h5>
                        <a href="#" class="btn btn-default" ><i class="fa fa-calculator fa-1x"></i>Simuler votre prêt Expresso</a>
                        </div>
                        
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h5>Crédit Auto</h5>
                        </div>
                        <div class="panel-body">
                            <center> <img src="assets/img/vv.jpg"/></center>
                        </div>
                        <div class="panel-footer">
                             <h5>Crédit Auto est le meilleur moyen pour vous ouffrir le voiture neuf ou d'occasion de moins de 3 ans.</h5>
                        <a href="auto.jsp" class="btn btn-primary"><i class="fa fa-calculator fa-1x"></i>Simuler votre prêt Auto</a>
                        </div>
                        
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            crédit Dari
                        </div>
                        <div class="panel-body">
                            <center><img src="assets/img/dd.jpg"/></center>
                        </div>
                        <div class="panel-footer">
                            
                               <h5> Le plan epargne logement DARI est la clé de tous vos projets immobilier.DARI vous permet d'associer simplicité d'épargne et rapidité dans l'octroi du crédit</h5>
                         <a href="dari.jsp" class="btn btn-success"><i class="fa fa-calculator fa-1x"></i>Simuler votre prêt Dari</a>
                        </div>
                        
                    </div>
                </div>
            </div>
                   <!-- /. ROW  -->
                   <hr>
                   <div class="row">
                <div class="col-md-4 col-sm-4">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            Crédit Aménagement et Travaux
                        </div>
                        <div class="panel-body">
                            <img src="assets/img/ct.jpg"/>
                        </div>
                        <div class="panel-footer">
                            <h5>Crédit Aménagement et Travaux est la solution la plus adapté pour vos petits et gros travaux.</h5>
                        <a href="travaux&aménagement.jsp" class="btn btn-info"><i class="fa fa-calculator fa-1x"></i>Simuler votre prêtTravaux </a>
                        </div>
                    </div>
                </div></hr>
            </hr><div class="col-md-4 col-sm-4">
                    <div class="panel panel-warning">
                        <div class="panel-heading">
                            Crédit Immobilier Mahly
                            
                        </div>
                        <div class="panel-body">
                         <img src="assets/img/construction.jpg"/> 
                        </div>
                        <div class="panel-footer">
                            <h5>vous permet de financer :
 L'acquisition d'un logement neuf ou ancien ou d'un terrain à usage d'habitation
 , La construction d'un logement
 et L'extension de votre logement.</h5>
                        <a href="CrdImmobilierMahly.jsp" class="btn btn-warning"><i class="fa fa-calculator fa-1x"></i>Simuler votre prêt Mahly</a>

                        </div>
                    </div>
            </div></hr>
            <hr> 
               <img src="assets/img/pret.jpg" />
            <!--<div class="col-md-4 col-sm-4">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            Danger Panel
                        </div>
                        <div class="panel-body">
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.</p>
                        </div>
                        <div class="panel-footer">
                            Panel Footer
                        </div>
                    </div>
                </div>
            </div>
                    <!-- /. ROW  -->
            
                </div>
               
                 <!-- /. ROW  -->
    </div>
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

