<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To User-Management-System</title>
</head>
<body>
	Hi, ${greetings}
	<br><br>
	<%-- <!-- Result is : <%= request.getAttribute("result") %> -->
	by using isELIgnored property of page, <br><br>
	Here is your Result <%= request.getAttribute("firstName") %>
	<br><br>
	Result is : ${result}
	<br><br> --%>
<%-- 	<%= request.getAttribute("greetings")  %>   --%>
	<h3>Your record updated successfully.......</h3>
	<%-- <br><br>
	<%= request.getAttribute("fullName") %> --%>
</body>
</html>