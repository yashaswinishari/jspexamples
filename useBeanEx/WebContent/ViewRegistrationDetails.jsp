<jsp:useBean id="regform " type="com.kogent.jspex.RegForm" scope="session"/>
<%@page errorPage="Registration.html"%>
<html>

<body>
<pre>
<b>User Name :</b><jsp:getProperty property="userName" name="regform"/>
<b>Password :</b><jsp:getProperty property="password" name="regform"/>
<b>Email Id :</b><jsp:getProperty property="email" name="regform"/>
<b>First Name :</b><jsp:getProperty property="firstname" name="regform"/>
<b>Last Name:</b><jsp:getProperty property="lastname" name="regform"/>
<b>Address:</b><jsp:getProperty property="address" name="regform"/>
</pre>
<form method="post" action="javascript:alert('The remaining process is under development');">
<input type="submit" value="Register"/>
</form>
</body>
</html>