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
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Karan
 */
@WebServlet(name = "warden_controller", urlPatterns = {"/warden_controller"})
 @MultipartConfig(maxFileSize = 16177215) 
public class warden_controller extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
 String fun=request.getParameter("fun"); 
 String url="jdbc:derby://localhost/outpass";
Connection con;
if(fun.equals("reg"))
{
           
       
 String sname=request.getParameter("sname");
 String eno=request.getParameter("eno");
 String block=request.getParameter("block");
 String roomno=request.getParameter("roomno");
 String course=request.getParameter("course");
 String batch=request.getParameter("batch");
 String email=request.getParameter("semail");
 String sphone=request.getParameter("sphone");
 String pphone=request.getParameter("pphone");
 
 String pwd="100";   
 boolean b=new sendmail().sendmail(eno,email,pwd);   
    
if(b==true)
{    
    try {
            con = DriverManager.getConnection(url,"root","root");
        
PreparedStatement stat=con.prepareStatement("insert into student (sname,eno,block,roomno,course,email,sphone,pphone,pwd,batch,ppic) "
        +" values(?,?,?,?,?,?,?,?,?,?,?)");
           stat.setString(1,sname);
           stat.setString(2,eno);
           stat.setString(3,block);
           stat.setString(4,roomno);
           stat.setString(5,course);
           stat.setString(6,email);
           stat.setString(7,sphone);
           stat.setString(8,pphone);
           stat.setString(9,pwd);
           stat.setString(10,batch);
            InputStream inputStream = null; // input stream of the upload file

            // obtains the upload file part in this multipart request
            Part filePart = request.getPart("ppic");
            if (filePart != null) 
            {
                // prints out some information for debugging
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());

                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();
            }
            if (inputStream != null)
            {
                    // fetches input stream of the upload file for the blob column
                    stat.setBlob(11, inputStream);
             }
            
            
           int radded=stat.executeUpdate();
           if(radded>0)
           {
               response.sendRedirect("warden.jsp");
           }
        }
        catch(Exception ee)
        {
            System.out.println(ee);
        }
}
        
}  
if(fun.equals("guidelines"))
{
 String title=request.getParameter("title");
 String message=request.getParameter("message");
 long millis=System.currentTimeMillis();  
 Date d = new Date(millis);
 Time t=new Time(millis);

    try
    {
        con = DriverManager.getConnection(url,"root","root");
        
PreparedStatement stat=con.prepareStatement("insert into msgtostudent values(?,?,?,?)");
         stat.setString(1,title);
         stat.setString(2,message);
         stat.setDate(3,d);
         stat.setTime(4,t);
         int radded=stat.executeUpdate();
          if(radded>0)
           {
               response.sendRedirect("warden.jsp");
           }
        
        
    }
    catch(Exception ee)
    {
       System.out.println(ee); 
    }
    
    
        
}

   
    }
}
