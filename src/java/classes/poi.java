/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.apache.poi.xssf.usermodel.*;
/**
 *
 * @author Karan
 */
public class poi
{
    
   public static void main(String[] args) throws Exception 
   {
       
  Calendar cal= Calendar.getInstance();
               int month = cal.get(Calendar.MONTH);
               int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String date=year+"-"+month+"-"+day;
                //Date date1=new SimpleDateFormat("dd/MM/yyyy")
               
                
       
    String url="jdbc:derby://localhost/outpass";
    Connection con=DriverManager.getConnection(url,"root","root");
    PreparedStatement stat=con.prepareStatement("select * from onoutpass where fromdate=? ");
    stat.setDate(1, );
    ResultSet res=stat.executeQuery();
if(res.next())
{
    System.out.println("Sucess");
}
       
       
      //Create blank workbook
     /* XSSFWorkbook workbook = new XSSFWorkbook(); 
      //Create a blank sheet
      XSSFSheet spreadsheet = workbook.createSheet( 
      "B-Block ");
      //Create row object
      XSSFRow row = spreadsheet.createRow((short)0);
      row.createCell(0).setCellValue("Name");
      row.createCell(1).setCellValue("ENo");
      row.createCell(2).setCellValue("course");
      row.createCell(3).setCellValue("Roomno");
      row.createCell(4).setCellValue("from");
      row.createCell(5).setCellValue("to");
      row.createCell(6).setCellValue("place");
      row.createCell(7).setCellValue("reason");
      row.createCell(8).setCellValue("mobile");
      row.createCell(9).setCellValue("pmobile");
      
      
       try 
           ( 
               
               FileOutputStream out = new FileOutputStream( 
                       new File("onoutpass(15-04-2017).xlsx"))) {
           workbook.write(out);
       }
      System.out.println( 
      "Writesheet.xlsx written successfully" );*/
   }
    
    
}
