<%-- 
    Document   : logout
    Created on : 15 Apr, 2017, 12:51:45 AM
    Author     : Karan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       
        String logout=request.getParameter("logout");
        String cpass=request.getParameter("cpass");
        out.println(logout);
        out.println(cpass);
        if(logout==null)
        {
            response.sendRedirect("changepass.jsp");
        }
        if(cpass==null)
        {
            session.invalidate();
        response.sendRedirect("login.jsp");
        }
        
        
        %>
    </body>
</html>
