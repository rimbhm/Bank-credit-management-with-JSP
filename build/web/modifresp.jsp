<%-- 
    Document   : modifresp
    Created on : 25 avr. 2016, 11:07:04
    Author     : DELL
--%>

<%@page import="src.com.classes.responsable"%>
<%-- 
    Document   : modifresp
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
                <a class="navbar-brand" href="chart.jsp">UIB DIRECT</a> 
            </div>
  <div style="color: white;
padding: 15px 50px 5px 50px;
float: right;
font-size: 16px;"><form method="post" action="logout">
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
                        <a class="active-menu"  href="responsable1.jsp"><i class="fa fa-male fa-3x"></i> Espace Responsable</a>
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
                        <a  href="gestiondemande.jsp"><i class="fa fa-envelope fa-3x"></i> Notifications</a>
                    </li>
                     <li>
                        <a   href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>Simulation</a>
                    </li>	
                    
                     </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper"  >
            <div id="page-inner">
                <div  class="row">
                    <div class="col-md-12">
                     <h2>Modifier les informations personnel de ce client</h2>   
                        
                       
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
       
        responsable p=new responsable();
          //  int id_resp =Integer.parseInt(request.getParameter("id_resp"));
             String nom =session.getAttribute("login").toString();
            p.setLogin(nom);
            p.setresp(nom);
                  
                                            %>
                                              <form role="form"  methode="Post" action="modifresp">
                                                  <br/>
                                         <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-circle-o-notch"  ></i></span>
                                            <input type="text" value="<%=p.getId_resp()%>" class="form-control" name ="id_resp" />
                                          
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-circle-o-notch"  ></i></span>
                                            <input type="text" value="<%=p.getNom()%>" class="form-control" name ="nom" />
                                          
                                        </div>
                           
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" value="<%=p.getPrenom()%>"  class="form-control" name ="prenom" />
                                        </div> 
                                        <div class="form-group input-group">
                                            <span class="input-group-addon">@</span>
                                            <input type="text" value="<%=p.getEmail()%>"  class="form-control" name ="Email" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" value="<%=p.getTelephone()%>"  name ="telephone" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" value="<%=p.getLieu_travail()%>"  name ="lieu_travail" />
                                        </div>
                                        <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" value="<%=p.getLogin()%>" name ="login" />
                                        </div>
                                    
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" class="form-control" value="<%=p.getPassword()%>" name ="password" />
                                        </div>
                                     
                                    
                                     <input type=submit class="btn btn-success " value="Enregistrer">
                                          <a  href="responsable1.jsp"> <input type="button" class="btn btn-reset" value="Retour"></a>
                                    </form>
                                        
                            </div>
                     
                        </div>
                    </div>
                
                
           </div>
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


