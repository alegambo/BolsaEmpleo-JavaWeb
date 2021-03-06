<%@page import="bolsa.model.PuestoModel"%>
<%@page import="bolsa.model.Puesto"%>
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
            PuestoModel dao = new PuestoModel();
            String ida = (String)request.getAttribute("id");
            Puesto utilisateur = (Puesto)dao.getUserById(ida);
        %>
	<form method="POST" action="PuestoServices" name="ajouter">
		<input type="hidden" name="action" value="edit" /> 
		<input type="hidden" name="id" value="<%= utilisateur.getID() %>" /> 
                <table class="tableModifier">
                        <caption>Modificar Empresa</caption>
			<tr>
				<td class="l">Id : </td>
                                <td class="r"><input type="text" name="" disabled value="<%= utilisateur.getID() %>"/></td>
			</tr>
			<tr>
				<td class="l">Nombre del Puesto : </td>
                                <td class="r"><input type="text" name="NombrePuesto" value="<%= utilisateur.getNombrePuesto() %>"/></td>
			</tr>
			<tr>
				<td class="l">Salario Ofrecido : </td>
				<td class="r"><input type="text" name="Salario" value="<%= utilisateur.getSalario() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Tipo de Puesto : </td>
				<td class="r"><input type="text" name="Tipo" value="<%= utilisateur.getTipo() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Cedula Juridica de la Empresa que ofrece el Puesto : </td>
				<td class="r"><input type="text" name="Empresa_id" value="<%= utilisateur.getEmpresa_id() %>"/></td>
			</tr>
                        
			<tr>
				<td class="l"><input type="submit" value="edit" /></td>
				<td class="r"><input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    </body>
</html>
