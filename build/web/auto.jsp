

<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="src.com.classes.*" %>




<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simulation de crédit Auto UIB Direct</title>
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
   <script language="javascript">
function calculm()
{
    var r = document.getElementById("revenu").value; 
    //var d = document.getElementById("duree").value; 
  
  var select = document.getElementById("duree");
    var choice = select.selectedIndex;  // Récupération de l'index du <option> choisi
    var d = select.options[choice].text;
     var select1= document.getElementById("age");
    var choice1 = select1.selectedIndex;  // Récupération de l'index du <option> choisi
    var a = select1.options[choice1].text;
  
    var mo = document.getElementById("montant").value; 
   var t = a+d;
   
   if (t < 100 ) {
     alert("Vous ne pouvez pas avoir un crédit avec une telle durée vous devez déminuez la durée !");
   } else{
         var  m =(mo + (7.3/12))/ 1-(1+(7.3/12))^ d;
          var s =m/r;
         //   if (s < (45/100)){
                 alert("Votre mensualité est éguale à ,"+ m);
            // }else{
                   //alert("Veuillez déminuez votre montant ou la durée !");
            // }
     }
            
  }


</script>
   
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
font-size: 16px;"> <%
   Date aujourdhui = new Date();
   DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
  out.println(shortDateFormat.format(aujourdhui));
