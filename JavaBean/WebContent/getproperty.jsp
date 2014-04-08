<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <body>
  <h1>Get Value from bean</h1>
   <jsp:useBean id="emp" class="Bean.Employees"/>
    <table>
     <tr>
      <td>First Name :
       <jsp:getProperty name="emp" property="firstName"/> 
      </td>
     </tr>
     <tr>
      <td>Last Name : 
       <jsp:getProperty name="emp" property="lastName"/> 
      </td>
      </tr>
     <tr>
      <td>Address :
       <jsp:getProperty name="emp" property="address"/> 
      </td>
     </tr>
    </table>
 </body>
</html>