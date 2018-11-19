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
	CaracteristicasModel dao = new CaracteristicasModel();
	List<Caracteristicas> userList = dao.getAllUsers();
	Iterator<Caracteristicas> itr = userList.iterator();
        Caracteristicas utilisateur = null;
%>
<table class="table">
    <caption>Lista de Usuarios</caption>
	<tr>
		<th>id de Puesto</th>
		<th>Nombre </th>
                <th>Nivel</th>
                <th>Lenguaje1</th>
                <th>Lenguaje2</th>
                <th>Lenguaje3</th>
                <th>Tecnologia1</th>
                <th>Tecnologia2</th>
                <th>Tecnologia3</th>
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
			<td><%= utilisateur.getID()  %></td>
			<td><%= utilisateur.getNombre()  %></td>
			<td><%= utilisateur.getNivel()  %></td>
                        <td><%= utilisateur.getLenguaje1()  %></td>
                          <td><%= utilisateur.getLenguaje2()  %></td>
                          <td><%= utilisateur.getLenguaje3()  %></td>
                            <td><%= utilisateur.getTecnologia1()  %></td>
                            <td><%= utilisateur.getTecnologia2()  %></td>
                            <td><%= utilisateur.getTecnologia3()  %></td>
			<td>
                            <form method="POST" action="CaracteristicaServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="CaracteristicaServices">
                                <button class="effacer" onclick="if(!confirm('Desea Eliminar?')) return false;"></button>
                                <input type="hidden" name="action" value="delete" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
		</tr>
		<%
			}
		%>	
</table>
<div class="lien">
    
    <p><a href="CaracteristicaServices?action=insert" >Agregar una nueva Caracteristica al Sistema</a></p>
</div>
</body>
</html>














