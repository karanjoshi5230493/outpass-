<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN PAGE</title>
    </head>
    
    <body bgcolor="whitesmoke">
      
        <br>
        <center><div style="width:120px;height:150px ;"><img src="lock.png"></div></center>
        
  
    <center> 
        <div style="background-color:lightskyblue; width:400px; height: 230px;"> 
     <center>
      <br><br>
      <fieldset>
          <legend align="center">AMITY UNIVERSITY<img src=""></legend>
          <form action="login_controller" method="post">
              
            <table>
                <tr><td>User ID</td>
                    <td><input type="text" name="uid" required/></td>
                    
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pass" required/></td></tr>
                <tr><td></td><td></td></tr><tr><td></td><td></td></tr>
                </table>
                  <input type="radio" name="role"  value="student" required/>Student
                  <input type="radio" name="role" value="admin" required/>Admin
                    <input type="radio" name="role" value="warden" required/>Warden
                
                
            <p><p>
                <input type="submit" value=" Login " style="width:21%;font-weight: bold;border-radius:4px; " >
         
        </form>
      </fieldset>
        </center>
    </div>
    </center>
              
    </body>
</html>
