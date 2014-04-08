<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <body>
  <h1>Get Value from bean</h1>
    <jsp:useBean id="emp" class="getbean.Employees" scope="page" />
        

    <jsp:setProperty name="emp" property="firstName" value="Komal Singh"/>
    <jsp:setProperty name="emp" property="lastName" value="Choudhary"/>
    <jsp:setProperty name="emp" property="address" value="Delhi"/>
        

     <table>
      <tr>
       <td>First Name</td>
       <td> : </td>
       <td> <jsp:getProperty name="emp" property="firstName"/> </td>
      </tr>
      <tr>
       <td>Last Name</td>
       <td> : </td>
       <td> <jsp:getProperty name="emp" property="lastName"/> </td>
      </tr>
      <tr>
       <td>Address</td>
       <td> : </td>
       <td> <jsp:getProperty name="emp" property="address"/> </td>
      </tr>
     </table>
        

  </body>
</html>