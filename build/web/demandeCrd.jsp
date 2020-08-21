<%-- 
    Document   : demandeCrd
    Created on : 15 mars 2016, 20:08:14
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
    <title>Demandez votre crédit</title>
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
                    <img src="assets/img/myfobyke.jpg"/>
					</li>
				
		
                    <li>
                        <a   href="form.html"><i class="fa fa-male fa-3x" ></i>Espace Client </a>
                    </li>				
		    <li>
                        <a href="#" class="active-menu"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="expresso1.jsp">Crédit Expresso</a>
                            </li>
                            <li>
                                <a href="auto1.jsp">Crédit Auto</a>
                            </li>
                            
                            <li>
                                <a href="#">Crédit Immobilier<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="travaux&aménagement1.jsp">Immobilier Aménagement & travaux</a>
                                    </li>
                                    <li>
                                        <a href="CrdImmobilierMahly1.jsp">Immobilier Mahly</a>
                                    </li>
                                    <li>
                                    <a href="dari1.jsp">Immobilier Dari</a>
                                    </li>

                                </ul>
                               
                            </li>
                            
                        </ul>
                      </li> 
                            
                      
                      
                 <li>
                        <a href="#" ><i class="fa fa-edit fa-3x"></i> Faire votre demande<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="demande.jsp">Ajouter demande</a>
                            </li>
                            <li>
                                <a href="listedemande.jsp">Liste demande</a>
                            </li>
                          
                            
                        </ul>
                      </li>  
                  
                  <li>
                        <a href="rachat.jsp"><i class="fa fa-edit fa-3x"></i>Demander un rachat de crédit </a>
                    </li>
                                         
                                         <li>
                        <a  href="suividem.jsp"><i class="fa fa-eye fa-3x"></i> Suivi de votre demande </a> </li>  
                  
                  	 <li>
                        <a href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i> Simulation</a></li>	
                    
                    <!--<li>
                        <a  href="form.html"><i class="fa fa-edit fa-3x"></i> Suivi de votre demande </a> </li>-->  
                 
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                
                     
                       <img src="assets/img/cc.jpg"/>
                       
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><strong>Un crédit vous engage et doit etre remboursé.Vérifiez vos capacité de remboursssement avant de vous engage. </strong></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <h5>Remplissez notre formulaire en 5 minutes si vous etes rapide!
                        </h5>
            
                        
             <br><div class="col-md-8">                   
                    <div class="panel panel-default">
                        
        
           <div class="panel-body" class="pull-center">
                            <span class="pull-left"><img src="assets/img/r.png"/></span><tr><h2 class="pull-center"> Vos Information personnelles </h2></tr>
                            <h5>Les chmaps marqués en * sont obligatoires</h5>
                             <%
       
    
        String client =session.getAttribute("login").toString();
           %>
                            <form role="form"  methode ="Post" action="ajoutdem">
                        <label>*Type de Crédit</label>
                               <select class="form-control" name ="credit">
                                    <option>Choix</option>
                               <option>Expresso</option>
                                 <option>Auto</option>
                                  <option>Aménagement & traveaux</option>
                               <option>Mahly</option>  
                               <option>Dari</option> 
                               <option>Autre</option> 
                               </select>
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
                                 
                        </form>  </div>
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
                  </div>
                                            
                   <img src="assets/img/cont.jpg"/>
                   
             <!-- /. ROW  -->
            
                            
                      
                                           
                    
    
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
                       </div></div></div></div>
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



