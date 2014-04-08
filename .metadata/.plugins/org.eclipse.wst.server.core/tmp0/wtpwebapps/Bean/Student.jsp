<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="student"  class="javatpoint.StudentBean"> 
   <jsp:setProperty name="student" property="firstName" value="Zara"/>
   <jsp:setProperty name="student" property="lastName" value="Ali"/>
  
</jsp:useBean>

<p>Student First Name: 
   <jsp:getProperty name="student" property="firstName"/>
</p>
<p>Student Last Name: 
   <jsp:getProperty name="student" property="lastName"/>
</p>



</body>
</html>