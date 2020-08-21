<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import ="src.com.servlet.*" %>
<%@page import ="src.com.classes.*" %>




<%@page import="java.sql.*"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Votre espace Client</title>
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
                </button>
                <a class="navbar-brand" href="#">UIB DIRECT</a> 
            </div>

     
 <div style="color: white;
padding: 6px 40px 5px 100px;
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
				
					
                    
                      <li  > <a   href="client1.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                   
                     
                    <li>
                        <a  href="client1.jsp"><i class="fa fa-male fa-3x" ></i>Mon Espace</a>
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
                        <a href="#"  class="active-menu" ><i class="fa fa-edit fa-3x"></i>Mes demandes de crédit<span class="fa arrow"></span></a>
                        
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
                    <div class="col-md-12">
                     <h2>Table des demandes de crédit</h2>   
                        
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                 
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <center><strong>  Liste de mes demandes </strong></center>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                            <div class="col-sm-6">
                    <div id="dataTables-example_filter" class="dataTables_filter">
                  <label>Rechercher :<input type="search" class="form-control input-sm" aria-controls="dataTables-example">
                    </div></div>
                                
                                
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                        <tr>
                                             <th>Num</th>
                                          <th>Situation</th>
                                          <th>Personne à charge</th>
                                          <th>situation Logement</th>
                                            <th>Profesion</th>
                                            <th>Statut professionnel</th>
                                      
                                            <th>Durée d'activié</th>
                                             <th>Salaire mensuel net</th>
                                            
                                             <th>Montant</th>
                                             <th>Durée</th>
                                             <th>Etat</th>
                                         
                                    
                                        </tr>
                                        
                                    </thead>
                                    <tbody>
                                        <%
                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try {
			   String nom =session.getAttribute("login").toString();
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from demande where client = '"+ nom + "'and etat = 'en cours' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                                            
                                            %>
                                        <tr class="odd gradeX">
                                           <td><%=rs.getString(1)%></td>
                                         <td><%=rs.getString(3)%></td>
                                            <td><%=rs.getString(4)%></td>
                                            <td><%=rs.getString(5)%></td>
                                            <td><%=rs.getString(6)%></td>
                                           <td><%=rs.getString(7)%></td>
                                          <td><%=rs.getString(8)%></td>
                                          <td><%=rs.getString(9)%></td>
                                       
                                             <td><%=rs.getString(16)%></td>
                                               <td><%=rs.getString(17)%></td>
                                               <td><%=rs.getString(18)%></td>
                                               
                                           <td><center> <a href ='affdemande.jsp?num=<%=rs.getString(1)%>' ><i class="fa fa-eye "></i></a>
                                        
                                                   <a href ='modifdem.jsp?num=<%=rs.getString(1)%>'><i class="fa fa-pencil-square-o"></i></a>
                                        <a href ='supdemande?num=<%=rs.getString(1)%>' ><i class="fa fa-trash"></i></a></center></td>
                                        
                                        </tr>
                                            <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>
                                      
                                    </tbody>
                                </table>
                                 <div class="row"><div class="col-sm-6"><div class="dataTables_info" id="dataTables-example_info" role="alert" aria-live="polite" aria-relevant="all"></div></div><div class="col-sm-6"><div class="dataTables_paginate paging_simple_numbers" id="dataTables-example_paginate"><ul class="pagination"><li class="paginate_button previous disabled" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous"><a href="#">Précédent</a></li><li class="paginate_button active" aria-controls="dataTables-example" tabindex="0"><a href="#">1</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">2</a></li><li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next"><a href="#">Suivant</a></li></ul></div></div></div>               
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
                <!-- /. ROW  -->
            
                        </div>
                    </div>
                    <!--  end  Context Classes  -->
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
