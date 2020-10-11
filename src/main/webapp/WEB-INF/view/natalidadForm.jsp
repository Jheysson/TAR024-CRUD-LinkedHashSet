<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>[DAW] Desarrollo de Aplicaciones Web</title>
</head>
<body>
	<h1>Registro de Natalidad</h1>
	<br />
	<div class="container">
		<spring:url value="/save.lhs" var="saveURL" />
		<h2>Natalidad</h2>
		<form:form modelAttribute="natalidadForm" method="post"
			action="${saveURL }" cssClass="form">
			
			<div class="form-group">
				<lable for="firstName">CUIA</lable>
				<form:input path="CUIA" cssClass="form-control" id="CUIA" />
			</div>
			<div class="form-group">
				<lable for="fechNacimiento">fechNacimiento</lable>
				<form:input path="fechNacimiento" cssClass="form-control" id="fechNacimiento" />
			</div>
			<div class="form-group">
				<lable for="peso">peso</lable>
				<form:input path="peso" cssClass="form-control" id="peso" />
			</div>
			<div class="form-group">
				<lable for="genotipo">genotipo</lable>
				<form:input path="genotipo" cssClass="form-control" id="genotipo" />
			</div>
			<div class="form-group">
				<lable for="sexo">sexo</lable>
				<form:input path="sexo" cssClass="form-control" id="sexo" />
			</div>
			
			<div class="form-group">
				<lable for="CUIAmadre">CUIAmadre</lable>
				<form:input path="CUIAmadre" cssClass="form-control" id="CUIAmadre" />
			</div>
			
			<div class="form-group">
				<lable for="CUIApadre">CUIApadre</lable>
				<form:input path="CUIApadre" cssClass="form-control" id="CUIApadre" />
			</div>
			
			<div class="form-group">
				<lable for="observacion">observacion</lable>
				<form:input path="observacion" cssClass="form-control" id="observacion" />
			</div>
			
			<div class="form-group">
				<lable for="Estado">Estado</lable>
				<form:input path="Estado" cssClass="form-control" id="Estado" />
			</div>
			<button type="submit" class="btn btn-primary">Save</button>
		</form:form>
	</div>
</body>
</html>