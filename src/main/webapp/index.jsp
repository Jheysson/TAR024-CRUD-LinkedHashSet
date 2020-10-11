<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>[DAW] Desarrollo de Aplicaciones Web</title>
	</head>
	<body>
		<h2>Ganado Vacuno</h2>
		<hr>
		<co:url value="/ListadoNatalidad.lhs" var="mensaje"></co:url>
		<a href="${mensaje}">Listado del Registro de Natalidad</a>
		
		<co:url value="/agregarNatalidad.lhs" var="mensaje"></co:url>
		<a href="${mensaje}">agregar Registro de Natalidad</a>
		
	</body>
</html>
