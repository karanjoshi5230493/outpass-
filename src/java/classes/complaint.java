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
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "complaint", urlPatterns = {"/complaint"})
public class complaint extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
      PrintWriter out=response.getWriter();  
      String msg=request.getParameter("msgtowarden");
       HttpSession session=request.getSession();
       String sname=(String)session.getAttribute("sname");
       String eno=(String)session.getAttribute("eno");
       String block=(String)session.getAttribute("block");
       String roomno=(String)session.getAttribute("roomno");
       String email=(String)session.getAttribute("email");
       String fhadd=block+"-"+roomno;
       String sphone=(String)session.getAttribute("sphone");
       String course=(String)session.getAttribute("course");
      //out.print(fhadd+sphone+course);
       String url="jdbc:derby://localhost/outpass";
       try
       {
           Connection con = DriverManager.getConnection(url,"root","root");
           PreparedStatement stat=con.prepareStatement("insert into complaint values(?,?,?,?,?,?)");
           
           stat.setString(1,sname);
           stat.setString(2,fhadd);
           stat.setString(3,eno);
           stat.setString(4,msg);
           stat.setString(5,email);
           stat.setString(6,sphone);
           int dbupdate=stat.executeUpdate(); 
           con.close();
           if(dbupdate>0)
           {
            RequestDispatcher disp=request.getRequestDispatcher("outpass.jsp");
            disp.forward(request, response);
           }
           
        
         
       }
       catch(Exception ee)
       {
           System.out.println(ee);
       }
       
      
        
        
        
    }

   
   
   

   
   
    

}
