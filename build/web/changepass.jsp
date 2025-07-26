<%-- 
    Document   : changepass
    Created on : 27 Apr, 2017, 11:16:57 PM
    Author     : Karan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="lightblue">
        <script>
         function validate()
         {
            var opass=document.cpform.cpass.value;
            var rpass=document.cpform.rpass.value;
            if(opass==rpass)
            {
                return true;
            }
           
            
            if(opass!=rpass)
            {
                 //alert('typed password didnot match');
                  var data="<h5 style='color:green'>!!New & Retype Password didnot match!!</h5>";
            document.getElementById('d').innerHTML=data;
                return false;
            }    
          }
          </script>
         <center> 
        <form action="changepassword" method="post" onsubmit="return validate()" name="cpform" id='cpform'>
            
            <div id="ff" style="background-color:whitesmoke;width:450px;height:280px;margin-top: 90px; border-radius:7px;">
            <h3><marquee>Change Your Password</marquee></h3>    
            <table>    
            <input type="hidden" name="eno" value="">
           <tr><td>Old Password</td><td><input type="password" name="opass" id="opass" required/></td></tr>
            
           <tr><td> New Password</td><td><input type="password" name="cpass" id="cpass" required/></td></tr>
            <br>
            <tr><td>Retype Password</td><td><input type="password" name="rpass" id="rpass" required/></td></tr>
            </table><p>
             <p id="d"></p>   
            <button type="submit" value="Change" style="width: 30%;border-radius: 3px;"><b>Change</b></button>
            </div>
                
        </form>
       </center>      
    </body>
</html>
