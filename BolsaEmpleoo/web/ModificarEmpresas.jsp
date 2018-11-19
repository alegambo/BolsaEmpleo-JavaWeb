<%@page import="bolsa.model.Empresa"%>
<%@page import="bolsa.model.EmpresaModel"%>
<%@page import="bolsa.model.OferenteModel"%>
<%@page import="bolsa.model.Oferente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Modificar datos de Empresa</title>
    </head>
    <body>
        <%
            EmpresaModel dao = new EmpresaModel();
            String ida = (String)request.getAttribute("id");
            Empresa utilisateur = (Empresa)dao.getUserById(ida);
        %>
	<form method="POST" action="EmpresaServices" name="ajouter">
		<input type="hidden" name="action" value="edit" /> 
		<input type="hidden" name="id" value="<%= utilisateur.getID() %>" /> 
                <table class="tableModifier">
                        <caption>Modificar Empresa</caption>
			<tr>
				<td class="l">Id : </td>
                                <td class="r"><input type="text" name="" disabled value="<%= utilisateur.getID() %>"/></td>
			</tr>
			<tr>
				<td class="l">Nombre : </td>
                                <td class="r"><input type="text" name="Nombre" value="<%= utilisateur.getNombre() %>"/></td>
			</tr>
			<tr>
				<td class="l">Localizacion : </td>
				<td class="r"><input type="text" name="Localizacion" value="<%= utilisateur.getLocalizacion() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Correo : </td>
				<td class="r"><input type="text" name="Correo" value="<%= utilisateur.getCorreo() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Telefono : </td>
				<td class="r"><input type="text" name="Telefono" value="<%= utilisateur.getTelefono() %>"/></td>
			</tr>
                         <tr>
				<td class="l">Descripcion : </td>
				<td class="r"><input type="text" name="Descripcion" value="<%= utilisateur.getDescripcion() %>"/></td>
			</tr>
                        
			<tr>
				<td class="l"><input type="submit" value="edit" /></td>
				<td class="r"><input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    </body>
</html>
