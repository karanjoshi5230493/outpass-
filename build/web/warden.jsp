<%-- 
    Document   : admin
    Created on : 18 Mar, 2017, 12:13:40 PM
    Author     : Karan
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            
      ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 150px;
    background-color: white;
    height:100%;
    float:left;
     
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
    
}
li
{
 text-align: center;   
}

/* Change the link color on hover#555 */
li a:hover {
    background-color:green;
    color: white;
}


.active {
    background-color: #4CAF50;
    color:white;
}

td,th
{
    text-align:left;
    padding:4px;
   
    
}

table
{
   border-collapse: collapse;
   text-align:left ;
   border-color:lightblue;
   
   
  
   
}

tbody tr:nth-child(odd) 
{
  background: #eee;
}


        </style>  
        
         
        <title>Warden Section</title>
        
         
    </head>
    <body bgcolor="lightblue">
           
        
        <h3 style=" float: left; transform: rotate(270deg); margin-top: 275px; margin-left: 30px; font-family: sans-serif; " >WARDEN SECTION</h3>    
        
        
        
        
        
       <div 
            style="background-color:whitesmoke;  border-style:none;
            width:775px; 
            height:617px;
            margin-top:10px;
            margin-left: auto;
            margin-right:auto;
            margin-bottom:10px;
            overflow-y:auto;
            overflow-x: auto;
            ">   
       
           
   <script type="text/javascript">
       
     function myFun()
     {
     var data6="<br><select onchange='listf(this.value);'><option><b>See list by block</b>\n\
</option><option value='A' >A-BLOCK</option>\n\
<option value='B'>B BLOCK</option>\n\
<option value='B1'>B1 BLOCK</option>\n\
<option value='C'>C BLOCK</option>\n\
<option value='D'>D BLOCK</option>\n\
<option value='E'>E BLOCK</option>\n\
<option value='F'>F BLOCK</option>\n\
<option value='F1'>F1 BLOCK</option></select>\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
<button><b>Download</b></button>\n\
<br>";        
document.getElementById('er').innerHTML=data6; 
   
     }
     function listf(value)
     {
         if(value=='A'){listA();}
         if(value=='B'){listB();}
     }
     
     
     
     
     
     
     function listA()
     {
       //var block=value;  
       //console.log(block);
      var data8="<br><select onchange='listf(this.value);'><option><b>See list by block</b>\n\
</option><option value='A' selected='selected'>A-BLOCK</option>\n\
<option value='B'>B BLOCK</option>\n\
<option value='B1'>B1 BLOCK</option>\n\
<option value='C'>C BLOCK</option>\n\
<option value='D'>D BLOCK</option>\n\
<option value='E'>E BLOCK</option>\n\
<option value='F'>F BLOCK</option>\n\
<option value='F1'>F1 BLOCK</option></select>\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
<form action='' method='post'><button><b>Download</b></button></form>\n\
<br><br>\n\
<table border='' width='100%' style=''>\n\
<tr><th>Name</th><th>Roomno</th><th>From</th><th>To</th><th>Place</th><th>Reason</th><th>Contact</th></tr>";
         <%
             
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
                     
                      
                      
                     
       %>              
                    
  
 data8= data8+"<tr><td><%=sname%></td><td><%=haddr%></td><td><%=fromd%></td><td><%=tod%></td><td><%=placeg%></td><td><%=reasonf%></td><td><%=phone%></td></tr>";           
                  
                     
         <% }%>
data8=data8+"</table>";
           <% }
            catch(Exception ex)
            {
                
            }
       
        
         %>  
        
       document.getElementById('er').innerHTML=data8;   
         
         
         
         
         
         
     }
     
     
     
     
     
     function listB()
     {
      
      var data5="<br><select onchange='listf(this.value);'><option><b>See list by block</b>\n\
</option><option value='A' >A-BLOCK</option>\n\
<option value='B' selected='selected'>B BLOCK</option>\n\
<option value='B1'>B1 BLOCK</option>\n\
<option value='C'>C BLOCK</option>\n\
<option value='D'>D BLOCK</option>\n\
<option value='E'>E BLOCK</option>\n\
<option value='F'>F BLOCK</option>\n\
<option value='F1'>F1 BLOCK</option></select>\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n\
<button><b>Download</b></button>\n\
<br>\n\
&nbsp;&nbsp;<table border='1px' >\n\
<tr><th>Name</th><th>Roomno</th><th>From</th><th>To</th><th>Place</th><th>Reason</th><th>Contact</th></tr>";
         <%
             
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
                     
                      
                     
       %>              
                    
  
 data5= data5+"<tr><td><%=name%></td><td><%=hadd%></td><td><%=from%></td><td><%=to%></td><td><%=place%></td><td><%=reason%></td><td><%=sphone%></td></tr>";           
                  
                     
         <% }%>
