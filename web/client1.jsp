<%@page import="java.sql.*"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import ="src.com.servlet.*" %>
<%@page import ="src.com.classes.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Identifiez vous poour accéz à votre espace client</title>
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
padding: 10px 50px 5px 100px;
float: right;
font-size: 16px;"> 
<form method="post" action="logout">
     Bienvenu <%=session.getAttribute("login")%> <input type="submit"  class="btn btn-danger " value ="Déconnexion" />
</form>




 </div>

   
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/mccc.jpg"/>
					</li>
    
                    <li>
                        <a  href="client1.jsp" class="active-menu"><i class="fa fa-male fa-3x" ></i>Mon Espace</a>
                    </li>				
		    <li>
                        <a href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
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
                        <a href="#"   ><i class="fa fa-edit fa-3x"></i>Mes demandes de crédit<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="demandeCrd.jsp">Ajouter demande</a>
                            </li>
                            <li>
                                <a  href="listedemande.jsp">Liste demande</a>
                            </li>
                          
                            
                        </ul>
                      </li> 
                       <li>
                        <a  href="suividem.jsp"><i class="fa fa-eye fa-3x"></i> Suivi de votre demande </a> </li>  
                  
                   <li>
                        <a href="#"   ><i class="fa fa-edit fa-3x"></i>Demander un rachat de crédit<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="rachat.jsp">Ajouter rachat</a>
                            </li>
                            <li>
                                <a  href="listerachat.jsp">Liste rachat</a>
                            </li>
                          
                            
                        </ul>
                      </li> 
                            
                    
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
                    <div class="col-md-12">
                     <hr>
                     <img src="assets/img/cc.jpg"/></hr>
                          
                        <h3> </h3>
                       <h3> </h3>
                       <h3> </h3>
                       <h3>  </h3>
                    </div>
                </div>
                 <!-- /. ROW  -->
                 
                      
                               <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong>Accés à mon espace client</strong> 
                        </div>
                        <div class="panel-body">
                            <div> <h5> </h5>
                               <h5>Suivi de votre demande de rachat de votre crédit hors UIB.</h5>
                                <h5>Suivi de votre demande de crédit. </h5>
                                    <h5>Consultation de tableau d'amortissement de votre Prêt. </h5>
                             <%
     
        String nom =session.getAttribute("login").toString();
          
                                           %>
                             <a href="modifcompte.jsp?login=<%=nom%>" class="btn btn-primary" ><i class="fa fa-edit "></i> Modifier mes informations personnelles</a>
                                 <a href ='supcompte?login=<%=nom%>' class="btn btn-danger"><i class="fa fa-pencil"></i> Supprimer mon compte</a>
                            
                            
                            </div>
                     <div class="row"> 
                     </div>
                        </div>
                    </div>            
                </div>
                      <div class="row">
                    <div class="col-md-6 col-sm-12 col-xs-12">
                   
                    <div class="chat-panel panel panel-default chat-boder chat-panel-head" >
                        <div class="panel-heading">
                            <i class="fa fa-comments fa-fw"></i>
                           Notifications Reçus
                            <div class="btn-group pull-right">
                                <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                    <i class="fa fa-chevron-down"></i>
                                </button>
                                <ul class="dropdown-menu slidedown">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-refresh fa-fw"></i>Refresh
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-check-circle fa-fw"></i>Available
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-times fa-fw"></i>Busy
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-clock-o fa-fw"></i>Away
                                        </a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-sign-out fa-fw"></i>Sign Out
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>

                        <div class="panel-body">
                            <ul class="chat-box">
                                                                 
                                      
                                         <%
                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try {
			 
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from notification where client = '"+ nom + "' ORDER BY date_recu DESC "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            %>
                                          <li class="left clearfix">
                                    <span class="chat-img pull-left">
                                        <img src="assets/img/notif.png" alt="message" class="img-circle" />
                                    </span>
                                    <div class="chat-body">                                        
                                            <strong >Vous avez une nouvelle notification</strong>
                                            <small class="pull-right text-muted">
                                                <i class="fa fa-clock-o fa-fw"></i>12 mins ago
                                            </small> 
                                            <p> <%=rs.getString(3)%></p>
                                                  
                                    </div>
                                </li>
                             
                                           <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>   
                                       
                                 
                                
                               
                                   
                                
                            </ul>
                        </div>

                        <div class="panel-footer">
                            <div class="input-group">
                                <input id="btn-input" type="text" class="form-control input-sm" placeholder="Type your message to send..." />
                                <span class="input-group-btn">
                                    <button class="btn btn-warning btn-sm" id="btn-chat">
                                        Send
                                    </button>
                                </span>
                            </div>
                        </div>

                    </div>
                    
                    </div>
                    
             
                                
                </div> 
                
           </div>
                 
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
