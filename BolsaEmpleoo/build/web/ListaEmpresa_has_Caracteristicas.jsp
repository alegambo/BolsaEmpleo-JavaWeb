<%@page import="bolsa.model.Empresa_has_Caracteristicas"%>
<%@page import="bolsa.model.Empresa_has_CaracteristicasModel"%>
<%@page import="bolsa.model.Caracteristicas_has_Oferente"%>
<%@page import="bolsa.model.Caracteristicas_has_OferenteModel"%>
<%@page import="bolsa.model.Caracteristicas"%>
<%@page import="bolsa.model.CaracteristicasModel"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="bolsa.model.Empresa" %>
<%@ page import="bolsa.model.EmpresaModel" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Lista de Caracteristicas Inscritas en el Sistema</title>
</head>
<body>
<%
	Empresa_has_CaracteristicasModel dao = new Empresa_has_CaracteristicasModel();
	List<Empresa_has_Caracteristicas> userList = dao.getAllUsers();
	Iterator<Empresa_has_Caracteristicas> itr = userList.iterator();
        Empresa_has_Caracteristicas utilisateur = null;
%>
<table class="table">
    <caption>Lista de Usuarios</caption>
	<tr>
		<th>id de la caracteristica</th>
		<th>Nivel </th>
                <th>Puesto</th>
                
		<th>Modificar</th>
		<th>Eliminar</th>
	</tr>
	<tr>
		<% //avec la boucle while
		//	while(itr.hasNext()){
		//		userBean user = new userBean();
		//		System.out.println(user.getID());
		while(itr.hasNext()) {
                    utilisateur = itr.next();
		%>
			<td><%= utilisateur.getCaracteristicas_id()  %></td>
			<td><%= utilisateur.getNivel()  %></td>
			<td><%= utilisateur.getPuesto()  %></td>
                        
			<td>
                            <form method="POST" action="Empresa_has_CaracteristicaServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getCaracteristicas_id() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="Empresa_has_CaracteristicaServices">
                                <button class="effacer" onclick="if(!confirm('Êtes-vous sur de bien vouloir supprimer ce utilisateur ?')) return false;"></button>
                                <input type="hidden" name="action" value="delete" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getCaracteristicas_id() %>" >
                            </form>
                            
                        </td>
		</tr>
		<%
			}
		%>	
</table>
<div class="lien">
    
    <p><a href="Empresa_has_CaracteristicaServices?action=insert" >Agregar una nueva Caracteristica al Sistema</a></p>
</div>
</body>
</html>














