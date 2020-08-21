<%-- 
    Document   : demdari
    Created on : 28 mars 2016, 11:12:14
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
    <title>Demande de crédit Immobilier Dari</title>
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
font-size: 16px;"> <form method="post" action="logout">
     Bienvenu <%=session.getAttribute("login")%> <input type="submit"  class="btn btn-danger " value ="Déconnexion" />
</form></div>
       
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/flooo.png"/>
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
                        <a   href="client.jsp"><i class="fa fa-male fa-3x" ></i>
 Espace Client </a>
                    </li>				
					 <!--<li  >
                        <a   href="login.html"><i class="fa fa-bolt fa-3x"></i> Login</a>
                    </li>	
                     <li  >
                        <a   href="registeration.html"><i class="fa fa-laptop fa-3x"></i> Registeration</a>
                    </li>-->	
					                   
                    <li>
                        <a href="#" href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        
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
                                        <a href="treavaux&aménagement.jsp">Immobilier Aménagement & travaux</a>
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
                        <a  href="demdari.jsp" class="active-menu"><i class="fa fa-edit fa-3x"></i> Faire votre demande </a> </li>  
                 
                  
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <hr>
                     <!--<img src="assets/image/img/da.jpg"/></hr>-->
                       <img src="assets/img/fh.jpg"/></hr>
                        <img src="assets/img/cddd.jpg"/></hr>
                          
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><strong>Un crédit vous engage et doit etre remboursé.Vérifiez vos capacité de remboursssement avant de vous engage. </strong></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <h4>Remplissez notre formulaire en 5 minutes si vous été  rapide!
                        </h4>
            
                         <!-- <div class="row">
                <div class="col-md-4 col-sm-4">
                    <div class="well">
                        <h4>Normal Well</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="well well-lg">
                        <h4>Large Well</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.</p>
                    </div>
                </div>
                <div class="col-md-4 col-sm-4">
                    <div class="well well-sm">
                        <h4>Small Well</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare lacus adipiscing, posuere lectus et, fringilla augue.</p>
                    </div>
                </div>-->
             <br><div class="col-md-8">                   
                    <div class="panel panel-default">
                        
                            
                        <div class="panel-body" class="pull-center">
                            <span class="pull-left"><img src="assets/img/r.png"/></span><tr><h2 class="pull-center"> Vos Information personnelles </h2></tr>
                            <h5>Les chmaps marqués en * sont obligatoires</h5>
                            <span class="pull-center">
                                   <h4>Vos Identité</h4>
                                    <%
       
    
        String client =session.getAttribute("login").toString();
           %>
                            <form role="form"  methode ="Post" action="ajoutdem">
                        <label>*Type de Crédit</label>
                               <label>*Type de Crédit</label>
                                  <input type="text" name ="credit" value="Dari" class="form-control"/>
                           <label>username</label>
                          <input type="text" name ="client" value="<%=client%>" class="form-control"/>
                        <br><label>*Situation familiale</label>
                               <select class="form-control" name ="situation">
                                    <option>Choix</option>
                               <option>Marie(e)</option>
                                 <option>Celibataire</option>
                                  <option>Veuf(ve)</option>
                               <option>Divorcé(e)</option>         
                               </select></br>    
                       
                           <label>*Nbre de pers.à.charge</label>
                           <input type="text" name ="pers" class="form-control" />
                            <br><label> *Situation Logement</label>
                            <select name ="logement" class="form-control" >
                             <option>Proprietaire</option>
                            <option>Locataire</option>
                            <option>Loge par la famille</option>
                            <option>Loge par l'employeur</option>
                            <option>Autre</option>
                             </select>
                                <br><label> *Profession</label>
                               <input type="text" name= "prof" class="form-control" />
                                <br><label>*Statut professionnel</label>
                                    <select name="statut" class="form-control">
                                        <option>Salarie public</option>
                                        <option>Salarie prive</option>
                                        <option>Autre et retraite</option>
                                    </select>
                                    <br><label>*Durée d'activité</label>
                                           <input type="text" name = "duree" class="form-control" />  
                                    <hr>
                             <h4>Vos Revenus</h4>
                                      <h5> saissez le chiffre 0 si un champ ne vous concerne pas.</h5>
                                       <br><label>*Salaire mensuel net</label>
                                  <input type="text" name = "salaire" class="form-control" />  
                                    <br><label> *Revenu non salarié(Pension de retraite)</label>
                               <input type="text" name = "revenu" class="form-control" />
                           <br><label>*Loyer mensuel percu </label>
                           <input type="text" name = "loyer" class="form-control" />
                           <br><label> *Autre revenus mensuels </label>
                           <input type="text" name = "arm" class="form-control" />
                           
                                 <hr>
                          <h4>Vos Charges</h4>
                               <h5> saissez le chiffre 0 si un champ ne vous concerne pas.</h5>
                               <br><label> *Montant du loyer à payer(si locataire)</label>
                           <input type="text" name = "mloyer" class="form-control" />
                          
                            <br><label> *Mensualité des crédits UIB </label>
                                <input type="text" name = "mcred" class="form-control"/>
                            <br><label> *Encours des crédits UIB </label>
                             <input type="text" name = "enc_cred" class="form-control" />
                             <br><label> *Montant</label>
                               <input type="text" name = "montant_cred" class="form-control" />
                           <br><label>*Durée </label>
                           <input type="text" name = "duree_cred" class="form-control" />
                           
                           
                        </br>
                               <input type=submit class="btn btn-success btn-lg" value="Enregistrer">
                                 
                        </form>  
                        
                               </div>
                    </div>            
             </div><tr><div class="col-md-4 col-sm-4">
                    <div class="well well-sm">
                        <h4>Demander de crédit en 3 étapes</h4>
                        <p>1.Simulez</p>
                        <h5>Renseignez votre projet pour recevoir votre proposition.</h5>
                    <p>1.Demandez</p>
                        <h5>Demandez votre crédit moins de 5 minutes chrono sans engagement réponse immédiate.</h5>
                        <p>1.Validez</p>
                        <h5>Finalisez votre demande en nous adressant votre dossier complet par courieur.</h5>
                    </div>
                </div>
                 <center><img src="assets/img/dem.jpg"/></center>
                 <br><strong> Déjà client UIB Direct ?
                         Gagnez du temps en vous connectant à votre <a href="client.jsp">ESPACE CLIENT !</strong></h2></br>                       
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
