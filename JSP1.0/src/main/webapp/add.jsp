<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int a =  Integer.parseInt(request.getParameter("a"));
	int b =  Integer.parseInt(request.getParameter("b"));
	int c =0;
	int choice = Integer.parseInt(request.getParameter("choice"));
	if(choice == 1){
		c=a+b;
	}
	else if(choice== 2){
		c=a-b;
	}
	else{
		c=0;
	}
	%>
	Answer: <%= c %>
</body>
</html>