<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabla</title>
</head>
<body>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<table border="1">
	<tr>
		<td>Nombre<td>
		<td>Apellido</td>
		<td>Genero</td>
		<td>Email</td>
	</tr>
<c:forEach var="per" items="${list}">   
	<tr>
		<td>${per.nombre}<td>
		<td>${per.apellido}</td>
		<td>${per.genero}</td>
		<td>${per.email}</td>
	</tr>
</c:forEach> 
</table>
</body>
</html>