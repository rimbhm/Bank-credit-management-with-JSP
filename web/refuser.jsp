<%-- 
    Document   : rfuser
    Created on : 3 mai 2016, 12:26:44
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
                        <a class="active-menu" href="responsable1.jsp"><i class="fa fa-male fa-3x"></i> Espace Responsable</a>
                    </li>
                    <li>
                        <a  href="gestionresp.jsp"><i class="fa fa-male fa-3x"></i> Gestion des Responsables</a>
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
            
           %> 
           <div class="panel-body" class="pull-center">
            <span class="pull-left"><img src="assets/img/r.png"/></span><tr><h2 class="pull-center"> Demande de crédit numéro <%=num%> </h2></tr>
                      
         
           
           
           <div class="panel panel-info">
                        <div class="panel-heading">
                           Veuillez donner le motif de votre décision.
                        </div>
                        <div class="panel-body">
              
       
      
                                  <form role="form"  methode ="Post" action="rejet">
                                 <div class="form-group">
                                      <label>Num de demande :</label>
                          <input type="text" name ="num" value="<%=num%>" class="form-control"/>
                      
                                 </div>
                                      
                                       <div class="form-group">
                                            <label>Motif : </label>
                                            <textarea name ="motif" class="form-control" rows="3"></textarea>
                                        </div>
                          
                                   
                                        <input type=submit class="btn btn-success " value="Enregistrer">
                                        <a onclick="myFunction()" class="btn btn-success" >Gérer une notification</a>
                                        <a  href="gestiondemande.jsp">  <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                                      Annuler
                                     </button></a>
                                            
                                    </form>
                                      
                                     
                               
                              
                           </div>
                          
                            </div>
                        </div>
                    </div>
         
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
                       </div></div>
<script>
    
function closeWin() {

        myWindow.close();
  
}
function myFunction() {
    title: 'Notification';
    var myWindow = window.open("Notification", "Notification", "width=300,height=200");
    myWindow.document.write(" <div class='panel-body'> <form role='form'  methode ='Post' action='ajnotif'><div class='form-group'><label>Client :</label> <input type='text' name ='client' value='<%=c.getClient()%>' class='form-control'/> </div> <div class='form-group'> <label>Message : </label> <textarea name ='contenu' class='form-control' rows='3'></textarea> </div>  <div class='form-group'> <label>Date :</label><input type='date' name ='date_recu'  class='form-control'/></div><input type=submit name='submit' class='btn btn-success' value='Envoyer'> </form></div> ");

}
</script>
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




