/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class responsable {
     String nom ;
     String prenom , Email;
     int id_resp, telephone;
     String lieu_travail,login,password ;
 Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;

    public int getId_resp() {
        return id_resp;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getLieu_travail() {
        return lieu_travail;
    }

    public void setLieu_travail(String lieu_travail) {
        this.lieu_travail = lieu_travail;
    }
            
    public void ajouter(String nom,String prenom,String email,int tel,String lieu,String login,String password ) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "insert into responsable(nom,prenom,Email,telephone,lieu_travail,login,password)values('" + nom + "','" + prenom + "','" + email + "','" + tel + "','" + lieu + "','" + login + "','" + password + "')";
    
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
       public void setresp(String nom) throws ClassNotFoundException, SQLException{
         
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try{
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from responsable where login ='"+ nom + "' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                           
               this.id_resp=Integer.parseInt(rs.getString(1));
          
              this.nom=rs.getString(2);
            this.prenom=rs.getString(3);
          
            this.Email=rs.getString(4);
 
            this.telephone=Integer.parseInt(rs.getString(5));
            
             this.lieu_travail=rs.getString(6);
            this.login=rs.getString(7);
            this.password=rs.getString(8);
                        }
         
            conn.close();}
            catch(Exception e)
            {System.out.println("erreur"+e);}
                                       
    }
     public void modifier(int id) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE responsable SET nom ='"+ this.nom+ "',prenom ='"+ this.prenom+ "',Email ='"+ this.Email+ "',lieu_travail ='"+ this.lieu_travail+ "',telephone ='"+ this.telephone +"' ,login ='"+ this.login +"' ,password ='"+ this.password +"'  where id_resp ='" + id + "'";
        
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
     
public void suppres(String nom) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
 conn=DriverManager.getConnection(url,"root","");
        
        String query = "delete from responsable where login ='" + nom + "'";
        Statement requete = conn.createStatement();
        requete.executeUpdate(query);
        conn.close();

    }
    
    
}
