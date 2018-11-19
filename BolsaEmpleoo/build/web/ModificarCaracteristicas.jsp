<%@page import="bolsa.model.Caracteristicas"%>
<%@page import="bolsa.model.CaracteristicasModel"%>
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
        <title>Modificar datos de Caracteristicas</title>
    </head>
    <body>
        <%
            CaracteristicasModel dao = new CaracteristicasModel();
            String ida = (String)request.getAttribute("id");
            Caracteristicas utilisateur = (Caracteristicas)dao.getUserById(ida);
        %>
	<form method="POST" action="CaracteristicaServices" name="ajouter">
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
				<td class="l">Nivel : </td>
                                <td class="r"><input type="text" name="Nivel" value="<%= utilisateur.getNivel() %>"/></td>
			</tr>
			<tr>
				<td class="l">Lenguaje1 : </td>
				<td class="r"><input type="text" name="Lenguaje1" value="<%= utilisateur.getLenguaje1() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Lenguaje2 : </td>
				<td class="r"><input type="text" name="Lenguaje2" value="<%= utilisateur.getLenguaje2() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Lenguaje3 : </td>
				<td class="r"><input type="text" name="Lenguaje3" value="<%= utilisateur.getLenguaje3() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Tecnologia1 : </td>
				<td class="r"><input type="text" name="Tecnologia1" value="<%= utilisateur.getTecnologia1() %>"/></td>
			</tr>
                         <tr>
				<td class="l">Tecnologia2 : </td>
				<td class="r"><input type="text" name="Tecnologia2" value="<%= utilisateur.getTecnologia2() %>"/></td>
			</tr>
                         <tr>
				<td class="l">Tecnologia3 : </td>
				<td class="r"><input type="text" name="Tecnologia3" value="<%= utilisateur.getTecnologia3() %>"/></td>
			</tr>
                        
                       
                        
                        
			<tr>
				<td class="l"><input type="submit" value="edit" /></td>
				<td class="r"><input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    </body>
</html>
