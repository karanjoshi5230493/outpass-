<%-- 
    Document   : newjsp
    Created on : 4 Mar, 2017, 11:30:54 AM
    Author     : Karan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            
            
            textArea
            {
                resize:none;
                outline:none;
                
            }
            date
            {
            }
            
        </style>  
        
         
        <title>Hostel corner</title>
            
         
    </head>
    <body bgcolor="lightblue">
       <div 
            style="background-color:whitesmoke;  border-style:none;
            width:730px; 
            height:610px;
            margin-top:10px;
            margin-left: 300px;
            margin-right:300px;
            margin-bottom:10px;">   
           <table><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>
             <th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>  
             <th style="font-family:Times New Roman;">   HOSTEL OUTPASS GENERATOR</th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>
             <th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>
             <th>            
                 <form action="logout.jsp"><input type="image" src="cpass.png" height="25px" value="cpass" title="change password" name="cpass">&nbsp;<input type="image" height="25px"src="logout.png" name="logout" value=" logout" alt="submit" title="logout"></form></th></table>
          
           <div style="width:170px;height:520px;border-style: groove; margin-left: 5px; float:left; background-color: white; ">
               <br>
               <%
                   String block=(String)session.getAttribute("block");
                   String room=(String)session.getAttribute("roomno");
                   
               %>
               <center><img src="image.jsp" width="128px" height="128px" border="1px"></center>
           <center><%=session.getAttribute("sname")%></center>
           <center><%=session.getAttribute("eno")%></center>
           <center><%out.println(block+"-"+room);%></center>
           <center><%=session.getAttribute("course")%></center>
           <center><%=session.getAttribute("email")%></center>
           <center><%=session.getAttribute("sphone")%></center>
           <center><%=session.getAttribute("pphone")%></center>
           <br>
           <br>
          
             <b> Write to Warden:</b>
             <form action="complaint" method="post" >
                 <textarea cols="20" rows="9" placeholder="Complaint Or Suggestion"  name="msgtowarden" style="border-radius:6px; border-color:lightblue; outline: none; background-color:lightpink;" required/></textarea>
                 <button type="submit" value ="Send ">Send</button>
              </form>
              
              
           
           
               
               
               
               
               
           </div>
           
           <div id="news" style="height:250px;width:500px ;border-style: groove; float:left; margin-left: 9px; border-radius:10px; background-color:white;">
               
                <b style="font-style: normal ;">NEWS</b>
                <br>
                <a href=""></a>
                
               
           </div>
           
           
           <div style="height:260px;width:500px ; float:left; margin-left: 9px; border-style: groove;border-radius:10px;background-color:white; ">
               <center>
           <form action="outpass_handler" method="post" id="outpass">
             <table border="0px" width="80%">
              <tr>  
                  <td>From:</td><td><input type="date" name="fromdate" id="fromdate" style="border-radius: 4px; width: 70%; " required/></td>
                  <td><input type="time" name="fromtime" id="fromtime" style="border-radius:4px; width:58%; " required/></td>
              </tr>   
                 
              <tr>
                  <td>To:</td><td><input type="date" name="todate" id="todate" style="border-radius:4px; width:70%" required/></td>
                  <td><input type="time" name="totime" id="totime" style="border-radius:4px; width:58%;" required/></td>
              </tr>  
              <tr>
               <td>Place:</td>   
               <td colspan="2"><textarea placeholder="specify Place"  cols="35" rows="2" name="place" style="border-radius:4px;" required/></textarea></td>
              
              </tr>   
              <tr>
              
               <td colspan="3"><textarea placeholder="Reason of going " name="reason" cols="50" rows="4" style="border-radius:4px;" required/></textarea></td>
              
              </tr> 
              
             </table>  
             
               <center><button type="submit" name="submit" value="" style="width:50%;"><b>Generate Outpass</b></button></center>
              
               <h4><input type="checkbox" id="emoutpass" value="emoutpass" name="emoutpass" onclick="myFunction()">Emergency Outpass</h4>
             </form>
              
              </center>       
               
           </div>
         
           
           
        </div>   
        
        
<script>
        function myFunction()
        {
         if(confirm('We will text you outpass on your registered number!!This option is for only Emergency Situations!!!Please Be Aware of Further Consequences')==true)
         {
             document.getElementById('emoutpass').checked = true;
         }
         else
         {
             document.getElementById('emoutpass').checked = false;
         }
             
         
       }
         
           
       
       
        </script>
        
    </body>
</html>
