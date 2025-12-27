<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addData" method="post">
	<fieldset>
		<legend>Customer Data</legend>
		<input type="text" name="id" placeholder ="Enter your id"/><br><br>
		<input type="text" name="name" placeholder="Enter the Name"/><Br><Br>
		<input type="text" name="dept" placeholder="Enter the dept"/><br><Br>
		<input type="text" name="age" placeholder="Enter age"/>
		<input type="submit" value="Submit"/>
	</fieldset>
</form>
</body>
</html>