/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karan
 */
@WebServlet(name = "download", urlPatterns = {"/download"})
public class download extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-Disposition", "attachment;filename=myfile.xls");
     PrintWriter out=response.getWriter();
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
         Connection con=null;
         String url="jdbc:derby://localhost/outpass";
         con=DriverManager.getConnection(url);
         Statement stat=con.createStatement();
         String query="SELECT * FROM ONOUTPASS where Current_Date >= fromdate and Current_Date<=todate and block='B' ";
        ResultSet res=stat.executeQuery(query);
        
        
         while(res.next())
          {
              name= res.getString("sname");
                     hadd=res.getString("block")+"-"+res.getString("roomno");
                     from=res.getString("fromdate");
                     to=res.getString("todate");
                     place=res.getString("place");
                     reason=res.getString("reason");
                   sphone=res.getString("sphone");
                     pphone=res.getString("pphone");   
          }
        
     }
     catch(Exception ee)
     {
         
     }
        
        
        
    }

   

}
