<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import ="src.com.servlet.*" %>
<%@page import ="src.com.classes.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Identifiez vous poour acc�z � votre espace client</title>
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
                    <img src="assets/img/mccc.jpg" />
					</li>
				
					
                    
                      <li  > <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                   
                    <li>
                        <a  class="active-menu" href="form.html"><i class="fa fa-male fa-3x" ></i>
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
                        <a href="simulation.jsp"><i class="fa fa-calculator fa-3x"></i>
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
                            <strong>Acc�s � mon espace client</strong> 
                        </div>
                        <div class="panel-body">
                            <div> <h5> </h5>
                               <h5>Suivi de votre demande de rachat de votre cr�dit hors UIB.</h5>
                                <h5>Suivi de votre demande de cr�dit. </h5>
                                    <h5>Consultation de tableau d'amortissement de votre Pr�t. </h5>
                           
                            
                            </div>
                     <div class="row"> 
                     </div>
                        </div>
                    </div>            
                </div>
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
               
                         <div class="panel panel-default">
                            <div class="panel-heading">
                        <strong>   Identiviez-vous pour acced� � votre espace client </strong>  
                            </div>
                            <div class="panel-body">
                                <form role="form" method ="Post" action="loginServelet">
                                       <br />
                                     <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-tag"  ></i></span>
                                            <input type="text" class="form-control" name ="login" placeholder="votre login " required="required"/>
                                        </div>
                                          <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" name="password" class="form-control"  placeholder="votre Password" required="required"/>
                                        </div>
                                    <div class="form-group">
                                            <label class="checkbox-inline">
                                               
                                                
                                            </label>
                                            <span class="pull-right">
                                                   
                                                  
                                            <a href="#" >vous oubliez password ? </a> 
                                  </span>
                                        </div>
                                     
                                       <input type=submit class="btn btn-primary " value="se connecter">
                                           <img src="assets/img/eee.png"/>
                                    <hr />
                                    Non Enregistrer ? <a href="ajoutclient.jsp" >clique ici</a> 
                                    </form>
                            </div>
                           
                                
                </div> 
                
           </div>
                 <!-- /. ROW  -->
               <!-- <div class="row">                     
                      
                               <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Donut Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-donut-chart"></div>
                        </div>
                    </div>            
                </div>
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Line Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-line-chart"></div>
                        </div>-->
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
