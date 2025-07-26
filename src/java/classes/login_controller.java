/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Karan
 */
@WebServlet(name = "login_controller", urlPatterns = {"/login_controller"})
public class login_controller extends HttpServlet {

   
    
    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
         String url="jdbc:derby://localhost/outpass";
        try (Connection con = DriverManager.getConnection(url,"root","root")) {
            PreparedStatement stat=null;
            
            String uid=request.getParameter("uid");
            String pass=request.getParameter("pass");
            String role=request.getParameter("role");
            if(request.getParameter("role").equals("student"))
            {
                stat=con.prepareStatement("select * from student where eno=? and pwd=? ");
                stat.setString(1,uid);
                stat.setString(2,pass);
                ResultSet res=stat.executeQuery();
                if(res.next())
                {
                    HttpSession session=request.getSession();
                    
                              session.setAttribute("sname",res.getString("sname"));
                              session.setAttribute("eno",res.getString("eno"));
                              session.setAttribute("block",res.getString("block"));
                              session.setAttribute("roomno",res.getString("roomno"));
                              session.setAttribute("course",res.getString("course"));
                              session.setAttribute("email",res.getString("email"));
                              session.setAttribute("sphone",res.getString("sphone"));
                              session.setAttribute("pphone",res.getString("pphone"));
                              //response.sendRedirect("outpass.jsp");
                               RequestDispatcher disp=request.getRequestDispatcher("outpass.jsp");
        disp.forward(request, response);
                            
                }
                else
                {
                      RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
            disp.forward(request,response);
                }
                
                
                
                
                
            }
            if(request.getParameter("role").equals("warden"))
            {
                
                stat=con.prepareStatement("select * from warden where userid=? and pwd=? ");
                stat.setString(1,uid);
                stat.setString(2,pass);
                ResultSet res=stat.executeQuery();
                if(res.next())
                {
                    
                   HttpSession session=request.getSession();
                    
                              session.setAttribute("sname",res.getString("name"));
                             // response.sendRedirect("warden.jsp");
                             RequestDispatcher disp=request.getRequestDispatcher("warden.jsp");
        disp.forward(request, response);
                    
                    
                    
                }
               
                else
                {
                      RequestDispatcher disp=request.getRequestDispatcher("error.jsp");
                      disp.forward(request,response);
                }
                
                
                
                
            }
            
            
            
            
        } catch (Exception ex) 
        {
           
                   
//            response.sendRedirect("error..jsp");
           
        }
        
        
    }

    
    
}
