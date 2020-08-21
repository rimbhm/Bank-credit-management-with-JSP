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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import src.com.classes.client;


/**
 *
 * @author Office Info
 */
public class ajoutcl extends HttpServlet {
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
          // int id= Integer.parseInt(request.getParameter("id"));
            int num_client= Integer.parseInt(request.getParameter("num_client"));
            int cin = Integer.parseInt(request.getParameter("cin"));     
            String nom = request.getParameter("nom");
            String prenom = request.getParameter("prenom");
            String etat = request.getParameter("etat");
            String date_naissance = request.getParameter("date_naissance");
            String email = request.getParameter("email");
            String adresse = request.getParameter("adresse");
            String nationalite = request.getParameter("nationalite");
            int telephone = Integer.parseInt(request.getParameter("telephone"));
            int ncompte = Integer.parseInt(request.getParameter("ncompte"));
            String type = request.getParameter("type");
             String login = request.getParameter("login");
            String password = request.getParameter("password");
          
            client p = new client();
      try 
{ 
        
     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       

    conn=DriverManager.getConnection(url,"root","");
    Statement st = conn.createStatement();
     String query = "insert into client (num_client,cin,nom,prenom,etat,date_naissance,email,adresse,nationalite,telephone,ncompte,type,login,password)values('" + num_client + "','" + cin + "','" + nom + "','" + prenom + "','" + etat + "','" + date_naissance + "','" + email + "','" + adresse + "','" + nationalite + "','" + telephone + "','" + ncompte + "','" + type + "','" + login + "','" + password + "')";
    
      
        st.executeUpdate(query);
           HttpSession session = request.getSession(false);
                if(session!=null)
                 session.setAttribute("login", login);
        RequestDispatcher dispatch = request.getRequestDispatcher("client1.jsp"); 
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
