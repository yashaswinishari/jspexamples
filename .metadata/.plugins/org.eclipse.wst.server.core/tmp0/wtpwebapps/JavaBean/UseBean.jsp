<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Java bean example in jsp</title>
</head>
<h1>Java bean example in jsp</h1>
<hr></hr>
<body>
<jsp:useBean id="mybean" class="my.MyBean" scope="session" >
<jsp:setProperty name="mybean" property="name" value=" Yash" />
</jsp:useBean>

<h1> <jsp:getProperty name="mybean" property="name" /></h1>
</body>
</html>