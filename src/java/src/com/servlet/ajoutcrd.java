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
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import src.com.classes.credit;

/**
 *
 * @author Office Info
 */
public class ajoutcrd extends HttpServlet {
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
         
           int tia = Integer.parseInt(request.getParameter("tia"));
            int montant_min =Integer.parseInt(request.getParameter("montant_min"));
             int montant_max =Integer.parseInt(request.getParameter("montant_max"));

             int duree_max = Integer.parseInt(request.getParameter("duree_max"));
            int duree_min = Integer.parseInt(request.getParameter("duree_min"));
            int teg = Integer.parseInt(request.getParameter("teg"));
            String type = request.getParameter("type");
            credit c = new credit();
           
         try 
{ 
        
     Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/pfe1"; 
       

    conn=DriverManager.getConnection(url,"root","");
 
       String query = "insert into crédit(tia,montant_max,montant_min,duree_max,duree_min,teg,type)values('" + tia + "','" + montant_max + "','" + montant_min + "','" + duree_max + "','"+ duree_min +"','"+ teg +"','" + type + "')";
    
       Statement st = conn.createStatement();
        st.executeUpdate(query);
        
        RequestDispatcher dispatch = request.getRequestDispatcher("gestioncrédit.jsp"); 
                            dispatch.forward(request, response);
        stmt.close();
        conn.close();
        }
    catch(   ClassNotFoundException | SQLException | ServletException | IOException e) 
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
