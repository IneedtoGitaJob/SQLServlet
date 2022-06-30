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
<script src="script1.js"></script>
<h1>Project 4</h1>
<p>You are connected to the Project 4 Enterprise System Please Sign in</p>
<form name="instructionForm" method="post" action="Servlet1">
  <label for="username">username:</label>
  <input type="text" id="username" name="username" ><br>
  <label for="password">password:</label>
  <input type="text" id="password" name="password"><br>
<input type = "submit" value = "post">
</form>

</body>
</html>