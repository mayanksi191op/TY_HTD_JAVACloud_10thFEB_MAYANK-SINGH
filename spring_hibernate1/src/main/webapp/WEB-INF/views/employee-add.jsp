<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	<div class="container">
	<div align="center">
		<h1>EMPLOYEE MANAGEMENT PORTAL</h1>
	</div>
	<form:form action="employeeadd" modelAttribute="employee">
	
		<table>
			<tr>
				<td>Enter Employee Id:</td>
				<td><form:input path="add_emp" modelAttribute="employee"/></td>
			</tr>
			<tr>
				<td>Enter Name:</td>
				<td><form:input path="add_emp" modelAttribute="employee"/></td>
			</tr>


		
		</table>
		
		
		
		
	
	
	
	</form:form>
	</div>	
		
</body>
</html>