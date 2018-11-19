<%@page import="bolsa.model.OferenteModel"%>
<%@page import="bolsa.model.Oferente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Modificar datos de Oferente</title>
    </head>
    <body>
        <%
            OferenteModel dao = new OferenteModel();
            String ida = (String)request.getAttribute("id");
            Oferente utilisateur = (Oferente)dao.getUserById(ida);
        %>
	<form method="POST" action="OferenteServices" name="ajouter">
		<input type="hidden" name="action" value="edit" /> 
		<input type="hidden" name="id" value="<%= utilisateur.getID() %>" /> 
                <table class="tableModifier">
                        <caption>Modificar Oferente</caption>
			<tr>
				<td class="l">Utilidaruer Id : </td>
                                <td class="r"><input type="text" name="" disabled value="<%= utilisateur.getID() %>"/></td>
			</tr>
			<tr>
				<td class="l">Nombre : </td>
                                <td class="r"><input type="text" name="Nombre" value="<%= utilisateur.getNombre() %>"/></td>
			</tr>
			<tr>
				<td class="l">Apellido : </td>
				<td class="r"><input type="text" name="Apellido" value="<%= utilisateur.getApellido() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Nacionalidad : </td>
				<td class="r"><input type="text" name="Nacionalidad" value="<%= utilisateur.getNacionalidad() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Telefono : </td>
				<td class="r"><input type="text" name="Telefono" value="<%= utilisateur.getTelefono() %>"/></td>
			</tr>
                         <tr>
				<td class="l">Direccion : </td>
				<td class="r"><input type="text" name="Direccion" value="<%= utilisateur.getDireccion() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Direccion : </td>
				<td class="r"><input type="text" name="Correo" value="<%= utilisateur.getCorreo() %>"/></td>
			</tr>
			<tr>
				<td class="l"><input type="submit" value="edit" /></td>
				<td class="r"><input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    </body>
</html>
