<%@ page import="java.util.*" %>
<%
Cookie[] cookies = request.getCookies();
   if (cookies == null)
   cookies = new Cookie[0];
   String name = request.getParameter("name");
   Cookie added = null;
   if (name!=null && name.length()>0) {
   added = new Cookie(name,name);
   response.addCookie(added);
   added.setMaxAge(365*24*60*60);
  }
%>
<HTML><HEAD>
<TITLE>Cookie List</TITLE>
</HEAD>
<BODY>
<%
   for (int i=0; i<cookies.length-1; i++) {
   out.println("Cookie Value Number :"+i+" and value "+cookies[i].getName());
   out.println("<br>");
   if (added!=null && added.getName().equals(cookies[i].getName()))
   added = null;
   }
   if (added != null)
   out.println("New Symbol: "+added.getName());
%>

<%
   if(cookies.length >=10)
  {
   int start=cookies.length-10;
   cookies[start].setMaxAge(0);
   response.addCookie(cookies[start]);
  }
   out.println("Length of cookie is "+cookies.length);
%>

<FORM>
<P>Get Cookie Value<INPUT TYPE='TEXT' NAME='name'></P>
<INPUT TYPE='SUBMIT' VALUE='Submit'>
</FORM>
</BODY>
</HTML>