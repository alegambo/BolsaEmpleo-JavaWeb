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
   
<title>Lista de Empresas Inscritas en el Sistema</title>
</head>
<body>
<%
	EmpresaModel dao = new EmpresaModel();
	List<Empresa> userList = dao.getAllUsers();
	Iterator<Empresa> itr = userList.iterator();
        Empresa utilisateur = null;
%>
<table class="table">
    <caption>Lista de Usuarios</caption>
	<tr>
		<th>Cedula Juridica de la Empresa</th>
		<th>Nombre de la Empresa</th>
		<th>Localizacion de la Empresa</th>
                <th>Correo de la Empresa</th>
                <th>Teléfono de la Empresa</th>
                <th>Pequeña descripcion de la Empresa</th>
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
			<td><%= utilisateur.getLocalizacion()  %></td>
                        <td><%= utilisateur.getCorreo()  %></td>
                        <td><%= utilisateur.getTelefono()  %></td>
                        <td><%= utilisateur.getDescripcion()  %></td>
			<td>
                            <form method="POST" action="EmpresaServices">
                                <button class="edit"></button>
                                <input type="hidden" name="action" value="editForm" >
                                <input type="hidden" name="ID" value="<%= utilisateur.getID() %>" >
                            </form>
                            
                        </td>
			<td>
                            <form method="POST" action="EmpresaServices">
                                <button class="effacer" onclick="if(!confirm('Desea Eliminar ?')) return false;"></button>
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
    
    <p><a href="EmpresaServices?action=insert" >Agregar una nueva Empresa al Sistema</a></p>
</div>
</body>
</html>














