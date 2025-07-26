<%-- 
    Document   : download
    Created on : 24 May, 2017, 1:47:12 PM
    Author     : Karan
--%>


<%@page import="java.sql.*;"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            String name=null;
     String hadd=null;
     String from=null;
     String to=null;
     String place=null;
     String reason=null;
     String sphone=null;
     String pphone=null;
            
            
        try
     {
         response.setContentType("application/vnd.ms-excel");
         Connection con=null;
         String url="jdbc:derby://localhost/outpass";
         con=DriverManager.getConnection(url);
         Statement stat=con.createStatement();
         String query="SELECT * FROM ONOUTPASS where Current_Date >= fromdate and Current_Date<=todate and block='B' ";
        ResultSet res=stat.executeQuery(query);%>
        <table>
       
        <% while(res.next())
          {
              name= res.getString("sname");
                     hadd=res.getString("block")+"-"+res.getString("roomno");
                     from=res.getString("fromdate");
                     to=res.getString("todate");
                     place=res.getString("place");
                     reason=res.getString("reason");
                   sphone=res.getString("sphone");
                     pphone=res.getString("pphone");%>
      <tr><td><%=name%></td><td><%=hadd%></td><td><%=from%></td><td><%=to%></td><td><%=place%></td><td><%=reason%></td><td><%=sphone%></td><td><%=pphone%></td></tr>               
       </table>              
                    
                     
              
              
         <% }
        
     }
      catch(Exception ee)
      {
          
      }
        
        
        %>
    </body>
</html>
