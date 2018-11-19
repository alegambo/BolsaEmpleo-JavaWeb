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
	Caracteristicas_has_OferenteModel dao = new Caracteristicas_has_OferenteModel();
	List<Caracteristicas_has_Oferente> userList = dao.getAllUsers();
	Iterator<Caracteristicas_has_Oferente> itr = userList.iterator();
        Caracteristicas_has_Oferente utilisateur = null;
%>
<table class="table">
    <caption>Lista de Usuarios</caption>
	<tr>
		<th>id de la caracteristica</th>
		<th>id del Oferente </th>
                <th>Nivel</th>
                
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
			<td><%= utilisateur.getOferente_id()  %></td>
			<td><%= utilisateur.getNivel()  %></td>
                        
			<td>
                            <form method="POST" action="Caracteristica_has_OferenteServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getCaracteristicas_id() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="Caracteristica_has_OferenteServices">
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
    
    <p><a href="Caracteristica_has_OferenteServices?action=insert" >Agregar una nueva Caracteristica al Sistema</a></p>
</div>
</body>
</html>














