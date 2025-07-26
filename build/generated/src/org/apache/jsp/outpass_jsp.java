package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class outpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            textArea\n");
      out.write("            {\n");
      out.write("                resize:none;\n");
      out.write("                outline:none;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            date\n");
      out.write("            {\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>  \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <title>Hostel corner</title>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightblue\">\n");
      out.write("       <div \n");
      out.write("            style=\"background-color:whitesmoke;  border-style:none;\n");
      out.write("            width:730px; \n");
      out.write("            height:610px;\n");
      out.write("            margin-top:10px;\n");
      out.write("            margin-left: 300px;\n");
      out.write("            margin-right:300px;\n");
      out.write("            margin-bottom:10px;\">   \n");
      out.write("           <table><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>\n");
      out.write("             <th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>  \n");
      out.write("             <th style=\"font-family:Times New Roman;\">   HOSTEL OUTPASS GENERATOR</th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>\n");
      out.write("             <th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th><th></th>\n");
      out.write("             <th>\n");
      out.write("    <form action=\"logout.jsp\"><input type=\"submit\" value=\"logout\"></form></th></table>\n");
      out.write("          \n");
      out.write("           <div style=\"width:170px;height:520px;border-style: groove; margin-left: 5px; float:left; background-color: white; \">\n");
      out.write("               <br>\n");
      out.write("               ");

                   String block=(String)session.getAttribute("block");
                   String room=(String)session.getAttribute("roomno");
                   
               
      out.write("\n");
      out.write("               <center><img src=\"image.jsp\" width=\"128px\" height=\"128px\" border=\"1px\"></center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("sname"));
      out.write("</center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("eno"));
      out.write("</center>\n");
      out.write("           <center>");
out.println(block+"-"+room);
      out.write("</center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("course"));
      out.write("</center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("email"));
      out.write("</center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("sphone"));
      out.write("</center>\n");
      out.write("           <center>");
      out.print(session.getAttribute("pphone"));
      out.write("</center>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("          \n");
      out.write("             <b> Write to Warden:</b>\n");
      out.write("             <form action=\"complaint\" method=\"post\" >\n");
      out.write("                 <textarea cols=\"20\" rows=\"9\" placeholder=\"Complaint Or Suggestion\"  name=\"msgtowarden\" style=\"border-radius:6px; border-color:lightblue; outline: none; background-color:lightpink;\" required/></textarea>\n");
      out.write("                 <button type=\"submit\" value =\" Send \">Send</button>\n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("           \n");
      out.write("           \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           <div id=\"news\" style=\"height:250px;width:500px ;border-style: groove; float:left; margin-left: 9px; border-radius:10px; background-color:white;\">\n");
      out.write("               \n");
      out.write("                <b style=\"font-style: normal ;\">NEWS</b>\n");
      out.write("                <br>\n");
      out.write("                <a href=\"\"></a>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <div style=\"height:260px;width:500px ; float:left; margin-left: 9px; border-style: groove;border-radius:10px;background-color:white; \">\n");
      out.write("               <center>\n");
      out.write("           <form action=\"outpass_handler\" method=\"post\" id=\"outpass\" onsubmit=\"return validateoutpassform()\">\n");
      out.write("             <table border=\"0px\" width=\"80%\">\n");
      out.write("              <tr>  \n");
      out.write("                  <td>From:</td><td><input type=\"date\" name=\"fromdate\" style=\"border-radius: 4px; width: 70%; \" required/></td>\n");
      out.write("                  <td><input type=\"time\" name=\"fromtime\" style=\"border-radius:4px; width:58%; \" required/></td>\n");
      out.write("              </tr>   \n");
      out.write("                 \n");
      out.write("              <tr>\n");
      out.write("                  <td>To:</td><td><input type=\"date\" name=\"todate\"  style=\"border-radius:4px; width:70%\" required/></td>\n");
      out.write("                  <td><input type=\"time\" name=\"totime\"  style=\"border-radius:4px; width:58%;\" required/></td>\n");
      out.write("              </tr>  \n");
      out.write("              <tr>\n");
      out.write("               <td>Place:</td>   \n");
      out.write("               <td colspan=\"2\"><textarea placeholder=\"specify Place\"  cols=\"35\" rows=\"2\" name=\"place\" style=\"border-radius:4px;\" required/></textarea></td>\n");
      out.write("              \n");
      out.write("              </tr>   \n");
      out.write("              <tr>\n");
      out.write("              \n");
      out.write("               <td colspan=\"3\"><textarea placeholder=\"Reason of going \" name=\"reason\" cols=\"50\" rows=\"4\" style=\"border-radius:4px;\" required/></textarea></td>\n");
      out.write("              \n");
      out.write("              </tr> \n");
      out.write("              \n");
      out.write("             </table>  \n");
      out.write("             \n");
      out.write("               <center><button type=\"submit\" name=\"submit\" value=\"\" style=\"width:50%;\"><b>Generate Outpass</b></button></center>\n");
      out.write("              \n");
      out.write("               <h4><input type=\"checkbox\" id=\"emoutpass\" onclick=\"myFunction()\">Emergency Outpass</h4>\n");
      out.write("             </form>\n");
      out.write("              \n");
      out.write("              </center>       \n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("         \n");
      out.write("           \n");
      out.write("           \n");
      out.write("        </div>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("        function myFunction()\n");
      out.write("        {\n");
      out.write("         if(confirm('We will text you outpass on your registered number!!This option is for only Emergency Situations!!!Please Be Aware of Further Consequences')==true)\n");
      out.write("         {\n");
      out.write("             document.getElementById('emoutpass').checked = true;\n");
      out.write("         }\n");
      out.write("         else\n");
      out.write("         {\n");
      out.write("             document.getElementById('emoutpass').checked = false;\n");
      out.write("         }\n");
      out.write("             \n");
      out.write("         \n");
      out.write("       }\n");
      out.write("       function validateoutpassform()\n");
      out.write("       {\n");
      out.write("           \n");
      out.write("       }\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        </script>\n");
      out.write("        \n");
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
