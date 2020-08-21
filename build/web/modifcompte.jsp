
<%@page import="src.com.classes.client"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@page import="java.sql.*"%>



<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Modif Client</title>
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
padding: 10px 50px 5px 100px;
float: right;
font-size: 16px;"> 
<form method="post" action="logout.java">
     Bienvenu <%=session.getAttribute("login")%> <input type="submit"  class="btn btn-danger " value ="Déconnexion" />
</form>
 </div>
       
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
		<li>   
                <a  class="active-menu" href="form.html"><i class="fa fa-male fa-3x" ></i>
 Espace responsable </a>
                              
                              
                              
                    </li>
                    
                    <li>
                    <a    href="gestionClient.jsp"><i class="fa fa-university fa-3x"></i>Gestion des clients</a>
                    <ul class="nav nav-second-level">
                        <li>
                                <a href="#">Consulter client</a>
                            </li> 
                        
                            <li>
                                <a href="#">Modifier client</a>
                            </li>
                            <li>
                                <a href="#">Supprimer client</a>
                            </li>
                    </ul>
                    </li>				
					 
                  <li>
                    <a    href="responsable.jsp"><i class="fa fa-university fa-3x"></i>Gestion des crédits</a>
                    <ul class="nav nav-second-level">
                        <li>
                                <a href="#"> Consulter crédit</a>
                            </li>    
                        <li>
                                <a href="#"> Ajouter crédit</a>
                            </li>
                            <li>
                                <a href="modifclient.jsp">Modifier crédit</a>
                            </li>
                            <li>
                                <a href="#">Supprimer crédit</a>
                            </li>
                    </ul>
                  </li>					
                      <li  >
                    <a    href="#"><i class="fa fa-list fa-3x"></i>Listes de rachat de prêt </a>
                    <ul class="nav nav-second-level">
                           
                            <li>
                                <a href="#">Modifier demande</a>
                            </li>
                            <li>
                                <a href="#">Supprimer demande</a>
                            </li>
                    </ul>
                      </li>
                     <li  >
                        <a   href="#"><i class="fa fa-list fa-3x"></i>Listes de demande de prêt</a>
                    <ul class="nav nav-second-level">
                           
                            <li>
                                <a href="#">Modifier demande</a>
                            </li>
                            <li>
                                <a href="#">Supprimer demande</a>
                            </li>
                    </ul>
                     </li>	
                   				
                    <li>
                        <a  href="Amortissement.jsp"><i class="fa fa-table fa-3x"></i>  Tableau d'amortissement</a> </li>  
                
                </ul>
              
                  
                 
           
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper"  >
            <div id="page-inner">
                <div  class="row">
                    <div class="col-md-12">
                     <h2>Modifier votre compte</h2>   
                        
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               
           <div class="row">
               
                <div class="col-md-4.5 col-md-offset-4.5 col-sm-6 col-sm-offset-3 col-xs-10 col-xs-offset-1" class="center-block">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                 
                        <strong>  Mise à jour</strong>  
                            </div>
                            <div class="panel-body">
                              

   <%
       
        client c =new client();
        String nom =session.getAttribute("login").toString();
          //  int num_client =Integer.parseInt(request.getParameter("num_client"));
           
            c.setLogin(nom);
           c.setclient1(nom);
                  
                                           %>
                                              <form role="form"  methode="Post" action="modico">
                                                  <br/>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-circle-o-notch"  ></i></span>
                                            <input type="text" value="<%=c.getNum_client()%>" class="form-control" name ="num_client" />
                                          
                                        </div>
                           
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=c.getCin()%>"  class="form-control" name ="cin" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=c.getNom()%>"  class="form-control" name ="nom" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"></i></span>
                                            <input type="text" class="form-control" value="<%=c.getPrenom()%>"  name ="prenom" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"></i></span>
                                            <input type="text" class="form-control" value="<%=c.getEtat()%>"  name ="etat" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i>
                                            </span>
                                            <input type="text" class="form-control" value="<%=c.getDate_naissance()%>" name ="date_naissance" />
                                        </div>
                                        
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">@</span>
                                            <input type="text" class="form-control" value="<%=c.getEmail()%>"  name ="email" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=c.getAdresse()%>"  class="form-control" name ="adresse"/>
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=c.getNationalite()%>"  class="form-control" name ="nationalite" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=c.getTelephone()%>" class="form-control" name ="telephone" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" value="<%=c.getNcompte()%>" name ="ncompte" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" value="<%=c.getType()%>" name ="type" />
                                        </div>
                                      <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="text" class="form-control" value="<%=nom%>" name ="login"/>
                                        </div>
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" class="form-control" value="<%=c.getPassword()%>" name ="password" />
                                        </div>
                                     
                                    
                                     <input type=submit class="btn btn-info " value="Enregistrer">
                                         
                                    </form>
                                    <a  href="client1.jsp"> <input type=submit class="btn btn-reset" value="Annuler"></a>     
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

