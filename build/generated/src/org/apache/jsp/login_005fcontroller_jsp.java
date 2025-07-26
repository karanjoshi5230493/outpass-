package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import classes.dbconnection;

public final class login_005fcontroller_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

          Connection con=dbconnection.conn();
           PreparedStatement stat=null;
           
           String uid=request.getParameter("uid");
           String pass=request.getParameter("pass");
           String role=request.getParameter("role");
           System.out.println(uid);
           System.out.println(pass);
           System.out.println(role);
           if(role.equals("student"))
           {
               stat=con.prepareStatement("select * from student where eno=? and pwd=? ");
               stat.setString(1,uid);
               stat.setString(2,pass);
               ResultSet res=stat.executeQuery();
               if(res.next())
               {
               
               String sname=new String(res.getString("sname"));   
               String block=new String(res.getString("block"));
               String roomno=new String(res.getString("roomno")); 
               String email=new String(res.getString("email")); 
               String sphone=new String(res.getString("sphone")); 
               String pphone=new String(res.getString("pphone")); 
                 session.setAttribute("eno",uid );
                 session.setAttribute("sname",sname);
                  session.setAttribute("block",block);
                   session.setAttribute("roomno",roomno);
                    session.setAttribute("email",email);
                     session.setAttribute("sphone",sphone);
                      session.setAttribute("pphone",pphone);
                 
                 response.sendRedirect("/outpass.jsp");
                 
                     //RequestDispatcher dispatch=request.getRequestDispatcher("/mainpage_stu.jsp");
                     //dispatch.forward(request, response);
               }
               
               
           }
           if(role=="warden")
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
