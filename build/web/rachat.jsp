<%-- 
    Document   : rachatm
    Created on : 31 mars 2016, 00:59:27
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
    <title>Demnader votre rachat de crédit consommation</title>
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
</form></div>
       
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/pc2222.png"/>
					</li>
				
					
                    
                      <li  > <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                     
                    <li  >
                        <a  class="active-menu" href="client.jsp"><i class="fa fa-male fa-3x" ></i>
 Espace Client </a>
                    </li>				
					 
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
                        <a  href="rachat.jsp"><i class="fa fa-edit fa-3x"></i>Demander votre Rachat </a> </li>  
                  
                  
                  
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <hr>
                                              <%
       
    
        String client =session.getAttribute("login").toString();
           %>
                     <img src="assets/img/reggg.png"/>
                       
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h1>Demande de regroupement de crédits </h1></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                     <br>
                                     <div class="col-md-8">                   
                    <div class="panel panel-default">
                        
       
                        <div class="panel-body" class="pull-center">
                            
                            
                            <h5> Les champs marqué en * sont obligatoires</h5>
                        
                         
                         <form role="form"  methode ="Post" action="ajoutrach">
                       <h2>Vos Identité</h2>
                           <label>username</label>
                          <input type="text" name ="client" value="<%=client%>" class="form-control"/>
                        <br><label>*Situation familiale</label>
                               <select name ="situation" class="form-control" >
                                 
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
                           
                                 <h2>Vos Revenus</h2>
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
                           
                           <br><h2>Vos Charges</h2>
                               <h5> saissez le chiffre 0 si un champ ne vous concerne pas.</h5>
                          
                               <br><label> *Montant du loyer à payer(si locataire)</label>
                           <input type="text" name = "mloyer" class="form-control" />
                            <hr>
                                  <h2>votre projet</h2>
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
                                <br><label>*Capital Restant en(DT) </label>
                                          <input class="form-control" name ="capitale"/> </br>
                                          
                             <br><label> *Mensualité de crédit  hors UIB actuel</label>
                                 <input class="form-control" name ="mens"></br>
                                            <br><label>*Montant du nouveau crédit </label> 
                                              <tr><input class="form-control" name ="montant" /> </br>
                           
                            
                                  
                           <br><input type=submit class="btn btn-primary btn-lg" value="Enregistrer"><tr>  
                                   </form>
                           </div>
                    </div>            
             </div><tr>
                 <div class="col-md-4 col-sm-4">
                    <div class="well well-sm">
                        <h4>Demander de rachat de crédit en 4 étapes</h4>
                        <p>1.Demande de rachat</p>
                        <h5>Réalizer votre demande en ligne gratuit et sans engagement.</h5>
                    <p>2.Etude et Montage de dossier</p>
                    <h5>Par un de nos conseillers experts en rachat de crédit</h5><br>
                        Il sera votre interlocuteur unique.
                        <p>3.Negociation auprés de nos partenaires Bancaires</p>
                        <h5>En voi de votre dosseir auprés de notre banque.</h5>
                        <p>4.Decision Banque et deblocage des fonds</p>
                        <h5>Votre conseiller vous informe de la décision banque: accord ou refus.</h5>
                    </div>
                </div>
                 <br>
                 <div class="col-md-4 col-sm-4">
                    <div class="well well-sm">
                        <h4>Demander de rachat de crédit </h4>
                        <p> *Concrètement effectuer un rachat de crédit consommation reveint à souscrire un nouveau Prêt.
                            Faite votre demande en ligne et obtenez une réponse de principe immédiatement.</p>
                        <p>*Ce nouveau Prêt vous permet de rembourser par anticipation l'ancien Prêt consommation.Vous repartez avec un nouveau 
                        crédit, une nouvelle garantie et une nouvelle assurance.
                        </p>
                        
                    </div>
                </div>
                     <br><center><img src="assets/image/img/rap.jpg"/></center>
                         
                         <br><strong>Un spécialiste du crédit est à votre disposition pour vous aider à faire une demande.
                                 Communiquez avec nous dés maintenant sur:<i class="fa fa-whatsapp fa-2x">71856663</i> </strong>                            

                     <!--<img src="assets/img/cont.jpg"/>-->
                     
                     </div>
                                    </div>
                       </div>
                                    </div>
             <!-- /. ROW  -->
            
                            
                      
                       </div>                                      
                    
                  </div>  <!-- /. PAGE INNER  -->
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
     <!-- MORRIS CHART SCRIPTS -->
     <script src="assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="assets/js/morris/morris.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>


