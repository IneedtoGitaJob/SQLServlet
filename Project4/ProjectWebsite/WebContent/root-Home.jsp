<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="custom.css">
<title>Web Server</title>
</head>
<body>
<h1>Welcome to the Project 4 Enterprise Database System</h1>
<p>You are connected to the Project 4 Enterprise System database as a Root user</p>
<form name="rootForm" method="post" action="ServletRoot">
  <textarea name= "instructions" rows="4" cols="50"></textarea><br>
  <input type = "submit" value = "Execute">
</form>
<button>Reset</button>
<button onclick= "Clear()">Clear</button>
<p>All results will appear below this line </p>
<p>----------------------------------------</p>
</body>
</html>