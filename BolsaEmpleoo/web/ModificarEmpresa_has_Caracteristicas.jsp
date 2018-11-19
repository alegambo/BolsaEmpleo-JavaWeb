<%@page import="bolsa.model.Empresa_has_Caracteristicas"%>
<%@page import="bolsa.model.Empresa_has_CaracteristicasModel"%>
<%@page import="bolsa.model.Caracteristicas_has_Oferente"%>
<%@page import="bolsa.model.Caracteristicas_has_OferenteModel"%>
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
            Empresa_has_CaracteristicasModel dao = new Empresa_has_CaracteristicasModel();
            String ida = (String)request.getAttribute("Caracteristicas_id");
            Empresa_has_Caracteristicas utilisateur = (Empresa_has_Caracteristicas)dao.getUserById(ida);
        %>
	<form method="POST" action="Empresa_has_CaracteristicaServices" name="ajouter">
		<input type="hidden" name="action" value="edit" /> 
		<input type="hidden" name="Caracteristicas_id" value="<%= utilisateur.getCaracteristicas_id() %>" /> 
                <table class="tableModifier">
                        <caption>Modificar Empresa</caption>
			<tr>
				<td class="l">Id : </td>
                                <td class="r"><input type="text" name="" disabled value="<%= utilisateur.getCaracteristicas_id() %>"/></td>
			</tr>
			<tr>
				<td class="l">Nombre : </td>
                                <td class="r"><input type="text" name="nivel" value="<%= utilisateur.getNivel() %>"/></td>
			</tr>
                        <tr>
				<td class="l">Nivel : </td>
                                <td class="r"><input type="text" name="Puesto_id" value="<%= utilisateur.getPuesto() %>"/></td>
                        </tr> 
                        
			<tr>
				<td class="l"><input type="submit" value="edit" /></td>
				<td class="r"><input type="reset" value="annuler" /></td>
			</tr>
		</table>
	</form>
    </body>
</html>
