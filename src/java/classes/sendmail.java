/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*;
/**
 *
 * @author Karan
 */
public class sendmail 
{
    String host="smtp.mail.yahoo.com";  
  final String user="amityhostels@yahoo.com";
  final String password="zxcvbnm,./"; 
    
    
    
  public boolean sendmail(String eno,String to,String pwd)
   {
      Properties props=new Properties(); 
      props.put("mail.smtp.host",host);
      props.put("mail.smtp.port","587");
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      Authenticator auth=new Authenticator()
      {
      
      protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, password);
                }
      
      };
      Session session=Session.getInstance(props,auth);
     
      try
      {
     MimeMessage message = new MimeMessage(session);  
     message.setFrom(new InternetAddress(user));  
     message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
     message.setSubject("your credentials for outpass portal:");  
     message.setText("login id:"+eno+"\n Password:"+pwd);  
       
    //send the message  
     Transport.send(message);  
  
     System.out.println("message sent successfully...");  
     return true;
          
          
      }
      catch(MessagingException ee)
      {
          System.out.println(ee);
          return false;
      }
                    
   
   }
 
    
    
}
