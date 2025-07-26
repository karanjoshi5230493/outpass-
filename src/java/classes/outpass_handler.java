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
import java.util.Calendar;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author Karan
 */
@WebServlet(name = "outpass_handler", urlPatterns = {"/outpass_handler"})
public class outpass_handler extends HttpServlet 
{

    
        
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
    }

       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
        
   
            String fromdate=request.getParameter("fromdate");
            System.out.println(fromdate);
           
           String fromtime=request.getParameter("fromtime");
           String todate=request.getParameter("todate");
           String totime=request.getParameter("totime");
            String place=request.getParameter("place");
             String reason=request.getParameter("reason");
             String emoutpass;
             emoutpass=request.getParameter("emoutpass");
             HttpSession session=request.getSession();
            synchronized(session)
            {
            String sname=(String)session.getAttribute("sname");
            String eno=(String)session.getAttribute("eno");
            String block=(String)session.getAttribute("block");
            String roomno=(String)session.getAttribute("roomno");
            String email=(String)session.getAttribute("email");
            String pphone=(String)session.getAttribute("pphone");
            String sphone=(String)session.getAttribute("sphone");
            String course=(String)session.getAttribute("course");
            
            //String batch=(String)session.getAttribute("batch");
            //
String url="jdbc:derby://localhost/outpass";
        try (Connection con = DriverManager.getConnection(url,"root","root"))
        {
            PreparedStatement stat=con.prepareStatement("insert into onoutpass values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stat.setString(1,eno);
            stat.setString(2,sname);
            stat.setString(3,block);
            stat.setString(4,roomno);
            stat.setString(5,course);
            //stat.setString(6,batch);
            stat.setString(6,email);
            stat.setString(7,sphone);
            stat.setString(8,pphone);
            stat.setString(9,fromdate);
            stat.setString(10,fromtime);
            stat.setString(11,todate);
            stat.setString(12,totime);
            stat.setString(13,place);
            stat.setString(14,reason);
            
//           Calendar cal=Calendar.getInstance();
//                int date=cal.get(Calendar.DATE);
//                int month=cal.get(Calendar.MONTH);
//                int year=cal.get(Calendar.YEAR);
            
            
            int dbupdate=stat.executeUpdate(); 
            //sel.main(new String[] {pphone,fromdate,fromtime,todate,totime,place});
            
           
            if(dbupdate>0)
            {  
             
           if(emoutpass==null)
            {
              printer.print(sname,eno,block+"-"+roomno,fromdate,fromtime,todate,totime,place,reason);
               PrintWriter out=response.getWriter();
               //out.println(emoutpass);
                   out.println( 
                    
                           "<html><body><script>"
                                   + "alert(\"...Outpass generated, collect your outpass from your respective Warden office...\");"
                                   +" window.location.replace(\"outpass.jsp\");"
                                   + "</script></body></html>"
                            
                            );   
              new sendsms_b().sendsmstoparents( pphone, fromdate, fromtime, todate, totime, place,reason);      
                    
             }    
           if(emoutpass!=null)   
             {
                 PrintWriter out=response.getWriter();
                  out.println( 
                    
                           "<html><body><script>"
                                   + "alert(\"...We are texting you the outpass...\");"
                                   +" window.location.replace(\"outpass.jsp\");"
                                   + "</script></body></html>"
                            
                            );  
                  new emergencyoutpass().emoutpss(sname, sphone, block+roomno, fromdate, fromtime, todate, totime, place, reason);
                  
                  
                   
             }
            
              }             
                            
                            
                            
                            
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
}    
        
    } 
        
    }

    


