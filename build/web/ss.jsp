<%-- 
    Document   : ss
    Created on : 29 Apr, 2017, 12:25:25 AM
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
        String e=request.getParameter("emoutpass");
        if(e==null)
        {
            out.println("hello");
        }
        %>
    </body>
</html>
