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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Karan
 */
@WebServlet(name = "changepassword", urlPatterns = {"/changepassword"})
public class changepassword extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        HttpSession session =request.getSession(false);
        String eno=(String) session.getAttribute("eno");
        String newpass=request.getParameter("cpass");
        String oldpass=request.getParameter("opass");
         String old=null;
        PrintWriter out=response.getWriter();
        String url="jdbc:derby://localhost/outpass";
      try(Connection con = DriverManager.getConnection(url,"root","root");)
      {
        
         PreparedStatement stat=con.prepareStatement("select pwd from student where eno=?");
         stat.setString(1,eno);
         ResultSet res=stat.executeQuery();
         if(res.next())
         {
             old=res.getString("pwd");
             
         }
       if(oldpass.equals(old))
         {
             
           PreparedStatement  stat1=con.prepareStatement("update student set pwd=? where eno=?");
               stat1.setString(1, newpass);
             stat1.setString(2,eno);
              int updated=stat1.executeUpdate();
               if(updated>0)
              {
               
                session.invalidate();
                out.println( "<html><body><script>alert(\"Password Updated ...redirecting you to index page\");"
                    + "window.location.replace(\"index.html\");"
                    + "</script></body></html>");
                //response.sendRedirect("login.jsp");
                
                }
               
         }
       if(oldpass.equals(old)==false)
         {
            out.println( "<html><body><script>alert(\"old password didnot match current password\");"
                    
                    + "window.location.replace(\"outpass.jsp\");"
                    + "</script></body></html>"); 
            
         }
         
      } 
      catch (Exception ex) 
      {
            
      }
    }

   

}
