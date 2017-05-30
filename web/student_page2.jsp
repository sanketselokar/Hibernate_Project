<%-- 
    Document   : student_page2
    Created on : May 28, 2017, 10:34:10 AM
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
        
        <input type="button" value="New Student" name="newStudentButton" onclick="openPage('new_student_2.jsp')">
        <!-- <br> <input type="button" value="Login" name="LoginButton" onclick="openPage('ListOfStudent.jsp')">-->
        
        <form method="post" >
        <br> <br>  <input type="submit" name="listOfButton" value="List Of all Students" onclick="return callservlet();">
        </form>
    </body>
    <script type="text/javascript">
        function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
 
 function callservlet() 
            {
                
               
                document.forms[0].action = "FetchDataServlet2";
            document.forms[0].submit();
            }
</script>
</html>
