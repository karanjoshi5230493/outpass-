package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightblue\">\n");
      out.write("        <script>\n");
      out.write("         function validate()\n");
      out.write("         {\n");
      out.write("            var opass=document.cpform.cpass.value;\n");
      out.write("            var rpass=document.cpform.rpass.value;\n");
      out.write("            if(opass==rpass)\n");
      out.write("            {\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            if(opass!=rpass)\n");
      out.write("            {\n");
      out.write("                 //alert('typed password didnot match');\n");
      out.write("                  var data=\"<h5 style='color:green'>New & Retype Password didnot match</h5>\";\n");
      out.write("            document.getElementById('d').innerHTML=data;\n");
      out.write("                return false;\n");
      out.write("            }    \n");
      out.write("          }\n");
      out.write("          </script>\n");
      out.write("         <center> \n");
      out.write("        <form action=\"changepassword\" method=\"post\" onsubmit=\"return validate()\" name=\"cpform\" id='cpform'>\n");
      out.write("            \n");
      out.write("            <div id=\"ff\" style=\"background-color:whitesmoke;width:450px;height:280px;margin-top: 90px; border-radius:7px;\">\n");
      out.write("            <h3><marquee>Change Your Password</marquee></h3>    \n");
      out.write("            <table>    \n");
      out.write("            <input type=\"hidden\" name=\"eno\" value=\"\">\n");
      out.write("           <tr><td>Old Password</td><td><input type=\"password\" name=\"opass\" id=\"opass\" required/></td></tr>\n");
      out.write("            \n");
      out.write("           <tr><td> New Password</td><td><input type=\"password\" name=\"cpass\" id=\"cpass\" required/></td></tr>\n");
      out.write("            <br>\n");
      out.write("            <tr><td>Retype Password</td><td><input type=\"password\" name=\"rpass\" id=\"rpass\" required/></td></tr>\n");
      out.write("            </table><p>\n");
      out.write("             <p id=\"d\"></p>   \n");
      out.write("            <button type=\"submit\" value=\"Change\" style=\"width: 30%;border-radius: 3px;\"><b>Change</b></button>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("       </center>      \n");
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
