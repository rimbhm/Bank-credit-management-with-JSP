/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.com.classes.credit;
import src.com.classes.responsable;

/**
 *
 * @author DELL
 */
public class modifcr extends HttpServlet {

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
           try{
            request.getRequestURL();
          
      int num_c= Integer.parseInt(request.getParameter("num_c"));
           int tia = Integer.parseInt(request.getParameter("tia"));
            int montant_min =Integer.parseInt(request.getParameter("montant_min"));
             int montant_max =Integer.parseInt(request.getParameter("montant_max"));

             int duree_max = Integer.parseInt(request.getParameter("duree_max"));
            int duree_min = Integer.parseInt(request.getParameter("duree_min"));
            int teg = Integer.parseInt(request.getParameter("teg"));
            String type = request.getParameter("type");
       
            credit crd = new credit();
            
           crd.setNum_c(num_c);
          
          crd.setTia(tia);
          crd.setMontant_max(montant_max);
          crd.setMontant_min(montant_min);
          crd.setDuree_max(duree_max);
          crd.setDuree_min(duree_min);
          crd.setTeg(teg);
          crd.setType(type);
           crd.modifier(crd.getNum_c());
      
           RequestDispatcher dispatch = request.getRequestDispatcher("gestioncrédit.jsp"); 
                            dispatch.forward(request, response);
                       
        
                            // out.println("<html>");
                           // out.println("<head>");
                           // out.println("<title>Book Store</title>");   
                           // out.println("validation faite");
                           //  out.println("</head>");
                           // out.println("<body>");         
               // out.println("</html>");
           
        
       } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(modifcl.class.getName()).log(Level.SEVERE, null, ex);
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
