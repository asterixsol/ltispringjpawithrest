<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

	<form method="Post" action="/test_mvc_app/addAccount">
		<h1>Account Addition</h1>
		<br><br>
		Name:<input type="text" name="name">
		<br><br>
		Email:<input type="text" name="email">
		<br><br>
		Password:<input type="text" name="password">
		<br><br>
		Balance:<input type="text" name="balance">
		<br><br>
		<input type="submit" value="Add Account">
		
		
		
	</form>

</center>

</body>
</html>