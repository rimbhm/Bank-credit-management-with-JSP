/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.classes;


import java.sql.*;
import java.sql.Date;

/**
 *
 * @author Office Info
 */
public class client {
    Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;

    int id, cin ,num_client,telephone,ncompte;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
     String nom,prenom,etat,email,adresse,nationalite,type,date_naissance,login,password;

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getNcompte() {
        return ncompte;
    }

    public void setNcompte(int ncompte) {
        this.ncompte = ncompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  
       public void setclient1(String nom) throws ClassNotFoundException, SQLException{
         
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try{
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from client where login ='"+ nom + "' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                           
              this.num_client=Integer.parseInt(rs.getString(2));
              this.cin=Integer.parseInt(rs.getString(3));
              this.nom=rs.getString(4);
            this.prenom=rs.getString(5);
             this.etat=rs.getString(6);
            this.date_naissance=rs.getString(7);
            this.email=rs.getString(8);
            this.adresse=rs.getString(9);
            
            this.nationalite=rs.getString(10);
            this.telephone=Integer.parseInt(rs.getString(11));
            this.ncompte=Integer.parseInt(rs.getString(12));
             this.type=rs.getString(13);
            this.login=rs.getString(14);
            this.password=rs.getString(15);
                        }
         
            conn.close();}
            catch(Exception e)
            {System.out.println("erreur"+e);}
                                       
    }
    public void setclient(int id) throws ClassNotFoundException, SQLException{
         
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try{
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from client where id ='"+ id + "' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                           
              
             this.num_client=Integer.parseInt(rs.getString(2));
              this.cin=Integer.parseInt(rs.getString(3));
              this.nom=rs.getString(4);
            this.prenom=rs.getString(5);
             this.etat=rs.getString(6);
            this.date_naissance=rs.getString(7);
            this.email=rs.getString(8);
            this.adresse=rs.getString(9);
            
            this.nationalite=rs.getString(10);
            this.telephone=Integer.parseInt(rs.getString(11));
            this.ncompte=Integer.parseInt(rs.getString(12));
             this.type=rs.getString(13);
            this.login=rs.getString(14);
            this.password=rs.getString(15);
                        }
         
            conn.close();}
            catch(Exception e)
            {System.out.println("erreur"+e);}
                                       
    }
  public void modifier1(int num) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE client SET cin ='" + this.cin+ "',nom ='"+ this.nom+ "',prenom ='"+ this.prenom+ "',etat ='"+ this.etat+ "',date_naissance ='"+ this.date_naissance+ "',email ='"+ this.email+ "',adresse ='"+ this.adresse+ "',nationalite ='" + this.nationalite+ "',telephone ='"+ this.telephone +"',ncompte ='" + this.ncompte + "',type ='" + this.type + "' where num_client ='" + num + "'";
        
       Statement st = conn.createStatement();
        st.executeUpdate(query);
       
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     }

 
    }
   
   public void modifier(int id) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE client SET num_client ='" + this.num_client+ "', cin ='" + this.cin+ "',nom ='"+ this.nom+ "',prenom ='"+ this.prenom+ "',etat ='"+ this.etat+ "',date_naissance ='"+ this.date_naissance+ "',email ='"+ this.email+ "',adresse ='"+ this.adresse+ "',nationalite ='" + this.nationalite+ "',telephone ='"+ this.telephone +"',ncompte ='" + this.ncompte + "',type ='" + this.type + "',login ='" + this.login + "',password ='" + this.password + "' where id ='" + id + "'";
        
       Statement st = conn.createStatement();
        st.executeUpdate(query);
       
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     }

 
    }
public void ajouter(int num,int cin,String nom,String prenom,String date_naissance,String email,String adresse,String nationalite,int tel,int ncompte,String type,String login,String password ) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "insert into client(num_client,cin,nom,prenom,date_naissance,email,adresse,nationalite,telephone,ncompte,type,login,password)values('" + num + "','" + cin + "','" + nom + "','" + prenom + "','" + date_naissance + "','" + email + "','" + adresse + "','" + nationalite + "','" + tel + "','" + ncompte + "','" + type + "','" + login + "','" + password + "')";
    
       Statement st = conn.createStatement();
        st.executeUpdate(query);
       
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     }

 
    }


public void suppcl1(int num) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
 conn=DriverManager.getConnection(url,"root","");
        
        String query = "delete from client where id ='" + num + "'";
        Statement requete = conn.createStatement();
        requete.executeUpdate(query);
        conn.close();

    }
public void suppcl(String nom) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
 conn=DriverManager.getConnection(url,"root","");
        
        String query = "delete from client where login ='" + nom + "'";
        Statement requete = conn.createStatement();
        requete.executeUpdate(query);
        conn.close();

    }

}

    

