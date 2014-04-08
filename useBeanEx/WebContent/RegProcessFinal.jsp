<%@page errorPage="Registration.html"%>
<jsp:useBean id="regform " type="com.kogent.jspex.RegForm" scope="session"></jsp:useBean>
<jsp:setProperty  name="regform" property="firstname" param="first_name"/>
<jsp:setProperty  name="regform" property="lastname" param="last_name"/>
<jsp:setProperty  name="regform" property="address" />
<html>


<body>
<pre>
Your Registration details are valid,
<a href="ViewRegistrationDetails.jsp">click</a>to view Registration details and confirm.
</pre>
</body>
</html>