data5=data5+"</table>";
           <% }
            catch(Exception ex)
            {
                
            }
       
        
         %>  
        
       document.getElementById('er').innerHTML=data5;   
         
         
         
         
         
         
     }
     
  
     
             
 
      
       
    function myFunction()
         {
        var data="<br>Select:<select><option value=''>select</option>\n\
<option value='one'>One By One</option>\n\
<option value='Ten'>Ten By Ten</option>\n\
<option value='All'>All</option>\n\
</select>\n\
<select><option value=''>No of Days</option>\n\
<option value='five'>5</option>\n\
<option value='Ten'>10</option></select>\n\
\n\<input type='text' placeholder='Search' name=''><br><br>\n\
<form action='' method=''><table border='1px' width='100%' height='100%'>\n\
<th>Approve</th><th>Name</th><th>Contact no</th><th>Reason</th><th>From</th>\n\
<th>To</th><th>Place Of Visit</th>\n\
 <tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve' ></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
<tr><td><input type='checkbox' name='approve'></td><td>Karan Joshi</td><td>778888</td><td>Shopping</td><td>02-04-2017</td><td>09-04-2017</td><td>Gurgaon</td></tr>\n\
</table></form> <a href='' style='float:right;'>Next>></a>";
       
        document.getElementById('er').innerHTML=data;
       
        
         }
         
         function myFunction1()
         {
        
        var data1="<fieldset><legend>Wants to disable out pass</legend>\n\
        From:<input type='datetime-local' name='from' title='specify date &time(24 hrs format)'>To:<input type='datetime-local' name='to' >\n\
           <br><br>\n\
           <textarea name='reason' placeholder='please specify reason' cols='55' rows='3'  ></textarea>\n\
            <br>\n\
           <input type='radio' name='able' value='disable' onChange='this.form.submit();'>Disable Outpass\n\
        </form>\n\
        </fieldset>\n\
         <fieldset><legend>Wants to enable outpass now</legend>\n\
        <form>\n\
        <input type='radio' name='able' value='enable' onChange='this.form.submit();' > Enable Now\n\
       \n\
       </fieldset>";
       
        document.getElementById('er').innerHTML=data1;
        
         }
           
         
        function myFunction2()
         {
        var data2="";
        document.getElementById('er').innerHTML=data2;
        
         }  
        
          function myFunction3()
         {
       var data3="<input type='hidden' name='fun' value='reg'><table style='none;'><tr><td>Name:</td><td><input type='text' name='sname' required/></td></tr>\n\
            <tr><td>ENo:</td><td><input type='text' name='eno' required/></td> </tr>\n\
             <tr><td>Hostel Add</td><td><select name='block'><option value=''>Select Block</option><option value='A'>A-Block</option>\n\
                <option value='B'>B-Block</option>\n\
                <option value='B1'>B1-Block</option>\n\
                <option value='C'>C-Block</option>\n\
                <option value='D'>D-Block</option>\n\
                <option value='E'>E-Block</option>\n\
                <option value='F'>F-Block</option>\n\
                 <option value='F1'>F1-Block</option>\n\
              </select>\n\<input type='text' name='roomno' placeholder='Room No' required/></td></tr>\n\
<tr><td>Course</td><td><input type='text' name='course' required/></td></tr> \n\
<tr><td>Batch</td><td><input type='text' name='batch' required/></td></tr> \n\
<tr><td>Email</td><td><input type='email' name='semail' required/></td></tr> \n\
   <tr><td>phone</td><td><input type='number' name='sphone' required/></td></tr><tr>\n\
<tr><td>Parents phone</td><td><input type='number' name='pphone' required/></td></tr><tr>\n\
<td>Profile pic</td><td><input type='file' name='ppic'></td></tr><tr></tr><tr></tr> <tr></tr><tr></tr> <tr><td></td>\n\
 <td><button type='submit' value='addrecord' name='Add record'>Add Record</button></td></tr>   \n\
</table> </form> ";
        document.getElementById('er').innerHTML=data3;
        
         }
         function myFunction5()
         {
        var data6="<input type='hidden' name='fun' value='guidelines'><textarea  name='title' placeholder='Title ' rows='1' cols='40' required/></textarea>\n\
<br><textarea name='message' rows='6' cols='55' placeholder='Message' required/></textarea>\n\
<br><input type='submit'>";
        document.getElementById('er').innerHTML=data6;
        
         }  
         function myFunction4()
         {
            
         }
         
         </script>
          
        
          <ul>
          <br>
          <li><img src="spyadav.jpg" height="130px" width="120px"></li>
          <li><a href="javascript:myFun();">Student On Outpass</a></li> 
        <!--<li><a href="javascript:myFunction();" >Approve Outpass</a></li>-->
          <li><a href="javascript:myFunction1();">Enable / Disable Outpass</a></li>
          <li><a href="javascript:myFunction2();">Blacklist</a></li>
          <li><a href="javascript:myFunction3();">Registration</a></li>
          <li><a href="javascript:myFunction4();">Messages/Complaint from students</a></li>
          <li><a href="javascript:myFunction5();">Guidelines to students</a></li>
          <li><a href="logout_w.jsp;">Logout</a></li>
          </ul>   
        
           
         <form  style="float: left;" action="warden_controller" method="post" enctype="multipart/form-data" >
             <div id="er" style="margin-left: 15px;">
              </div>   
             
         </form>
          
               
              
               
         
        </div>   
        
      <%
         
          
      %>  

        
    </body>
</html>

