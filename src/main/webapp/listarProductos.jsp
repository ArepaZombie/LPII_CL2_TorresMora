
<%@page import="java.util.*" %>
<%@page import="model.TblProductocl2" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body bgcolor="#581845" style="color:#DAF7A6" align="center">

<h2 align="center">Listado de Productos</h2>

<form method="post" action="ProductoControler">
<table align="center" bgcolor="#900C3F" style="padding:10px; border:2px solid #C70039; border-radius:5px">
<tr>
	<td>Nombre:</td>
	<td><input type="text" name="nombre"> </td>
</tr>

<tr>
	<td>Precio Venta:</td>
	<td><input type="number" name="precioventa"> </td>
</tr>

<tr>
	<td>Precio Compra:</td>
	<td><input type="number" name="preciocompra"> </td>
</tr>

<tr>
<td>Estado:</td>
	<td>
	<select name="estado" align="center">
		<option>Seleccionar</option>
		<option>vigente</option>
		<option>vencido</option>
		<option>sin stock</option>
	</select> 
	</td>
</tr>

<tr>
	<td>Descripción:</td>
	<td><input type="text" name="descripcion"> </td>
</tr>

<tr>
	<td colspan="2" align="center"><input type="submit" value="Registrar"> </td>
</tr>

</table>
</form>

<table border="1" align="center" bgcolor="#900C3F" style="padding:10px;margin:10px auto; border:2px solid #C70039; border-radius:5px">

<tr>
	<th>Id</th>
	<th>Nombre</th>
	<th>P.Venta</th>
	<th>P.Compra</th>
	<th>Estado</th>
	<th>Descripcion</th>
</tr>

<%
List<TblProductocl2> listado = (List<TblProductocl2>)request.getAttribute("lista");
if(listado!=null){
	for(TblProductocl2 p:listado){
		%>
	<tr>
		<td><%=p.getIdproducto() %></td>
		<td><%=p.getNombrecl2() %></td>
		<td><%=p.getPrecioventacl2() %></td>
		<td><%=p.getPreciocompracl2() %></td>
		<td><%=p.getEstadocl2() %></td>
		<td><%=p.getDescripcion() %></td>
	</tr>
<%} } %>


</table>

</body>
</html>