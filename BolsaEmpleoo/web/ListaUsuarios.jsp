<%@page import="java.lang.String"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="bolsa.model.Usuario" %>
<%@ page import="bolsa.model.UsuarioModel" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/style.css" type="text/css" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Lista de Usuarios del Sistema</title>
</head>
<body>
<%
	UsuarioModel dao = new UsuarioModel();
	List<Usuario> userList = dao.getAllUsers();
	Iterator<Usuario> itr = userList.iterator();
        Usuario utilisateur = null;
%>
<table class="table">
    <caption>Lista de Usuarios</caption>
	<tr>
		<th>Id</th>
		<th>Clave</th>
		<th>Tipo</th>
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
                
                %>
			<td><%= utilisateur.getID()  %></td>
			<td><%= utilisateur.getNom()  %></td>
			<td><%= utilisateur.esTipo()  %></td>
			<td>
                            <form method="POST" action="UsuarioServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="UsuarioServices">
                                <button class="effacer" onclick="if(!confirm('Êsta seguro que desea eliminar un usuario?')) return false;"></button>
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
    
    <p><a href="UsuarioServices?action=insert" >Agregar Usuario Nuevo</a></p>
</div>
</body>
</html>














