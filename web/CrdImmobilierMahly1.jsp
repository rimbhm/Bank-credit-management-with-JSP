<%-- 
    Document   : CréditImmobilier
    Created on : 3 mars 2016, 16:41:58
    Author     : Office Info
--%>
<%@page import="src.com.classes.mensualite"%>
<%
mensualite mode=(mensualite)request.getAttribute("mode");
%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simulation de crédit Immobilier Mahly UIB Direct</title>
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
                    <img src="assets/img/hffff.jpg" />
					</li>
				
					
                   			
                     <li  > <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
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
                    <div class="col-md-12">
                     
                     <!--<img src="assets/image/img/mooo.png"/></hr>-->
                      <img src="assets/img/fam.png"/> 
                       
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h2>Le crédit Immobilier Mahly UIB Direct, un crédit clair et compétitif </h2></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            
                        
                       </h4>
                         
                        <cebter><h2> Simulez votre crédit Immobilier Mahly</h2></center>
                   <h4>Evaluez votre capacité d'emprunt en fonction de vos revenus et calculer votre  mensualité  et obtenir une offre de crédit.
                           </h4>
                       
                                        </div>
                                    </div>
                                </div>
                       
                       <h3>  </h3>
                <form methode="post" action="controleur.php">
                       <div class="row">
                <div class="col-md-6 col-sm-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong> Savoir combein emprunter</strong>
                            
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#home" data-toggle="tab"><h4>Sur la base de vos revenus</h4></a>
                                </li>
                                <!--<li class=""><a href="#profile" data-toggle="tab">Profile</a>
                                </li>
                                <li class=""><a href="#messages" data-toggle="tab">Messages</a>
                                </li>
                                <li class=""><a href="#settings" data-toggle="tab">Settings</a>
                                </li>-->
                            </ul>

                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="home">
                                   
                                      <div class="form-group">
                                          <br><label> Vos Revenus mensuels nets</label> 
                                              <input class="form-petit" />DT</br>
                                           <br><label>Age de l'emprunteur</label>
                                           <select class="form-petit" > 
                                           <option>Ans</option>
                                            <option>18</option>
                                             <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                                <option>24</option>                                               
                                                <option>25</option>
                                               <option>26</option>
                                                <option>27</option>
                                                <option>28</option>
                                                <option>29</option>
                                                <option>30</option>
                                                <option>31</option>                                                
                                                <option>32</option>
                                               <option>33</option>
                                                <option>34</option>
                                                <option>35</option>
                                                <option>36</option>
                                                <option>37</option>
                                                <option>38</option>
                                            <option>39</option>
                                                <option>40</option>
                                                <option>41</option>
                                                <option>42</option>
                                                <option>43</option>
                                                <option>44</option>                                               
                                                <option>45</option>
                                               <option>46</option>
                                                <option>47</option>
                                                <option>48</option>
                                                <option>49</option>
                                                <option>50</option>
                                                <option>51</option>                                                
                                                <option>52</option>
                                               <option>53</option>
                                                <option>54</option>
                                                <option>55</option>
                                                <option>56</option>
                                                <option>57</option>
                                                <option>58</option>
                                            <option>59</option>
                                                <option>60</option>
                                                <option>61</option>
                                                <option>62</option>
                                                <option>63</option>                                               
                                                <option>64</option>
                                               <option>65</option>
                                                
                                           </select>
                                            
                                            
                                           </br><br><label>Durée souhaiteé de prêt </label>                                           
                                           <span class="pull-right"> <hr> <img src="assets/img/sim.jpg"/></hr>    </span>

                                        <select class="form-petit">
                                                <option>ans</option>
                                                <option>5</option>
                                                <option>6</option>
                                                <option>7</option>
                                                <option>8</option>
                                                <option>9</option>                                                
                                                <option>10</option>
                                               <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>                                                
                                                <option>17</option>
                                               <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>                                                
                                                <option>24</option>
                                                <option>25</option>
                                                
                                               
                                        </select></br>
                                                    <br><a href="#" class="btn btn-danger">Valider</a>
                                                    </div>
                                       
                                          
                                           
                                                
                                                
                                            
                                   </div>
                                <!--<div class="tab-pane fade" id="profile">
                                    <h4>Profile Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="messages">
                                    <h4>Messages Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="settings">
                                    <h4>Settings Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>-->
                            </div>
                        </div>
                    </div>
                </div>
                    
                   <div class="col-md-6 col-sm-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <strong> Calculer votre mensualité</strong>
                            
                        </div>
                        <div class="panel-body">
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#home" data-toggle="tab"><h4>Sur la base du montant du crédit</h4></a>
                                </li>
                                <!--<li class=""><a href="#profile-pills" data-toggle="tab">Profile</a>
                                </li>
                                <li class=""><a href="#messages-pills" data-toggle="tab">Messages</a>
                                </li>
                                <li class="active"><a href="#settings-pills" data-toggle="tab">Settings</a>
                                </li>-->
                            </ul>

                            <div class="tab-content">
                                <!--<div class="tab-pane fade" id="home-pills">
                                    <h4>Home Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <!---<div class="tab-pane fade" id="profile-pills">
                                    <h4>Profile Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>
                                <div class="tab-pane fade" id="messages-pills">
                                    <h4>Messages Tab</h4>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                </div>-->
                                <div class="tab-pane fade active in" id="settings-pills">
                                  <form role="form"  methode="Post" action="/ControleurServlet">
                                                  <br/>
                                    <div class="form-group"  >
                                        
                                      <br><label>Montant à emprunter</label>
                                          <input class="form-petit" />DT </br>
                                          <br><label>Revenu mensuel net </label>
                                              <tr><input class="form-petit" name="rmn"/>DT </br>
                                              <br><label>Age de l'emprunteur</label><tr><span class="pull-right"><img src="assets/img/sim.jpg"/></span>
                                                <select class="form-petit" name="age" > 
                                           <option>Ans</option>
                                            <option>18</option>
                                             <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>
                                                <option>24</option>                                               
                                                <option>25</option>
                                               <option>26</option>
                                                <option>27</option>
                                                <option>28</option>
                                                <option>29</option>
                                                <option>30</option>
                                                <option>31</option>                                                
                                                <option>32</option>
                                               <option>33</option>
                                                <option>34</option>
                                                <option>35</option>
                                                <option>36</option>
                                                <option>37</option>
                                                <option>38</option>
                                                <option>39</option>
                                                <option>40</option>
                                                <option>41</option>
                                                <option>42</option>
                                                <option>43</option>
                                                <option>44</option>                                               
                                                <option>45</option>
                                               <option>46</option>
                                                <option>47</option>
                                                <option>48</option>
                                                <option>49</option>
                                                <option>50</option>
                                                <option>51</option>                                                
                                                <option>52</option>
                                               <option>53</option>
                                                <option>54</option>
                                                <option>55</option>
                                                <option>56</option>
                                                <option>57</option>
                                                <option>58</option>
                                                <option>59</option>
                                                <option>60</option>
                                                <option>61</option>
                                                <option>62</option>
                                                <option>63</option>                                               
                                                <option>64</option>
                                               <option>65</option>
                                                
                                                </select></br>
                                                    <span class="pull-right"<img src="assets/img/sim.jpg"/></span>
                                            </br>      
                                            <br><label>Dureé souhaiteé    </label> 
                                                <select class="form-petit" >
                                                <option>ans</option>
                                                <option>5</option>
                                                <option>6</option>
                                                <option>7</option>
                                                <option>8</option>
                                                <option>9</option>                                                
                                                <option>10</option>
                                               <option>11</option>
                                                <option>12</option>
                                                <option>13</option>
                                                <option>14</option>
                                                <option>15</option>
                                                <option>16</option>                                                
                                                <option>17</option>
                                               <option>18</option>
                                                <option>19</option>
                                                <option>20</option>
                                                <option>21</option>
                                                <option>22</option>
                                                <option>23</option>                                                
                                                <option>24</option>
                                                <option>25</option>
                                                
                                                </select></br>
                                      

                                                <br><a href="#" class="btn btn-danger">Calculer</a>
                                       
                                  </div>
                                
                                </div>
                                
                            </div>
                        </div>
                    
                    </div>
                   </div>
                </div>
