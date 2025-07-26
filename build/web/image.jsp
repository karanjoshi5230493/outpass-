<%-- 
    Document   : image
    Created on : 15 Apr, 2017, 1:28:42 AM
    Author     : Karan
--%>

<%@page import="java.io.*"%>
<%@page import="java.awt.Image"%>
<%@page contentType="image/jpeg"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           String url="jdbc:derby://localhost/outpass";
          Connection con=DriverManager.getConnection(url,"root","root");
           PreparedStatement stat=null;
           String eno=(String)session.getAttribute("eno");
           System.out.println(eno);
           stat=con.prepareStatement("select ppic from student where eno=?");
               stat.setString(1,eno);
               ResultSet res =stat.executeQuery();
               if(res.next())
               {
                   
                  byte []img=res.getBytes("ppic");
                  OutputStream out1=response.getOutputStream();
                  out1.write(img);
                 
               }
               con.close();
       %>
    </body>
</html>
