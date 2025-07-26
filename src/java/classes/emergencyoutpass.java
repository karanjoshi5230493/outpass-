/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Karan
 */
public class emergencyoutpass 
{
    public  void emoutpss(String sname,String sphone,String roomno,String fromdate,String fromtime,String todate,String totime,String place,String reason) throws InterruptedException
   {
        
       
              
                
                
                String user=new String("9818232238");
		String pass=new String("qazwsx");
		 

			
		 
		System.setProperty("webdriver.chrome.driver" , "H:\\geckodriver-v0.14.0-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	driver.navigate().to("http://www.160by2.com/Index");
	driver.findElement(By.id("username")).sendKeys(user);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("password")).submit();
	Thread.sleep(5000);
	
	driver.findElement(By.id("emHelp")).click();
	driver.findElement(By.id("aSMS")).click();
	Thread.sleep(5000);
	driver.switchTo().frame("by2Frame");
	driver.findElement(By.id("sendSMSMsg")).sendKeys("Emergency Outpass, \n Mr./Ms."+sname+"\n "+roomno+"\n "+fromdate+" "+fromtime+" "+"to"+" "+todate+" "+totime+
                "\n place:"+place+"\n"+"Reason:"+reason);//text
    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys(sphone);//number
	driver.findElement(By.id("btnsendsms")).click();
	Thread.sleep(7000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("aSendSMS")).click();
        driver.quit();
        driver.close();
        
    }
}
