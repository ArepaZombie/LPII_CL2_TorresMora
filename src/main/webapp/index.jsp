<html>
<body bgcolor="#581845" style="color:#DAF7A6" align="center">

<h2 align="center">Bienvenido al CL2 de Jorge Torres</h2>

<h3 align="center">Por favor, inicie sesión</h3>

<form method="post" action="UsuarioControler">
<table align="center" bgcolor="#900C3F" style="padding:10px; border:2px solid #C70039; border-radius:5px">

<tr>
	<td>Usuario:</td>
	<td><input type="text" name="usuario"> </td>
</tr>

<tr>
	<td>Password:</td>
	<td><input type="text" name="password"> </td>
</tr>

<tr>
	<td colspan="2" align="center"><input type="submit" value="Ingresar"> </td>
</tr>

</table>
</form>

<% String mensaje = (String)request.getAttribute("mensaje"); 
if(mensaje!=null){%>
<h3 align="center"><%=mensaje %> </h3>
<%} %>

</body>
</html>
