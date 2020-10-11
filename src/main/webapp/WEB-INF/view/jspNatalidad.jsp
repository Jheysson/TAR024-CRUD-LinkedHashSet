<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>[DAW] Desarrollo de Aplicaciones Web</title>
</head>
<body>
	<h6>Listado Natalidad</h6>
	<hr>
	<co:url value="/agregarNatalidad.lhs" var="mensaje"></co:url>
	<a href="${mensaje}">agregar Registro de Natalidad</a>

	<div>
		<form action="">
			<table>
				<thead>
					<tr>
						<th>CUIA</th>
						<th>Fecha Nacimiento</th>
						<th>Peso</th>
						<th>Genotipo</th>
						<th>Sexo</th>
						<th>CUIA Madre</th>
						<th>CUIA Padre</th>
						<th>Observacion</th>
						<th>Editar</th>
						<th>Eliminar</th>
					</tr>
				</thead>
				<tbody>
					<co:forEach items="${model.listNatalidad}" var="itemcic">
						<tr>
							<td><co:out value="${itemcic.CUIA}"></co:out></td>
							<td><co:out value="${itemcic.fechNacimiento}"></co:out></td>
							<td><co:out value="${itemcic.peso}"></co:out></td>
							<td><co:out value="${itemcic.genotipo}"></co:out></td>
							<td><co:out value="${itemcic.sexo}"></co:out></td>
							<td><co:out value="${itemcic.CUIAmadre}"></co:out></td>
							<td><co:out value="${itemcic.CUIApadre}"></co:out></td>
							<td><co:out value="${itemcic.observacion}"></co:out></td>

							<td><spring:url
									value="/updateNatalidad.lhs/${itemcic.CUIA}.lhs"
									var="updateURL" /> <a class="btn btn-primary"
								href="${updateURL}" role="button">Update</a></td>
							<td><spring:url
									value="/eliminarNatalidad.lhs/${itemcic.CUIA}.lhs"
									var="deleteURL" /> <a class="btn btn-primary"
								href="${deleteURL }" role="button">Delete</a></td>
						</tr>
					</co:forEach>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>