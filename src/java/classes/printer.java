package classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class printer implements Printable 
{
static  String name,eno,room,fromdate,todate,fromtime,totime,place,reason;  
  
    printer(String name,String eno,String room,String fromdate,String fromtime,String todate,String totime,String place,String reason)
    {
        printer.name=name;
        printer.eno=eno;
        printer.room=room;
        printer.fromdate=fromdate;
        printer.fromtime=fromtime;
        printer.todate=todate;
        printer.totime=totime;
        printer.place=place;
        printer.reason=reason;
        
        
    }   
    

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException 
    {
    if (pageIndex>0)
    {return NO_SUCH_PAGE;}

        
        
       Graphics2D g2d = (Graphics2D)graphics;
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

    // Now we perform our rendering
    graphics.drawString("AMITY UNIVERSITY HARYANA,HOSTEL OUT PASS",80,20);
    graphics.drawLine(0, 30, 450, 30);
    graphics.drawString("Name : "+name,7, 60);
    graphics.drawString("EnrollmentNo : "+eno,150,60);
    graphics.drawString("Room no : "+room,330,60);
    graphics.drawString("From : "+fromdate,7,90);
    graphics.drawString("Time : "+fromtime,137,90);
    graphics.drawString("To : "+todate,227,90);
    graphics.drawString("Time : "+totime,330,90);
    graphics.drawString("Place : "+place,7,120);
    graphics.drawString("Reason : "+reason,180,120);
    graphics.drawRect(0,0,450,260);
    graphics.drawRect(250,150,180,70);
    graphics.drawString("Warden's Stamp",290 ,165 );
    graphics.drawRect(15,150,180,70);
    graphics.drawString("Co-ordinator's Stamp",30 ,165 );
    graphics.drawLine(0,235 , 450, 235);
    graphics.drawString("ENTRY RESTRICTED IN THE CAMPUS DURING 9:30 PM TO 6:00 AM",15,250 );
    //graphics.drawRect(160,150,100,10);
  
    // tell the caller that this page is part
    // of the printed document
    return PAGE_EXISTS;
    }
    
   synchronized public static void print(String name,String eno,String room,String fromdate,String fromtime,String todate,String totime,String place,String reason) throws PrinterException
    {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new printer(name,eno,room,fromdate,fromtime,todate,totime,place,reason));
        job.print();
    }
  
}
