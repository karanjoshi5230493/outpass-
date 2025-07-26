package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class warden_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("      ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    width: 150px;\n");
      out.write("    background-color: white;\n");
      out.write("    height:100%;\n");
      out.write("    float:left;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: #000;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("li\n");
      out.write("{\n");
      out.write(" text-align: center;   \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change the link color on hover#555 */\n");
      out.write("li a:hover {\n");
      out.write("    background-color:green;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td,th\n");
      out.write("{\n");
      out.write("    text-align:left;\n");
      out.write("    padding:4px;\n");
      out.write("   \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("table\n");
      out.write("{\n");
      out.write("   border-collapse: collapse;\n");
      out.write("   text-align:left ;\n");
      out.write("   overflow: auto;\n");
      out.write("  \n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("tbody tr:nth-child(odd) \n");
      out.write("{\n");
      out.write("  background: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>  \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <title>Warden Section</title>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightblue\">\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        <h3 style=\" float: left; transform: rotate(270deg); margin-top: 275px; margin-left: 30px; font-family: sans-serif; \" >WARDEN SECTION</h3>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div \n");
      out.write("            style=\"background-color:whitesmoke;  border-style:none;\n");
      out.write("            width:775px; \n");
      out.write("            height:617px;\n");
      out.write("            margin-top:10px;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right:auto;\n");
      out.write("            margin-bottom:10px;\n");
      out.write("/*            overflow-y:scroll;\n");
      out.write("            overflow-x: auto;*/\n");
      out.write("            \">   \n");
      out.write("       \n");
      out.write("           \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("       \n");
      out.write("     function myFun()\n");
      out.write("     {\n");
      out.write("     var data6=\"<br><select onchange='listf(this.value);'><option><b>See list by block</b>\\n\\\n");
      out.write("</option><option value='A' >A-BLOCK</option>\\n\\\n");
      out.write("<option value='B'>B BLOCK</option>\\n\\\n");
      out.write("<option value='B1'>B1 BLOCK</option>\\n\\\n");
      out.write("<option value='C'>C BLOCK</option>\\n\\\n");
      out.write("<option value='D'>D BLOCK</option>\\n\\\n");
      out.write("<option value='E'>E BLOCK</option>\\n\\\n");
      out.write("<option value='F'>F BLOCK</option>\\n\\\n");
      out.write("<option value='F1'>F1 BLOCK</option></select>&nbsp;&nbsp;<button><b>Print</b></button>\\n\\\n");
      out.write("<br><br>\";        \n");
      out.write("document.getElementById('er').innerHTML=data6; \n");
      out.write("   \n");
      out.write("     }\n");
      out.write("     function listf(value)\n");
      out.write("     {\n");
      out.write("         if(value=='A'){listA();}\n");
      out.write("         if(value=='B'){listB();}\n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     function listA()\n");
      out.write("     {\n");
      out.write("       //var block=value;  \n");
      out.write("       //console.log(block);\n");
      out.write("      var data8=\"<br><select onchange='listf(this.value);'><option><b>See list by block</b>\\n\\\n");
      out.write("</option><option value='A' >A-BLOCK</option>\\n\\\n");
      out.write("<option value='B'>B BLOCK</option>\\n\\\n");
      out.write("<option value='B1'>B1 BLOCK</option>\\n\\\n");
      out.write("<option value='C'>C BLOCK</option>\\n\\\n");
      out.write("<option value='D'>D BLOCK</option>\\n\\\n");
      out.write("<option value='E'>E BLOCK</option>\\n\\\n");
      out.write("<option value='F'>F BLOCK</option>\\n\\\n");
      out.write("<option value='F1'>F1 BLOCK</option></select>&nbsp;&nbsp;<button><b>Print</b></button>\\n\\\n");
      out.write("<br><br>\\n\\\n");
      out.write("<table border='1px' style=''>\\n\\\n");
      out.write("<tr><th>Name</th><th>Roomno</th><th>From</th><th>To</th><th>Place</th><th>Reason</th><th>Contact</th></tr>\";\n");
      out.write("         ");

             
             String sname=null;
             String haddr=null;
             String fromd=null;
             String tod=null;
             String placeg=null;
             String reasonf=null;
             String phone=null;
             String hphone=null;
              
         String url1="jdbc:derby://localhost/outpass";
      
            try
            {
                Connection con = DriverManager.getConnection(url1,"root","root");
                    
            long millis=System.currentTimeMillis(); 
            Date d=new java.sql.Date(millis);
         Statement stat=con.createStatement();
         String query="SELECT * FROM ONOUTPASS where Current_Date >= fromdate and Current_Date<=todate and block='A' ";
          ResultSet res=stat.executeQuery(query);
          while(res.next())
          {
              
                     sname= res.getString("sname");
                     haddr=res.getString("block")+"-"+res.getString("roomno");
                     fromd=res.getString("fromdate");
                     tod=res.getString("todate");
                     placeg=res.getString("place");
                     reasonf=res.getString("reason");
                     phone=res.getString("sphone");
                     hphone=res.getString("pphone");
                     
                      
                      
                     
       
      out.write("              \n");
      out.write("                    \n");
      out.write("  \n");
      out.write(" data8= data8+\"<tr><td>");
      out.print(sname);
      out.write("</td><td>");
      out.print(haddr);
      out.write("</td><td>");
      out.print(fromd);
      out.write("</td><td>");
      out.print(tod);
      out.write("</td><td>");
      out.print(placeg);
      out.write("</td><td>");
      out.print(reasonf);
      out.write("</td><td>");
      out.print(phone);
      out.write("</td></tr>\";           \n");
      out.write("                  \n");
      out.write("                     \n");
      out.write("         ");
 }
      out.write("\n");
      out.write("data8=data8+\"</table>\";\n");
      out.write("           ");
 }
            catch(Exception ex)
            {
                
            }
       
        
         
      out.write("  \n");
      out.write("        \n");
      out.write("       document.getElementById('er').innerHTML=data8;   \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     function listB()\n");
      out.write("     {\n");
      out.write("      \n");
      out.write("      var data5=\"<br><select onchange='listf(this.value);'><option><b>See list by block</b>\\n\\\n");
      out.write("</option><option value='A' >A-BLOCK</option>\\n\\\n");
      out.write("<option value='B'>B BLOCK</option>\\n\\\n");
      out.write("<option value='B1'>B1 BLOCK</option>\\n\\\n");
      out.write("<option value='C'>C BLOCK</option>\\n\\\n");
      out.write("<option value='D'>D BLOCK</option>\\n\\\n");
      out.write("<option value='E'>E BLOCK</option>\\n\\\n");
      out.write("<option value='F'>F BLOCK</option>\\n\\\n");
      out.write("<option value='F1'>F1 BLOCK</option></select>&nbsp;&nbsp;<button><b>Print</b></button>\\n\\\n");
      out.write("<br><br>\\n\\\n");
      out.write("<div style='overflow-y:auto;overflow-x: auto;'><table border='1px' style=''>\\n\\\n");
      out.write("<tr><th>Name</th><th>Roomno</th><th>From</th><th>To</th><th>Place</th><th>Reason</th><th>Contact</th></tr>\";\n");
      out.write("         ");

             
             String name=null;
             String hadd=null;
             String from=null;
             String to=null;
             String place=null;
             String reason=null;
             String sphone=null;
             String pphone=null;
              
         String url="jdbc:derby://localhost/outpass";
      
            try
            {
                Connection con = DriverManager.getConnection(url,"root","root");
                    
            long millis=System.currentTimeMillis(); 
            Date d=new java.sql.Date(millis);
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
                     
                      
                     
       
      out.write("              \n");
      out.write("                    \n");
      out.write("  \n");
      out.write(" data5= data5+\"<tr><td>");
      out.print(name);
      out.write("</td><td>");
      out.print(hadd);
      out.write("</td><td>");
      out.print(from);
      out.write("</td><td>");
      out.print(to);
      out.write("</td><td>");
      out.print(place);
      out.write("</td><td>");
      out.print(reason);
      out.write("</td><td>");
      out.print(sphone);
      out.write("</td></tr>\";           \n");
      out.write("                  \n");
      out.write("                     \n");
      out.write("         ");
 }
      out.write("\n");
      out.write("data5=data5+\"</table></div>\";\n");
      out.write("           ");
 }
            catch(Exception ex)
            {
                
            }
       
        
         
      out.write("  \n");
      out.write("        \n");
      out.write("       document.getElementById('er').innerHTML=data5;   \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("     }\n");
      out.write("     \n");
      out.write("  \n");
      out.write("     \n");
      out.write("             \n");
      out.write(" \n");
      out.write("      \n");
      out.write("       \n");
      out.write("    function myFunction()\n");
      out.write("         {\n");
      out.write("        var data=\"<br>Select:<select><option value=''>select</option>\\n\\\n");
      out.write("<option value='one'>One By One</option>\\n\\\n");
      out.write("<option value='Ten'>Ten By Ten</option>\\n\\\n");
      out.write("<option value='All'>All</option>\\n\\\n");
      out.write("</select>\\n\\\n");
      out.write("<select><option value=''>No of Days</option>\\n\\\n");
      out.write("<option value='five'>5</option>\\n\\\n");
      out.write("<option value='Ten'>10</option></select>\\n\\\n");
      out.write("\\n\\<input type='text' placeholder='Search' name=''><br><br>\\n\\\n");
      out.write("<form action='' method=''><table border='1px' width='100%' height='100%'>\\n\\\n");
      out.write("<th>Approve</th><th>Name</th><th>Contact no</th><th>Reason</th><th>From</th>\\n\\\n");
      out.write("<th>To</th><th>Place Of Visit</th>\\n\\\n");
      out.write(" <tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\\n\\\n");
      out.write("</table></form> <a href='' style='float:right;'>Next>></a>\";\n");
      out.write("       \n");
      out.write("        document.getElementById('er').innerHTML=data;\n");
      out.write("       \n");
      out.write("        \n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         function myFunction1()\n");
      out.write("         {\n");
      out.write("        \n");
      out.write("        var data1=\"<fieldset><legend>Wants to disable out pass</legend>\\n\\\n");
      out.write("        From:<input type='datetime-local' name='from' title='specify date &time(24 hrs format)'>To:<input type='datetime-local' name='to' >\\n\\\n");
      out.write("           <br><br>\\n\\\n");
      out.write("           <textarea name='reason' placeholder='please specify reason' cols='55' rows='3'  ></textarea>\\n\\\n");
      out.write("            <br>\\n\\\n");
      out.write("           <input type='radio' name='able' value='disable' onChange='this.form.submit();'>Disable Outpass\\n\\\n");
      out.write("        </form>\\n\\\n");
      out.write("        </fieldset>\\n\\\n");
      out.write("         <fieldset><legend>Wants to enable outpass now</legend>\\n\\\n");
      out.write("        <form>\\n\\\n");
      out.write("        <input type='radio' name='able' value='enable' onChange='this.form.submit();' > Enable Now\\n\\\n");
      out.write("       \\n\\\n");
      out.write("       </fieldset>\";\n");
      out.write("       \n");
      out.write("        document.getElementById('er').innerHTML=data1;\n");
      out.write("        \n");
      out.write("         }\n");
      out.write("           \n");
      out.write("         \n");
      out.write("        function myFunction2()\n");
      out.write("         {\n");
      out.write("        var data2=\"\";\n");
      out.write("        document.getElementById('er').innerHTML=data2;\n");
      out.write("        \n");
      out.write("         }  \n");
      out.write("        \n");
      out.write("          function myFunction3()\n");
      out.write("         {\n");
      out.write("       var data3=\"<input type='hidden' name='fun' value='reg'><table style='none;'><tr><td>Name:</td><td><input type='text' name='sname' required/></td></tr>\\n\\\n");
      out.write("            <tr><td>ENo:</td><td><input type='text' name='eno' required/></td> </tr>\\n\\\n");
      out.write("             <tr><td>Hostel Add</td><td><select name='block'><option value=''>Select Block</option><option value='A'>A-Block</option>\\n\\\n");
      out.write("                <option value='B'>B-Block</option>\\n\\\n");
      out.write("                <option value='B1'>B1-Block</option>\\n\\\n");
      out.write("                <option value='C'>C-Block</option>\\n\\\n");
      out.write("                <option value='D'>D-Block</option>\\n\\\n");
      out.write("                <option value='E'>E-Block</option>\\n\\\n");
      out.write("                <option value='F'>F-Block</option>\\n\\\n");
      out.write("                 <option value='F1'>F1-Block</option>\\n\\\n");
      out.write("              </select>\\n\\<input type='text' name='roomno' placeholder='Room No' required/></td></tr>\\n\\\n");
      out.write("<tr><td>Course</td><td><input type='text' name='course' required/></td></tr> \\n\\\n");
      out.write("<tr><td>Batch</td><td><input type='text' name='batch' required/></td></tr> \\n\\\n");
      out.write("<tr><td>Email</td><td><input type='email' name='semail' required/></td></tr> \\n\\\n");
      out.write("   <tr><td>phone</td><td><input type='number' name='sphone' required/></td></tr><tr>\\n\\\n");
      out.write("<tr><td>Parents phone</td><td><input type='number' name='pphone' required/></td></tr><tr>\\n\\\n");
      out.write("<td>Profile pic</td><td><input type='file' name='ppic'></td></tr><tr></tr><tr></tr> <tr></tr><tr></tr> <tr><td></td>\\n\\\n");
      out.write(" <td><button type='submit' value='addrecord' name='Add record'>Add Record</button></td></tr>   \\n\\\n");
      out.write("</table> </form> \";\n");
      out.write("        document.getElementById('er').innerHTML=data3;\n");
      out.write("        \n");
      out.write("         }\n");
      out.write("         function myFunction5()\n");
      out.write("         {\n");
      out.write("        var data6=\"<input type='hidden' name='fun' value='guidelines'><textarea  name='title' placeholder='Title ' rows='1' cols='40' required/></textarea>\\n\\\n");
      out.write("<br><textarea name='message' rows='6' cols='55' placeholder='Message' required/></textarea>\\n\\\n");
      out.write("<br><input type='submit'>\";\n");
      out.write("        document.getElementById('er').innerHTML=data6;\n");
      out.write("        \n");
      out.write("         }  \n");
      out.write("         function logout()\n");
      out.write("         {\n");
      out.write("            \n");
      out.write("         }\n");
      out.write("         \n");
      out.write("         </script>\n");
      out.write("          \n");
      out.write("        \n");
      out.write("          <ul>\n");
      out.write("          <br>\n");
      out.write("          <li><img src=\"admin.png\" height=\"130px\" width=\"120px\"></li>\n");
      out.write("          <li><a href=\"javascript:myFun();\">Student On Outpass</a></li> \n");
      out.write("        <!--<li><a href=\"javascript:myFunction();\" >Approve Outpass</a></li>-->\n");
      out.write("          <li><a href=\"javascript:myFunction1();\">Enable / Disable Outpass</a></li>\n");
      out.write("          <li><a href=\"javascript:myFunction2();\">Blacklist</a></li>\n");
      out.write("          <li><a href=\"javascript:myFunction3();\">Registration</a></li>\n");
      out.write("          <li><a href=\"javascript:myFunction4();\">Messages/Complaint from students</a></li>\n");
      out.write("          <li><a href=\"javascript:myFunction5();\">Guidelines to students</a></li>\n");
      out.write("          <li><a href=\"logout_w.jsp;\">Logout</a></li>\n");
      out.write("          </ul>   \n");
      out.write("        \n");
      out.write("           \n");
      out.write("         <form  style=\"float: left;\" action=\"warden_controller\" method=\"post\" enctype=\"multipart/form-data\" >\n");
      out.write("             <div id=\"er\" style=\"\">\n");
      out.write("              </div>   \n");
      out.write("             \n");
      out.write("         </form>\n");
      out.write("          \n");
      out.write("               \n");
      out.write("              \n");
      out.write("               \n");
      out.write("         \n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("      ");

         
          
      
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
