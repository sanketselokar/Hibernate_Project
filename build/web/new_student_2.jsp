<%-- 
    Document   : new_student_2
    Created on : May 28, 2017, 12:07:17 PM
    Author     : Sanket
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="NewStudentServlet2">       
        
            Roll Number: <input type="text" name="rollNo">
            <br>First Name: <input type="text" name="fname">
            
            <br> Last Name: <input type="text" name="lname">
           <br> DOB: <input type="date" name="dob" id="dob"> 
            <br> <input type="submit" value="Save" name="saveButton" onclick="return callservlet();" >
        <br> <input type="submit" value="Cancel">
        </form>
        
        
         </body>
         <script type="text/javascript">
            function callservlet() 
            {
                var x = document.getElementById('dob').value;
                document.getElementById("dob").value = x;
                //document.forms.submit();
                //document.form1.hiddenValue.value = x; 
                
                //<input type="submit" value="Save" name="saveButton" onclick="return callservlet();" >
                
              //  document.forms[0].action = "NewStudentServlet";
            document.forms[0].submit();
            }
</html>

