<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
<TITLE>Using JavaBeans with JSP</TITLE>
<LINK REL=STYLESHEET
 HREF="JSP-Styles.css"
 TYPE="text/css">
</HEAD>
<BODY>
<TABLE BORDER=5 ALIGN="CENTER">
 <TR><TH CLASS="TITLE">
 Using JavaBeans with JSP</TABLE>
<jsp:useBean id="stringBean" class="coreservlets.StringBean" />
<OL>
<LI>Initial value (from jsp:getProperty):
 <I><jsp:getProperty name="stringBean" 
 property="message" /></I>
<LI>Initial value (from JSP expression):
 <I><%= stringBean.getMessage() %></I>
<LI><jsp:setProperty name="stringBean" 
 property="message" 
 value="Best string bean: Fortex" />
 Value after setting property with jsp:setProperty:
 <I><jsp:getProperty name="stringBean" 
 property="message" /></I>
<LI><% stringBean.setMessage("My favorite: Kentucky Wonder"); %>
 Value after setting property with scriptlet:
 <I><%= stringBean.getMessage() %></I>
</OL> 
</BODY></HTML>