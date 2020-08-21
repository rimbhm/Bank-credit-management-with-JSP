/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.loginDAO1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Office Info
 */
@WebServlet(name = "loginres", urlPatterns = {"/loginres"})
public class loginres extends HttpServlet {
                private static final long serialVersionUID = 1L;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
             //   Connection conn = null;
		// Statement stmt = null;
		//ResultSet rs = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          // try{
          
            String n=request.getParameter("login");
                String p=request.getParameter("password");
                
                HttpSession session = request.getSession(false);
                if(session!=null)
                 session.setAttribute("login", n);
              
                if(loginDAO1.validate(n, p)){
                  
               
                    RequestDispatcher rd=request.getRequestDispatcher("responsable1.jsp");
                    rd.forward(request,response);
                             // }else{  RequestDispatcher rd=request.getRequestDispatcher("simulation.jsp");
                   // rd.forward(request,response);}
                                  
                }
                else{
                 out.print("<p style=\"color:red\">login et password invalident</p>");
                    RequestDispatcher rd=request.getRequestDispatcher("responsable.jsp");
                    rd.include(request,response);
                }
            
                /* } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginServelet.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
            Logger.getLogger(loginServelet.class.getName()).log(Level.SEVERE, null, ex);
                }*/
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