</form>
               <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h2>Quels sont les critères du crédit Immobilier Mahly</h2></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <strong> Pour qui?</strong>
                                            <h4> Le crédit Mahly est potentiellement accessible à toute salarié titulaire du secteur public, du secteur privé avec 
                                                plan de salaire décentralisé physique majeure jusqu'à 64 ans, capable physiquement.et les  retraités de moins de 65 ans à la souscription de l'asurance.
                                                </h4>
                         <strong> Pour quel projet?</strong>
                         <h4>-L'acquisition de logement ou de terrain à usage d'habitation.</h4>
                         <h4>-Construction ou extension de logement</h4>
                         <strong> Pour quel montant?</strong>
                        <h4>Pour un montant emprunter entre 5000 DT et 200 000 DT selon capacité de remboursement .</h4>
                       
                                        </div>
                                    </div>
                                </div>
                       <center><a href="demmahly.jsp" class="btn btn-danger btn-lg">Demandez ce crédit Vous seul</a></center>
                       <center><a href="#" >Demandez ce crédit Avec Co-Emprunteur</a></center>
                      <!--<div class="row">
                       <div style="margin:5px;" class="btn-toolbar">
										
										
										<div class="btn-group">
										  <button class="btn btn-danger">Danger</button>
										  <button   data-toggle="dropdown" class="btn btn-danger dropdown-toggle"><span class="caret"></span></button>
										  <ul class="dropdown-menu">
											<li><a href="#">Action</a></li>
											<li><a href="#">Another action</a></li>
											<li><a href="#">Something else here</a></li>
											<li class="divider"></li>
											<li><a href="#">Separated link</a></li>
										  </ul>
										
                                                                                </div>
                                         
									  </div>
                      </div>-->
                           <!-- /. ROW  -->
                 
                      
                               <!--<div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2>Accés à mon espace client</h2> 
                        </div>
                        <div class="panel-body">
                            <div> <strong>Simulation de crédit </strong>
                                <br><strong>Demande de crédit</strong>
                                <br><strong>Suivi de crédit </strong>
                                    <br><Strong>Consultation de tableau d'amortissement </strong></div>
                     <div class="row"> 
                     </div>
                        </div>
                    </div>            
                </div>
                      <div class="col-md-6 col-sm-12 col-xs-12">                     
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2> Identifiez vous pour accéder à votre Espace client</h2>
                        </div>
                        <div class="panel-body">
                            <div> <strong>Saisie votre numéro client:</strong>
                                 <span class="pull-right">
                                                   <a href="#" ><hr>
                     <img src="assets/img/ee.png"/></hr> </a> 
                                            </span>
                                 <div class="form-group input-group">
                                            <span class="input-group-addon"><i class="fa fa-lock"  ></i></span>
                                            <input type="password" class="form-control"  placeholder="Your Password" />
                                        </div>
                                    <div class="form-group">
                                            <label class="checkbox-inline">
                                                <input type="checkbox" /> <strong>mémoriser votre numéro</strong>
                                            </label></div>
                                <a href="chart.jsp"  href="#" class="btn btn-danger">Valider</a>
                                <br><div></div>
                                    <br><strong>j'oublier mon identifient!  </strong><a href="registeration.jsp" >click here </a>
                        </div>
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


