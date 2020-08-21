<%-- 
    Document   : modifdem
    Created on : 2 mai 2016, 22:29:02
    Author     : DELL
--%>


<%@page import="src.com.classes.*"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>votre demande de crédit</title>
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
                        <a  href="responsable1.jsp"><i class="fa fa-male fa-3x"></i> Espace Responsable</a>
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
                        <a class="active-menu" href="gestiondemande.jsp"><i class="fa fa-pencil fa-3x"></i> Gestion des Demandes </a>
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
                                          
            
                        
             <br><div class="col-md-12 col-sm-4">                   
                    <div class="panel panel-default">
                        
             <%
       
        demande c =new demande();
   
         int num =Integer.parseInt(request.getParameter("num"));
           
            c.setNum(num);
            c.setdemande(num);
          
       
        client p =new client();
   
         String nom= c.getClient();
           
            p.setLogin(nom);
            p.setclient1(nom);
            
           %> 
           <div class="panel-body" class="pull-center">
            <span class="pull-left"><img src="assets/img/r.png"/></span><tr><h2 class="pull-center"> Demande de crédit numéro <%=num%> </h2></tr>
                      
          
           
           <div class="panel panel-primary">
                        <div class="panel-heading">
                           Informations sur la demande 
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#home" data-toggle="tab">Info sur le client</a>
                                </li>
                                <li class=""><a href="#profile" data-toggle="tab">Revenus</a>
                                </li>
                                <li class=""><a href="#messages" data-toggle="tab">Charges</a>
                                </li>
                                <li class=""><a href="#settings" data-toggle="tab">Montants</a>
                                </li>
                            </ul>

                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="home">
                                    <h4></h4>
                                    <p> <label>Client : <%=c.getClient()%> </label> </p>
                                    <p><label>Nom & prénom : <%=p.getNom()%> <%=p.getPrenom()%> </label></p>
                                     <p><label>Cin : <%=p.getCin()%></label></p>
                                    <p><label>Date de naissance : <%=p.getDate_naissance()%></label></p>
                                 
                               <p><label>Email : <%=p.getEmail()%></label> </p> 
                               <p> <label>Adresse : <%=p.getAdresse()%></label></p>
                             
                               <p> <label>Nationalité : <%=p.getNationalite()%></label> </p> 
                               <p><label>Tel : <%=p.getTelephone()%></label> </p> 
                               <p><label>Num de compte : <%=p.getNcompte()%></label></p>
                              
                              <p><label>Type : <%=p.getType()%></label></p> 
                              
                              
                              <p>  <label>Situation familiale : <%=c.getSituation()%></label></p> 
                              <p><label>Nbre de pers.à.charge : <%=c.getPers()%></label></p>
                           
                           <div class="col-md-12 col-sm-6">
                                 <center><img src="assets/img/dem.jpg"/></center>
                               
                               
                           </div>
                           </div>
                            <div class="tab-pane fade" id="messages">
                                 
                                   <br><label> Profession</label>
                               <input type="text" name= "prof" class="form-control" value="<%=c.getProf()%>" disabled/>
                                <br><label>Statut professionnel</label>
                                    <input name="statut" class="form-group" value="<%=c.getStatut()%>"disabled/>
                                     
                                    <br><label>Durée d'activité</label>
                                   <input type="text" name = "duree" class="form-group" value="<%=c.getDuree()%>" disabled/>  
                                <br><label>Salaire mensuel net</label>
                                  <input type="text" name = "salaire" class="form-control" value="<%=c.getSalaire()%>" disabled/>  
                                    <br><label> *Revenu non salarié(Pension de retraite)</label>
                               <input type="text" name = "revenu" class="form-control" value="<%=c.getRevenu()%>" disabled/>
                          <br><label>Autre revenus mensuels </label>
                           <input type="text" name = "arm" class="form-control" value="<%=c.getArm()%>" disabled />
                         
                                </div>
                         <div class="tab-pane fade" id="profile">
                                   <br><label> Situation Logement</label>
                                <input type="text" name ="logement" class="form-control" value="<%=c.getLogement()%>" disabled/>
                               <br><label>Loyer mensuel percu </label>
                           <input type="text" name = "loyer" class="form-control" value="<%=c.getLoyer()%>" disabled/>
                            <br><label> Montant du loyer à payer(si locataire)</label>
                           <input type="text" name = "mloyer" class="form-control" value="<%=c.getMloyer()%>" disabled/>
                          
                            </div>
                                <div class="tab-pane fade" id="settings">
                                 <br><label> Mensualité des crédits UIB </label>
                                <input type="text" name = "mcred" class="form-control" value="<%=c.getMcred()%>" disabled/>
                                <br><label> Encours des crédits UIB </label>
                                 <input type="text" name = "enc_cred" class="form-control" value="<%=c.getEnc_cred()%>" disabled/>
                                  <label> Montant</label>
                               <input type="text" name = "montant_cred" class="form-control" value="<%=c.getMontant_cred()%>" disabled/>
                                 <br>
                               <label>Durée </label>
                               <input type="text" name = "duree_cred" class="form-control" value="<%=c.getDuree_cred()%>" disabled=""/>
                           
                              </div>
                            </div>
                        </div>
                    </div>
           <a  href="gestiondemande.jsp"> 
             <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                            Retour
             </button></a>
               </div>
                </div>            
             </div>
                              
                </div>
               
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




