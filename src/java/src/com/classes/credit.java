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
 * @author Office Info
 */
public class credit {
    

    Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
    int num_c;
    int montant_max,montant_min,tia,teg,duree_min,duree_max;
String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   

    public int getNum_c() {
        return num_c;
    }

    public void setNum_c(int num_c) {
        this.num_c = num_c;
    }

    public int getMontant_max() {
        return montant_max;
    }

    public void setMontant_max(int montant_max) {
        this.montant_max = montant_max;
    }

    public int getMontant_min() {
        return montant_min;
    }

    public void setMontant_min(int montant_min) {
        this.montant_min = montant_min;
    }

    public int getTia() {
        return tia;
    }

    public void setTia(int tia) {
        this.tia = tia;
    }

    public int getTeg() {
        return teg;
    }

    public void setTeg(int teg) {
        this.teg = teg;
    }

    public int getDuree_min() {
        return duree_min;
    }

    public void setDuree_min(int duree_min) {
        this.duree_min = duree_min;
    }

    public int getDuree_max() {
        return duree_max;
    }

    public void setDuree_max(int duree_max) {
        this.duree_max = duree_max;
    }

 

  

    
    public void setcredit(int num) throws ClassNotFoundException, SQLException{
         
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try{
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from crédit where num_c ='" + num + "' "; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
              this.tia= Integer.parseInt(rs.getString(2));
              this.montant_max= Integer.parseInt(rs.getString(3));
             this.montant_min= Integer.parseInt(rs.getString(4));
             this.duree_max= Integer.parseInt(rs.getString(5));
             this.duree_min= Integer.parseInt(rs.getString(6));
         
            this.teg= Integer.parseInt(rs.getString(7));
               this.type= rs.getString(8);
           
                   }
         
            conn.close();}
            catch(Exception e)
            {System.out.println("erreur"+e);}
                                       
    }

   
   public void modifier(int num) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
            String query = "UPDATE crédit SET tia ='" + this.tia+ "',montant_max ='" + this.montant_max + "',montant_min='" + this.montant_min + "',duree_max='" + this.duree_max+ "',duree_min='" + this.duree_min+ "',teg ='" + this.teg+ "' ,type ='" + this.type+ "'  where num_c ='" + num + "'";
        
         stmt = conn.createStatement();
        int rs=stmt.executeUpdate(query);
       
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     }

 
    }


public void supcrd(int num) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
 conn=DriverManager.getConnection(url,"root","");
        
        String query = "delete from crédit where num_c ='" + num + "'";
        Statement requete = conn.createStatement();
        requete.executeUpdate(query);
        conn.close();

    }


public void ajouter(int tia,int montant_max,int montant_min,int duree_max,int duree_min,int teg,String type) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "insert into crédit(tia,montant_max,montant_min,duree_max,duree_min,teg,type)values('" + tia + "','" + montant_max + "','" + montant_min + "','" + duree_max + "','"+ duree_min +"','"+ teg +"','"+ type +"')";
    
       Statement st = conn.createStatement();
        st.executeUpdate(query);
       
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     }

 
    }}

    


    

