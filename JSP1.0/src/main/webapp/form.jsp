<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.jsp" method="get">
		A : <input type = "number" name="a"/>
		<br>
		B : <input type = "number" name="b"/>
		<br>
		Choice : <select  name="choice">
		<option value ="1">Add</option>
		<option value ="2">Sub</option>
		<option value ="3">Return</option>
		</select>
		<button type = "submit">Add me</button>	
	</form>

</body>
</html>