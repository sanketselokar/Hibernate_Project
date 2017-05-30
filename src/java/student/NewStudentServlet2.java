/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sanket
 */
@WebServlet(name = "NewStudentServlet2", urlPatterns = {"/NewStudentServlet2"})
public class NewStudentServlet2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        int rollNo = Integer.parseInt(request.getParameter("rollNo"));
        String firstName=request.getParameter("fname");
        
        String lastName=request.getParameter("lname");
        
       
       String dateParameter = request.getParameter("dob");
        
        
          StdDataStoreBussLogic dt = new StdDataStoreBussLogic();
//          dt.display(firstName);
          
        String save = "save";
//        String update = "update";
        // 1. Save fresh student
        dt.saveStudentDetails(rollNo, firstName, lastName, dateParameter, save);
        
        //2. Update existing student
//        dt.saveStudentDetails(rollNo, firstName, lastName, dateParameter, update);
          

        response.sendRedirect("student_page2.jsp");
        
        System.out.println("Ikde aala.....");
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
