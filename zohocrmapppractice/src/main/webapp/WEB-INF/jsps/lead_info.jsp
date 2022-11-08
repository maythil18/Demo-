<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<h2>Lead Information</h2>
First Name:${lead.firstName}<br/>
Last Name:${lead.lastName}<br/>
Email:${lead.email}<br/>
Source:${lead.source}<br/>
mobile:${lead.mobile}<br/>
<form action="composeEmail" method="post">
<input type="hidden" name="email" value="${lead.email}"/> 
<input type="submit" value="send email"/ >


</form>
</body>
</html>