/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanket
 */
@WebServlet(name = "UpdateServlet2", urlPatterns = {"/UpdateServlet2"})
public class UpdateServlet2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int rollNo = Integer.parseInt(request.getParameter("rollNo"));
//        int rollNo = request.getParameter("rno");
        String firstName=request.getParameter("firstName");
        
        String lastName=request.getParameter("lastName");
        
       
       String dateParameter = request.getParameter("dob");
        
        System.out.println("Rla number++++" + rollNo);
        System.out.println("Rla number++++" + firstName);
        System.out.println("Rla number++++" + lastName);
        System.out.println("Rla number++++" + dateParameter);
        
          StdDataStoreBussLogic dt = new StdDataStoreBussLogic();
////          dt.display(firstName);
//          
        String save = "update";
//
        dt.saveStudentDetails(rollNo, firstName, lastName, dateParameter, save);
        
        //2. Update existing student
//        dt.saveStudentDetails(rollNo, firstName, lastName, dateParameter, update);
//          
System.out.println("Updatela cal zal ");
//response.sendRedirect("http://localhost:8080/HelloWorld/test");
        response.sendRedirect("FetchDataServlet2");
//        response.sendRedirect("login_jsp2.jsp");
        
        //System.out.println("Updatela cal zal ");
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
