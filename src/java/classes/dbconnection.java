package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karan
 */

import java.sql.*;
public  class dbconnection 
{
 static String url="jdbc:mysql://localhost:3306/outpass";
 static Connection con=null;  
 
public static Connection conn()
{
    try
    {
         con=DriverManager.getConnection(url,"root","root");
    }
    catch(SQLException ee)
    {
        
    }
    return con;

}   
}

   
