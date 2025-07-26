/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Karan
 */
public class sendsms_b 
{    
public  void sendsmstoparents(String pphone,String fromdate,String fromtime,String todate,String totime,String place,String reason) throws InterruptedException
   {
        
        //String user=new String("9818232238");
	//String pass=new String("siyavarram");
        	 
 
			
		 
		/*System.setProperty("webdriver.gecko.driver" , "H:\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver" , "H:\\geckodriver-v0.14.0-win64\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("frame");
		driver.findElement(By.id("mobile")).sendKeys(pphone);
		driver.findElement(By.id("message")).sendKeys("Sir Your Ward is on outpass from:"+fromdate+" "+fromtime + 
                 "to:"+todate+" "+totime+" \n Place:"+place);
                Thread.sleep(3000);
		driver.findElement(By.id("Send")).click();
                Thread.sleep(3000);
                driver.quit();
                */
                
                
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
	driver.findElement(By.id("sendSMSMsg")).sendKeys("Sir, your ward is on outpass "+fromdate+" "+fromtime+" "+"to"+" "+todate+" "+totime+
                "\n place:"+place+"\n"+"Reason:"+reason);//text
    driver.findElement(By.cssSelector("input.ui-autocomplete-input")).sendKeys(pphone);//number
	driver.findElement(By.id("btnsendsms")).click();
	Thread.sleep(7000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("aSendSMS")).click();
        driver.quit();
        driver.close();
        
    }
   
    
}
