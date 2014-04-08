<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Java bean example in jsp</title>
</head>
<h1>Java bean example in jsp to demonstrate set and get property</h1>
<hr></hr>
<body>
<jsp:useBean id="bean" class="mypack.Employee" scope="session" >
<jsp:setProperty name="bean" property="name" value=" Yashaswini" />
</jsp:useBean>

<h1> Name:<jsp:getProperty name="bean" property="name" /></h1>
</body>
</html>