%> </div>
       
        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/auto33.jpg"/>
					</li>
				
					
                    
                      <li  > <a   href="index.jsp"><i class="fa fa-university fa-3x"></i>Accueil</a>
                    </li>
                     <!--<li>
                        <a  href="ui.html"><i class="fa fa-desktop fa-3x"></i> Espaceq</a>
                    </li>
                    <li>
                        <a  href="tab-panel.html"><i class="fa fa-qrcode fa-3x"></i> Tabs & Panels</a>
                    </li>
						   <li  >
                        <a   href="chart.html"><i class="fa fa-bar-chart-o fa-3x"></i> Morris Charts</a>
                    </li>	
                      <li  >
                        <a  href="table.html"><i class="fa fa-table fa-3x"></i> Table Examples</a>
                    </li>-->
                    <li  >
                        <a   href="client.jsp"><i class="fa fa-male fa-3x" ></i>
 Espace Client </a>
                    </li>				
					 <!--<li  >
                        <a   href="login.html"><i class="fa fa-bolt fa-3x"></i> Login</a>
                    </li>	
                     <li  >
                        <a   href="registeration.html"><i class="fa fa-laptop fa-3x"></i> Registeration</a>
                    </li>-->	
					                   
                    <li>
                        <a class="active-menu" href="client.jsp" href="#"><i class="fa fa-money fa-3x"></i> Nos Crédits Consommation<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="expresso.jsp">Crédit Expresso</a>
                            </li>
                            <li>
                                <a  href="auto.jsp" >Crédit Auto</a>
                            </li>
                            
                            <li>
                                <a href="#">Crédit Immobilier<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="travaux&aménagement">Immobilier Aménagement & Travaux</a>
                                    </li>
                                    <li>
                                        <a href="CrdImmobilierMahly.jsp">Immobilier Mahly</a>
                                    </li>
                                    <li>
                                <a href="dari.jsp">Crédit Dari</a>
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
                        <a  href="demandeCrd.jsp"><i class="fa fa-edit fa-3x"></i>Faire une demande de crédit</a> </li>  
                 
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <hr>
                     <img src="assets/img/c_homee.png"/></hr>
                       
                       
                       <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h2>Le crédit Auto UIB Direct, un crédit clair et compétitif </h2></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <h4>   Nous pouvons vous aider à acquérir 
                        
                        votre crédit Auto Pas cher.</h4>
                         
                        <cebter><h2> Simulez votre crédit Auto</h2></center>
                   <h4>Evaluez votre capacité d'emprunt en fonction de vos revenus et calculer votre  mensualité  et obtenir une offre de crédit.
                           </h4>
                       
                                        </div>
                                    </div>
                                </div>
                       
                       <h3>  </h3>
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
                                    <%
                  Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try {
			  
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from crédit where type = 'Auto' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                            
                        {
                               
                              int t =Integer.parseInt(rs.getString(2));
                            
                            int montant =Integer.parseInt(rs.getString(3));
                            
                  %>
                              
                  <div class="form-group">    <form name="form" action="" method="post">
                                          <br><label> Vos Revenus mensuels nets</label> 
                                              <input type="text" class="form-petit"  name ="revenu" id ="revenu"/>DT</br>
                                           <br><label>Age de l'emprunteur</label>
                                           <select class="form-petit" name = "age1" id ="age1"> 
                                           <option >Ans</option>
                                            <option value="18">18</option>
                                             <option value="19">19</option>
                                                <option value="20">20</option>
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

                                        <select class="form-petit" name="duree1" id="duree1">
                                                <option>Mois</option>
                                                <option id="1" value="1">60</option>
                                                <option id="2" value="2">61</option>
                                                <option id="3" value="3">62</option>
                                                <option>63</option>
                                                <option>64</option>                                               
                                                <option>65</option>
                                               <option>66</option>
                                                <option>67</option>
                                                <option>68</option>
                                                <option>69</option>
                                                <option>71</option>
                                                <option>72</option>                                                
                                                <option>73</option>
                                               <option>74</option>
                                                <option>75</option>
                                                <option>76</option>
                                                <option>77</option>
                                                <option>78</option>
                                                <option>79</option>                                                
                                                <option>80</option>
                                                <option>81</option>
                                                <option>82</option>
                                                <option>83</option>
                                                <option>84</option>
                                 
                                        </select></br>
                           <br> <input type="submit" name="valider" class="btn btn-danger" value="valider" />
                      </form>
                                                    </div>

                                       <%
                                                }
                            conn.close();
                            }catch(Exception e){System.out.println("erreur"+e);

                            }
                                                
                                                %>
                                           
                                           
                                                
                                                
                                            
                                   </div>
                               
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
                              
                            </ul>

                            <div class="tab-content">
                               
                                <div class="tab-pane fade active in" id="settings-pills">
                                  <div class="form-group">
                                    <form name="form" action="" method="post">  
                                      <br><label>Montant à emprunter</label>
                                          <input type="text" class="form-petit"  name="montant" id = "montant"/>DT </br>
                                          <br><label>Revenu mensuel net </label><span class="pull-right"> <hr> <img src="assets/img/sim.jpg"/></hr>    </span>
                                              <tr><input type="text" class="form-petit" name="revenu" id = "revenu" />DT </br>
                                            <br><label>Age de l'emprunteur</label>
                                                <select class="form-petit" name="age" id = "age" > 
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
                                            </br>      
                                            <br><label>Dureé souhaiteé    </label> 
                                                <select class="form-petit"  name ="duree" id="duree">
                                             <option value="vide">Mois</option>
                                                 <option id="1" value="1">60</option>
                                                <option id="2" value="2">61</option>
                                                <option id="3" value="3">62</option>
                                                <option>63</option>
                                                <option>64</option>                                                
                                                <option>65</option>
                                               <option>66</option>
                                                <option>67</option>
                                                <option>68</option>
                                                <option>69</option>
                                                <option>71</option>
                                                <option>72</option>                                                
                                                <option>73</option>
                                               <option>74</option>
                                                <option>75</option>
                                                <option>76</option>
                                                <option>77</option>
                                                <option>78</option>
                                                <option>79</option>                                                
                                                <option>80</option>
                                                <option>81</option>
                                                <option>82</option>
                                                <option>83</option>
                                                <option>84</option>
                                 
                                                </select></br>
                                                <br>
                                  <input type="submit" name="calculer" class="btn btn-danger" value="Calculer" onClick="calculm()"/>
                                    </form>
                                  
                                  
                                  </div>
                                    
                                </div>
                                
                            </div>
                        </div>
                    
                    </div>
                   </div>
                </div>
               <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h4 class="panel-title">
                                            <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><h2>Quels sont les critères du crédit Auto UIB Direct </h2></a>
                                        </h4>
                                    </div>
                                    <div id="collapseTwo" class="panel-collapse in" style="height: auto;">
                                        <div class="panel-body">
                                            <strong> Pour qui?</strong>
                                            <h4> Le crédit Auto UIB Direct est potentiellement accessible à toute salarié titulaire du secteur public, du secteur privé avec 
                                                plan de salaire décentralisé physique majeure jusqu'à 64 ans, capable physiquement.et les  retraités de moins de 65 ans à la souscription de l'asurance.
                                                </h4>
                         <strong> Pour quel projet?</strong>
                         <h4>L'acquisition d'un véhicule neuf ou d'occasion .</h4>
                         <strong> Pour quel montant?</strong>
                        <h4>Pour un montant emprunter entre 1000 DT et 200000 DT .</h4>
                       
                                        </div>
                                    </div>
                                </div>
                       <center><a href="client.jsp" class="btn btn-danger btn-lg">Demandez ce crédit Vous seul</a></center>
                       <center><a href="#" >Demandez ce crédit Avec Co-Emprunteur</a></center>
                    
                    </div>            
               
                 <!-- /. ROW  -->
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>

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


