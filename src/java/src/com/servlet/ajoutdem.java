/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.com.classes.*;

/**
 *
 * @author DELL
 */
public class ajoutdem extends HttpServlet {
                    Connection conn = null;
		 Statement stmt = null;
		ResultSet rs = null;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
              
            String client = request.getParameter("client");
            String situation = request.getParameter("situation");
            int pers = Integer.parseInt(request.getParameter("pers"));
            String logement = request.getParameter("logement");
            String prof = request.getParameter("prof");
            String statut = request.getParameter("statut");
            String duree = request.getParameter("duree");
            int salaire = Integer.parseInt(request.getParameter("salaire"));
            int revenu = Integer.parseInt(request.getParameter("revenu"));
            int loyer = Integer.parseInt(request.getParameter("loyer"));
             int arm = Integer.parseInt(request.getParameter("arm"));
             int mloyer = Integer.parseInt(request.getParameter("mloyer"));
             int mcred = Integer.parseInt(request.getParameter("mcred"));
            int enc_cred = Integer.parseInt(request.getParameter("enc_cred"));
             int montant_cred = Integer.parseInt(request.getParameter("montant_cred"));
            int duree_cred = Integer.parseInt(request.getParameter("duree_cred"));
             String credit = request.getParameter("credit");
     
      try 
{ 
        
     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       

    conn=DriverManager.getConnection(url,"root","");
    Statement st = conn.createStatement();
     String query = "insert into demande (client,situation,pers,logement,prof,statut,duree,salaire,revenu,loyer,arm,mloyer,mcred,enc_cred,montant_cred,duree_cred,etat,motif,credit)values('" + client + "','" + situation + "','" + pers + "','" + logement + "','" + prof + "','" + statut + "','" + duree + "','" + salaire + "','" + revenu + "','" + loyer + "','" + arm + "','" + mloyer + "','" + mcred + "','" + enc_cred + "','" + montant_cred + "','" + duree_cred + "','en cours','','" + credit + "')";
    
      
        st.executeUpdate(query);
        
       //out.println(" <script> //alert(\"Votre demande est enregistré avec succé  !\");</script>");
          
        RequestDispatcher dispatch = request.getRequestDispatcher("listedemande.jsp"); 
                            dispatch.forward(request, response);
        stmt.close();
        conn.close();
        }
    catch(Exception e) 
    {
        System.out.println("Error.."+e);
     } 
            
        
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
