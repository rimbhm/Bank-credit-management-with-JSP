<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
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
                    <span class="sr-only">  UIB DIRECT</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                
                </button>
               
                <a class="navbar-brand" href="accueil.jsp" >  UIB  DIRECT </a> 
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
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/pc2222.png" />
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                     
                    <li>
                       <!--<form role="form" action="chart.jsp">-->
                        <a  href="client.jsp"><i class="fa fa-male fa-3x" ></i>
                                Espace Client </a>
                    </li>
                   <li>
                       <!--<form role="form" action="chart.jsp">-->
                        <a  href="responsable.jsp"><i class="fa fa-male fa-3x" ></i>
                                Espace Responsble </a>
                    </li>
					                   
                    <li>
                        <a href="#"><i class="fa fa-money fa-3x"></i> Nos Cr�dits Consommation<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="expresso.jsp">Cr�dit Expresso</a>
                            </li>
                            <li>
                                <a href="auto.jsp">Cr�dit Auto</a>
                            </li>
                            
                            <li>
                                <a href="#">Cr�dit Immobilier<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="travaux&am�nagement.jsp">Immobilier Am�nagement & travaux</a>
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
                        <a    href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>
 Simulation</a>
                    </li>	
                    
              	 	
               	
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
     <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>Bienvenue sur UIBDIRECT</h2>   
                        <h3> D�j� 1 Million de Clients! Merci de votre confiance </h3>
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr>
             
                 <center>  <img src ="assets/img/a1.jpg"/></center>
                
            <hr/>
                 <!-- /. ROW  -->
                 <br> <div class="row"> 
                    
                      
                       <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
               
                            <h2> Pourquoi choisir notre Banque UIB DIRECT? </h2>
                        </div>
                        <div class="panel-body">
                            <div > <strong>30 Ann�es au services de nos client pour les aider � concr�tiser leurs projets apr�s une �tude personnalis�e de leur dossier.</strong></div>
                            <strong><br> 127 Agences ouvertes 5 jours sur 7 jusqu'� 17h du lundi au vendredi.</br></strong>
                            <strong> <br>B�n�ficiez de la qualit� de services UIB DIRECT gr�ce � notre �quipe sp�cialistes.</br>
                        
</strong>
                        </div>
                        
                    </div>            
                </div>
                         
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2>Votre cr�dit en ligne avec UIB DIRECT</h2>
                        </div>
                        <div class="panel-body">
                            <div ><strong>D�couvrez notre offre de cr�dits adapte� � votre situation:<strong>
                                        <strong> <br> Besoin d'argent? Achat impr�vus? projet d'avenir? Achaque projet D�couvrez la simulation sans engagement, la demande de votre cr�dit 100% en ligne.
                                        </strong>
                                                <!--<br><div class="col-md-6 col-sm-12 col-xs-12">                     
                   
                                     
                                            
                                                -->
                           
                            </div>
                        </div>
                    
                    </div>            
                </div>
                    </div> 
                     <div class="row">                     
                      
                               <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2> Comment obtenez votre cr�dit en ligne?</h2>
                        </div>
                        <div class="panel-body">
                            
                        </div>
                     <div >
                         <!--<span class="pull-left"><img src="assets/img/nb1.png"/></span>-->
                         <h3> 1�re �tape:Simulez votre cr�dit</h3>
                         <strong> Vous choisissez et simulez votre cr�dit, remplaissez le formulaire de simulation pour savoir combien emprunter sur la base de vos revenus.
                         </strong>
                             <br><h3> 2�me �tape:Demandez votre cr�dit</h3>
                                 <strong> vous remplissez le formulaire en ligne.</strong>
                                 <strong> <br> Il vous suffira ensuite d'imprimer votre dossier de demande de financement personalis�.</strong>
                           <br><h3> 3�me �tape:Envoyer-nous votre dossier complet</h3>
                               <strong>  Vous nous envoyez votre dossier de demande de financement complet, accompagn� des pi�ces justificatives n�cessaires dans un d�lai de 15 jours maximum � compter du moment o� vous avez obtenu une r�ponse de principe.             
                               </strong>
                                   </div>            
                </div>
                      
               <hr>  <center>  <img src ="assets/img/a2.jpg"/></center> </hr> 
           </div>
             <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2> Comment vous faire votre cr�dit en ligne?</h2>
                        </div>
                        <div class="panel-body">
                        </div>
                        <div><h3> 4�me �tape:Suivi de votre cr�dit</h3>
                            <strong> apr�s que vous demandez votre cr�dit vous souhaiterez connaitre l'etat d'avencement de votre dossier en ligne.
                                </strong>                
                                <h3> 5�me �tape: Vous recevez notre r�ponse</h3>
                                <strong> Nous vous confirmons la bonne r�ception de votre dossier et nous �tudions votre demande de financement.
                                </strong>              
                                    <h3> 6�me �tape:Finalisez votre projet</h3>
                                  
                                    <strong>Il vous faudra prendre rendez-vous chez nous pour sign� le contrat de pret.</strong>
                    </div>            
                </div>       
                         
                 
          
    
                 
                 
                 
                 
              </div>
                            
                 <!-- /. ROW  -->
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
     </div>    
</div>
        
        
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
