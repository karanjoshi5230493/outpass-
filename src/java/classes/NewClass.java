/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;



/**
 *
 * @author Karan
 */
public class NewClass 
{
    public static void main(String[] args) throws InterruptedException
    {
      String phone="9410587600";
      String fromdate="24-04-2017";
      String fromtime="23:53";
     String todate="25-04-2017";
      String totime="22:00";
      String place="ggn";
      String reason="shopping";
      
      
        
        new sendsms_b().sendsmstoparents(phone,fromdate,fromtime,todate,totime,place);
      
    }
}
