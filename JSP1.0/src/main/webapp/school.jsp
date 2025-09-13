<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Another file</h2>
	<% 
	//scriptlet
	int first = 10;
    int second = 20;

    // add two numbers
    int sum = first + second;
    
    %>
    <!-- Expression tag -->
    <%=  sum %>

</body>
</html>