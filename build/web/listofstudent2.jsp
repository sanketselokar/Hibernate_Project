<%-- 
    Document   : listofstudent2
    Created on : May 28, 2017, 11:53:23 PM
    Author     : Sanket
--%>

<%@page import="student.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css"/>
        


    </head>
    <body>
        <div id="container">
        
        <h1>Student list</h1>
         <!--<input type="button" value="Edit" name="editButton" >-->
         
         
         <!--New code-->
         <div>
            
            <input type="button" value="Edit" id="edit" onclick="showInputField()" disabled="true"/>
            
        </div>
<form method="post" action="UpdateServlet2">
        <div id="inputField">
            <h2>User Details</h2>

                <fieldset>
                <legend>Roll No</legend>
                <input type="text" id="rollNo" name="rollNo" placeholder="Roll"/>
            </fieldset>
            <fieldset>
                <legend>First Name</legend>
                <input type="text" id="firstName" name="firstName" placeholder="Last"/>
            </fieldset>
            <fieldset>
                <legend>Last Name</legend>
                <input type="text" id="lastName" name="lastName" placeholder="Last"/>
            </fieldset>
            <fieldset>
                <legend>Date of Birth</legend>
                <input type="text" id="dob" name="dob" placeholder="mm/dd/yyyy"/>
            </fieldset>
            <fieldset>
                
                <input type="button" value="Edit User" id="addUser" onclick="editUser()"/>
                <!--<input type="submit" value="Edit User" name="addUser" onclick=" editUser()"/>-->
                
                <!--<input type="submit" name="listOfButton" value="List Of all Students" onclick="return callservlet();">-->
                <input type="button" value="Cancel" id="cancel" onclick="hideInputField()"/>
            </fieldset>

        </div>
                         </form>

         
         
        <table  id= "table">
            
            <tr>
                <th>Roll No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Date Of Birth</th>
                
                
            </tr>

           
            <c:forEach  var="san" items="${std}">
                <tr>
                    <td><c:out value="${san.getRollNo()}" /></td>
                    <td><c:out value="${san.getFname()}" /></td>
                    <td><c:out value="${san.getLname()}" /></td>
                    <td><c:out value="${san.getDob()}" /></td>
                    
                    
                </tr>
            </c:forEach>
                
                
                
        </table>
        </div>
    </body>
    
    <script type="text/javascript" src="js/table_javascript2.js"></script>
</html>
