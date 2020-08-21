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
public class rachat {
      Connection conn = null;
	Statement stmt = null;
        ResultSet rs = null;
         int num ,pers; 
  String client,credit,situation,logement,prof,statut,duree,etat,motif;
int id,salaire,revenu,loyer,arm,mloyer,capitale,mens,montant;

    public int getCapitale() {
        return capitale;
    }

    public void setCapitale(int capitale) {
        this.capitale = capitale;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPers() {
        return pers;
    }

    public void setPers(int pers) {
        this.pers = pers;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getLogement() {
        return logement;
    }

    public void setLogement(String logement) {
        this.logement = logement;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getRevenu() {
        return revenu;
    }

    public void setRevenu(int revenu) {
        this.revenu = revenu;
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public int getArm() {
        return arm;
    }

    public void setArm(int arm) {
        this.arm = arm;
    }

    public int getMloyer() {
        return mloyer;
    }

    public void setMloyer(int mloyer) {
        this.mloyer = mloyer;
    }

    public int getMens() {
        return mens;
    }

    public void setMens(int mens) {
        this.mens = mens;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

 public void setrachat(int num) throws ClassNotFoundException, SQLException{
         
                Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/pfe1";
		
		try{
			
			conn = DriverManager.getConnection(url, "root", "");
                        stmt = conn.createStatement();
                        String query ="select * from rachat where num ='"+ num + "'"; 
                        rs = stmt.executeQuery(query);
                        while (rs.next())
                        {
                           
              
             this.num=Integer.parseInt(rs.getString(1));
             
            this.client=rs.getString(2);
               this.situation=rs.getString(3);
               this.pers=Integer.parseInt(rs.getString(4));
            this.logement=rs.getString(5);
            this.prof=rs.getString(6);
            this.statut=rs.getString(7);
             this.duree=rs.getString(8);
             this.salaire=Integer.parseInt(rs.getString(9));
             this.revenu=Integer.parseInt(rs.getString(10));
             this.loyer=Integer.parseInt(rs.getString(11));
             this.arm=Integer.parseInt(rs.getString(12));
             this.mloyer=Integer.parseInt(rs.getString(13));
           
             this.credit=rs.getString(20);
               this.capitale=Integer.parseInt(rs.getString(21));
                this.mens=Integer.parseInt(rs.getString(22));
                 this.montant=Integer.parseInt(rs.getString(23));
                        }
         
            conn.close();}
            catch(SQLException | NumberFormatException e)
            {System.out.println("erreur"+e);}
                                       
    }
 
   
   public void modifier(int num) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE demande SET situation ='" + this.situation+ "',pers ='"+ this.pers+ "',logement ='"+ this.logement+ "',prof ='"+ this.prof+ "',statut ='"+ this.statut+ "',duree ='"+ this.duree+ "',salaire ='"+ this.salaire+ "',revenu ='"+ this.revenu+ "',loyer ='"+ this.loyer+ "',arm ='" + this.arm+ "',mloyer ='"+ this.mloyer +"',credit ='" + this.credit + "' where num ='" + num + "'";
        
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
   
public void ajouter(String client,String situation,int pers,String logement,String prof,String statut,String duree,int salaire,int revenu,int loyer,int arm,int mloyer,int mcred,int enc_cred,int montant_cred,int duree_cred, String credit ) throws ClassNotFoundException, SQLException {
           
  try 
{ 

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 

    conn=DriverManager.getConnection(url,"root","");
    Statement st = conn.createStatement();
     String query = "insert into demande (num,client,situation,pers,logement,prof,statut,duree,salaire,revenu,loyer,arm,mloyer,mcred,enc_cred,montant_cred,duree_cred,etat,motif,credit)values(''," + client + "','" + situation + "','" + pers + "','" + logement + "','" + prof + "','" + statut + "','" + duree + "','" + salaire + "','" + revenu + "','" + loyer + "','" + arm + "','" + mloyer + "','" + mcred + "','" + enc_cred + "','" + montant_cred + "','" + duree_cred + "','en cours','','" + credit+ "')";
      
        st.executeUpdate(query);
       stmt.close();
        conn.close();
        }
    catch(ClassNotFoundException | SQLException e) 
    {
        System.out.println("Error.."+e);
     } 

 
    }



public void suppdem(int num) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
 conn=DriverManager.getConnection(url,"root","");
        
        String query = "delete from demande where num ='" + num + "'";
        Statement requete = conn.createStatement();
        requete.executeUpdate(query);
        conn.close();

    }

public void modifier1(int num) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE demande SET etat = 'Acceptation',motif ='" + this.motif + "' where num ='" + num + "'";
        
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

public void modifier2(int num) throws ClassNotFoundException, SQLException {
    

     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       
try 
{ 
    conn=DriverManager.getConnection(url,"root","");
 
     String query = "UPDATE demande SET etat = 'Refus',motif ='" + this.motif + "' where num ='" + num + "'";
        
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




}
