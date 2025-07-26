package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class download_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            
            String name=null;
     String hadd=null;
     String from=null;
     String to=null;
     String place=null;
     String reason=null;
     String sphone=null;
     String pphone=null;
            
            
        try
     {
         response.setContentType("application/vnd.ms-excel");
         Connection con=null;
         String url="jdbc:derby://localhost/outpass";
         con=DriverManager.getConnection(url);
         Statement stat=con.createStatement();
         String query="SELECT * FROM ONOUTPASS where Current_Date >= fromdate and Current_Date<=todate and block='B' ";
        ResultSet res=stat.executeQuery(query);
      out.write("\n");
      out.write("        <table>\n");
      out.write("       \n");
      out.write("        ");
 while(res.next())
          {
              name= res.getString("sname");
                     hadd=res.getString("block")+"-"+res.getString("roomno");
                     from=res.getString("fromdate");
                     to=res.getString("todate");
                     place=res.getString("place");
                     reason=res.getString("reason");
                   sphone=res.getString("sphone");
                     pphone=res.getString("pphone");
      out.write("\n");
      out.write("      <tr><td>");
      out.print(name);
      out.write("</td><td>");
      out.print(hadd);
      out.write("</td><td>");
      out.print(from);
      out.write("</td><td>");
      out.print(to);
      out.write("</td><td>");
      out.print(place);
      out.write("</td><td>");
      out.print(reason);
      out.write("</td><td>");
      out.print(sphone);
      out.write("</td><td>");
      out.print(pphone);
      out.write("</td></tr>               \n");
      out.write("       </table>              \n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("              \n");
      out.write("              \n");
      out.write("         ");
 }
        
     }
      catch(Exception ee)
      {
          
      }
        
        
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
