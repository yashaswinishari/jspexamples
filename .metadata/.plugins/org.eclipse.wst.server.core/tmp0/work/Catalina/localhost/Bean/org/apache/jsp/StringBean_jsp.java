/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.50
 * Generated at: 2014-03-15 04:18:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StringBean_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>Using JavaBeans with JSP</TITLE>\n");
      out.write("<LINK REL=STYLESHEET\n");
      out.write(" HREF=\"JSP-Styles.css\"\n");
      out.write(" TYPE=\"text/css\">\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<TABLE BORDER=5 ALIGN=\"CENTER\">\n");
      out.write(" <TR><TH CLASS=\"TITLE\">\n");
      out.write(" Using JavaBeans with JSP</TABLE>\n");
      coreservlets.StringBean stringBean = null;
      stringBean = (coreservlets.StringBean) _jspx_page_context.getAttribute("stringBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (stringBean == null){
        stringBean = new coreservlets.StringBean();
        _jspx_page_context.setAttribute("stringBean", stringBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("<OL>\n");
      out.write("<LI>Initial value (from jsp:getProperty):\n");
      out.write(" <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.StringBean)_jspx_page_context.findAttribute("stringBean")).getMessage())));
      out.write("</I>\n");
      out.write("<LI>Initial value (from JSP expression):\n");
      out.write(" <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\n");
      out.write("<LI>");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("stringBean"), "message", "Best string bean: Fortex", null, null, false);
      out.write("\n");
      out.write(" Value after setting property with jsp:setProperty:\n");
      out.write(" <I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((coreservlets.StringBean)_jspx_page_context.findAttribute("stringBean")).getMessage())));
      out.write("</I>\n");
      out.write("<LI>");
 stringBean.setMessage("My favorite: Kentucky Wonder"); 
      out.write("\n");
      out.write(" Value after setting property with scriptlet:\n");
      out.write(" <I>");
      out.print( stringBean.getMessage() );
      out.write("</I>\n");
      out.write("</OL> \n");
      out.write("</BODY></HTML>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
